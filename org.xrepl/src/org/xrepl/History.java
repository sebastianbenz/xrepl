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