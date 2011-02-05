/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 Sebastian Benz and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Sebastian Benz - Initial API and implementation
 *
 * </copyright>
 *
 * 
 */
package org.xrepl.xscript.scoping;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.xrepl.xscript.XScript;
import org.xrepl.xscript.util.EcoreUtil3;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class EPackageScopeProvider {


	@Inject
	private EPackageResolver packageResolver;

	public IScope createEClassScope(Resource resource, EClass type) {
		Iterable<EPackage> ePackages = resolvePackages(resource);
		Iterable<EClass> eClasses = getAllEClasses(ePackages);
		Iterable<EClass> filteredEClasses = filterAssignableEClasses(eClasses,
				type);
		Iterable<IEObjectDescription> scopedElements = Scopes
				.scopedElementsFor(filteredEClasses);
		return new SimpleScope(scopedElements);
	}

	private Iterable<EClass> filterAssignableEClasses(
			Iterable<EClass> eClasses, final EClass targetType) {
		return Iterables.filter(eClasses, new Predicate<EClass>() {

			public boolean apply(EClass input) {
				if (EcoreUtil3.isSubClass(targetType, input)
						&& EcoreUtil3.isInstantiatable(input))
					return true;
				else
					return false;
			}
		});
	}
	

	private Iterable<EPackage> resolvePackages(Resource resource) {
		Iterator<XScript> scripts = filter(resource.getResourceSet().getAllContents(), XScript.class);
		List<EPackage> result = newArrayList();
		while(scripts.hasNext()){
			addAll(result, packageResolver.getEPackages(scripts.next()));
		}
		return result;
	}

	public Iterable<EClass> getAllEClasses(
			Iterable<? extends EPackage> ePackages) {
		Class<EClass> type = EClass.class;
		return getAllInstances(ePackages, type);
	}

	private <T extends EObject> Iterable<T> getAllInstances(
			Iterable<? extends EPackage> ePackages, Class<T> type) {
		Iterable<T> result = emptyList();
		for (EPackage ePackage : ePackages) {
			List<T> allContents = EcoreUtil2.getAllContentsOfType(ePackage,
					type);

			result = Iterables.concat(result, allContents);
		}
		return result;
	}

	public IScope createEClassScope(Resource resource) {
		Iterable<EPackage> ePackages = resolvePackages(resource);
		Iterable<EClass> eClasses = getAllEClasses(ePackages);
		Iterable<IEObjectDescription> scopedElements = Scopes
				.scopedElementsFor(eClasses);
		return new SimpleScope(scopedElements);
	}

}
