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

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;

/**
 * Provides partial implementation of the {@link GeneratedElementListener}.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class AbstractGeneratedElementListener implements GeneratedElementListener {

	/**
	 * The synchronizer to notify if changes are detected.
	 */
	protected SynchronizerRepositoryClient synchronizer;

	/**
	 * The URI of listened elements.
	 */
	protected ArrayList<URI> listenedElementsURIs;

	/**
	 * AbstractGeneratedElementListener constructor.
	 */
	public AbstractGeneratedElementListener() {
		this.listenedElementsURIs = new ArrayList<URI>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener#setSynchronizer(org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient)
	 */
	public void setSynchronizer(SynchronizerRepositoryClient synchronizer) {
		this.synchronizer = synchronizer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener#notifySynchronizer(org.eclipse.emf.common.util.URI)
	 */
	public void notifySynchronizer(URI uriOfChangedElement) {
		this.synchronizer.handleChangeNotification(null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener#addElementToListen(org.eclipse.emf.common.util.URI)
	 */
	public void addElementToListen(URI uri) {
		this.listenedElementsURIs.add(uri);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener#removeElementToListen(org.eclipse.emf.common.util.URI)
	 */
	public void removeElementToListen(URI uri) {
		this.listenedElementsURIs.remove(uri);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener#clearElementToListen()
	 */
	public void clearElementToListen() {
		this.listenedElementsURIs.clear();
	}

}
