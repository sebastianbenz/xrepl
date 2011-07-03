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
package org.xrepl;

import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

public class EvaluationController {

	public static class Factory {

		private final DefaultEvaluator repl;

		@Inject
		public Factory(DefaultEvaluator repl) {
			this.repl = repl;

		}

		public EvaluationController create(InputField inputField,
				OutputView outputField) {
			return new EvaluationController(repl, inputField, outputField);
		}

	}

	private OutputView outputView;

	private final Evaluator repl;

	private final InputField inputField;

	@Inject
	public EvaluationController(DefaultEvaluator repl, InputField inputField,
			OutputView outputView) {
		this.repl = repl;
		this.inputField = inputField;
		this.outputView = outputView;
	}

	public void evaluate(final String input) {
		evaluate(input, CancelIndicator.NullImpl);
	}
	
	public void evaluate(final String input, CancelIndicator cancelIndicator) {
		if (empty(input)) {
			inputField.revert();
			return;
		}
		if (!repl.canEvaluate(input)) {
			return;
		}
		inputField.freeze();
		try {
			Object result = repl.evaluate(input, cancelIndicator);
			outputView.showInput(input);
			outputView.showResult(result);
			inputField.clear();
		} catch (Throwable e) {
			outputView.showInput(input);
			outputView.showError(e);
			inputField.revert();
		}
		outputView.flush();
		inputField.unfreeze();
	}

	private boolean empty(String input) {
		return input.trim().length() == 0;
	}

	public void reset() {
		repl.reset();
		outputView.clear();
	}

	public boolean isEvaluationTrigger(TextChange textChange) {
		return isEnterPressed(textChange)
				&& cursorAtTheEnd(textChange, bottomIndexEndOffset());
	}

	private boolean isEnterPressed(TextChange event) {
		String text = event.getText();
		return text != null && text.length() > 0 && endsWithLineBreak(text);
	}

	private boolean endsWithLineBreak(String text) {
		int i = text.length()-1;
		while(i >= 0){
			char c = text.charAt(i);
			if(c == '\n'){
				return true;
			}else if(c != '\t' && c != ' '){
				return false;
			}
			i--;
		}
		return false;
	}

	private boolean cursorAtTheEnd(TextChange event, int bottomIndexEndOffset) {
		return event.getOffset() + event.getText().length() == bottomIndexEndOffset;
	}

	private int bottomIndexEndOffset() {
		return inputField.inputLength();
	}

	public boolean canEvaluate(String input) {
		return repl.canEvaluate(input);
	}


}
