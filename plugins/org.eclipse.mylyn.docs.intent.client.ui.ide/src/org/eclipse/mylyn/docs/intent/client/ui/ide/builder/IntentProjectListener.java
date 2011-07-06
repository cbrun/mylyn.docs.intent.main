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
package org.eclipse.mylyn.docs.intent.client.ui.ide.builder;

import com.google.common.collect.Sets;

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IntentProjectManager;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;

/**
 * A {@link ResourceChangeListener} that reacts to the creation or opening of Intent projects by creating
 * Repository and launching clients.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentProjectListener implements IResourceChangeListener {

	/**
	 * Default constructor.
	 */
	public IntentProjectListener() {
		// We first treat the existing projects
		treatExistingIntentrojects();
	}

	/**
	 * Treats all IProjects already opened when the plugin get activated, if they are associated to the intent
	 * Nature.
	 */
	public void treatExistingIntentrojects() {
		IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allProjects) {
			try {
				if (project.isAccessible() && project.hasNature(IntentNature.NATURE_ID)) {
					handleOpenedProjects(Sets.newHashSet(project));
				}
			} catch (CoreException e) {
				IntentUiLogger.logError(e);
				try {
					// Close the project : Intent cannot work correctly
					project.close(new NullProgressMonitor());
				} catch (CoreException e1) {
					IntentUiLogger.logError(e);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org.eclipse.core.resources.IResourceChangeEvent)
	 */
	public void resourceChanged(IResourceChangeEvent event) {

		// We want to be notified AFTER any changed that occurred
		if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
			final IResourceDelta rootDelta = event.getDelta();
			// If any resource of the repository has changed
			if (rootDelta != null) {
				// We launch the analysis of the delta in a new thread
				Runnable runnable = new Runnable() {
					public void run() {
						analyseWorkspaceDelta(rootDelta);
					}
				};
				Thread t = new Thread(runnable);
				t.start();
			}
		}

	}

	/**
	 * Analyzes the given {@link IResourceDelta}.
	 * 
	 * @param repositoryDelta
	 *            the {@link IResourceDelta} to analyze
	 */
	protected void analyseWorkspaceDelta(IResourceDelta repositoryDelta) {

		try {
			// Step 1 : We visit the given delta using a IntentBuilderDeltaVisitor visitor
			final IntentBuilderDeltaVisitor visitor = new IntentBuilderDeltaVisitor();
			repositoryDelta.accept(visitor);

			// Step 2 : if any project has been opened, we handle this creation
			handleOpenedProjects(visitor.getOpenedProjects());

			// Step 2 : if any project has been opened, we handle this creation
			handleClosedProjects(visitor.getClosedProjects());

		} catch (CoreException e) {
			// TODO
		}

	}

	/**
	 * Handles the creation or opening of Intent projects by launching all clients.
	 * 
	 * @param openedProjects
	 *            the created or opened projects to handle
	 */
	public void handleOpenedProjects(Set<IProject> openedProjects) {
		for (IProject project : openedProjects) {
			IntentProjectManager projectManager = IntentProjectManager.getInstance(project);
			try {
				projectManager.createAndLaunchClients();
			} catch (RepositoryConnectionException e) {
				IntentUiLogger.logError(e);
			}

		}
	}

	/**
	 * Handles the deletion or closing of Intent projects by stopping all clients and closing repository.
	 * 
	 * @param closedProjects
	 *            the deleted or closed projects to handle
	 */
	public void handleClosedProjects(Set<IProject> closedProjects) {
		for (IProject project : closedProjects) {
			IntentProjectManager projectManager = IntentProjectManager.getInstance(project);
			try {
				projectManager.disconnect();
			} catch (RepositoryConnectionException e) {
				IntentUiLogger.logError(e);
			}
		}
	}

}
