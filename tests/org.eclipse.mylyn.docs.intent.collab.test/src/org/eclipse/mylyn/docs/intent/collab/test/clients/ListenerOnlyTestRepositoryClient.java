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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.test.ide.AbstractWorkspaceRepositoryTest;

/**
 * Client that indicates the last received RepositoryChangeNotification.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ListenerOnlyTestRepositoryClient extends AbstractTestRepositoryClient {

	/**
	 * ListenerOnlyTestRepositoryClient constructor.
	 * 
	 * @param testToNotify
	 *            the test class to notify when receiving a change notification
	 */
	public ListenerOnlyTestRepositoryClient(AbstractWorkspaceRepositoryTest testToNotify) {
		super(testToNotify);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.mylyn.docs.intent.collab.test.clients.AbstractTestRepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	public void handleChangeNotification(RepositoryChangeNotification notification) {
		testToNotify.setReceivedNotification(notification);
	}

	/**
	 * Add the element contained in the given list as listened elements using the RepositoryObjectHandler.
	 * 
	 * @param newElements
	 *            the list of newElements to listen
	 */
	public void addNewElementsToListen(List<EObject> newElements) {
		this.repositoryObjectHandler.getNotificator().addObjectsToListen(newElements);
	}

}
