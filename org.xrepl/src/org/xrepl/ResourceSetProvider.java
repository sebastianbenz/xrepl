package org.xrepl;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class ResourceSetProvider implements Provider<ResourceSet> {

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	@Inject
	private IResourceFactory resourceFactory;

	private SynchronizedXtextResourceSet resourceSet;

	public ResourceSet get() {
		if (resourceSet == null) {
			resourceSet = new SynchronizedXtextResourceSet();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileExtension, resourceFactory);
		}
		return resourceSet;
	}

}
