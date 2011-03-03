package org.xrepl.xscript.scoping;

import static com.google.common.collect.Iterators.emptyIterator;
import static com.google.common.collect.Iterators.filter;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.scoping.featurecalls.AbstractStaticMethodsFeatureForTypeProvider;
import org.xrepl.xscript.XImport;

import com.google.inject.internal.Lists;

public class StaticallyImportedFeaturesProvider extends AbstractStaticMethodsFeatureForTypeProvider {

	@Override
	protected Iterable<String> getVisibleTypesContainingStaticMethods(JvmTypeReference reference) {
		Iterator<XImport> imports = getImports();
		boolean extension = reference != null && reference.getType() != null;
		List<String> result = Lists.newArrayList();
		XImport imported;
		while(imports.hasNext()){
			imported = imports.next();
			if (imported.isStatic() ) {
				String typeName = imported.getImportedTypeName();
				if (!Strings.isEmpty(typeName))
					result.add(typeName);
			}
		}
		return result;
	}

	protected Iterator<XImport> getImports() {
		Resource resource = getContext();
		if (resource.getResourceSet() == null)
			return emptyIterator();
		return filter(resource.getResourceSet().getAllContents(), XImport.class);
	}
	
}
