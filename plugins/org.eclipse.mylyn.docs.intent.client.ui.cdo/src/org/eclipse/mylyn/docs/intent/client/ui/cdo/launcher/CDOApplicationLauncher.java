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
package org.eclipse.mylyn.docs.intent.client.ui.cdo.launcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.eresource.EresourcePackage;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.client.compiler.launcher.CompilerCreator;
import org.eclipse.mylyn.docs.intent.client.ui.cdo.widgets.IndexWidget;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.collab.cdo.notification.CDORepositoryChangeNotificationFactory;
import org.eclipse.mylyn.docs.intent.collab.cdo.repository.CDOConfig;
import org.eclipse.mylyn.docs.intent.collab.cdo.utils.CDORepositoryCreator;
import org.eclipse.mylyn.docs.intent.collab.cdo.utils.IntentRepositoryConnectionSettingsForCDO;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactoryHolder;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
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
 * Launch all the clients needed by the ui application (Compiler, Synchronizer...).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class CDOApplicationLauncher {

	private static Repository repository;

	/**
	 * CDOApplicationLauncher constructor.
	 */
	private CDOApplicationLauncher() {

	}

	private static void connect() throws RepositoryConnectionException {
		if (repository == null) {
			CDOConfig cdoConfig = new CDOConfig(
					IntentRepositoryConnectionSettingsForCDO.REPOSITORY_COMPLETE_ADRESS,
					IntentRepositoryConnectionSettingsForCDO.REPOSITORY_NAME);
			RepositoryCreatorHolder.setCreator(new CDORepositoryCreator());
			RepositoryChangeNotificationFactoryHolder
					.setChangeNotificationFactory(new CDORepositoryChangeNotificationFactory());
			repository = RepositoryCreatorHolder.getCreator().createRepository(cdoConfig);
			// repository.getPackageRegistry().put(MarkupPackage.eNS_URI, MarkupPackage.eINSTANCE);
			repository.getPackageRegistry().put(IntentIndexerPackage.eNS_URI, IntentIndexerPackage.eINSTANCE);
			repository.getPackageRegistry().put(CompilerPackage.eNS_URI, CompilerPackage.eINSTANCE);
			repository.getPackageRegistry().put(IntentDocumentPackage.eNS_URI, IntentDocumentPackage.eINSTANCE);
			repository.getPackageRegistry().put(ModelingUnitPackage.eNS_URI, ModelingUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(DescriptionUnitPackage.eNS_URI,
					DescriptionUnitPackage.eINSTANCE);
			repository.getPackageRegistry().put(GenericUnitPackage.eNS_URI, GenericUnitPackage.eINSTANCE);

			repository.getPackageRegistry().put(EresourcePackage.eNS_URI, EresourcePackage.eINSTANCE);
		}
	}

	// FIXME remove hardcoded strings
	public static void intializeContent() {
		try {
			connect();
			List<String> filesToLoad = new ArrayList<String>();
			filesToLoad
					.add("E:/workspace/helios/org.eclipse.mylyn.docs.intent/org.eclipse.mylyn.docs.intent.client.ui.cdo/samples/document.intent");
			initializeWithSampleContent(repository, filesToLoad);
		} catch (RepositoryConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Launch all the clients needed by the ui application (Compiler, Synchronizer...).
	 */
	public static void initializeClients() {

		try {
			connect();
		} catch (RepositoryConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2 : launching all the need clients.
		// Step 2.1 : compiler
		Runnable runnable = new Runnable() {

			public void run() {
				try {

					CompilerCreator.createCompilerClient(repository);
				} catch (RepositoryConnectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(runnable);
		t.start();

		// Step 2.2 : indexer
		// IndexerCreator.launchIndexer(repository);

	}

	public static void openElement() {
		try {

			connect();
			IndexWidget.createIndexWidget(repository);
		} catch (RepositoryConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// FIXME remove hardcoded strings
	private static void initializeWithSampleContent(Repository consideredRepository, List<String> filesToLoad)
			throws RepositoryConnectionException {

		CDOSession session = (CDOSession)consideredRepository.getOrCreateSession();
		CDOTransaction transaction = session.openTransaction();
		Resource cdoResourceIndex = transaction.getOrCreateResource(IntentLocations.GENERAL_INDEX_PATH);
		cdoResourceIndex.getContents().add(IntentIndexerFactory.eINSTANCE.createIntentIndex());
		Resource cdoResource = transaction.getOrCreateResource(IntentLocations.INTENT_INDEX);
		if (cdoResource.getContents().size() == 0) {
			cdoResource.getContents().clear();
			try {
				List<EObject> elementsToUpload = new ArrayList<EObject>();
				IntentParser parser = new IntentParser();

				for (String filePath : filesToLoad) {

					EObject parsedObject = parser.parse(FileToStringConverter.getFileAsString(new File(
							filePath)));
					elementsToUpload.add(parsedObject);
				}

				for (EObject objectToCopy : elementsToUpload) {
					cdoResource.getContents().add(EcoreUtil.copy(objectToCopy));
					System.out.println("parsed : " + objectToCopy.eClass().getName() + "/"
							+ objectToCopy.toString());

				}

				// Also creating index
				// Resource cdoResourceIndex = transaction.getOrCreateResource("/Intent/Index");

				// Step : closing the session
				transaction.commit();
			} catch (ParseException e1) {
				// we don't treat this exception because it's just an example
				System.out.println(e1);
			} catch (IOException e1) {
				// we don't treat this exception because it's just an example
				System.err.println(e1);
				IntentUiLogger.logError(e1);

			} catch (CommitException e) {
				// we do nothing because it's a sample action
				throw new RuntimeException("Commit Exception", e);
			}
		} else {
			transaction.rollback();
		}
		transaction.close();

	}

}
