package org.xrepl;

public class CommandLineOutput implements OutputView {

	
	public CommandLineOutput() {
		System.out.println("Xbase REPL");
		System.out.print(PROMPT);
	}
	
	private static final String PROMPT = "user=> ";

	public void showInput(String input) {
		// not needed
	}

	public void showResult(Object result) {
		System.out.println(result);
		System.out.println();
		System.out.print(PROMPT);
	}

	public void showError(Throwable e) {
		System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		System.out.println();
		System.out.print(PROMPT);
	}

	public void flush() {
		// not required
	}

	public void clear() {
		// not possible
	}

	public void dispose() {
		// not required
	}

}
