/*******************************************************************************
 * Copyright (c) 2010, 2011 Obeo.



 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.markup.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * A ResourceFactory able to retrieve resources from a wikimedia server.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 * 
 */
public class WikimediaResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new WikimediaResource(uri);
	}

}
