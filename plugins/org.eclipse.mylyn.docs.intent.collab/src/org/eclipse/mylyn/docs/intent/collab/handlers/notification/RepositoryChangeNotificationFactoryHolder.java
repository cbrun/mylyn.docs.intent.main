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
 * Hold a RepositoryChangeNotificationFactory that will be used for creating notifications from the specific
 * notifications send by the repository (CDOInvalidationEvent, WorkspaceChangeEvent...).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class RepositoryChangeNotificationFactoryHolder {

	/**
	 * The ChangeNotificationFactory to use.
	 */
	private static RepositoryChangeNotificationFactory changeNotificationFactory;

	/**
	 * RepositoryChangeNotificationFactoryHolder constructor.
	 */
	private RepositoryChangeNotificationFactoryHolder() {

	}

	/**
	 * Returns the ChangeNotificationFactory to use.
	 * 
	 * @return the ChangeNotificationFactory to use
	 */
	public static RepositoryChangeNotificationFactory getChangeNotificationFactory() {
		return changeNotificationFactory;
	}

	/**
	 * Sets the the ChangeNotificationFactory to use.
	 * <p>
	 * This {@link RepositoryChangeNotificationFactory} will be used to create generic notifications from the
	 * specific notifications send by the repository (CDOInvalidationEvent, WorkspaceChangeEvent...).
	 * </p>
	 * 
	 * @param newChangeNotificationFactory
	 *            the ChangeNotificationFactory to use
	 */
	public static void setChangeNotificationFactory(
			RepositoryChangeNotificationFactory newChangeNotificationFactory) {
		changeNotificationFactory = newChangeNotificationFactory;
	}

}
