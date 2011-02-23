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

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Iterators.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.util.SimpleAttributeResolver.NAME_RESOLVER;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Ignore;
import org.junit.Test;
import org.xrepl.DefaultEvaluator;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class DefaultEvaluatorTest extends AbstractXScriptTest {

	@Inject
	private DefaultEvaluator evaluator;

	@Inject
	private ResourceSet resourceSet;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		evaluator.setResourceSet(resourceSet);
	}

	@Test public void shouldReportSyntaxErrors() {
		assertThat(evaluator.canEvaluate("1 + 1"), is(true));
		assertThat(evaluator.canEvaluate("1 &? 2"), is(false));
	}

	@Test public void shouldEvaluteAssignments() throws Throwable {
		assertThat(evalToString("var x = 3"), is("3"));
	}

	@Test public void shouldAllowFeatureCalls() throws Throwable {
		assertThat(evalToString("'literal'.toUpperCase()"), is("LITERAL"));
	}

	@Test public void shouldEvaluateUseStatement() throws Throwable {
		assertThat(evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'"),
				is(EcorePackage.eINSTANCE.toString()));
	}

	@Test public void shouldReturnErrorIfPackageNotFoundUseStatement()
			throws Throwable {
		assertThat(
				evalutionException("use 'NotExistingPackage'"),
				is(instanceOf(Exception.class)));
	}

	@Test public void shouldKeepVariableDeclarations() throws Throwable {
		eval("var x = 'result'");
		eval("var y = x");
		assertThat(evalToString("y"), is("result"));
	}

	private Throwable evalutionException(String string) {
		try {
			eval(string);
			return null;
		} catch (Throwable e) {
			return e;
		}
	}

	@Test public void shouldAllowCreationOfNewEObjects() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		assertThat(eval("var newEPackage = new EPackage"),
				is(instanceOf(EPackage.class)));
	}

	@Test public void shouldAddTwoIntegers() throws Throwable {
		assertThat((Integer) eval("1 + 1"), is(2));
	}

	@Test public void shouldCompareTwoValues() throws Throwable {
		assertThat((Boolean) eval("1 == 1"), is(true));
	}

	@Test public void shouldAllowSettingAttributes() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = new EPackage");
		eval("aPackage.name = 'test'");
		assertThat(evalToString("aPackage.name"), is("test"));
	}

	@Test public void shouldAllowSettingAttributesViaSetMethod() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = new EPackage");
		eval("aPackage.setName('test')");
		assertThat(evalToString("aPackage.name"), is("test"));
	}

	@SuppressWarnings("restriction")
	@Test public void shouldRemoveElementsFromResourceOnException()
			throws Throwable {
		try {
			eval("{" + "  var x = 'shouldBeRemovedAfterException' "
					+ "  null.toString" + "}");
			fail("no exception");
		} catch (Exception e) {
			// expected
		}
		eval("'This triggers a new evaluation'");
		assertThat(resourceSet(), not(hasItem("x")));
	}

	@Test public void shouldFullyResetTheInterpreter() throws Throwable {
		eval("var x = 'aVariable'");
		eval("'another input'");
		evaluator.reset();
		assertFalse("Variable is still in scope", evaluator.canEvaluate("x"));
	}

	@SuppressWarnings("restriction")
	@Test public void shouldKeepNonEvaluatorResources() throws Throwable {
		Resource resource = resourceSet.createResource(URI
				.createFileURI("shouldBeKept.ecore"));
		eval("var x = 'aVariable'");
		eval("'another input'");
		evaluator.reset();
		assertThat(resourceSet.getResources(), hasItem(resource));
	}

	@Test public void shouldResetEvaluationContext() throws Throwable {
		eval("var x = 'aVariable'");
		evaluator.reset();
		assertThat(evalutionException("var x = 'aVariable'"), is(nullValue()));
	}

	private Iterable<String> resourceSet() {
		TreeIterator<Notifier> allContents = resourceSet.getAllContents();
		Iterator<String> allNames = transform(allContents,
				new Function<Notifier, String>() {

					public String apply(Notifier from) {
						if (from instanceof EObject) {
							String name = NAME_RESOLVER.apply((EObject) from);
							return name;
						}
						return null;
					}

				});
		return newArrayList(filter(allNames, notNull()));
	}

	private String evalToString(String toEvaluate) throws Throwable {
		Object result = eval(toEvaluate);
		return result != null ? result.toString() : "null";
	}

	private Object eval(String toEvaluate) throws Throwable {
		return evaluator.evaluate(toEvaluate);
	}

}
