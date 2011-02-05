package org.eclipse.xtext.xbase.repl;

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

	public int getLength() {
		return -1;
	}

	public void setContext(XtextResourceSet resourceSet) {

	}

}
