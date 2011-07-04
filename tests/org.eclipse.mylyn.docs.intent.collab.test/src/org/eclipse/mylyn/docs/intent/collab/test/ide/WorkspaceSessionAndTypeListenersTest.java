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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.collab.ide.repository.WorkspaceRepository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.test.assertioncontainer.NotificationAssertionContainer;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;

/**
 * Tests the correct behavior of a Workspace Session and TypeListeners.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceSessionAndTypeListenersTest extends AbstractWorkspaceRepositoryTest {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.test.AbstractRepositoryTest#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// We first open a WorkspaceSession.
		try {
			repository.getOrCreateSession();
		} catch (RepositoryConnectionException e) {
			// As this a test, we expect that the repository can be accessed
		}
		createTypeListeningClients();
	}

	/**
	 * Ensures that the listening client isn't notified of modification on non-listened types.
	 */
	public void testNotificationOnNonListenedTypes() {
		// We don't expect to be notified of the following modification
		writingClient.createNewInstance(TestPackagePackage.eINSTANCE.getTestClass2(), "theTestClass2");
		NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(false, null);
		waitForResultAndTest(expectedResult);
	}

	/**
	 * Ensures that the listening client is correctly notified of modification on listened types.
	 */
	public void testNotificationOnListenedTypes() {
		// We expect to be notified of the following modification
		// The target of the expected notificaiton should be the created Element
		AbstractTestClass createdElement = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass1(), "theTestClass1-1");
		NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(true,
				createdElement);
		waitForResultAndTest(expectedResult);
	}

	/**
	 * Ensure that the listening clients are correctly notified when there are several modifications on the
	 * repository.
	 */
	public void testSeveralNotificationsOnListenedTypes() {

		// We create a new SampleClass2 element : listening client shouldn't be notified
		AbstractTestClass newTestClass2 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass2(), "theTestClass2-2");
		NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(false, null);
		waitForResultAndTest(expectedResult);

		// We create a new SampleClass1 element : listening client should be notified
		AbstractTestClass newTestClass1 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass1(), "theTestClass1-2");
		expectedResult = new NotificationAssertionContainer(true, newTestClass1);
		waitForResultAndTest(expectedResult);

		// TODO we would like this resolving to be done automatically
		newTestClass1 = (AbstractTestClass)EcoreUtil.resolve(newTestClass1,
				((WorkspaceRepository)this.repository).getResourceSet());
		// We modify it : listening client should be notified
		writingClient.modifyElementAndSave(newTestClass1);

		newTestClass1 = (AbstractTestClass)EcoreUtil.resolve(newTestClass1,
				((WorkspaceRepository)this.repository).getResourceSet());
		expectedResult = new NotificationAssertionContainer(true, newTestClass1);
		waitForResultAndTest(expectedResult);

		newTestClass1 = (AbstractTestClass)EcoreUtil.resolve(newTestClass1,
				((WorkspaceRepository)this.repository).getResourceSet());
		// We modify it again : listening client should be notified
		writingClient.modifyElementAndSave(newTestClass1);

		expectedResult = new NotificationAssertionContainer(true, newTestClass1);
		waitForResultAndTest(expectedResult);

		newTestClass2 = (AbstractTestClass)EcoreUtil.resolve(newTestClass2,
				((WorkspaceRepository)this.repository).getResourceSet());
		// The we modify a non-listened element
		writingClient.modifyElementAndSave(newTestClass2);

		expectedResult = new NotificationAssertionContainer(false, null);
		waitForResultAndTest(expectedResult);
	}

	/**
	 * Ensure that the listening clients are correctly notified when there are several modifications on the
	 * repository.
	 */
	public void testSeveralNotificationsOnListenedTypesWithAutomaticReload() {
		// We create a new SampleClass2 element : listening client shouldn't be notified
		AbstractTestClass testElement2 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass2(), "theTestClass2-2");
		NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(false, null);
		waitForResultAndTest(expectedResult);

		// We create a new SampleClass1 element : listening client should be notified
		AbstractTestClass testElement1 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass1(), "theTestClass1-2");
		expectedResult = new NotificationAssertionContainer(true, testElement1);
		waitForResultAndTest(expectedResult);

		// We modify it : listening client should be notified
		testElement1 = writingClient.modifyElementAndSave(testElement1);

		expectedResult = new NotificationAssertionContainer(true, testElement1);
		waitForResultAndTest(expectedResult);

		// We modify it again : listening client should be notified
		testElement1 = writingClient.modifyElementAndSave(testElement1);

		expectedResult = new NotificationAssertionContainer(true, testElement1);
		waitForResultAndTest(expectedResult);

		// The we modify a non-listened element
		testElement2 = writingClient.modifyElementAndSave(testElement2);

		expectedResult = new NotificationAssertionContainer(false, null);
		waitForResultAndTest(expectedResult);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		repository.closeSession();
		super.tearDown();
	}
}
