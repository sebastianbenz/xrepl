
package org.eclipse.xtext.xbase.repl.ui.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class XbaseConsoleFactory implements IConsoleFactory {
	
	@Inject
	private Provider<XbaseConsole> consoleProvider;
	
	public void openConsole() {
		XbaseConsole console = consoleProvider.get();
		IConsoleManager mgr = ConsolePlugin.getDefault().getConsoleManager();
		
		// must do this twice due to a bug in the Console API
		mgr.showConsoleView(console);
		mgr.showConsoleView(console);
	}
}
