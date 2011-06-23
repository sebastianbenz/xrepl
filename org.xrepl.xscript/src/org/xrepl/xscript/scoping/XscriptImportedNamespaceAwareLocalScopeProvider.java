package org.xrepl.xscript.scoping;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xrepl.xscript.xscript.XImport;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;

public class XscriptImportedNamespaceAwareLocalScopeProvider extends
XbaseImportedNamespaceScopeProvider {
	
	@Inject
	private IQualifiedNameConverter nameConverter;
	
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
		SimpleAttributeResolver<EObject, String> importResolver = SimpleAttributeResolver.newResolver(String.class,
				"importedNamespace");
		Iterator<EObject> eContents = Iterators.filter(context.eResource().getResourceSet().getAllContents(), EObject.class);
		while (eContents.hasNext()) {
			String value = importResolver.getValue(eContents.next());
			ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
			if (resolver != null)
				importedNamespaceResolvers.add(resolver);
		}
		return importedNamespaceResolvers;
	}

}
