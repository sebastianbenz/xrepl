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

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xrepl.xscript.XNewEObject;

import com.google.inject.Inject;

public class XscriptTypeProvider extends XbaseTypeProvider {
	
	@Inject
	private TypeReferences typeRefs;
	
	protected JvmTypeReference _type(final XNewEObject object, boolean raw) {
		return typeRefs.getTypeForName(object.getType().getInstanceClass(), object);
	}

}
