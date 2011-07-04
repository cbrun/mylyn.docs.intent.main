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
package org.eclipse.mylyn.docs.intent.collab.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.test.assertioncontainer.NotificationAssertionContainer;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory;
import org.eclipse.mylyn.docs.intent.collab.test.settings.TestCollabSettings;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;

/**
 * Abstract class for any test relative to a {@link Repository}.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractRepositoryTest extends TestCase {

	/**
	 * The time to wait for a notification ; if this delay is over, we consider that no notification has been
	 * received.
	 */
	protected static final long TIME_OUT_DELAY = 3000;

	/**
	 * The Repository to use in the current Test.
	 */
	protected Repository repository;

	/**
	 * Represents the receivedNotifaction ; a null value represents the fact that no notification has been
	 * received.
	 */
	private RepositoryChangeNotification receivedNotification;

	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// We create the repository (if needed)
		if (repository == null) {
			repository = createRepository();
		}
		clearRepositoryContent(repository);
		initializeRepositoryContent(repository);
	}

	/**
	 * Clears the repository content.
	 * 
	 * @param repositoryToClear
	 *            the {@link Repository} to clear
	 */
	private void clearRepositoryContent(Repository repositoryToClear) {
		RepositoryAdapter repositoryAdapter = null;
		try {

			// We first get an adapter for using the repository
			repositoryAdapter = RepositoryCreatorHolder.getCreator().createRepositoryAdapterForRepository(
					repositoryToClear);
			// We open a save Context
			repositoryAdapter.openSaveContext();

			Resource indexResource = repositoryAdapter.getOrCreateResource(TestCollabSettings.TEST_INDEX);
			// If the an index was already define
			if (!(indexResource.getContents().isEmpty())) {
				// We delete all the reference objects
				TestIndex testIndex = (TestIndex)indexResource.getContents().get(0);
				for (TestIndexEntry entry : testIndex.getEntries()) {
					Resource resourceToDelete = entry.getReferencedElement().eResource();
					resourceToDelete.getContents().clear();
				}
				testIndex.getEntries().clear();
			} else {
				// Otherwise, we create an empty index
				indexResource.getContents().add(TestPackageFactory.eINSTANCE.createTestIndex());
			}
			repositoryAdapter.save();
			repositoryAdapter.closeContext();
		} catch (RepositoryConnectionException e) {
			// As this a test, we expect that the repository can be accessed
			e.printStackTrace();
		} catch (ReadOnlyException e) {
			// As we have opened a save context, this exception can never occur
			e.printStackTrace();
		} catch (SaveException e) {
			e.printStackTrace();
			try {
				repositoryAdapter.undo();
			} catch (ReadOnlyException e1) {
				// As we have opened a save context, this exception can never occur
			}
		}

	}

	/**
	 * Initializes the repository with test content (subClass can override this method to adapt the content to
	 * the test).
	 * 
	 * @param repositoryToInitialize
	 *            the {@link Repository} to initialize
	 */
	protected void initializeRepositoryContent(Repository repositoryToInitialize) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO close the repository
		super.tearDown();
	}

	/**
	 * Creates the repository which will be used by all tests ; subClasses should override this method.
	 * 
	 * @return the created repository.
	 */
	public abstract Repository createRepository();

	/**
	 * Wait for a notification until the TimeOut is reached ; when receiving a notification, asserts that it
	 * was expected.
	 * 
	 * @param expectedResult
	 *            the {@link NotificationAssertionContainer} that represents the expectedResult
	 */
	public void waitForResultAndTest(NotificationAssertionContainer expectedResult) {

		long initialTime = System.currentTimeMillis();
		long currentTime = initialTime;

		// We wait for a notification or a timeout
		while ((receivedNotification == null) && (currentTime - initialTime < TIME_OUT_DELAY)) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// As this is a test, we just break the loop
				break;
			}
			currentTime = System.currentTimeMillis();
		}
		// If no notification has been received, receivedNotification is equals to null
		Assert.assertTrue(expectedResult.isNotificationConformToExpected(receivedNotification));
		receivedNotification = null;

	}

	/**
	 * Sets the receivedNotification.
	 * 
	 * @param receivedNotification
	 *            the new received {@link RepositoryChangeNotification}
	 */
	public void setReceivedNotification(RepositoryChangeNotification receivedNotification) {
		this.receivedNotification = receivedNotification;
	}
}
