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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.client.ui.ide.Activator;
import org.eclipse.mylyn.docs.intent.client.ui.ide.builder.IntentNature;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

/**
 * A Job that refreshes Intent projects in the project explorer.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ProjectExplorerRefreshJob extends Job {

	/**
	 * Name to associate to this job.
	 */
	public static final String PROJECT_EXPLORER_REFRESH_JOB_NAME = "Refreshing Intent Index";

	/**
	 * The project to refresh.
	 */
	private IProject project;

	/**
	 * The element to refresh inside this project.
	 */
	private EObject elementToRefresh;

	/**
	 * Default constructor.
	 * 
	 * @param project
	 *            the project to refresh
	 * @param elementToRefresh
	 *            the element to refresh inside this project (can be null)
	 */
	public ProjectExplorerRefreshJob(IProject project, EObject elementToRefresh) {
		super(PROJECT_EXPLORER_REFRESH_JOB_NAME);
		this.project = project;
		this.elementToRefresh = elementToRefresh;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			// If project is accessible
			if (project.isAccessible() && project.getNature(IntentNature.NATURE_ID) != null) {
				// if the project explorer view is opened
				for (IWorkbenchWindow activeWorkbenchWindow : PlatformUI.getWorkbench().getWorkbenchWindows()) {
					IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();

					for (IViewReference viewRef : activePage.getViewReferences()) {
						if (ProjectExplorer.VIEW_ID.equals(viewRef.getId())) {
							// We refresh the project explorer on this project
							final ProjectExplorer projectExplorer = (ProjectExplorer)viewRef.getView(false);
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									refreshProjectExplorer(projectExplorer);
								}
							});
						}
					}
				}
			}
		} catch (CoreException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Error while refreshing the project explorer view");
		}
		return Status.OK_STATUS;
	}

	/**
	 * Refreshes the project explorer.
	 * 
	 * @param projectExplorer
	 *            the project explorer to refresh
	 */
	private void refreshProjectExplorer(final ProjectExplorer projectExplorer) {
		CommonViewer commonViewer = projectExplorer.getCommonViewer();
		if (elementToRefresh != null) {
			// We try to refresh the element container (if not null)
			if (elementToRefresh.eContainer() != null) {
				commonViewer.refresh(elementToRefresh.eContainer(), true);
			} else {
				commonViewer.refresh(elementToRefresh, true);
			}
		} else {
			commonViewer.refresh(project, true);
		}
	}
}
