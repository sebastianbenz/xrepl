
package org.xrepl.xscript;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XscriptStandaloneSetup extends XscriptStandaloneSetupGenerated{

	public static void doSetup() {
		new XscriptStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

