package org.xrepl;

import com.google.inject.ImplementedBy;


@ImplementedBy(CommandLineOutput.class)
public interface OutputView {
	
	void showInput(String input);

	void showResult(Object result);

	void showError(Throwable e);

	void flush();

	void clear();

	void dispose();

}
