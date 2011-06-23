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
package org.xrepl.xscript.typing;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xrepl.xscript.xscript.XNewEObject;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class XscriptTypeProvider extends XbaseTypeProvider {
	
	@Inject
	private TypeReferences typeRefs;
	
	@Inject
	private TypesFactory typesFactory;
	
	protected JvmTypeReference _type(final XNewEObject object, boolean raw) {
		if(object.getType() == null || object.getType().eIsProxy()){
			JvmVoid voidType = typesFactory.createJvmVoid();
			JvmParameterizedTypeReference ref = typesFactory.createJvmParameterizedTypeReference();
			ref.setType(voidType);
			return ref;
		}
		Class<?> instanceClass = object.getType().getInstanceClass();
		return typeRefs.getTypeForName(instanceClass, object);
	}

}
