/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package org.xrepl.ui.console;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.actions.ClearOutputAction;
import org.eclipse.ui.part.Page;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xrepl.EvaluationController;
import org.xrepl.InputField;
import org.xrepl.OutputView;
import org.xrepl.ui.embedded.EmbeddedXtextEditor;
import org.xrepl.ui.internal.ReplActivator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class XbaseConsolePage extends Page {

	private Composite page;

	private ITextViewer outputViewer;

	private EObject context;

	private ISelectionService selectionService;
	private ISelectionListener selectionListener;

	private EmbeddedXtextEditor sourceEditor;

	private EvaluationController evaluator;

	private ConsoleOutputView.Factory outputWrapperFactory;

	private OutputView outputViewWrapper;

	private final EvaluationController.Factory documentEvaluatorFactory;

	private final ConsoleInputField.Factory inputWrapperFactory;

	private InputField inputViewWrapper;

	@Inject
	private Injector injector;

	@Inject
	public XbaseConsolePage(
			EvaluationController.Factory documentEvaluatorFactory,
			ConsoleOutputView.Factory outputFactory,
			ConsoleInputField.Factory inputFieldFactory) {
		this.documentEvaluatorFactory = documentEvaluatorFactory;
		this.outputWrapperFactory = outputFactory;
		this.inputWrapperFactory = inputFieldFactory;
	}

	@Override
	public void createControl(Composite parent) {
		createPanel(parent);
		createOutputViewer();
		createEditor();
		createDocumentEvaluator();
		registerSelectionListener();
		createActions();
		setFocus();
	}

	private void createEditor() {
		sourceEditor = new EmbeddedXtextEditor(page, injector);
		sourceEditor.getViewer().addTextListener(new ITextListener() {

			public void textChanged(TextEvent event) {
				if (evaluator.isEvaluationTrigger(TextChangeEventWrapper.wrap(event))) {
					triggerEvaluationJob();
				}
			}

		});
	}

	private void triggerEvaluationJob() {
		new Job("Update Console") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				runInUiThread(new Runnable() {

					public void run() {
						getDocument().modify(
								new IUnitOfWork<Object, XtextResource>() {

									public Object exec(XtextResource state)
											throws Exception {
										evaluator.evaluate(getDocument().get());
										return null;
									}

								});
					}

				});
				return Status.OK_STATUS;
			}

		}.schedule();

	}

	private void runInUiThread(Runnable runnable) {
		Display.getDefault().asyncExec(runnable);
	}

	private void createPanel(Composite parent) {
		page = new SashForm(parent, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);
	}

	private void createActions() {
		ClearOutputAction clear = new ClearOutputAction(outputViewer);
		CloseAction close = new CloseAction();
		SaveAction save = new SaveAction();
		LoadAction load = new LoadAction();

		IMenuManager menu = getSite().getActionBars().getMenuManager();
		menu.add(load);
		menu.add(save);
		menu.add(clear);
		menu.add(close);

		IMenuManager metamodelMenu = new MenuManager("Metamodel"); //$NON-NLS-1$
		menu.add(metamodelMenu);

		IToolBarManager toolbar = getSite().getActionBars().getToolBarManager();
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, load);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, save);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, clear);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, close);
	}

	private void registerSelectionListener() {
		selectionListener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart part,
					ISelection selection) {
				XbaseConsolePage.this.selectionChanged(selection);
			}
		};
		selectionService = getSite().getWorkbenchWindow().getSelectionService();
		selectionService.addPostSelectionListener(selectionListener);
		selectionChanged(selectionService.getSelection());
	}

	private void createOutputViewer() {
		outputViewer = new TextViewer(page, SWT.BORDER | SWT.MULTI
				| SWT.V_SCROLL | SWT.H_SCROLL);
		outputViewer.getTextWidget().setLayoutData(
				new GridData(GridData.FILL_BOTH));
		outputViewer.getTextWidget().setFont(
				JFaceResources.getFont(JFaceResources.TEXT_FONT));
		outputViewer.setEditable(false);
		outputViewer.setDocument(new Document());
	}

	private void createDocumentEvaluator() {
		outputViewWrapper = outputWrapperFactory.create(outputViewer);
		inputViewWrapper = inputWrapperFactory.create(sourceEditor);
		evaluator = documentEvaluatorFactory.create(inputViewWrapper,
				outputViewWrapper);
	}


	private IXtextDocument getDocument() {
		return sourceEditor.getDocument();
	}

	@Override
	public Control getControl() {
		return page;
	}

	@Override
	public void setFocus() {
		sourceEditor.setFocus();
	}

	@Override
	public void dispose() {
		outputViewWrapper.dispose();
		selectionService.removePostSelectionListener(selectionListener);
		super.dispose();
	}

	private void selectionChanged(ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) sel;

			if (!ssel.isEmpty()) {
				Object selected = ssel.getFirstElement();

				if (selected instanceof EObject) {
					context = (EObject) selected;
				} else if (selected instanceof IAdaptable) {
					context = (EObject) ((IAdaptable) selected)
							.getAdapter(EObject.class);
				}
			}
		}
	}

	String toString(Object object) {
		return String.valueOf(object);
	}

	private class CloseAction extends Action {
		private final String tip;

		CloseAction() {
			super("Reset...", PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

			tip = "Resets the interpreter";
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			sourceEditor.update("");
			evaluator.reset();
		}
	}

	private class SaveAction extends Action {
		private final String tip;

		SaveAction() {
			super("Save...", ImageDescriptor.createFromURL(FileLocator.find(
					ReplActivator.getInstance().getBundle(), new Path(
							"$nl$/icons/elcl16/save.gif"), //$NON-NLS-1$
					null)));

			tip = "Save the current script";
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			Shell shell = getControl().getShell();

			MessageDialog.openWarning(shell, "Saving not possible",
					"No yet implemented");
		}
	}

	private class LoadAction extends Action {
		private final String tip;

		LoadAction() {
			super("Load...", PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_OBJ_FILE));

			tip = "Loads a new Xscript";
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			Shell shell = getControl().getShell();

			FileDialog dlg = new FileDialog(shell, SWT.OPEN);
			dlg.setFilterExtensions(new String[] { "*.xscript" }); //$NON-NLS-1$
			dlg.setText("Load Xscript");

			String file = dlg.open();
			if (file != null) {
				try {
					MessageDialog.openWarning(shell, "Saving not possible",
							"No yet implemented");
				} catch (Exception e) {
					MessageDialog.openError(shell, e.getClass().getSimpleName()
							+ " while loading: ", e.getLocalizedMessage());
				}
			}
		}

	}

}
