package org.xrepl.xscript.ui.repl;

import java.io.IOException;

import org.xrepl.CommandLineRepl;
import org.xrepl.xscript.XscriptPackage;
import org.xrepl.xscript.XscriptStandaloneSetup;

import com.google.inject.Injector;

public class XscriptCommandLineRepl {
	
	public static void main(String[] args) throws IOException {
		XscriptPackage.eINSTANCE.getClass();
		Injector injector = new XscriptStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.getInstance(CommandLineRepl.class).run();
	}
}

