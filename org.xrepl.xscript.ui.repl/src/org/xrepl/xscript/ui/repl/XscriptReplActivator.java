package org.xrepl.xscript.ui.repl;

import static com.google.inject.Guice.createInjector;
import static org.eclipse.xtext.util.Modules2.mixin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.xrepl.ui.ReplModule;

import com.google.inject.Injector;
import com.google.inject.Module;

public class XscriptReplActivator extends AbstractUIPlugin {


	static BundleContext getContext() {
		return getInstance().getBundle().getBundleContext();
	}

	private static XscriptReplActivator INSTANCE;
	private Injector injector;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		INSTANCE = this;
	}

	public static XscriptReplActivator getInstance() {
		return INSTANCE;
	}

	public Injector getInjector() {
		if(injector == null){
			injector = createInjector(mixin(
					runtimeModule(), 
					uiModule(), 
					sharedStateModule(),
					replModule()));
		}
		return injector;
	}

	protected Module replModule() {
		return new ReplModule();
	}

	protected Module runtimeModule() {
		return new XscriptRuntimeModule();
	}

	protected Module uiModule() {
		return new XscriptUiModule(this);
	}

	protected Module sharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}

}
