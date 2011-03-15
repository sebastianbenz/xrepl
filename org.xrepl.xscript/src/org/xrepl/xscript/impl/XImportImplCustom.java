/*******************************************************************************
* Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.xrepl.xscript.impl;


public class XImportImplCustom extends org.xrepl.xscript.impl.XImportImpl {

	@Override
	public boolean isWildcard() {
		if (importedNamespace == null)
			return false;
		return importedNamespace.endsWith("*");
	}
	
	@Override
	public String getImportedTypeName() {
		String result = getImportedNamespace();
		if (isWildcard()) {
			if (result.length() > 2)
				return result.substring(0, result.length() - 2);
			return null;
		}
		return result.substring(0, result.lastIndexOf("."));
	}
}
