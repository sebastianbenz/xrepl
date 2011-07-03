package org.xrepl;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class XreplResourceSetProvider implements Provider<ResourceSet> {

	private ResourceSet resourceSet;

	public synchronized ResourceSet get() {
		if(resourceSet == null){
			resourceSet = createResourceSet();
		}
		return resourceSet;
	}

	protected ResourceSet createResourceSet() {
		return new SynchronizedXtextResourceSet();
	}


	
}
