package org.eclipse.xtext.xbase.repl.ui.console;

import org.eclipse.jface.text.TextEvent;
import org.eclipse.xtext.xbase.repl.TextChange;

public class TextChangeEventWrapper implements TextChange {

	private final TextEvent event;

	public TextChangeEventWrapper(TextEvent event) {
		this.event = event;
	}

	public static TextChange wrap(TextEvent event) {
		return new TextChangeEventWrapper(event);
	}

	public String getText() {
		return event.getText();
	}

	public int getOffset() {
		return event.getOffset();
	}

}
