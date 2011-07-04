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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;

/**
 * Represents the configuration of a WorkspaceRepository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceConfig {

	/**
	 * The standard name for any WorkspaceRepository.
	 */
	private static final String REPOSITORY_STANDARD_NAME = ".repository";

	/**
	 * The relative path from the root of the Workspace Project to the repository folder.
	 */
	private static final String REPOSITORY_RELATIVE_PATH_FROM_PROJECT_ROOT = "/"
			+ getRepositoryStandardName();

	/**
	 * The project of this repository.
	 */
	private IProject project;

	/**
	 * A list of the Repository Indexes relative path.
	 * <p>
	 * These index will always be loaded at the opening of a Session.
	 * </p>
	 */
	private List<String> indexPathList;

	/**
	 * WorkspaceConfig constructor.
	 * 
	 * @param project
	 *            The project of the current Project
	 * @param indexesPath
	 *            a list of the Repository Indexes relative path.
	 *            <p>
	 *            These index will always be loaded at the opening of a Session.
	 *            </p>
	 */
	public WorkspaceConfig(IProject project, String[] indexesPath) {
		this.project = project;
		this.indexPathList = new ArrayList<String>();
		for (int i = 0; i < indexesPath.length; i++) {
			indexPathList.add(indexesPath[i]);
		}
	}

	/**
	 * Returns the list of the Repository Indexes relative path.
	 * <p>
	 * These index will always be loaded at the opening of a Session.
	 * </p>
	 * 
	 * @return the list of the Repository Indexes relative path
	 */
	public List<String> getIndexesPathList() {
		return indexPathList;
	}

	/**
	 * Return the the project containing this repository.
	 * 
	 * @return the project containing this repository.
	 */
	public IProject getProject() {
		return this.project;
	}

	/**
	 * Returns the absolute path of this repository (from platform:/).
	 * 
	 * @return the absolute path of this repository (from platform:/)
	 */
	public String getRepositoryAbsolutePath() {
		return project.getFolder(getRepositoryStandardName()).getFullPath().toString();
	}

	/**
	 * Returns the relative path of this repository (from the the containing Project's root).
	 * 
	 * @return the relative path of this repository (from the the containing Project's root)
	 */
	public String getRepositoryRelativePath() {
		return REPOSITORY_RELATIVE_PATH_FROM_PROJECT_ROOT;
	}

	/**
	 * Returns the standard name for any WorkspaceRepository.
	 * 
	 * @return the standard name for any WorkspaceRepository
	 */
	public static String getRepositoryStandardName() {
		return REPOSITORY_STANDARD_NAME;
	}

}
