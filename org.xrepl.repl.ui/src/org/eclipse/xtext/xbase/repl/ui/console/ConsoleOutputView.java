package org.eclipse.xtext.xbase.repl.ui.console;

import static org.eclipse.xtext.util.Exceptions.throwUncheckedException;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.xbase.repl.OutputView;

import com.google.inject.Inject;

public class ConsoleOutputView implements OutputView {

	public static class Factory  {

		@Inject
		private ColorManager colorManager;

		public OutputView create(ITextViewer textViewer) {
			return new ConsoleOutputView(textViewer, colorManager);
		}

	}

	private boolean isOutputEmpty = true;

	private ITextViewer outputViewer;

	private final ColorManager colorManager;

	public ConsoleOutputView(ITextViewer outputViewer, ColorManager colorManager) {
		this.outputViewer = outputViewer;
		this.colorManager = colorManager;
	}

	public void flush() {
		scrollOutputViewer();
	}

	private void scrollOutputViewer() {
		outputViewer.revealRange(getOutputViewerDocument().getLength(), 0);
	}

	public void clear() {
		isOutputEmpty = true;
		outputViewer.getDocument().set("");
	}

	public void showInput(String input) {
		Color outputDefault = colorManager.getColor(ColorManager.DEFAULT);
		separateFromPreviousOutput(outputDefault);
		append("user=> " + input.substring(0, input.length() - 1),
				outputDefault, false);
	}

	private void separateFromPreviousOutput(Color outputDefault) {
		if (!isOutputEmpty) {
			appendLineBreakToOutput(outputDefault);
		}
		isOutputEmpty = false;
	}

	public void showResult(Object result) {
		Color outputResults = colorManager
				.getColor(ColorManager.OUTPUT_RESULTS);
		if (result == null) {
			result = "null";
		}
		append(result.toString(), outputResults, false);
	}

	public void showError(Throwable e) {
		error((e.getLocalizedMessage() == null) ? e.getClass().getName() : e
				.getClass().getSimpleName() + ": " + e.getLocalizedMessage());

	}

	private void error(String message) {
		append(message, colorManager.getColor(ColorManager.OUTPUT_ERROR), false);
		scrollOutputViewer();
	}

	private void append(String text, Color color, boolean bold) {

		IDocument doc = getOutputViewerDocument();
		try {
			int offset = doc.getLength();
			int length = text.length();

			text = text + '\n';

			if (offset > 0) {
				doc.replace(offset, 0, text);
			} else {
				doc.set(text);
			}

			StyleRange style = new StyleRange();
			style.start = offset;
			style.length = length;
			style.foreground = color;

			if (bold) {
				style.fontStyle = SWT.BOLD;
			}

			outputViewer.getTextWidget().setStyleRange(style);
		} catch (BadLocationException e) {
			throwUncheckedException(e);
		}
	}

	private void appendLineBreakToOutput(Color outputDefault) {
		append("", outputDefault, false); //$NON-NLS-1$
	}

	public void dispose() {
		colorManager.dispose();
	}

	private IDocument getOutputViewerDocument() {
		return outputViewer.getDocument();
	}

}
