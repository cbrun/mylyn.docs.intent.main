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
package org.eclipse.mylyn.docs.intent.client.synchronizer.strategy;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * Define a set of behaviors that will be used during a Synchronization operation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface SynchronizerStrategy {

	/**
	 * Handles the case of a null external resource (can decide to copy the internal Resource or put a new
	 * Status on the resource for example).
	 * 
	 * @param resourceDeclaration
	 *            the resourceDeclaration associated to the given internal Resource
	 * @param internalResource
	 *            the internal (repository) compiled resource
	 * @param externalResourceURI
	 *            the URI of the external (local or repository or http...) compiled resource
	 * @return the modified external resource (the synchronizer will stop if it's null)
	 */
	Resource handleNullExternalResource(ResourceDeclaration resourceDeclaration, Resource internalResource,
			String externalResourceURI);

	/**
	 * Handles the case of a null internal resource (can decide to stop for example).
	 * 
	 * @param internalResourceURI
	 *            the URI of the internal (repository) compiled resource
	 * @param externalResource
	 *            the external (local or repository or http...) compiled resource
	 * @return the modified internal resource (the synchronizer will stop if it's null)
	 */
	Resource handleNullInternalResource(String internalResourceURI, Resource externalResource);

	/**
	 * Returns the resource that should be considered has the left Resource during comparison (see EMFCompare
	 * documentation for more informations).
	 * 
	 * @param internalResource
	 *            the internal (repository) compiled resource
	 * @param externalResource
	 *            the external (local or repository or http...) compiled resource
	 * @return the resource that should be considered has the left Resource during comparison
	 */
	Resource getLeftResource(Resource internalResource, Resource externalResource);

	/**
	 * Returns the resource that should be considered has the right Resource during comparison (see EMFCompare
	 * documentation for more informations).
	 * 
	 * @param internalResource
	 *            the internal (repository) compiled resource
	 * @param externalResource
	 *            the external (local or repository or http...) compiled resource
	 * @return the resource that should be considered has the right Resource during comparison
	 */
	Resource getRightResource(Resource internalResource, Resource externalResource);

}
