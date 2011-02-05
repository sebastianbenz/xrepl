package org.eclipse.xtext.xbase.repl.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.repl.EvaluationController;
import org.eclipse.xtext.xbase.repl.InputField;
import org.eclipse.xtext.xbase.repl.OutputView;
import org.eclipse.xtext.xbase.repl.TextChange;
import org.jmock.Expectations;
import org.jmock.Sequence;

import com.google.inject.Inject;

public class EvaluationControllerTest extends AbstractXScriptTest {

	@Inject
	private EvaluationController.Factory fixtureFactory;

	private final InputField inputField = mock(InputField.class);
	private final OutputView output = mock(OutputView.class);
	private EvaluationController fixture;

	private final Sequence outputs = sequence("outputs");

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		checking(new Expectations() {
			{
				ignoring(inputField).setContext(
						(XtextResourceSet) with(anything()));
			}
		});
	}

	public void testShouldEvaluateInput() throws Exception {
		checking(new Expectations() {
			{
				oneOf(output).showInput("1 == 1");
				inSequence(outputs);
				oneOf(output).showResult(true);
				inSequence(outputs);
				oneOf(output).flush();
				inSequence(outputs);

				oneOf(inputField).clear();
			}
		});

		evaluate("1 == 1");
	}

	public void testShouldHandleEvaluationException() throws Exception {
		checking(new Expectations() {
			{
				oneOf(output).showInput("null.toString");
				inSequence(outputs);
				oneOf(output)
						.showError(
								(Throwable) with(instanceOf(NullPointerException.class)));
				oneOf(output).flush();
				inSequence(outputs);

				oneOf(inputField).revert();
			}
		});

		evaluate("null.toString");
	}

	public void testShouldUndoEmptyInput() throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).revert();
			}
		});

		evaluate("");
	}

	public void testShouldUndoWhitespaceInputWithCursorAtTheEnd()
			throws Exception {
		checking(new Expectations() {
			{
				oneOf(inputField).revert();
			}
		});

		evaluate("\n");
	}

	public void testShouldDoNothingOnSyntaxError() throws Exception {
		evaluate("1 %$¤ 2");
	}

	public void testShouldTriggerEvaluationIfEnterIsPressedAndCursorAtTheEnd() {
		assertThat(isEvaluationTrigger("\n"), is(true));
	}

	public void testShouldTriggerEvaluationIfEnterIsPressedWithLineBreaksInBetween() {
		assertThat(isEvaluationTrigger("true\ntrue\n"), is(true));
	}

	public void testShouldTriggerEvaluationIfEnterIsPressedWithTabInNextLine() {
		assertThat(isEvaluationTrigger("\ttrue\n\t"), is(true));
	}

	public void testShouldNotTriggerEvaluationIfEnterIsPressedAndCursorNotAtTheEnd() {
		assertThat(isEvaluationTrigger("true\ntrue\n", 3, 30), is(false));
	}

	private boolean isEvaluationTrigger(String text) {
		return isEvaluationTrigger(text, 0, text.length());
	}

	private boolean isEvaluationTrigger(final String text, final int offset,
			final int documentLength) {
		checking(new Expectations() {
			{
				oneOf(inputField).getLength();
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
		Resource resource = load(input);
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
