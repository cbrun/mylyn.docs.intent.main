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
package org.eclipse.mylyn.docs.intent.client.ui.ide.wizards;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.mylyn.docs.intent.client.ui.ide.builder.ToggleNatureAction;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IDEApplicationManager;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IntentProjectManager;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * The Intent project creation wizard.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class NewIntentProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	protected WizardNewProjectCreationPage page;

	protected IConfigurationElement configElement;

	/**
	 * Constructor.
	 */
	public NewIntentProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("New Intent Project"); //$NON-NLS-1$
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new WizardNewProjectCreationPage("New Intent project"); //$NON-NLS-1$
		page.setTitle("New Intent project"); //$NON-NLS-1$
		page.setDescription("Select project name"); //$NON-NLS-1$
		addPage(page);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IWorkspaceRunnable create = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(page.getProjectName());
				IPath location = page.getLocationPath();
				if (!project.exists()) {
					IProjectDescription desc = project.getWorkspace().newProjectDescription(
							page.getProjectName());
					if (location != null
							&& ResourcesPlugin.getWorkspace().getRoot().getLocation().equals(location)) {
						location = null;
					}
					desc.setLocation(location);
					project.create(desc, monitor);
					project.open(monitor);
				}
				if (!project.isOpen()) {
					project.open(monitor);
				}
				IDEApplicationManager.initializeContent(project, getInitialContent());
				ToggleNatureAction.toggleNature(project);
				IntentProjectManager.getInstance(project).launchIndexer();
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(create, null);
			return true;
		} catch (CoreException e) {
			IntentUiLogger.logError(e);
			return false;
		}
	}

	/**
	 * Get the initial content.
	 * 
	 * @return the initial content as String
	 * @throws IOException
	 */
	private String getInitialContent() {
		try {
			String result = "";
			InputStream fis = this.getClass().getResourceAsStream("sample.intent");
			BufferedInputStream bis = null;
			BufferedReader dis = null;
			StringBuffer sb = new StringBuffer();

			bis = new BufferedInputStream(fis);
			dis = new BufferedReader(new InputStreamReader(bis));

			while (dis.ready()) {
				sb.append(dis.readLine() + "\n");
			}

			fis.close();
			bis.close();
			dis.close();

			result = sb.toString();
			return result;
		} catch (IOException e) {
			IntentUiLogger.logError(e);
		}
		return "Document {\n}";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
	 *      java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		this.configElement = config;
	}
}
