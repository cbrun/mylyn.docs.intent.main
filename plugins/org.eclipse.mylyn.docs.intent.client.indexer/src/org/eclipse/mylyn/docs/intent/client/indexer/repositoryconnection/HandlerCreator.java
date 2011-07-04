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
package org.eclipse.mylyn.docs.intent.client.indexer.repositoryconnection;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.ReadWriteRepositoryObjectHandlerImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;

/**
 * Creates an handler notified of all changes made on the element at the given path.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class HandlerCreator {

	/**
	 * Creates an handler notified of all changes made on any element of the resource at the given path.
	 * 
	 * @param repository
	 *            the repository containing the listened objects
	 * @param pathToListenedResource
	 *            the path of the listened resource
	 * @return a new handler that will be notified of all changes made on the element at the given path
	 * @throws RepositoryConnectionException
	 *             if the connection to the given repository is invalid
	 */
	public RepositoryObjectHandler createHandler(String pathToListenedResource, Repository repository)
			throws RepositoryConnectionException {
		// We first create an adapter to get the resource to listen
		RepositoryAdapter cdoAdapter = RepositoryCreatorHolder.getCreator()
				.createRepositoryAdapterForRepository(repository);
		cdoAdapter.openSaveContext();
		Resource resourceFromPath = cdoAdapter.getResource(pathToListenedResource);

		// We get the contained elements
		Set<EObject> listenedElements = new HashSet<EObject>();
		listenedElements.addAll(resourceFromPath.getContents());

		// We create the handler
		RepositoryObjectHandler elementHandler = new ReadWriteRepositoryObjectHandlerImpl(cdoAdapter);
		ElementListAdapter adapter = new ElementListAdapter();
		Notificator listenedElementsNotificator = new ElementListNotificator(listenedElements, adapter);
		elementHandler.setNotificator(listenedElementsNotificator);

		return elementHandler;
	}
}
