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

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.SimpleCache;
import org.eclipse.xtext.util.Tuples;
import org.xrepl.xscript.XPackageUse;
import org.xrepl.xscript.XScript;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public final class EPackageResolver {


	public Iterable<EPackage> getEPackages(XScript root) {
		List<XPackageUse> ePackageUris = getEPackageUris(root);
		List<EPackage> result = new ArrayList<EPackage>(ePackageUris.size());
		for (XPackageUse XPackageUse : ePackageUris) {
			try {
				EPackage ePackage = resolve(root.eResource(),
						XPackageUse.getNsUri());
				result.add(ePackage);
			} catch (EPackageNotFoundException e) {
				// user will be informed during validation
			}
		}
		return result;
	}

	private List<XPackageUse> getEPackageUris(XScript root) {
		return newArrayList(filter(root.getExpressions(), XPackageUse.class));
	}
	
	private SimpleCache<Pair<Resource, String>, EPackage> cache = new SimpleCache<Pair<Resource, String>, EPackage>(
			new Function<Pair<Resource, String>, EPackage>() {

				public EPackage apply(Pair<Resource, String> tuple) {

					String packageUri = tuple.getSecond();
					EPackage ePackage = getPackageFromRegistry(packageUri);
					if (ePackage == null) {
						ePackage = loadPackageAsResource(tuple.getFirst(),
								packageUri);
					}
					checkPackage(packageUri, ePackage);
					return ePackage;
				}
			});

	public EPackage resolve(Resource resource, String packageUri) {
		Pair<Resource, String> pair = Tuples.create(resource, packageUri);
		return cache.get(pair);
	}

	private EPackage loadPackageAsResource(Resource context, String packageUri) {
		return getEPackage(EcoreUtil2.getResource(context, packageUri));

	}

	private EPackage getPackageFromRegistry(String packageUri) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
		return ePackage;
	}

	private void checkPackage(String packageUri, EPackage ePackage)
			throws EPackageNotFoundException {
		if (ePackage == null) {
			throw new EPackageNotFoundException("Could not resolve package "
					+ packageUri);
		}
	}

	private EPackage getEPackage(Resource resource) {
		EList<EObject> contents = resource.getContents();

		if (!contents.isEmpty() && contents.get(0) instanceof EPackage) {
			return (EPackage) contents.get(0);
		} 
		throw new NoSuchElementException("Resource " + resource.getURI()
				+ " is empty");
	}

	public Iterable<EPackage> getAllRegisteredEPackages() {
		// copy due to potential CME while resolving EPackages
		List<String> packageUris = Lists
				.newArrayList(EPackage.Registry.INSTANCE.keySet());
		return Iterables.transform(packageUris,
				new Function<String, EPackage>() {
					public EPackage apply(String uri) {
						return EPackage.Registry.INSTANCE.getEPackage(uri);
					}
				});
	}
}
