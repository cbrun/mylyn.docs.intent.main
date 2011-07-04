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
package org.eclipse.mylyn.docs.intent.collab.cdo.utils;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.mylyn.docs.intent.collab.cdo.adapters.CDOAdapter;
import org.eclipse.mylyn.docs.intent.collab.cdo.repository.CDOConfig;
import org.eclipse.mylyn.docs.intent.collab.cdo.repository.CDORepository;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreator;

/**
 * Construct Repository according to configuration files.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CDORepositoryCreator implements RepositoryCreator {

	/**
	 * RepositoryCreator constructor.
	 */
	public CDORepositoryCreator() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreator#createRepository(java.lang.Object)
	 */
	public Repository createRepository(Object configurationInformations) throws RepositoryConnectionException {
		if (!(configurationInformations instanceof CDOConfig)) {
			throw new RepositoryConnectionException("The given configuration informations are invalid.");
		}
		Repository repository = new CDORepository((CDOConfig)configurationInformations);
		initialisePackageRegistry(repository);
		return repository;
	}

	/**
	 * Initializes the package registry of the given repository ; subClass should override this method.
	 * 
	 * @param repository
	 *            the repository containing the package registry to initialize
	 * @throws RepositoryConnectionException
	 *             if the repository connection cannot be established
	 */
	private void initialisePackageRegistry(Repository repository) throws RepositoryConnectionException {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreator#createRepositoryAdapterForRepository(org.eclipse.mylyn.docs.intent.collab.repository.Repository)
	 */
	public RepositoryAdapter createRepositoryAdapterForRepository(Repository repository)
			throws RepositoryConnectionException {
		return new CDOAdapter((CDOSession)repository.getOrCreateSession());
	}

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
	// ------------- FOR EXAMPLE PURPOSE ONLY
	// private RepositoryObjectHandler createHandler(String pathToListenedResource, Repository repository)
	// throws RepositoryConnectionException {
	// We first create an adapter to get the resource to listen
	// RepositoryAdapter repositoryAdapter = this.createRepositoryAdapterForRepository(repository);
	// repositoryAdapter.openSaveContext();
	// Resource resourceFromPath = repositoryAdapter.getResource(pathToListenedResource);

	// We get the contained elements
	// Set<EObject> listenedElements = new HashSet<EObject>();
	// listenedElements.addAll(resourceFromPath.getContents());
	//
	// // We create the handler
	// RepositoryObjectHandler elementHandler = new ReadWriteRepositoryObjectHandlerImpl(repositoryAdapter);
	// ElementListAdapter adapter = new ElementListAdapter();
	// Notificator listenedElementsNotificator = new ElementListNotificator(listenedElements, adapter);
	// elementHandler.setNotificator(listenedElementsNotificator);

	// return elementHandler;
	// }
}
