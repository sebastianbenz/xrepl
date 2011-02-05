/**
 * Copyright (c) 2010, 2011 ProxiAD
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Cedric Vidal (ProxiAD) - initial API and implementation
 */

package org.xrepl.ui.embedded;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

public class EmbeddedXtextResource extends LazyLinkingResource {

	private Resource parentResource = null;

	public Resource getParentResource() {
		return parentResource;
	}

	public void setParentResource(Resource parentResource) {
		this.parentResource = parentResource;
	}

}
