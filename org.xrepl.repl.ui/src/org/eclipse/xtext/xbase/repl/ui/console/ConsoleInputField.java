package org.eclipse.xtext.xbase.repl.ui.console;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.repl.InputField;
import org.eclipse.xtext.xbase.repl.ui.embedded.EmbeddedXtextEditor;

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

	public void setContext(XtextResourceSet resourceSet) {
		sourceEditor.setResourceSet(resourceSet);
	}

}
