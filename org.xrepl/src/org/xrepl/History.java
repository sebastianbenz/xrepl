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

import static com.google.common.base.Joiner.on;
import static org.xrepl.DefaultEvaluator.LINE_BREAK;

import java.util.Stack;

public class History {

		private Stack<String> contents = new Stack<String>();

		public void undo() {
			contents.pop();
		}

		public History append(String string) {
			contents.add(string);
			return this;
		}

		@Override
		public String toString() {
			return on(LINE_BREAK).join(contents);
		}

		public String last() {
			return contents.peek();
		}
	}