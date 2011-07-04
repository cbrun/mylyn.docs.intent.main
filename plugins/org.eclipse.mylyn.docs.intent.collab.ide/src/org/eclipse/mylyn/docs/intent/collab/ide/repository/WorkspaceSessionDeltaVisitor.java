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
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.ide.adapters.WorkspaceAdapter;

/**
 * Visitor of Delta listened by the WorkpaseSession that calculate the list of emfRessources that have
 * changed, added or deleted.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceSessionDeltaVisitor implements IResourceDeltaVisitor {

	/**
	 * The WorkspaceRepository resource set used to access the EMF Resources.
	 */
	protected WorkspaceAdapter repositoryAdapter;

	/**
	 * All the EMF resource of the WorkspaceRepository that have changed.
	 */
	protected Collection<Resource> changedResources;

	/**
	 * All the EMF resource of the WorkspaceRepository that have been removed of this repository.
	 */
	protected Collection<Resource> removedResources;

	/**
	 * The path indicating the location of the listened WorkspaceRepository.
	 */
	private String repositoryPath;

	/**
	 * WorkspaceSessionDeltaVisitor constructor.
	 * 
	 * @param repositoryAdapter
	 *            the WorkspaceRepository resource set used to access the EMF Resources
	 * @param repositoryPath
	 *            the path indicating the location of the listened WorkspaceRepository
	 */
	public WorkspaceSessionDeltaVisitor(WorkspaceAdapter repositoryAdapter, Path repositoryPath) {
		this.repositoryAdapter = repositoryAdapter;
		this.changedResources = new ArrayList<Resource>();
		this.removedResources = new ArrayList<Resource>();
		this.repositoryPath = repositoryPath.toString();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
	 */
	public boolean visit(IResourceDelta delta) {
		if (delta.getResource().getType() != IResource.FILE) {
			return true;
		}

		if (isRelevantModification(delta) && delta.getResource().isAccessible()) {

			// We first calculate the repository relative path for this resource
			String repositoryRelativePath = delta.getFullPath().removeFileExtension().toString();
			repositoryRelativePath = repositoryRelativePath.replaceFirst(repositoryPath, "");

			// TODO check for regressions
			// was: Resource resource = repositoryAdapter.getResource(repositoryRelativePath, false);
			Resource resource = repositoryAdapter.getResource(repositoryRelativePath, true);
			if (resource != null) {
				switch (delta.getKind()) {
					case IResourceDelta.REMOVED:
						removedResources.add(resource);
						break;

					case IResourceDelta.ADDED:
					case IResourceDelta.CHANGED:
						changedResources.add(resource);
						break;

					default:
						break;
				}
			}

		}

		return true;
	}

	/**
	 * Indicates if the given delta describes a relevant modification.
	 * 
	 * @param delta
	 *            the visited delta
	 * @return true if the given delta describes a relevant modification false otherwise
	 */
	private boolean isRelevantModification(IResourceDelta delta) {
		// First of all, we test if this delta describes an deletion, an addition or a modification
		boolean isRelevantModification = (delta.getKind() == IResourceDelta.REMOVED)
				|| (delta.getKind() == IResourceDelta.CHANGED) || delta.getKind() == IResourceDelta.ADDED;
		// The we ensure that this delta isn't a touch or a marker modification
		isRelevantModification = isRelevantModification && ((delta.getFlags() & IResourceDelta.MARKERS) == 0);
		return isRelevantModification;
	}

	/**
	 * Returns all the EMF resource of the WorkspaceRepository that have changed.
	 * 
	 * @return all the EMF resource of the WorkspaceRepository that have changed
	 */
	public Collection<Resource> getChangedResources() {
		return changedResources;
	}

	/**
	 * Returns all the EMF resource of the WorkspaceRepository that have been removed of this repository.
	 * 
	 * @return all the EMF resource of the WorkspaceRepository that have been removed of this repository
	 */
	public Collection<Resource> getRemovedResources() {
		return removedResources;
	}
}
