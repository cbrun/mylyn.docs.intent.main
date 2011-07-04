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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.mylyn.docs.intent.collab.handlers.LockMode;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * Abstract class defining the basic behaviors for handling Objects stored in an Intent Repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractRepositoryObjectHandler implements RepositoryObjectHandler {

	/**
	 * the notification strategy to use (ElementListening, TypeListening, none...).
	 */
	private Notificator notificator;

	/**
	 * set containing all the clients subscribed to this RepositoryObjectHandler.
	 */
	private Set<RepositoryClient> subscribedClients;

	/**
	 * Adapter used by this RepositoryObjectHandler to communicate with the concrete repository.
	 */
	private RepositoryAdapter repositoryAdapter;

	/**
	 * Default constructor for an AbstractRepositoryObjectHandler.
	 */
	public AbstractRepositoryObjectHandler() {
		subscribedClients = new HashSet<RepositoryClient>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#stop()
	 */
	public void stop() {
		if (this.notificator != null) {
			notificator.stop();
		}
		// TODO Make sure there is no other things to stop ?
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#getNotificator()
	 */
	public Notificator getNotificator() {
		return this.notificator;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#setNotificator(org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator)
	 */
	public void setNotificator(Notificator notificator) {
		this.notificator = notificator;
		this.notificator.addRepositoryObjectHandler(this);

		if (mustAllowChangeSubscriptionPolicyForNotificator()) {
			allowChangeSubscriptionPolicy();
		}
	}

	/**
	 * Returns true if the notificator associated to this handler needs changeSubscriptionPolicy to work
	 * correctly.
	 * 
	 * @return true if the given notificator needs changeSubscriptionPolicy to work correctly, false otherwise
	 */
	private boolean mustAllowChangeSubscriptionPolicyForNotificator() {
		return notificator instanceof ElementListNotificator;
	}

	/**
	 * Allow the change subscription policy for the current connection, in order to be correctly notified
	 * (typically used when using an ElementListNotificator).
	 */
	private void allowChangeSubscriptionPolicy() {
		if (this.repositoryAdapter != null) {
			this.repositoryAdapter.allowChangeSubscriptionPolicy();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#getRepositoryAdapter()
	 */
	public RepositoryAdapter getRepositoryAdapter() {
		return this.repositoryAdapter;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#setRepositoryAdapter(org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter)
	 */
	public void setRepositoryAdapter(RepositoryAdapter adapter) {
		this.repositoryAdapter = adapter;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#addClient(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient)
	 */
	public void addClient(RepositoryClient client) {
		subscribedClients.add(client);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#removeClient(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient)
	 */
	public void removeClient(RepositoryClient client) {
		subscribedClients.remove(client);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#lockObjects(java.util.List,
	 *      org.eclipse.mylyn.docs.intent.collab.handlers.LockMode)
	 */
	public void lockObjects(List<Object> objectsToLock, LockMode lockMode) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#unlockObjects(java.util.List)
	 */
	public void unlockObjects(List<Object> objectsToUnlock) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public void handleChangeNotification(RepositoryChangeNotification notification) {

		for (RepositoryClient client : subscribedClients) {
			client.handleChangeNotification(notification);
		}
	}
}
