/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLConsole.java,v 1.1 2010/03/11 10:13:27 ewillink Exp $
 */

package org.eclipse.xtext.xbase.repl.ui.console;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.AbstractConsole;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.xtext.xbase.repl.ui.internal.ReplActivator;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class XbaseConsole extends AbstractConsole {

	public static final String CONSOLE_TITLE = "_consoleTitle";
	
	private Provider<XbaseConsolePage> consolePageProvider;
	
	@Inject
	public XbaseConsole(@Named(CONSOLE_TITLE) String title, Provider<XbaseConsolePage> consolePageProvider) {
		super(title, ImageDescriptor.createFromURL(ReplActivator
				.getInstance().getBundle().getEntry("/icons/console.gif"))); //$NON-NLS-1
		this.consolePageProvider = consolePageProvider;
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(
				new IConsole[] {this});
	}

	public IPageBookViewPage createPage(IConsoleView view) {
		return consolePageProvider.get();
	}

	void close() {
		ConsolePlugin.getDefault().getConsoleManager()
				.removeConsoles(new IConsole[] { this });
		dispose();
	}
}
