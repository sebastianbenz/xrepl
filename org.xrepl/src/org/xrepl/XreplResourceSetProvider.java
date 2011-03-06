package org.xrepl;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class XreplResourceSetProvider implements Provider<ResourceSet> {

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	@Inject
	private IResourceFactory resourceFactory;

	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory;
	
	private SynchronizedXtextResourceSet resourceSet;

	public ResourceSet get() {
		if (resourceSet == null) {
			resourceSet = new SynchronizedXtextResourceSet();
			resourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileExtension, resourceFactory);
			IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
			resourceFactoryRegistry().getProtocolToFactoryMap().put(URIHelperConstants.PROTOCOL, typeProvider);
		}
		return resourceSet;
	}

	protected Registry resourceFactoryRegistry() {
		return resourceSet.getResourceFactoryRegistry();
	}

}
