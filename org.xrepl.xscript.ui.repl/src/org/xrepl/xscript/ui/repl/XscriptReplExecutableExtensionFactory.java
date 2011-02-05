package org.xrepl.xscript.ui.repl;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class XscriptReplExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XscriptReplActivator.getContext().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XscriptReplActivator.getInstance().getInjector();
	}
	
}
