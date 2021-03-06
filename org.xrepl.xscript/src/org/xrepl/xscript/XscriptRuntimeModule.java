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
/*
 * generated by Xtext
 */
package org.xrepl.xscript;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xrepl.xscript.scoping.XscriptImportedNamespaceAwareLocalScopeProvider;
import org.xrepl.xscript.scoping.XscriptScopeProvider;
import org.xrepl.xscript.typing.XscriptTypeProvider;
import org.xrepl.xscript.valueconverter.XscriptValueConverterService;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XscriptRuntimeModule extends org.xrepl.xscript.AbstractXscriptRuntimeModule {

	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return XscriptTypeProvider.class;
	}

	public Class<? extends IExpressionInterpreter> bindIExpressionInterpreter() {
		return XscriptInterpreter.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return XscriptValueConverterService.class;
	}
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return XscriptScopeProvider.class;
	}
	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(XscriptImportedNamespaceAwareLocalScopeProvider.class);
	}
}
