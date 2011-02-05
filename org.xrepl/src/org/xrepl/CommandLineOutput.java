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
package org.xrepl;

public class CommandLineOutput implements OutputView {

	
	public CommandLineOutput() {
		System.out.println("Xbase REPL");
		System.out.print(PROMPT);
	}
	
	private static final String PROMPT = "user=> ";

	public void showInput(String input) {
		// not needed
	}

	public void showResult(Object result) {
		System.out.println(result);
		System.out.println();
		System.out.print(PROMPT);
	}

	public void showError(Throwable e) {
		System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		System.out.println();
		System.out.print(PROMPT);
	}

	public void flush() {
		// not required
	}

	public void clear() {
		// not possible
	}

	public void dispose() {
		// not required
	}

}
