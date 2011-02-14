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

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.xrepl.OutputView;
import org.xrepl.xscript.XscriptPackage;
import org.xrepl.xscript.XscriptRuntimeModule;
import org.xrepl.xscript.XscriptStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

@RunWith(JMock.class)
public abstract class AbstractXScriptTest {

	protected Mockery context = new JUnit4Mockery();
	
	static Injector injector = new XscriptStandaloneSetup() {
		@Override
		public Injector createInjector() {
			return Guice.createInjector(new XscriptRuntimeModule() {
				public ClassLoader bindClassLoaderToInstance() {
					return AbstractXScriptTest.class.getClassLoader();
				}
			});
		}
	}.createInjectorAndDoEMFRegistration();

	@Before
	public void setUp() throws Exception {
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


	public <T> T mock(Class<T> typeToMock) {
		return context.mock(typeToMock);
	}


	public Sequence sequence(String name) {
		return context.sequence(name);
	}


	public void checking(Expectations expectations) {
		context.checking(expectations);
	}
}
