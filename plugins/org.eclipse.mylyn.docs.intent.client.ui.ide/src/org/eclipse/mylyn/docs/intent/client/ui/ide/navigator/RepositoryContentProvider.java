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
package org.eclipse.mylyn.docs.intent.client.ui.ide.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IDEApplicationManager;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceConfig;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry;

/**
 * Provides content for the ProjectExplorer elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class RepositoryContentProvider implements ITreeContentProvider {

	private static final Object[] EMPTY = {};

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
		Object[] children = EMPTY;

		if (parentElement instanceof IProject) {
			IFile iFileIndex = getIFileIndex((IProject)parentElement);
			if (iFileIndex == null) {
				children = EMPTY;
			} else {
				children = getChildren(iFileIndex);
			}
		}
		if (parentElement instanceof IFile) {
			IFile file = (IFile)parentElement;
			// We connect to the repository
			try {
				IDEApplicationManager.connect(file.getProject());
				RepositoryAdapter repositoryAdapter = RepositoryCreatorHolder.getCreator()
						.createRepositoryAdapterForRepository(
								IDEApplicationManager.getRepository(file.getProject()));
				repositoryAdapter.openReadOnlyContext();
				Resource resource = repositoryAdapter.getResource(IntentLocations.GENERAL_INDEX_PATH);
				if (resource.getContents().size() > 0) {
					IntentIndex index = (IntentIndex)resource.getContents().get(0);
					children = index.getEntries().toArray();
				}

			} catch (RepositoryConnectionException e) {
				// We simply don't contribute to the project explorer
			}
		}
		if (parentElement instanceof IntentIndex) {
			children = ((IntentIndex)parentElement).getEntries().toArray();
		}
		if (parentElement instanceof IntentIndexEntry) {
			// IntentIndexEntry reloaded = (IntentIndexEntry)repositoryAdapter.reload((IntentIndexEntry)parentElement);
			// children = reloaded.getSubEntries().toArray();
			children = ((IntentIndexEntry)parentElement).getSubEntries().toArray();
		}
		return children;
	}

	/**
	 * Returns the IFile containing a Repository Index contained in the given Project (can be null if no Index
	 * File found).
	 * 
	 * @param project
	 *            the project potentially containing an Repository Index
	 * @return the IFile containing a Repository Index contained in the given Project (can be null if no Index
	 *         File found)
	 */
	private IFile getIFileIndex(IProject project) {
		IFolder repositoryFolder = project.getFolder(WorkspaceConfig.getRepositoryStandardName());
		if (repositoryFolder.exists()) {
			// If this repositoryFolder has an index
			IFile file = repositoryFolder.getFile(IntentLocations.GENERAL_INDEX_PATH + ".xmi");
			if (file.exists()) {
				return file;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		// TODO
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		if ((element instanceof IntentIndex) || (element instanceof IntentIndexEntry)
				|| (element instanceof IProject)) {
			return getChildren(element).length > 0;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// we can now close the session
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IProject) {
			return getChildren(getIFileIndex((IProject)inputElement));
		}
		return getChildren(inputElement);
	}

}
