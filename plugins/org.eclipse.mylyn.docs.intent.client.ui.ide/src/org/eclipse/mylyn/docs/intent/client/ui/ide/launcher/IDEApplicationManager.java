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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection.CompilerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.IndexerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.ui.ide.builder.IntentNature;
import org.eclipse.mylyn.docs.intent.client.ui.ide.navigator.ProjectExplorerRefresher;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;
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

	private static ProjectExplorerRefresher refresher;

	/**
	 * IDEApplicationManager constructor.
	 */
	private IDEApplicationManager() {

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
						IntentProjectManager.getInstance(project).connect();
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
							initializeWithSampleContent(IntentProjectManager.getRepository(project),
									filesToLoad);
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
	 * Initializes the project with sample content.
	 * 
	 * @param project
	 *            the project to initialize
	 * @param initialContent
	 *            the initialContent
	 */
	public static void initializeContent(IProject project, String initialContent) {
		try {
			if (project.isAccessible()) {
				IntentProjectManager.getInstance(project).connect();
				if (project.exists()) {
					if (!project.isOpen()) {
						project.open(null);
					}
				}
				initializeWithSampleContent(IntentProjectManager.getRepository(project), initialContent);
			}
		} catch (CoreException e) {
			IntentUiLogger.logError(e);
		} catch (RepositoryConnectionException e) {
			IntentUiLogger.logError(e);
		}
	}

	/**
	 * Creates a sample Widget allowing the user to choose the Intent Element to open (should be removed as
	 * the Project Explorer provides a similar behavior).
	 */
	public static void openElement() {
		IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allProjects) {
			try {
				if (project.isAccessible() && project.getNature(IntentNature.NATURE_ID) != null) {
					IntentProjectManager.getInstance(project).launchIndexer();
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	 * @throws RepositoryConnectionException
	 *             if the connection to the repository is invalid
	 */
	private static void initializeWithSampleContent(Repository repositoryToInitialize, String initialContent)
			throws RepositoryConnectionException {
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

				EObject parsedObject = parser.parse(initialContent);
				elementsToUpload.add(parsedObject);

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
		} catch (ReadOnlyException e) {
			IntentUiLogger.logError(e);
		} catch (SaveException e) {
			IntentUiLogger.logError(e);
		}
		wpAdapter.closeContext();
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
