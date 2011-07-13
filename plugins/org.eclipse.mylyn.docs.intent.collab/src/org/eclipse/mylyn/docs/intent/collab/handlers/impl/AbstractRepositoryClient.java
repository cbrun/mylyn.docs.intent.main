/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.collab.handlers.impl;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * An abstract Repository Client which manages notifications.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public abstract class AbstractRepositoryClient implements RepositoryClient {

	/**
	 * The delay to use for scheduling this Job.
	 */
	public static final long SCHEDULE_DELAY = 500;

	/**
	 * The repositoryObjectHandler notifying this indexer about any modifications on the document.
	 */
	protected RepositoryObjectHandler repositoryObjectHandler;

	/**
	 * The {@link Job} that handles notifications.
	 */
	private Job notificationJob;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.addClient(this);
		this.repositoryObjectHandler = handler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.removeClient(this);
		this.repositoryObjectHandler = null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public void handleChangeNotification(RepositoryChangeNotification notification) {
		// Step 1 : cancel previous refresh job
		if (notificationJob != null) {
			notificationJob.cancel();
		}

		// Step 2 : launching a new Job
		notificationJob = createNotificationJob(notification);
		notificationJob.schedule(SCHEDULE_DELAY);
	}

	/**
	 * Manages the creation of a new notification Job.
	 * 
	 * @param notification
	 *            the notification
	 * @return the job
	 */
	protected abstract Job createNotificationJob(RepositoryChangeNotification notification);

	public RepositoryObjectHandler getRepositoryObjectHandler() {
		return repositoryObjectHandler;
	}

}
