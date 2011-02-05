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

import java.util.Collections;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.typing.XExpressionTypeProvider;
import org.xrepl.xscript.XEClassType;
import org.xrepl.xscript.XNewEObject;
import org.xrepl.xscript.XscriptFactory;

public class XscriptTypeProvider extends XExpressionTypeProvider {
	
	protected JvmTypeReference _type(final XNewEObject object) {
		return getTypesService().getTypeForName(object.getType().getInstanceClass(), object);
	}

}
