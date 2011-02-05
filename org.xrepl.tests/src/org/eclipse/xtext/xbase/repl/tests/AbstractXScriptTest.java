package org.eclipse.xtext.xbase.repl.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.jmock.integration.junit3.MockObjectTestCase;
import org.xrepl.xscript.XscriptPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class AbstractXScriptTest extends MockObjectTestCase {

	static Injector injector = new XscriptStandaloneSetup() {
		@Override
		public Injector createInjector() {
			return Guice.createInjector(new XscriptRuntimeModule() {
				@Override
				public ClassLoader bindClassLoaderToInstance() {
					return AbstractXScriptTest.class.getClassLoader();
				}
			});
		}
	}.createInjectorAndDoEMFRegistration();

	@Override
	protected void setUp() throws Exception {
		XscriptPackage.eINSTANCE.getClass();
		getInjector().injectMembers(this);
	}
	

	public Injector getInjector() {
		return injector;
	}

	public Resource load(String input) throws IOException {
		Resource resource = new XtextResourceSet().createResource(URI
				.createURI("Test.xscript"));
		resource.load(new StringInputStream(input), null);
		return resource;
	}
}
