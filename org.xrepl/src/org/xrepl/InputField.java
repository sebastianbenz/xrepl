package org.xrepl;

import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.ImplementedBy;

@ImplementedBy(CommandLineInput.class)
public interface InputField {

	public void clear();

	public void revert();

	public int getLength();

	public void setContext(XtextResourceSet resourceSet);

}
