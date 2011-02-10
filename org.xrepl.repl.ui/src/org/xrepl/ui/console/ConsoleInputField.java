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

import org.eclipse.xtext.resource.XtextResourceSet;
import org.xrepl.InputField;
import org.xrepl.ui.embedded.EmbeddedXtextEditor;

public class ConsoleInputField implements InputField {

	private final EmbeddedXtextEditor sourceEditor;

	public static class Factory {

		public InputField create(EmbeddedXtextEditor sourceEditor) {
			return new ConsoleInputField(sourceEditor);
		}
		
	}
	
	public ConsoleInputField(EmbeddedXtextEditor sourceEditor) {
		this.sourceEditor = sourceEditor;
	}

	public void clear() {
		sourceEditor.update(""); 

	}

	public void revert() {
		String content = sourceEditor.getDocument().get();
		sourceEditor.update(content.substring(0, content.length() - 1));
	}

	public int getLength() {
		return sourceEditor.getDocument().getLength();
	}

}
