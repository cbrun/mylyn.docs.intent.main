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

/**
 * Represents the expected behavior of a change notification Factory.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryChangeNotificationFactory {

	/**
	 * Create a generic RepositoryChangeNotification from the given specific notification sent by the
	 * repository (for instance can be an EMF notification, a CDO invalidation event...).
	 * 
	 * @param specificChangeNotification
	 *            the specific notification sent by the concrete repository
	 * @return a generic RepositoryChangeNotification created from the given specific notification
	 */
	RepositoryChangeNotification createRepositoryChangeNotification(Object specificChangeNotification);
}
