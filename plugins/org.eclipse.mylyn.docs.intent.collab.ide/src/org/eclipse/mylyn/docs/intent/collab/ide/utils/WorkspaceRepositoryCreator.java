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
package org.eclipse.mylyn.docs.intent.collab.ide.utils;

import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.ide.adapters.WorkspaceAdapter;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceConfig;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceRepository;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreator;

/**
 * Construct Repository according to configuration files.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceRepositoryCreator implements RepositoryCreator {

	/**
	 * The structurer to attach to each created Workspace adapter.
	 */
	private RepositoryStructurer repositoryStructurer;

	/**
	 * RepositoryCreator constructor.
	 */
	public WorkspaceRepositoryCreator() {

	}

	/**
	 * RepositoryCreator constructor.
	 * 
	 * @param structurer
	 *            the structurer to attach to each created Workspace adapter
	 */
	public WorkspaceRepositoryCreator(RepositoryStructurer structurer) {
		this.repositoryStructurer = structurer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreator#createRepository(java.lang.Object)
	 */
	public Repository createRepository(Object configurationInformations) throws RepositoryConnectionException {
		if (!(configurationInformations instanceof WorkspaceConfig)) {
			throw new RepositoryConnectionException("The given configuration informations are invalid.");
		}
		Repository repository = new WorkspaceRepository((WorkspaceConfig)configurationInformations);
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
		if (repository instanceof WorkspaceRepository) {
			WorkspaceAdapter workspaceAdapter = new WorkspaceAdapter((WorkspaceRepository)repository);
			if (this.repositoryStructurer != null) {
				workspaceAdapter.attachRepositoryStructurer(this.repositoryStructurer);
			}
			return workspaceAdapter;
		}
		throw new RepositoryConnectionException("Cannot create adapter for "
				+ repository.getClass().getName() + " should be " + WorkspaceRepository.class.getName());
	}
}
