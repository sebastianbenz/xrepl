package org.eclipse.xtext.xbase.repl;

import static org.eclipse.xtext.EcoreUtil2.resolveAll;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class DefaultEvaluator implements Evaluator {

	public static final String LINE_BREAK = "\n";

	private static final String RESET_COMMAND = "reset";
	private static final String EXIT_COMMAND = "exit";

	private static final Object NOTHING = "";

	private XtextResourceSet resourceSet;

	private final IExpressionInterpreter interpreter;

	private History history;
	private Resource currentResource;

	private int steps = 0;

	private IEvaluationContext context;

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	@Inject
	private IResourceFactory resourceFactory;

	private String lastEvaluatedString = "";

	@Inject
	public DefaultEvaluator(IExpressionInterpreter interpreter) {
		super();
		this.interpreter = interpreter;
	}

	private String asScript(String toEvaluate) {
		if (history == null) {
			history = new History();
		}
		history.append(toEvaluate + LINE_BREAK).toString();
		return toEvaluate;
	}

	public boolean canEvaluate(String input) {
		try {
			parseScript(input);
			return currentResource != null
					&& currentResource.getErrors().isEmpty();
		} catch (IOException e) {
			return false;
		}
	}

	public Object evaluate(String input) throws Throwable {
		if (input.equals(EXIT_COMMAND)) {
			return handleExitCommand();
		} else if (input.equals(RESET_COMMAND)) {
			return handleResetCommand();
		} else {
			try {
				return execute(input);
			} catch (Exception e) {
				history.undo();
				throw e;
			}
		}

	}

	private Object execute(String toEvaluate) throws Throwable {
		parseScript(toEvaluate);
		try {
			IEvaluationResult evaluation = interpreter.evaluate(
					currentExpression(), getContext());
			Throwable exception = evaluation.getException();
			if (exception != null) {
				handleEvaluationException(exception);
			}
			steps++;
			return evaluation.getResult();
		} catch (Exception e) {
			handleEvaluationException(e);
			return null; // not reachable
		}
	}

	private IEvaluationContext getContext() {
		if (context == null) {
			context = new DefaultEvaluationContext();
		}
		return context;
	}

	private void handleEvaluationException(Throwable exception)
			throws Throwable {
		if (exception instanceof EvaluationException) {
			exception = exception.getCause();
		}
		while (exception instanceof WrappedException) {
			exception = exception.getCause();
		}
		throw exception;
	}

	private Object handleResetCommand() {
		history = null;
		currentResource.unload();
		steps = 0;
		return NOTHING;
	}

	private Object handleExitCommand() {
		return handleResetCommand();
	}

	private void parseScript(String toEvaluate) throws IOException {
		if (isAlreadyParsed(toEvaluate)) {
			return;
		}
		load(asScript(toEvaluate));
		resolveAll(currentResource, CancelIndicator.NullImpl);
		lastEvaluatedString = toEvaluate;
	}

	private XExpression currentExpression() {
		XExpression expression = (XExpression) currentResource.getContents()
				.get(0);
		return expression;
	}

	private boolean isAlreadyParsed(String toEvaluate) {
		return lastEvaluatedString.equals(toEvaluate);
	}

	private void load(String input) throws IOException {
		currentResource = getResourceSet().getResource(
				URI.createURI("Test" + steps + "." + fileExtension), false);
		if (currentResource == null) {
			currentResource = resourceSet.createResource(URI.createURI("Test"
					+ steps + "." + fileExtension));
		} else {
			currentResource.unload();
		}
		currentResource.load(new StringInputStream(input), null);
	}

	public XtextResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new SynchronizedXtextResourceSet();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileExtension, resourceFactory);
		}
		return resourceSet;
	}

	public void reset() {
		handleResetCommand();
	}

}
