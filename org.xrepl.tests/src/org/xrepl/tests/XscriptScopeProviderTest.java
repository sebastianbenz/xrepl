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

import static com.google.common.collect.Iterables.size;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Iterators.filter;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Test;
import org.xrepl.xscript.XNewEObject;
import org.xrepl.xscript.XScript;
import org.xrepl.xscript.XscriptPackage;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class XscriptScopeProviderTest extends AbstractXScriptTest {
	
	@Inject 
	private IScopeProvider scopeProvider;
	
	@Test public void shouldResolveUsedEPackages() throws Exception {
		 XNewEObject newEObject = get(XNewEObject.class, "use 'http://www.eclipse.org/emf/2002/Ecore' " +
									"var x = new EPackage");
		 assertThat(size(scope(newEObject, XscriptPackage.Literals.XNEW_EOBJECT__TYPE)) > 0, is(true));
		
	}

	private Iterable<String> scope(EObject context,
			EReference reference) {
		return transform(scopeProvider.getScope(context, reference).getAllElements(), new Function<IEObjectDescription, String>() {

			public String apply(IEObjectDescription from) {
				return from.getName().toString();
			}
		});
	}

	private <T extends EObject>T get(Class<T> type, String input) throws IOException {
		return filter(expression(input).eAllContents(), type).next();
	}

	private XScript expression(String input) throws IOException {
		Resource resource = new XtextResourceSet().createResource(URI.createURI("tmp.xscript"));
		resource.load(new StringInputStream(input), Collections.emptyMap());
		return (XScript) resource.getContents().get(0);
	}

}
