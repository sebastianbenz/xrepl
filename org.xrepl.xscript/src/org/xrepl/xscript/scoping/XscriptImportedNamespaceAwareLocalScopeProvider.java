package org.xrepl.xscript.scoping;

import static com.google.inject.internal.Lists.newArrayList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.xrepl.xscript.XImport;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;

public class XscriptImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {
	
	@Inject
	private IQualifiedNameConverter nameConverter;
	
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		List<ImportNormalizer> importedNamespaceResolvers = newArrayList();
		Iterator<?> contents = Iterators.emptyIterator();
		Resource resource = context.eResource();
		if(resource != null && resource.getResourceSet() != null){
			contents = resource.getResourceSet().getAllContents();
		}else if(resource != null){
			contents = resource.getAllContents();
		}
		Iterator<XImport> imports = Iterators.filter(contents, XImport.class);
		while (imports.hasNext()) {
			XImport xImport = (XImport) imports.next();
			importedNamespaceResolvers.add(new ImportNormalizer(nameConverter.toQualifiedName(xImport.getImportedNamespace()), true, ignoreCase));
		}
		return importedNamespaceResolvers;
	}

}
