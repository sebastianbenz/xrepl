package org.xrepl.xscript.ui.repl;

import java.io.IOException;

import org.eclipse.xtext.xbase.repl.CommandLineRepl;
import org.eclipse.xtext.xscript.XscriptPackage;
import org.eclipse.xtext.xscript.XscriptStandaloneSetup;

import com.google.inject.Injector;

public class XscriptCommandLineRepl {
	
	public static void main(String[] args) throws IOException {
		XscriptPackage.eINSTANCE.getClass();
		Injector injector = new XscriptStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.getInstance(CommandLineRepl.class).run();
	}
}

