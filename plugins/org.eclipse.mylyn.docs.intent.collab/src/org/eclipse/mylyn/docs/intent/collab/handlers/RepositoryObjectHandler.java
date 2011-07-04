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
package org.eclipse.mylyn.docs.intent.collab.handlers;

import java.util.List;

import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * Handles the management of Objects from the Intent Repository ; can be in READONLY mode or READ/WRITE mode.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryObjectHandler {

	/**
	 * Returns the notificator used by this handler (ElementList Notificator, Type Notificator, none...). *
	 * 
	 * @return the notificator to use (ElementList Notificator, Type Notificator, none...)
	 */
	Notificator getNotificator();

	/**
	 * Sets the notificator to use (ElementList Notificator, Type Notificator, none...). *
	 * 
	 * @param notificator
	 *            notificator to use (ElementList Notificator, Type Notificator, none...)
	 */
	void setNotificator(Notificator notificator);

	/**
	 * Actions associated to the reception of a change notification : notifies the clients.
	 * 
	 * @param notification
	 *            ChangeNotification received (sent by the Notificator)
	 */
	void handleChangeNotification(RepositoryChangeNotification notification);

	/**
	 * Stop properly the RepositoryObjectHandler by stoping Notificator, Adapter...
	 */
	void stop();

	/**
	 * returns the Adapter used by this RepositoryObjectHandler to communicate with the concrete repository.
	 * 
	 * @return the Adapter used by this RepositoryObjectHandler to communicate with the concrete repository
	 *         (CDOAdapter, LocalAdapter...).
	 */
	RepositoryAdapter getRepositoryAdapter();

	/**
	 * Sets the adapter used by this RepositoryObjectHandler to communicate with the concrete repository.
	 * 
	 * @param adapter
	 *            Adapter used by this RepositoryObjectHandler to communicate with the concrete repository
	 *            (CDOAdapter, LocalAdapter...).
	 */
	void setRepositoryAdapter(RepositoryAdapter adapter);

	// TODO void setLockStrategy(LockStrategy lockStrategy);

	/**
	 * Adds the given client to the list of listeners in order to be prevented for any change on the monitored
	 * objects.
	 * 
	 * @param client
	 *            client to add.
	 */
	void addClient(RepositoryClient client);

	/**
	 * Removes the given client from the list of listeners ; it won't be warned if a change occures on an
	 * monitored object.
	 * 
	 * @param client
	 *            client to remove.
	 */
	void removeClient(RepositoryClient client);

	/**
	 * Locks the given objects in the given lock Mode.
	 * 
	 * @param objectsToLock
	 *            objects to lock
	 * @param lockMode
	 *            lock mode : can be READ or WRITE
	 */
	void lockObjects(List<Object> objectsToLock, LockMode lockMode);

	/**
	 * Unlocks the given objects in the given lock Mode.
	 * 
	 * @param objectsToUnlock
	 *            objects to unlock
	 */
	void unlockObjects(List<Object> objectsToUnlock);

}
