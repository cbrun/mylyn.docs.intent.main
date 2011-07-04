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
package org.eclipse.mylyn.docs.intent.client.synchronizer.listeners;

import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;

/**
 * Listens all the generated element (external to the repository) and warn the synchronizer when one of them
 * change.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface GeneratedElementListener {

	/**
	 * Sets the synchronizer that must be notified and provides the generatedElements to listen.
	 * 
	 * @param synchronizer
	 *            the synchronizer that must be notified and provides the generatedElements to listen
	 */
	void setSynchronizer(SynchronizerRepositoryClient synchronizer);

	/**
	 * Notifies the synchronizer that the element at the given URI changed.
	 * 
	 * @param uriOfChangedElement
	 *            the URI of the changed element
	 */
	void notifySynchronizer(URI uriOfChangedElement);

	/**
	 * Adds an element to listen.
	 * 
	 * @param uri
	 *            the uri of the element to listen
	 */
	void addElementToListen(URI uri);

	/**
	 * Removes the given element of the listened elements.
	 * 
	 * @param uri
	 *            the uri of the element to remove
	 */
	void removeElementToListen(URI uri);

	/**
	 * Clears the element to listen list.
	 */
	void clearElementToListen();

}
