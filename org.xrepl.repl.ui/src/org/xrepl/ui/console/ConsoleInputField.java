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

	public void setContext(XtextResourceSet resourceSet) {
		sourceEditor.setResourceSet(resourceSet);
	}

}
