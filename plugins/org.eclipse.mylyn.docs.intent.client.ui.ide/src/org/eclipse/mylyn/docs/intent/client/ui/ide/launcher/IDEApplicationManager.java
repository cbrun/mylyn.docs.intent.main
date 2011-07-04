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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.eresource.EresourcePackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.client.compiler.launcher.CompilerCreator;
import org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection.CompilerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.IndexerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.launcher.IndexerCreator;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.synchronizer.launcher.SynchronizerCreator;
import org.eclipse.mylyn.docs.intent.client.ui.ide.builder.IntentNature;
import org.eclipse.mylyn.docs.intent.client.ui.ide.generatedelementlistener.IDEGeneratedElementListener;
import org.eclipse.mylyn.docs.intent.client.ui.ide.structurer.IntentWorkspaceRepositoryStructurer;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactoryHolder;
import org.eclipse.mylyn.docs.intent.collab.ide.notification.WorkspaceRepositoryChangeNotificationFactory;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceConfig;
import org.eclipse.mylyn.docs.intent.collab.ide.utils.MonitoringUtil;
import org.eclipse.mylyn.docs.intent.collab.ide.utils.WorkspaceRepositoryCreator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.parser.IntentParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.utils.FileToStringConverter;

/**
 * In charge of creating the repository and launching clients in the context of a Workspace Intent Repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IDEApplicationManager {

	private static Map<IProject, Repository> repositories = new HashMap<IProject, Repository>();

	private static CompilerRepositoryClient compilerClient;

	private static SynchronizerRepositoryClient synchronizerClient;

	private static IndexerRepositoryClient indexerClient;

	/**
	 * IDEApplicationManager constructor.
	 */
	private IDEApplicationManager() {

	}

	/**
	 * Initialize the repository and the RepositoryCreator (if needed).
	 * 
	 * @param project
	 *            the project to connect
	 * @throws RepositoryConnectionException
	 *             if the connection to the repository is invalid
	 */
	public static void connect(IProject project) throws RepositoryConnectionException {
		if (getRepository(project) == null) {
			// We first create a configuration
			WorkspaceConfig wpConfig = new WorkspaceConfig(project, IntentLocations.INDEXES_LIST);

			// We define the structurer used to split the resources
			IntentWorkspaceRepositoryStructurer structurer = new IntentWorkspaceRepositoryStructurer();
			// We initialize the creator that will be used for creating RepositoryAdapter
			RepositoryCreatorHolder.setCreator(new WorkspaceRepositoryCreator(structurer));
			RepositoryChangeNotificationFactoryHolder
					.setChangeNotificationFactory(new WorkspaceRepositoryChangeNotificationFactory());

			// Package registry initilialization
			Repository repository = RepositoryCreatorHolder.getCreator().createRepository(wpConfig);
			// repository.getPackageRegistry().put(MarkupPackage.eNS_URI, MarkupPackage.eINSTANCE);
			repository.getPackageRegistry().put(IntentIndexerPackage.eNS_URI, IntentIndexerPackage.eINSTANCE);
			repository.getPackageRegistry().put(CompilerPackage.eNS_URI, CompilerPackage.eINSTANCE);
			repository.getPackageRegistry().put(IntentDocumentPackage.eNS_URI,
					IntentDocumentPackage.eINSTANCE);
			repository.getPackageRegistry().put(ModelingUnitPackage.eNS_URI, ModelingUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(DescriptionUnitPackage.eNS_URI,
					DescriptionUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(GenericUnitPackage.eNS_URI, GenericUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(EresourcePackage.eNS_URI, EresourcePackage.eINSTANCE);

			repositories.put(project, repository);

		}
		getRepository(project).getOrCreateSession();
	}

	/**
	 * Initializes the repository with sample content (search for a file 'document.intent' in the project).
	 * FIXME: could be managed by a builder
	 */
	public static void initializeContent() {
		IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allProjects) {
			try {
				if (project.isAccessible() && project.getNature(IntentNature.NATURE_ID) != null) {
					try {
						connect(project);
						List<String> filesToLoad = new ArrayList<String>();
						if (project.exists()) {
							if (!project.isOpen()) {
								project.open(null);
							}
						}
						IFile fileToLoad = project.getFile("/document.intent");

						// Step 2 : if the file exists, initializes the repository content with it
						if (fileToLoad.exists()) {
							filesToLoad.add(fileToLoad.getLocationURI().toString().replace("file:", ""));
							initializeWithSampleContent(getRepository(project), filesToLoad);
						}
					} catch (RepositoryConnectionException e) {
						IntentUiLogger.logError(e);
					} catch (CoreException e) {
						IntentUiLogger.logError(e);
					}
				}
			} catch (CoreException e) {
				IntentUiLogger.logError(e);
			}
		}
	}

	/**
	 * Returns the current open repository managed by this .
	 * 
	 * @param project
	 *            the project which contains the repository
	 * @return the repository
	 */
	public static Repository getRepository(IProject project) {
		return repositories.get(project);
	}

	/**
	 * Creates and Launch all the clients needed by the Intent application (Compiler, Synchronizer, Indexer).
	 */
	public static void createAndLaunchClients() {
		IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allProjects) {
			try {
				if (project.isAccessible() && project.getNature(IntentNature.NATURE_ID) != null) {
					try {
						connect(project);

						// Clients creation (if needed)
						// Compiler
						if (compilerClient == null) {
							compilerClient = CompilerCreator.createCompilerClient(getRepository(project));
						}

						// Synchronizer
						if (synchronizerClient == null) {
							synchronizerClient = SynchronizerCreator.createSynchronizer(
									getRepository(project), MonitoringUtil.createProgressMonitor(null),
									new IDEGeneratedElementListener());
						}

						// Indexer
						if (indexerClient == null) {
							indexerClient = IndexerCreator.launchIndexer(getRepository(project));
						}

						// FIXME: deactivated to avoid bug
						// Launches the needed client
						// compilerClient.handleChangeNotification(null);
						indexerClient.handleChangeNotification(null);

					} catch (RepositoryConnectionException e) {
						IntentUiLogger.logError(e);
					}
				}
			} catch (CoreException e) {
				IntentUiLogger.logError(e);
			}
		}
	}

	/**
	 * Creates a sample Widget allowing the user to choose the Intent Element to open (should be removed as
	 * the Project Explorer provides a similar behavior).
	 */
	public static void openElement() {
		// do nothing
		// TODO review semantics
		// try {
		//
		// connect();
		// IDEIndexWidget.createIndexWidget(repository);
		// } catch (RepositoryConnectionException e) {
		// IntentUiLogger.logError(e);
		// }
	}

	/**
	 * Initializes the given repository using the given list of files to load.
	 * 
	 * @param repositoryToInitialize
	 *            the repository to initialize
	 * @param filesToLoad
	 *            the files to use for initializing the repository (list of absolute paths)
	 * @throws RepositoryConnectionException
	 *             if the connection to the repository is invalid
	 */
	private static void initializeWithSampleContent(Repository repositoryToInitialize,
			List<String> filesToLoad) throws RepositoryConnectionException {
		RepositoryAdapter wpAdapter = RepositoryCreatorHolder.getCreator()
				.createRepositoryAdapterForRepository(repositoryToInitialize);

		try {

			Resource wpResourceIndex = wpAdapter.getOrCreateResource(IntentLocations.GENERAL_INDEX_PATH);
			wpResourceIndex.getContents().add(IntentIndexerFactory.eINSTANCE.createIntentIndex());
			Resource wpCompilStatusIndex = wpAdapter
					.getOrCreateResource(IntentLocations.COMPILATION_STATUS_INDEX_PATH);
			wpCompilStatusIndex.getContents().add(CompilerFactory.eINSTANCE.createCompilationStatusManager());
			Resource wpTracabilityIndexResource = wpAdapter
					.getOrCreateResource(IntentLocations.TRACEABILITY_INFOS_INDEX_PATH);
			wpTracabilityIndexResource.getContents().add(CompilerFactory.eINSTANCE.createTraceabilityIndex());

			Resource repositoryIntentResource;

			repositoryIntentResource = wpAdapter.getOrCreateResource(IntentLocations.INTENT_INDEX);

			if (repositoryIntentResource.getContents().size() == 0) {
				repositoryIntentResource.getContents().clear();

				List<EObject> elementsToUpload = new ArrayList<EObject>();
				IntentParser parser = new IntentParser();

				for (String filePath : filesToLoad) {
					EObject parsedObject = parser.parse(FileToStringConverter.getFileAsString(new File(
							filePath)));
					elementsToUpload.add(parsedObject);
				}

				for (EObject objectToCopy : elementsToUpload) {
					repositoryIntentResource.getContents().add(EcoreUtil.copy(objectToCopy));
				}

				// Step : closing the session
				wpAdapter.save();
			} else {
				wpAdapter.undo();
			}
		} catch (ParseException e) {
			IntentUiLogger.logError(e);
		} catch (IOException e) {
			IntentUiLogger.logError(e);
		} catch (ReadOnlyException e) {
			IntentUiLogger.logError(e);
		} catch (SaveException e) {
			IntentUiLogger.logError(e);
		}
		wpAdapter.closeContext();
	}
}
