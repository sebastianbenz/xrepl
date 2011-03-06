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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
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
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.actions.ClearOutputAction;
import org.eclipse.ui.part.Page;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xrepl.EvaluationController;
import org.xrepl.InputField;
import org.xrepl.OutputView;
import org.xrepl.ui.embedded.EmbeddedXtextEditor;
import org.xrepl.ui.internal.XreplActivator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class XreplConsolePage extends Page {

	public class CancelAction extends Action {

		public CancelAction() {
			init();
		}

		protected void init() {
			setDisabledImageDescriptor(getImage("dlcl16/cancel.gif"));
			setImageDescriptor(getImage("elcl16/cancel.gif"));
			setEnabled(false);
		}

		@Override
		public void run() {
			if (evaluationJob != null) {
				evaluationJob.cancel();
			}
		}

		@Override
		public String getToolTipText() {
			return "Cancel execution";
		}

		protected ImageDescriptor getImage(String path) {
			return XreplActivator.getImageDescriptor("icons/" + path);
		}

	}

	private class EvaluationJob extends Job {
		private final String input;

		private EvaluationJob(String input) {
			super("evaluating script");
			this.input = input;
			setPriority(INTERACTIVE);
		}

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			evaluator.evaluate(input, asCancelIndicator(monitor));
			cancelAction.setEnabled(false);
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			} else {
				return Status.OK_STATUS;
			}
		}

		protected CancelIndicator asCancelIndicator(
				final IProgressMonitor monitor) {
			return new CancelIndicator() {

				public boolean isCanceled() {
					return monitor.isCanceled();
				}
			};
		}
	}

	private class ResetAndClearAction extends ClearOutputAction {

		ResetAndClearAction() {
			super(outputViewer);
		}

		@Override
		public String getToolTipText() {
			return "Resets the interpreter";
		}

		@Override
		public void run() {
			super.run();
			sourceEditor.update("");
			evaluator.reset();
		}
	}

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

	private CancelAction cancelAction;

	private Job evaluationJob;

	@Inject
	public XreplConsolePage(
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
				if (event.getDocumentEvent() == null) {
					return;
				}
				if (evaluator.isEvaluationTrigger(TextChangeEventWrapper
						.wrap(event))) {
					triggerEvaluation();
				}
			}

		});
	}

	private void triggerEvaluation() {
		getDocument().readOnly(new IUnitOfWork<Object, XtextResource>() {

			public Object exec(XtextResource state) throws Exception {
				final String input = getDocument().get();
				cancelAction.setEnabled(true);
				evaluationJob = new EvaluationJob(input);
				evaluationJob.schedule();
				return null;
			}

		});
	}

	private void createPanel(Composite parent) {
		page = new SashForm(parent, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);
	}

	private void createActions() {
		ResetAndClearAction resetAndClear = createResetAndClearAction();
		cancelAction = createCancelAction();
		addToMenu(resetAndClear, cancelAction);

		addToToolbar(IConsoleConstants.OUTPUT_GROUP, resetAndClear);
		addToToolbar(IConsoleConstants.LAUNCH_GROUP, cancelAction);
	}

	protected CancelAction createCancelAction() {
		return new CancelAction();
	}

	protected void addToToolbar(String group, Action action) {
		IToolBarManager toolbar = getSite().getActionBars().getToolBarManager();
		toolbar.appendToGroup(group, action);
	}

	protected void addToMenu(Action... actions) {
		IMenuManager menu = getSite().getActionBars().getMenuManager();
		for (Action action : actions) {
			menu.add(action);
		}
	}

	protected ResetAndClearAction createResetAndClearAction() {
		return new ResetAndClearAction();
	}

	private void registerSelectionListener() {
		selectionListener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart part,
					ISelection selection) {
				XreplConsolePage.this.selectionChanged(selection);
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

}
