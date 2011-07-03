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
package org.xrepl.ui;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.xrepl.Evaluator;
import org.xrepl.XreplResourceSetProvider;
import org.xrepl.ui.console.XreplConsole;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class XreplModule implements Module {
	
	public void configure(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(XreplConsole.CONSOLE_TITLE)).toInstance(getConsoleTitle());
		binder.bind(ResourceSet.class).toProvider(XreplResourceSetProvider.class);
		binder.bind(Evaluator.class).to(WorkspaceAwareEvaluator.class);
	}
	
	
	protected String getConsoleTitle() {
		return "Xbase";
	}

	
}
