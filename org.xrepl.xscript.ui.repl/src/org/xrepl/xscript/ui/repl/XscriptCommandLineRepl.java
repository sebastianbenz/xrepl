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
package org.xrepl.xscript.ui.repl;

import java.io.IOException;

import org.xrepl.CommandLineRepl;
import org.xrepl.xscript.XscriptPackage;
import org.xrepl.xscript.XscriptStandaloneSetup;

import com.google.inject.Injector;

public class XscriptCommandLineRepl {
	
	public static void main(String[] args) throws IOException {
		XscriptPackage.eINSTANCE.getClass();
		Injector injector = new XscriptStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.getInstance(CommandLineRepl.class).run();
	}
}

