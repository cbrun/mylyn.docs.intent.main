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
package org.eclipse.mylyn.docs.intent.collab.handlers.notification;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;

/**
 * Notification strategy defining the notification mechanism to use : List of Elements Listening, Type
 * Listening, none...
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface Notificator {

	/**
	 * Delete the listeners of the handled objects.
	 */
	void stop();

	/**
	 * Adds the given repositoryObjectHandler to the listeners of any changes detected by this notification
	 * strategy.
	 * 
	 * @param listener
	 *            repositoryObjectHandler that listens this notification strategy
	 */
	void addRepositoryObjectHandler(RepositoryObjectHandler listener);

	/**
	 * Removes the given repositoryObjectHandler from the listeners of any changes detected by this
	 * notification strategy.
	 * 
	 * @param listener
	 *            repositoryObjectHandler to remove from the listeners list.
	 */
	void removeRepositoryObjectHandler(RepositoryObjectHandler listener);

	/**
	 * Send to the registered handlers a change Notification.
	 * 
	 * @param changeNotification
	 *            a RepositoryChangeNotification representing the changes that occurred.
	 */
	void notifyHandlers(RepositoryChangeNotification changeNotification);

	/**
	 * Adds the given objects to the handled object list (i.e this notificator will send notifications any
	 * time these objects are notified).
	 * 
	 * @param newElements
	 *            the new objects to handle
	 */
	void addObjectsToListen(List<EObject> newElements);

	/**
	 * Removes the given objects from the handled object list (i.e this notificator will not send
	 * notifications relative to these objects any more).
	 * 
	 * @param objectsToRemove
	 *            the objects to remove
	 */
	void removeObjectsToListen(List<Object> objectsToRemove);
}
