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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.junit.Test;
import org.xrepl.DefaultEvaluator;
import org.xrepl.XreplResourceSetProvider;
import org.xrepl.xscript.XscriptInterpreter;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class EvaluatorTest extends AbstractXScriptTest {

	private DefaultEvaluator evaluator;

	private ResourceSet resourceSet;

	@Inject
	private XscriptInterpreter interpreter;
	
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	@Inject
	private XreplResourceSetProvider resourceSetProvider;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		interpreter.setClassLoader(getClass().getClassLoader());
		evaluator = new DefaultEvaluator(interpreter, resourceSetProvider, fileExtension);
		resourceSet = resourceSetProvider.get();
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
		assertThat(evalToString("import 'http://www.eclipse.org/emf/2002/Ecore'"),
				is(EcorePackage.eINSTANCE.toString()));
	}

	@Test public void shouldReturnErrorIfPackageNotFoundUseStatement()
			throws Throwable {
		assertThat(
				evalutionException("import 'NotExistingPackage'"),
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
	
	@Test public void shouldAllowCreationOfObjects() throws Throwable {
		assertThat(evalToString("new String('aString')"),
				is("aString"));
	}

	@Test public void shouldAllowCreationOfEObjects() throws Throwable {
		evalToString("import 'http://www.eclipse.org/emf/2002/Ecore'");
		assertThat(eval("var newEPackage = create EPackage"),
				is(instanceOf(EPackage.class)));
	}

	@Test public void shouldAddTwoIntegers() throws Throwable {
		assertThat((Integer) eval("1 + 1"), is(2));
	}

	@Test public void shouldCompareTwoValues() throws Throwable {
		assertThat((Boolean) eval("1 == 1"), is(true));
	}

	@Test public void shouldAllowSettingAttributes() throws Throwable {
		eval("import 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = create EPackage");
		eval("aPackage.name = 'test'");
		assertThat(evalToString("aPackage.name"), is("test"));
	}

	@Test
	public void shouldSupportClojures() throws Throwable {
		eval("var list = new java.util.ArrayList()");
		eval("list.add('a')");
		eval("list = list.map(e | e.toString.toUpperCase)");
		assertThat(evalToString("list"), is("[A]"));
	}
	
	@Test public void shouldAllowSettingAttributesViaSetMethod() throws Throwable {
		evalToString("import 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = create EPackage");
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
	
	@Test public void shouldSupportJavaImports() throws Throwable {
		eval("import java.util.ArrayList");
		assertThat(eval("new ArrayList()"), is(ArrayList.class));
	}
	
	@Test public void shouldSupportJavaImportsWithWildCard() throws Throwable {
		eval("import java.util.*");
		assertThat(eval("new ArrayList()"), is(ArrayList.class));
	}
	
	@Test public void shouldSupportJavaQualifiedNames() throws Throwable {
		assertThat(eval("new java.util.ArrayList()"), is(ArrayList.class));
	}
	/*
	@Test public void shouldSupportStaticJavaImportsWithWildCard() throws Throwable {
		eval("import static java.lang.Math.*");
		assertThat(eval("random()"), is(double.class));
	}
	
	@Test public void shouldSupportStaticJavaImports() throws Throwable {
		assertThat(eval("Math.random()"), is(double.class));
	}
	
	@Test public void shouldSupportStaticJavaImportsByQualifiedName() throws Throwable {
		eval("import static java.lang.Math.random");
		assertThat(eval("random()"), is(double.class));
	}
	
	@Test public void shouldSupportStaticJavaImportsByQualifiedName2() throws Throwable {
		assertThat(eval("java.lang.Math.random()"), is(double.class));
	}

	@Test public void shouldSupportStaticJavaImportsByQualifiedNameWithParams() throws Throwable {
		assertThat(eval("java.util.Arrays.asList('x', 'y')"), is(List.class));
	}
	*/
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
