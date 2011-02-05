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

package org.xrepl.ui.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class XbaseConsoleFactory implements IConsoleFactory {
	
	@Inject
	private Provider<XbaseConsole> consoleProvider;
	
	public void openConsole() {
		XbaseConsole console = consoleProvider.get();
		IConsoleManager mgr = ConsolePlugin.getDefault().getConsoleManager();
		
		// must do this twice due to a bug in the Console API
		mgr.showConsoleView(console);
		mgr.showConsoleView(console);
	}
}
