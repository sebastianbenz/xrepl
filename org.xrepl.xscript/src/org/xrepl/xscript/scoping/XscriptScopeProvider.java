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
package org.xrepl.xscript.scoping;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.DefaultJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.xrepl.xscript.xscript.XNewEObject;
import org.xrepl.xscript.xscript.XScript;
import org.xrepl.xscript.xscript.XscriptPackage;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;
/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class XscriptScopeProvider extends XbaseScopeProvider {
	
	@Inject 
	private EPackageScopeProvider packageScopeProvider;
	
	@Inject
	private Provider<StaticallyImportedFeaturesProvider> staticallyImportedFeaturesProvider;


	public class DeclarativeScopeProvider extends AbstractDeclarativeScopeProvider{
		public IScope scope_XNewEObject_type(XNewEObject context, EReference ref){
			 return packageScopeProvider.createEClassScope(context.eResource());
		}
	}
	
	private DeclarativeScopeProvider internalScopeProvider = new DeclarativeScopeProvider();
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(isXScriptFeature(reference)){
			return internalScopeProvider.getScope(context, reference);
		}
		return super.getScope(context, reference);
	}
	
	@Override
	protected IScope createLocalVarScope(EObject context, EReference reference, IScope parentScope, boolean includeCurrentBlock, int idx) {
		if (context instanceof XScript) {
			XScript xScript = (XScript) context;
			return new SimpleScope(allVariables(xScript));
		}else{
			return super.createLocalVarScope(context, reference, parentScope,includeCurrentBlock,idx);
		}
	}

	private Iterable<IEObjectDescription> allVariables(XScript xScript) {
		ResourceSet resourceSet = xScript.eResource().getResourceSet();
		if(xScript.eResource() == null || resourceSet == null){
			return Collections.emptyList();
		}
		List<XVariableDeclaration> variables = Lists.newArrayList();
		for (Resource resource : resourceSet.getResources()) {
			for (XScript script : filter(resource.getContents(), XScript.class)) {
				addAll(variables, filter(script.getExpressions(), XVariableDeclaration.class));
			}
		}
		return scopedElementsFor(variables);
	}

	private boolean isXScriptFeature(EReference reference) {
		return reference.getEContainingClass().getEPackage() == XscriptPackage.eINSTANCE;
	}
	
	@Override
	protected List<IJvmFeatureDescriptionProvider> getStaticFeatureDescriptionProviders(Resource context,
			JvmDeclaredType contextType) {
		List<IJvmFeatureDescriptionProvider> result = super.getStaticFeatureDescriptionProviders(context, contextType);
		final DefaultJvmFeatureDescriptionProvider defaultProvider = newDefaultFeatureDescProvider();
		StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider.get();
		staticProvider.setContext(context);
		defaultProvider.setContextType(contextType);
		defaultProvider.setFeaturesForTypeProvider(staticProvider);
		result.add(0, defaultProvider);
		return result;
	}
	
	
}
