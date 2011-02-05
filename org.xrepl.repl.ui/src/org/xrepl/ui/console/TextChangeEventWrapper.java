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

import org.eclipse.jface.text.TextEvent;
import org.xrepl.TextChange;

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
