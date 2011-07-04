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
package org.eclipse.mylyn.docs.intent.collab.test.clients;

import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.test.ide.AbstractWorkspaceRepositoryTest;

/**
 * Abstract Test client that all the tests Clients should extend.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractTestRepositoryClient implements RepositoryClient {

	/**
	 * The handler associated to this client.
	 */
	protected RepositoryObjectHandler repositoryObjectHandler;

	/**
	 * The test class to notify when receiving a change notification.
	 */
	protected AbstractWorkspaceRepositoryTest testToNotify;

	/**
	 * AbstractTestRepositoryClient constructor.
	 * 
	 * @param testToNotify
	 *            the test class to notify when receiving a change notification
	 */
	AbstractTestRepositoryClient(AbstractWorkspaceRepositoryTest testToNotify) {
		this.testToNotify = testToNotify;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.addClient(this);
		this.repositoryObjectHandler = handler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.removeClient(this);
		this.repositoryObjectHandler = null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public abstract void handleChangeNotification(RepositoryChangeNotification notification);
}
