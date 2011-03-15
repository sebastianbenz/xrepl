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

import static org.xrepl.ui.util.Displays.runInUiThread;

import org.eclipse.swt.custom.StyledText;
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
		runInUiThread(new Runnable() {

			public void run() {
				sourceEditor.update("");
			}
		});

	}

	public void revert() {
		runInUiThread(new Runnable() {

			public void run() {
				String content = sourceEditor.getDocument().get();
				sourceEditor.update(removeLineBreak(content));
			}

			private String removeLineBreak(String content) {
				int i = content.length() - 1;
				while (i != 0) {
					char c = content.charAt(i);
					if (c != '\n' && c != '\t' && c != ' ') {
						return content.substring(0, i + 1);
					}
					i--;
				}
				return "";
			}
		});
	}

	public int inputLength() {
		return sourceEditor.getDocument().getLength();
	}

	public void freeze() {
		runInUiThread(new Runnable() {

			public void run() {
				textWidget().setEditable(false);
			}
		});
	}

	protected StyledText textWidget() {
		return sourceEditor.getViewer().getTextWidget();
	}

	public void unfreeze() {
		runInUiThread(new Runnable() {

			public void run() {
				textWidget().setEditable(true);
			}
		});
	}
}
