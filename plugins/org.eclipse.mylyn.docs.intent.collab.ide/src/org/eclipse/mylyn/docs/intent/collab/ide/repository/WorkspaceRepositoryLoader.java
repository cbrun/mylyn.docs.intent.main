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
package org.eclipse.mylyn.docs.intent.collab.ide.repository;

import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * Class used to load a repository. In case of a {@link WorkspaceRepository}, loads only the declared Index.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceRepositoryLoader {

	/**
	 * The {@link WorkspaceRepository} to load.
	 */
	private WorkspaceRepository workspaceRepository;

	/**
	 * The list of relative path of the indexes to load.
	 */
	private List<String> indexPathList;

	/**
	 * WorkspaceRepositoryLoader constructor.
	 * 
	 * @param workspaceRepository
	 *            the {@link WorkspaceRepository} to load
	 * @param indexPathList
	 *            the list of relative path of the indexes to load
	 */
	public WorkspaceRepositoryLoader(WorkspaceRepository workspaceRepository, List<String> indexPathList) {
		this.workspaceRepository = workspaceRepository;
		this.indexPathList = indexPathList;

	}

	/**
	 * Loads the {@link WorkspaceRepository} resource set by loading all declared indexes.
	 */
	public void loadResourceSet() {
		// We load each declared index
		for (String indexPath : indexPathList) {
			addIndexFileToResourceSet(indexPath);
		}
	}

	/**
	 * Adds the index located at the given indexRelativePaht to the repository's resource set.
	 * 
	 * @param indexRelativePath
	 *            the relative path of the index to load
	 */
	private void addIndexFileToResourceSet(String indexRelativePath) {
		URI fileURI = workspaceRepository.getURIMatchingPath(indexRelativePath);
		workspaceRepository.getResourceSet().getResource(fileURI, true);
	}

}
