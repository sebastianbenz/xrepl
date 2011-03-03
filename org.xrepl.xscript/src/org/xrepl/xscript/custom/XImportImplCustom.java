package org.xrepl.xscript.custom;

import org.xrepl.xscript.impl.XImportImpl;

public class XImportImplCustom extends XImportImpl {
	
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
