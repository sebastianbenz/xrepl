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

	private static final CharSequence LINE_BREAK = "\n";

	private OutputView outputView;

	private final DefaultEvaluator repl;

	private final InputField inputField;

	@Inject
	public EvaluationController(DefaultEvaluator repl, InputField inputField,
			OutputView outputView) {
		this.repl = repl;
		this.inputField = inputField;
		this.outputView = outputView;
	}

	public void evaluate(String input) {
		if (emptyInput(input)) {
			inputField.revert();
			return;
		}
		if (!repl.canEvaluate(input)) {
			return;
		}
		outputView.showInput(input);
		try {
			Object result = repl.evaluate(input);
			outputView.showResult(result);
			inputField.clear();
		} catch (Throwable e) {
			outputView.showError(e);
			inputField.revert();
		} 
		outputView.flush();
	}


	private boolean emptyInput(String input) {
		return input.trim().length() == 0;
	}

	public void reset() {
		repl.reset();
		outputView.clear();
	}

	public boolean isEvaluationTrigger(TextChange textChange) {
		System.out.println(textChange.getText() + " ("  + textChange.getOffset() + ")");
		return isEnterPressed(textChange)
				&& cursorAtTheEnd(textChange, bottomIndexEndOffset());
	}

	private boolean isEnterPressed(TextChange event) {
		return event.getText() != null && event.getText().contains(LINE_BREAK);
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
