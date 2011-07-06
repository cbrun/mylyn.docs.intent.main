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
package org.eclipse.mylyn.docs.intent.client.ui.editor.outline;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.mylyn.docs.intent.client.ui.IntentEditorActivator;

/**
 * The job class to refresh the outline view.
 * 
 * @author <a href="mailto:jonathan.musset@obeo.fr">Jonathan Musset</a>
 */
class RefreshOutlineJob {

	private static final String REFRESH_VIEW_JOB_NAME = "refreshIntentOutlineView";

	/**
	 * Time to wait before actually refreshing the outline (in case another notification is received by the
	 * document Provider.
	 */
	private static final long OUTLINE_REFESH_DELAY = 200;

	/**
	 * The element to refresh.
	 */
	Object element;

	/**
	 * The internal job used by this RefreshViewJob.
	 */
	Job refreshJob;

	/**
	 * The outlinePage to refresh.
	 */
	private IntentOutlinePage outlinePage;

	/**
	 * RefreshViewJob constructor.
	 * 
	 * @param outlinePage
	 *            the outlinePage to refresh
	 */
	public RefreshOutlineJob(IntentOutlinePage outlinePage) {
		this.outlinePage = outlinePage;
	}

	/**
	 * Refreshes the view for the given element.
	 * 
	 * @param elem
	 *            is the element to refresh
	 */
	public void refreshView(Object elem) {

		if (refreshJob != null) {
			refreshJob.cancel();
		}
		this.element = elem;
		refreshJob = new Job(REFRESH_VIEW_JOB_NAME) { //$NON-NLS-1$

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if ((outlinePage.getControl() != null) && (!outlinePage.getControl().isDisposed())) {
					outlinePage.getTreeViewer().getControl().getDisplay().asyncExec(new Runnable() {
						public void run() {
							outlinePage.refreshInternalContainer(element);
						}
					});
				} else {
					/*
					 * Assume that this was completed successfully : happened because the user closed the
					 * editor or switched perspective.
					 */
				}
				return new Status(IStatus.OK, IntentEditorActivator.PLUGIN_ID, "Outline correctly refreshed"); //$NON-NLS-1$
			}
		};
		refreshJob.setPriority(Job.DECORATE);
		refreshJob.setSystem(true);
		refreshJob.schedule(OUTLINE_REFESH_DELAY);
	}
}
