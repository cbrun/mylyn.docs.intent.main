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
package org.eclipse.mylyn.docs.intent.client.ui.ide.launcher;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.eresource.EresourcePackage;
import org.eclipse.mylyn.docs.intent.client.compiler.launcher.CompilerCreator;
import org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection.CompilerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.IndexerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.launcher.IndexerCreator;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.synchronizer.launcher.SynchronizerCreator;
import org.eclipse.mylyn.docs.intent.client.ui.ide.builder.IntentNature;
import org.eclipse.mylyn.docs.intent.client.ui.ide.generatedelementlistener.IDEGeneratedElementListener;
import org.eclipse.mylyn.docs.intent.client.ui.ide.navigator.ProjectExplorerRefresher;
import org.eclipse.mylyn.docs.intent.client.ui.ide.structurer.IntentWorkspaceRepositoryStructurer;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactoryHolder;
import org.eclipse.mylyn.docs.intent.collab.ide.notification.WorkspaceRepositoryChangeNotificationFactory;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceConfig;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;

/**
 * Handles an Intent Project lifecycle :
 * <ul>
 * <li>Create/Delete the Repository</li>
 * <li>Launch/Stop Intent Clients</li>.
 * </ul>
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentProjectManager {

	/**
	 * The list of created {@link IntentProjectManager}s, associated to the corresponding project.
	 */
	private static Map<IProject, IntentProjectManager> projectManagers = new HashMap<IProject, IntentProjectManager>();

	private CompilerRepositoryClient compilerClient;

	private SynchronizerRepositoryClient synchronizerClient;

	private IndexerRepositoryClient indexerClient;

	private ProjectExplorerRefresher refresher;

	/**
	 * The project associated to this IntentProjectManager (must be associated to the Intent nature).
	 */
	private IProject project;

	private Repository repository;

	/**
	 * Default constructor.
	 * 
	 * @param project
	 *            the project to associate to this IntentProjectManager (must be associated to the Intent
	 *            nature)
	 */
	private IntentProjectManager(IProject project) {
		this.project = project;
	}

	/**
	 * Creates and Launch all the clients needed by the Intent application :
	 * <ul>
	 * <li>Compiler</li>
	 * <li>Synchronizer</li>
	 * <li>Indexer</li>
	 * <li>Project Explorer Refresher.</li>
	 * </ul>
	 * 
	 * @throws RepositoryConnectionException
	 *             if the {@link Repository} cannot be created or accessed
	 */
	public void createAndLaunchClients() throws RepositoryConnectionException {
		try {
			if (project.isAccessible() && project.getNature(IntentNature.NATURE_ID) != null) {
				connect();

				// Clients creation (if needed)
				// Compiler
				if (compilerClient == null) {
					compilerClient = CompilerCreator.createCompilerClient(getRepository());
				}

				// Synchronizer
				if (synchronizerClient == null) {
					synchronizerClient = SynchronizerCreator.createSynchronizer(getRepository(),
							new IDEGeneratedElementListener());
				}

				// Indexer
				if (indexerClient == null) {
					indexerClient = IndexerCreator.launchIndexer(getRepository());
				}

				// Project explorer refresher
				if (refresher == null) {
					refresher = ProjectExplorerRefresher.createProjectExplorerRefresher(project);
				}

			} else {
				IntentUiLogger.logError(new RepositoryConnectionException(
						"Cannot create Repository on project " + project.getName()));
			}
		} catch (CoreException e) {
			throw new RepositoryConnectionException(e.getMessage());
		}
	}

	/**
	 * Connects to the {@link Repository}.
	 * 
	 * @throws RepositoryConnectionException
	 *             if the {@link Repository} cannot be created or accessed
	 */
	public void connect() throws RepositoryConnectionException {
		getRepository().getOrCreateSession();
	}

	/**
	 * Disconnects the given project by closing the session and the repository.
	 * 
	 * @throws RepositoryConnectionException
	 *             if the {@link Repository} cannot be deleted or accessed
	 */
	public void disconnect() throws RepositoryConnectionException {
		getRepository().closeSession();
		repository = null;
		projectManagers.remove(this);
	}

	/**
	 * Gets or creates the {@link Repository} associated to the considered project.
	 * 
	 * @return the {@link Repository} associated to the considered project
	 * @throws RepositoryConnectionException
	 *             if the {@link Repository} cannot be created or accessed
	 */
	private Repository getRepository() throws RepositoryConnectionException {
		if (this.repository == null) {

			// Step 1 : create the Repository configuration
			WorkspaceConfig wpConfig = new WorkspaceConfig(project, IntentLocations.INDEXES_LIST);

			// Step 2 : define a structurer used to split the repository resources
			IntentWorkspaceRepositoryStructurer structurer = new IntentWorkspaceRepositoryStructurer();

			// Step 3 : initialize the creator that will be used for creating RepositoryAdapter
			if (RepositoryCreatorHolder.getCreator() == null) {
				RepositoryCreatorHolder.setCreator(new IntentWorkspaceRepositoryCreator(structurer));
			}
			// Step 4 : initialize the Notification Factory
			if (RepositoryChangeNotificationFactoryHolder.getChangeNotificationFactory() == null) {
				RepositoryChangeNotificationFactoryHolder
						.setChangeNotificationFactory(new WorkspaceRepositoryChangeNotificationFactory());
			}

			// Step 5 : initialize the Repository's Package registry
			repository = RepositoryCreatorHolder.getCreator().createRepository(wpConfig);
			repository.getPackageRegistry().put(IntentIndexerPackage.eNS_URI, IntentIndexerPackage.eINSTANCE);
			repository.getPackageRegistry().put(CompilerPackage.eNS_URI, CompilerPackage.eINSTANCE);
			repository.getPackageRegistry().put(IntentDocumentPackage.eNS_URI,
					IntentDocumentPackage.eINSTANCE);
			repository.getPackageRegistry().put(ModelingUnitPackage.eNS_URI, ModelingUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(DescriptionUnitPackage.eNS_URI,
					DescriptionUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(GenericUnitPackage.eNS_URI, GenericUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(EresourcePackage.eNS_URI, EresourcePackage.eINSTANCE);
		}
		return repository;
	}

	/**
	 * Returns the {@link Repository} associated to the given Intent project.
	 * 
	 * @param project
	 *            the Intent project to get the Repository from
	 * @return the {@link Repository} associated to the given Intent project
	 */
	public static Repository getRepository(IProject project) {
		try {
			return getInstance(project).getRepository();
		} catch (RepositoryConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns the {@link IntentProjectManager} handling the given Intent project. If no IntentProjectManager
	 * is associated to this project, creates a new one.
	 * 
	 * @param project
	 *            the Intent project to get the {@link IntentProjectManager} from
	 * @return the {@link IntentProjectManager} handling the given Intent project
	 */
	public static IntentProjectManager getInstance(IProject project) {
		if (projectManagers.get(project) == null) {
			projectManagers.put(project, new IntentProjectManager(project));
		}
		return projectManagers.get(project);
	}

	/**
	 * Indicates if the given project is handled by a {@link IntentProjectManager}.
	 * 
	 * @param project
	 *            the project to test
	 * @return true if the given project is handled by a {@link IntentProjectManager}, false otherwise
	 */
	public static boolean isManagedProject(IProject project) {
		return projectManagers.get(project) != null;
	}

	public void launchIndexer() {
		// Indexer
		if (indexerClient == null) {
			try {
				indexerClient = IndexerCreator.launchIndexer(getRepository());
			} catch (RepositoryConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		indexerClient.handleChangeNotification(null);
	}

	public void launchSynchronizer() {
		if (synchronizerClient == null) {
			try {
				synchronizerClient = SynchronizerCreator.createSynchronizer(getRepository(),
						new IDEGeneratedElementListener());
			} catch (RepositoryConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronizerClient.handleChangeNotification(null);
	}
}
