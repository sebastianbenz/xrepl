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

import static org.eclipse.emf.ecore.util.EcoreUtil.resolveAll;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;

import com.google.inject.Inject;
import com.google.inject.name.Named;

@SuppressWarnings("restriction")
public class DefaultEvaluator implements Evaluator {


	private static final String PREFIX = "__REPL_RESOURCE_";

	public static final String LINE_BREAK = "\n";

	private ResourceSet resourceSet;

	private final IExpressionInterpreter interpreter;

	private History history;
	private Resource currentResource;
	private int steps = 0;

	private IEvaluationContext context;

	private String fileExtension;


	private String lastEvaluatedString = "";

	@Inject
	public DefaultEvaluator(IExpressionInterpreter interpreter, XreplResourceSetProvider resourceSetProvider, @Named(Constants.FILE_EXTENSIONS) String fileExtension) {
		super();
		this.interpreter = interpreter;
		this.resourceSet = resourceSetProvider.get();
		this.fileExtension = fileExtension;
	}

	protected void appendToHistory(String toEvaluate) {
		history().append(toEvaluate + LINE_BREAK).toString();
		lastEvaluatedString = toEvaluate;
	}

	private History history() {
		if (history == null) {
			history = new History();
		}
		return history;
	}

	public boolean canEvaluate(String input) {
		try {
			parseScript(input);
			if(currentResource == null){
				return false;
			}
			resolveAll(currentResource);
			return currentResource.getErrors().isEmpty();
		} catch (IOException e) {
			return false;
		}
	
	}

	public Object evaluate(String input) throws Throwable{
			return evaluate(input, CancelIndicator.NullImpl);
	}
	public Object evaluate(String input, CancelIndicator cancelIndicator) throws Throwable {
		try {
			return execute(input, cancelIndicator);
		} catch (Exception e) {
			history().undo();
			throw e;
		}
	}

	protected Object execute(String toEvaluate, CancelIndicator cancelIndicator) throws Throwable {
		parseScript(toEvaluate);
		try {
			IEvaluationResult evaluation = interpreter.evaluate(
					currentExpression(), getContext(), cancelIndicator);
			if(evaluation == null){
				throw new InterpreterCanceledException();
			}
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

	protected IEvaluationContext getContext() {
		if (context == null) {
			context = new DefaultEvaluationContext();
		}
		return context;
	}

	protected void handleEvaluationException(Throwable exception)
			throws Throwable {
		if (exception instanceof EvaluationException) {
			exception = exception.getCause();
		}
		while (exception instanceof WrappedException) {
			exception = exception.getCause();
		}
		throw exception;
	}

	protected void clearReplResources() {
		Iterator<Resource> allResources = resourceSet.getResources().iterator();
		while (allResources.hasNext()) {
			Resource resource = (Resource) allResources.next();
			if(resource.getURI().lastSegment().startsWith(PREFIX)){
				allResources.remove();
			}
		}
	}

	protected void parseScript(String toEvaluate) throws IOException {
		if (isAlreadyParsed(toEvaluate)) {
			return;
		}
		load(toEvaluate);
		appendToHistory(toEvaluate);
	}

	protected XExpression currentExpression() {
		if(currentResource.getContents().isEmpty()){
			return null;
		}
		return (XExpression) currentResource.getContents()
				.get(0);
	}

	protected boolean isAlreadyParsed(String toEvaluate) {
		return lastEvaluatedString.equals(toEvaluate);
	}

	protected void load(String input) throws IOException {
		URI uri = newResourceUri();
		currentResource = resourceSet.getResource(
				uri, false);
		if (currentResource == null) {
			currentResource = resourceSet.createResource(uri);
		} else {
			currentResource.unload();
		}
		currentResource.load(new StringInputStream(input), null);
		resolveAll(currentResource);
	}

	protected URI newResourceUri() {
		return URI.createURI(newResourceName());
	}

	protected String newResourceName() {
		return PREFIX + steps + "." + fileExtension;
	}


	public void reset() {
		history = null;
		currentResource = null;
		lastEvaluatedString = "";
		context = null;
		steps = 0;
		clearReplResources();
	}

	protected String getFileExtension() {
		return fileExtension;
	}

	protected ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public IExpressionInterpreter getInterpreter() {
		return interpreter;
	}
}
