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
package org.xrepl.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.jmock.Expectations;
import org.jmock.Sequence;
import org.junit.Test;
import org.xrepl.EvaluationController;
import org.xrepl.InputField;
import org.xrepl.OutputView;
import org.xrepl.TextChange;

import com.google.inject.Inject;

public class EvaluationControllerTest extends AbstractXScriptTest {

	@Inject
	private EvaluationController.Factory fixtureFactory;

	private final InputField inputField = mock(InputField.class);
	private final OutputView output = mock(OutputView.class);
	private EvaluationController fixture;

	private final Sequence outputs = sequence("outputs");

	@Test public void shouldEvaluateInput() throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).freeze();
				oneOf(output).showInput("1 == 1");
				inSequence(outputs);
				oneOf(output).showResult(true);
				inSequence(outputs);
				oneOf(output).flush();
				inSequence(outputs);

				oneOf(inputField).clear();
				oneOf(inputField).unfreeze();
			}
		});

		evaluate("1 == 1");
	}

	@Test public void shouldHandleEvaluationException() throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).freeze();
				oneOf(output).showInput("null.toString");
				inSequence(outputs);
				oneOf(output)
						.showError(
								(Throwable) with(instanceOf(NullPointerException.class)));
				oneOf(output).flush();
				inSequence(outputs);

				oneOf(inputField).revert();
				oneOf(inputField).unfreeze();
			}
		});

		evaluate("null.toString()");
	}

	@Test public void shouldUndoEmptyInput() throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).revert();
			}
		});

		evaluate("");
	}

	@Test public void shouldUndoWhitespaceInputWithCursorAtTheEnd()
			throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).revert();
			}
		});

		evaluate("\n");
	}

	@Test public void shouldDoNothingOnSyntaxError() throws Exception {
		evaluate("1 %$¤ 2");
		evaluate("1 %$¤ 2");
	}
	
	@Test public void shouldTriggerEvaluationIfEnterIsPressedAndCursorAtTheEnd() {
		assertThat(isEvaluationTrigger("\n"), is(true));
	}

	@Test public void shouldTriggerEvaluationIfEnterIsPressedWithLineBreaksInBetween() {
		assertThat(isEvaluationTrigger("true\ntrue\n"), is(true));
	}

	@Test public void shouldTriggerEvaluationIfEnterIsPressedWithTabInNextLine() {
		assertThat(isEvaluationTrigger("\ttrue\n\t"), is(true));
	}

	@Test public void shouldNotTriggerEvaluationIfEnterIsPressedAndCursorNotAtTheEnd() {
		assertThat(isEvaluationTrigger("true\ntrue\n", 3, 30), is(false));
	}
	
	
	
	
	private boolean isEvaluationTrigger(String text) {
		return isEvaluationTrigger(text, 0, text.length());
	}

	private boolean isEvaluationTrigger(final String text, final int offset,
			final int documentLength) {
		checking(new Expectations() {
			{
				oneOf(inputField).inputLength();
				will(returnValue(documentLength));
			}
		});
		return getFixture().isEvaluationTrigger(textChange(text, offset));
	}

	private TextChange textChange(final String text, final int offset) {
		TextChange textChange = new TextChange() {

			public String getText() {
				return text;
			}

			public int getOffset() {
				return offset;
			}
		};
		return textChange;
	}

	private void evaluate(String input) throws IOException {
		load(input);
		getFixture().evaluate(input);
	}

	private EvaluationController getFixture() {
		// creation after expectations
		if (fixture == null) {
			fixture = fixtureFactory.create(inputField, output);
		}
		return fixture;
	}

}
