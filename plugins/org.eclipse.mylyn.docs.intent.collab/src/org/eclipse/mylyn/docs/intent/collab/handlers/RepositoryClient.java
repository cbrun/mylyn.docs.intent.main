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

import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * Client of a RepositoryObjectHandler : must have methods for handling notifications.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryClient {

	/**
	 * Adds the given {@link RepositoryObjectHandler} to the list of handlers and registers this client to the
	 * given handler.
	 * 
	 * @param handler
	 *            {@link RepositoryObjectHandler} to associate with this client
	 */
	void addRepositoryObjectHandler(RepositoryObjectHandler handler);

	/**
	 * Removes the given {@link RepositoryObjectHandler} to the list of handlers and unregisters the client to
	 * the given handler.
	 * 
	 * @param handler
	 *            {@link RepositoryObjectHandler} to remove from this client's handlers list
	 */
	void removeRepositoryObjectHandler(RepositoryObjectHandler handler);

	/**
	 * This method is called any time one of the {@link RepositoryObjectHandler} associated to this client
	 * sends a notification.
	 * 
	 * @param notification
	 *            a change notification sent by one of the {@link RepositoryObjectHandler} associated to this
	 *            client
	 */
	void handleChangeNotification(RepositoryChangeNotification notification);
}
