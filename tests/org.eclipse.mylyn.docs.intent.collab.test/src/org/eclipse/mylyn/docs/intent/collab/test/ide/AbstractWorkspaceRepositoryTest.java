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
package org.eclipse.mylyn.docs.intent.collab.test.ide;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.ReadWriteRepositoryObjectHandlerImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.typeListener.TypeNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactoryHolder;
import org.eclipse.mylyn.docs.intent.collab.ide.notification.WorkspaceRepositoryChangeNotificationFactory;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceConfig;
import org.eclipse.mylyn.docs.intent.collab.ide.utils.WorkspaceRepositoryCreator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.test.AbstractRepositoryTest;
import org.eclipse.mylyn.docs.intent.collab.test.clients.ListenerOnlyTestRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.test.clients.RepositoryWriterTestRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.test.ide.utils.IDETestUtils;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;
import org.eclipse.mylyn.docs.intent.collab.test.settings.TestCollabSettings;
import org.eclipse.mylyn.docs.intent.collab.test.structurer.TestRepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;

/**
 * Abstract class for any test relative to a WorkspaceRepository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractWorkspaceRepositoryTest extends AbstractRepositoryTest {

	/**
	 * Indicates the name of the test Project (in which we will create the repository).
	 */
	private static String WORKSPACE_REPOSITORY_PROJECT_NAME = "Test/";

	/**
	 * A sample client for testing this repository.
	 */
	protected ListenerOnlyTestRepositoryClient listeningClient;

	/**
	 * A sample client for testing this repository.
	 */
	protected RepositoryWriterTestRepositoryClient writingClient;

	/**
	 * A set containing elements created during initialization and that client should listen.
	 */
	protected Set<AbstractTestClass> listenedTestElements;

	/**
	 * A set containing elements created during initialization and that shouldn't be listened by any client.
	 */
	protected Set<AbstractTestClass> nonListenedTestElements;

	private IProject repositoryProject;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.test.AbstractRepositoryTest#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// We first have to create a test project
		repositoryProject = IDETestUtils.createNewProjet(WORKSPACE_REPOSITORY_PROJECT_NAME);
		super.setUp();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.test.AbstractRepositoryTest#createRepository()
	 */
	@Override
	public Repository createRepository() {

		// For creating Workspace Repository (step by step) :
		// Step 1 : General configuration
		// Step 1.1 : create a WorkspaceConfig (defining the location of the repository : relative path from
		// platform:/).
		WorkspaceConfig wpConfig = new WorkspaceConfig(repositoryProject,
				TestCollabSettings.INDEXES_PATH);

		// Step 1.2 : defining a structurer that will structure the repository content
		// here we use a structurer to handle the splitting strategy
		// this structurer will be called before any save action to restructure the repository content
		RepositoryStructurer structurer = new TestRepositoryStructurer();

		// Step 1.3 : Defining the repositoryCreator, that will be used for creating repository and repository
		// adapters.
		RepositoryCreatorHolder.setCreator(new WorkspaceRepositoryCreator(structurer));

		// Step 1.4 : Defining the changeNotificationFactory
		RepositoryChangeNotificationFactoryHolder
				.setChangeNotificationFactory(new WorkspaceRepositoryChangeNotificationFactory());

		// Step 2 : use of this configuration to create the repository (can be done at any time and any place)
		Repository createdrepository = null;
		try {
			// Step 2.1 : creating the repository
			createdrepository = RepositoryCreatorHolder.getCreator().createRepository(wpConfig);

			// Step 2.2 (optional) : setting the repository's package registry content
			createdrepository.getPackageRegistry().put(TestPackagePackage.eNS_URI,
					TestPackagePackage.eINSTANCE);

		} catch (RepositoryConnectionException e) {
			// As this a test, we expect that the repository can be accessed
		}
		return createdrepository;
	}

	/**
	 * Creates a {@link ListenerOnlyTestRepositoryClient} and a {@link RepositoryWriterTestRepositoryClient}.
	 */
	protected void createTypeListeningClients() {
		if (listeningClient == null) {
			try {
				// Step 1 : creating the listening client
				// Step 1.1 : defining the listened features (here the attribute To Listen of sampleClass1)
				Set<EStructuralFeature> listenedTypes = new HashSet<EStructuralFeature>();
				listenedTypes.add(TestPackagePackage.eINSTANCE.getTestClass1_TheAttributeToListen());

				// Step 1.2 : create the handler for these types
				final RepositoryAdapter repositoryAdapterForListeningClient = RepositoryCreatorHolder
						.getCreator().createRepositoryAdapterForRepository(repository);
				RepositoryObjectHandler handler = new ReadWriteRepositoryObjectHandlerImpl(
						repositoryAdapterForListeningClient);
				Notificator notificator = new TypeNotificator(listenedTypes);
				handler.setNotificator(notificator);

				// Step 1.3 : create the client
				listeningClient = new ListenerOnlyTestRepositoryClient(this);
				listeningClient.addRepositoryObjectHandler(handler);

				// Step 2 : creating the writing client
				// Step 2.1 : no types listened
				listenedTypes.clear();
				// Step 2.2 : handler creation
				final RepositoryAdapter repositoryAdapterForWritingClient = RepositoryCreatorHolder
						.getCreator().createRepositoryAdapterForRepository(repository);
				repositoryAdapterForWritingClient.setSendSessionWarningBeforeSaving(false);
				handler = new ReadWriteRepositoryObjectHandlerImpl(repositoryAdapterForWritingClient);

				// Step 2.3 : create the client
				writingClient = new RepositoryWriterTestRepositoryClient(this);
				writingClient.addRepositoryObjectHandler(handler);

			} catch (RepositoryConnectionException e) {
				// As this a test, we expect that the repository can be accessed
			}
		}
	}

	/**
	 * Creates a {@link ListenerOnlyTestRepositoryClient} and a {@link RepositoryWriterTestRepositoryClient}.
	 */
	protected void createElementListeningClients() {
		if (listeningClient == null) {
			try {
				// Step 1 : creating the listening client
				// Step 1.1 : defining the listened elements
				Set<EObject> listenedElements = new HashSet<EObject>();
				listenedElements.addAll(this.listenedTestElements);

				// Step 1.2 : create the handler for these types
				final RepositoryAdapter repositoryAdapterForListeningClient = RepositoryCreatorHolder
						.getCreator().createRepositoryAdapterForRepository(repository);
				RepositoryObjectHandler handler = new ReadWriteRepositoryObjectHandlerImpl(
						repositoryAdapterForListeningClient);
				Notificator notificator = new ElementListNotificator(listenedElements);
				handler.setNotificator(notificator);

				// Step 1.3 : create the client
				listeningClient = new ListenerOnlyTestRepositoryClient(this);
				listeningClient.addRepositoryObjectHandler(handler);

				// Step 2 : creating the writing client
				// Step 2.1 : no types listened
				listenedElements.clear();
				// Step 2.2 : handler creation
				final RepositoryAdapter repositoryAdapterForWritingClient = RepositoryCreatorHolder
						.getCreator().createRepositoryAdapterForRepository(repository);
				handler = new ReadWriteRepositoryObjectHandlerImpl(repositoryAdapterForWritingClient);
				// Step 2.3 : create the client
				writingClient = new RepositoryWriterTestRepositoryClient(this);
				writingClient.addRepositoryObjectHandler(handler);

			} catch (RepositoryConnectionException e) {
				// As this a test, we expect that the repository can be accessed
			}
		}
	}

	/**
	 * Initializes the repository with sample elements (in order that the clients can listenned to these
	 * elements).
	 */
	protected void initializeContent() {
		RepositoryAdapter adapter = null;
		try {
			adapter = RepositoryCreatorHolder.getCreator().createRepositoryAdapterForRepository(repository);

			adapter.openSaveContext();
			Resource indexResource = adapter.getResource(TestCollabSettings.TEST_INDEX);
			TestIndex testIndex = (TestIndex)indexResource.getContents().get(0);
			// Sample content creation
			TestClass1 testClass1 = TestPackageFactory.eINSTANCE.createTestClass1();
			testClass1.setName("sampleTestClass1");
			testClass1.setTheAttributeToListen("theSampleAttributeToListen");
			listenedTestElements.add(testClass1);
			TestIndexEntry indexEntry1 = TestPackageFactory.eINSTANCE.createTestIndexEntry();
			indexEntry1.setReferencedElement(testClass1);

			TestClass1 testClass1NotListened = TestPackageFactory.eINSTANCE.createTestClass1();
			testClass1NotListened.setName("sampleTestClass1-notListened");
			testClass1NotListened.setTheAttributeToListen("theSampleAttributeNotToListen");
			nonListenedTestElements.add(testClass1NotListened);
			TestIndexEntry indexEntry2 = TestPackageFactory.eINSTANCE.createTestIndexEntry();
			indexEntry2.setReferencedElement(testClass1NotListened);

			TestClass2 testClass2 = TestPackageFactory.eINSTANCE.createTestClass2();
			testClass2.setName("sampleTestClass2");
			TestIndexEntry indexEntry3 = TestPackageFactory.eINSTANCE.createTestIndexEntry();
			indexEntry3.setReferencedElement(testClass2);
			listenedTestElements.add(testClass2);

			// Save the added informations in the index

			testIndex.getEntries().add(indexEntry1);
			testIndex.getEntries().add(indexEntry2);
			testIndex.getEntries().add(indexEntry3);
			adapter.save();

			adapter.closeContext();
		} catch (RepositoryConnectionException e) {
			// As this a test, we expect that the repository can be accessed
		} catch (ReadOnlyException e) {
			// Cannot occur as we have opened a save context
		} catch (SaveException e) {
			e.printStackTrace();
			try {
				adapter.undo();
			} catch (ReadOnlyException e1) {
				// Cannot occur as we have opened a save context
			}
		}

	}

}
