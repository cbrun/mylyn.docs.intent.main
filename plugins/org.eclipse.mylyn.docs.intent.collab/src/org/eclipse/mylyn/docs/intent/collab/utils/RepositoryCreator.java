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
package org.eclipse.mylyn.docs.intent.collab.utils;

import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;

/**
 * Providing facilities for creating Repository, RepositoryAdapter, RepositoryObjectHandlers.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryCreator {

	/**
	 * Constructs an Intent Repository according to configuration files.
	 * 
	 * @param configurationInformations
	 *            all the need configuration informations for creating this repository
	 * @return the constructed repository
	 * @throws RepositoryConnectionException
	 *             if the repository connection cannot be established
	 */
	Repository createRepository(Object configurationInformations) throws RepositoryConnectionException;

	/**
	 * Create and return a RepositoryAdapter for the given repository, according to the nature of the
	 * repository (CDO, Workspace...).
	 * 
	 * @param repository
	 *            the repository to use for creating this repositoryAdapter
	 * @return the created RepositoryAdapter for the given repository
	 * @throws RepositoryConnectionException
	 *             if the connection to the given repository is invalid
	 */
	RepositoryAdapter createRepositoryAdapterForRepository(Repository repository)
			throws RepositoryConnectionException;

}
