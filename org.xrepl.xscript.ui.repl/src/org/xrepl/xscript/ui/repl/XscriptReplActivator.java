/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package org.xrepl.xscript.ui.repl;

import static com.google.inject.Guice.createInjector;
import static org.eclipse.xtext.util.Modules2.mixin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.xrepl.ui.ReplModule;
import org.xrepl.xscript.XscriptRuntimeModule;
import org.xrepl.xscript.ui.XscriptUiModule;

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
