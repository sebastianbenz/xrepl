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

import org.eclipse.xtext.resource.XtextResourceSet;

/**
 * Not required by command line repl.
 */
public class CommandLineInput implements InputField {

	public void clear() {
		// 
	}

	public void revert() {
		//
	}

	public int inputLength() {
		return -1;
	}

	public void setContext(XtextResourceSet resourceSet) {

	}

}
