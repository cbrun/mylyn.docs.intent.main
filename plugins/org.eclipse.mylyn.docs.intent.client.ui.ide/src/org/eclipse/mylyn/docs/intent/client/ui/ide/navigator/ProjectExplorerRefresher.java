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

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IntentProjectManager;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.ReadWriteRepositoryObjectHandlerImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;

/**
 * A Repository Client used by the IDE bridge to refresh the project explorer when the Indexer computes a new
 * Table of Contents.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ProjectExplorerRefresher extends AbstractRepositoryClient {

	/**
	 * The project to refresh.
	 */
	private IProject project;

	/**
	 * Creates a new {@link ProjectExplorerRefresher}.
	 * 
	 * @param project
	 *            the project to refresh
	 */
	public ProjectExplorerRefresher(IProject project) {
		this.project = project;
	}

	/**
	 * Creates a new {@link ProjectExplorerRefresher}, that will refresh the project explorer when the Indexer
	 * computes a new Index for the given repository.
	 * 
	 * @param project
	 *            the project that will be refreshed by this {@link ProjectExplorerRefresher} (must match a
	 *            Repository)
	 * @return a new {@link ProjectExplorerRefresher}
	 * @throws RepositoryConnectionException
	 *             if cannot correctly connect to the given repository
	 */
	public static ProjectExplorerRefresher createProjectExplorerRefresher(IProject project)
			throws RepositoryConnectionException {
		// Step 1 : Create a Repository Adapter
		Repository repository = IntentProjectManager.getRepository(project);
		final RepositoryAdapter repositoryAdapter = RepositoryCreatorHolder.getCreator()
				.createRepositoryAdapterForRepository(repository);

		// Step 2 : Creating the RepositoryObjectHandler for this client
		RepositoryObjectHandler handler = new ReadWriteRepositoryObjectHandlerImpl(repositoryAdapter);
		// listening to the Intent Index
		Set<EObject> listenedElements = new LinkedHashSet<EObject>();
		Resource repositoryIntentResource = repositoryAdapter.getResource(IntentLocations.GENERAL_INDEX_PATH);
		listenedElements.addAll(repositoryIntentResource.getContents());
		Notificator listenedElementsNotificator = new ElementListNotificator(listenedElements);
		handler.setNotificator(listenedElementsNotificator);

		// Step 4 : create the ProjectExplorer refresher
		ProjectExplorerRefresher refresher = new ProjectExplorerRefresher(project);
		refresher.addRepositoryObjectHandler(handler);
		return refresher;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient#createNotificationJob(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	protected Job createNotificationJob(RepositoryChangeNotification notification) {
		Job res = null;
		if (notification.getRightRoots().isEmpty()) {
			res = new ProjectExplorerRefreshJob(project, notification.getRightRoots().iterator().next());
		} else {
			res = new ProjectExplorerRefreshJob(project, null);
		}
		return res;
	}
}
