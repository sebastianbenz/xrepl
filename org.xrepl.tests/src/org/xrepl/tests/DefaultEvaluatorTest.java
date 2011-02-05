package org.xrepl.tests;

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Iterators.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.util.SimpleAttributeResolver.NAME_RESOLVER;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.StringInputStream;
import org.jmock.Expectations;
import org.xrepl.DefaultEvaluator;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class DefaultEvaluatorTest extends AbstractXScriptTest {

	@Inject
	private DefaultEvaluator evaluator;
	
	public void testShouldReportSyntaxErrors(){
		assertThat(evaluator.canEvaluate("1 + 1"), is(true));
		assertThat(evaluator.canEvaluate("1 &? 2"), is(false));
	}

	public void testShouldEvaluteAssignments() throws Throwable {
		assertThat(evalToString("var x = 3"), is("3"));
	}

	public void testShouldAllowFeatureCalls() throws Throwable {
		assertThat(evalToString("'literal'.toUpperCase()"), is("LITERAL"));
	}

	public void testShouldEvaluateUseStatement() throws Throwable {
		assertThat(evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'"),
				is(EcorePackage.eINSTANCE.toString()));
	}

	public void testShouldReturnErrorIfPackageNotFoundUseStatement()
			throws Throwable {
		assertThat(
				evalutionException("use 'http://www.eclipse.org/emf/2002/Ecore'"),
				is(instanceOf(Exception.class)));
	}

	public void testShouldKeepVariableDeclarations() throws Throwable {
		eval("var x = 'result'");
		eval("var y = x");
		assertThat(evalToString("y"), is("result"));
	}

	private Throwable evalutionException(String string) {
		try {
			eval(getName());
			fail("no exception");
			return null;
		} catch (Throwable e) {
			return e;
		}
	}

	public void testShouldAllowCreationOfNewEObjects() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		assertThat(eval("var newEPackage = new EPackage"),
				is(instanceOf(EPackage.class)));
	}

	public void testShouldAddTwoIntegers() throws Throwable {
		assertThat((Integer) eval("1 + 1"), is(2));
	}

	public void testShouldCompareTwoValues() throws Throwable {
		assertThat((Boolean) eval("1 == 1"), is(true));
	}

	public void testShouldAllowSettingAttributes() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = new EPackage");
		assertThat(evalToString("aPackage.name = 'test'"), is("test"));
	}

	public void testShouldAllowSettingAttributesViaSetMethod() throws Throwable {
		evalToString("use 'http://www.eclipse.org/emf/2002/Ecore'");
		eval("var aPackage = new EPackage");
		assertThat(evalToString("aPackage.setName('test')"), is("test"));
	}

	@SuppressWarnings("restriction")
	public void testShouldRemoveElementsFromResourceOnException()
			throws Throwable {
		try{
			eval("{" + "  var x = 'shouldBeRemovedAfterException' "
				+ "  null.toString" + "}");
			fail("no exception");
		}catch (Exception e) {
			// expected
		}
		eval("'This triggers a new evaluation'");
		assertThat(resourceSet(), not(hasItem("x")));
	}


	private Iterable<String> resourceSet() {
		TreeIterator<Notifier> allContents = evaluator.getResourceSet()
				.getAllContents();
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
