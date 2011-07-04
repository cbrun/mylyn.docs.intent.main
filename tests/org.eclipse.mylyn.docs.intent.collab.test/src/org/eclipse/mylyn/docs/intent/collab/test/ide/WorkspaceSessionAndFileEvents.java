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

import java.io.IOException;
import java.util.HashSet;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.test.assertioncontainer.NotificationAssertionContainer;
import org.eclipse.mylyn.docs.intent.collab.test.ide.utils.IDETestUtils;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;

/**
 * Tests the correct behavior of the session and listeners when files are modified without the EMF Resource
 * API (simulates SVN updates).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceSessionAndFileEvents extends AbstractWorkspaceRepositoryTest {

	/**
	 * Value used when modifying an element (prefix the element with this value.
	 */
	private static final String MODIFIED_VALUE = "new";

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

		// We create test elements on the repository
		listenedTestElements = new HashSet<AbstractTestClass>();
		nonListenedTestElements = new HashSet<AbstractTestClass>();
		initializeContent();
	}

	/**
	 * Ensures that the listening client (listening a list of element) is correctly notified of modifications
	 * made by replacing the a file (not using eAdapter).
	 */
	public void testNotificationsWithFileModificationWithElementListListeners() {
		// Initialization of the elements listener clients
		createElementListeningClients();

		// We get the resource of each listened element.
		for (AbstractTestClass elementToModify : listenedTestElements) {
			Resource resourceToModify = elementToModify.eResource();
			try {

				IFile iFileToModify = IDETestUtils
						.getIFile(resourceToModify.getURI().toPlatformString(false));

				// We modify the physic file corresponding to this resource
				String resourceContent = IDETestUtils.getIFileContent(iFileToModify);
				resourceContent = resourceContent.replace(elementToModify.getName(), MODIFIED_VALUE
						+ elementToModify.getName());
				IDETestUtils.setIFileContent(iFileToModify, resourceContent);
			} catch (IOException e) {
				// If you get an assertion error here, it means that the resource cannot been get as a string
				// The cause can be an invalid URI, or a charset problem.
				Assert.assertTrue(false);
			}

			// We construct the expected version of the element
			AbstractTestClass expectedElement = EcoreUtil.copy(elementToModify);
			expectedElement.setName(MODIFIED_VALUE + expectedElement.getName());
			NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(true,
					expectedElement);
			waitForResultAndTest(expectedResult);
		}
	}

	/**
	 * Ensures that the listening client (listening a list of types) is correctly notified of modifications
	 * made by replacing the a file.
	 */
	public void testNotificationsWithFileModificationWithTypeListeners() {
		// Initialization of the type listeners clients
		createTypeListeningClients();

		// We modified each created element.
		for (AbstractTestClass elementToModify : listenedTestElements) {
			boolean clientShouldbeNotified = false;
			AbstractTestClass expectedElement = EcoreUtil.copy(elementToModify);

			// We get the resource of this element
			Resource resourceToModify = elementToModify.eResource();
			try {

				IFile iFileToModify = IDETestUtils
						.getIFile(resourceToModify.getURI().toPlatformString(false));

				// We modify the physic file corresponding to this resource
				String resourceContent = IDETestUtils.getIFileContent(iFileToModify);
				if (elementToModify instanceof TestClass1) {
					String expectedValue = MODIFIED_VALUE
							+ ((TestClass1)elementToModify).getTheAttributeToListen();
					// Here we modify a listened feature, so the client should be notified
					resourceContent = resourceContent.replace(
							((TestClass1)elementToModify).getTheAttributeToListen(), expectedValue);

					// We update the expectedElement
					((TestClass1)expectedElement).setTheAttributeToListen(expectedValue);
					clientShouldbeNotified = true;

				} else {
					// Here we don't modify any listened feature, so the client shouln't be notified
					resourceContent = resourceContent.replace(elementToModify.getName(), MODIFIED_VALUE
							+ elementToModify.getName());
				}
				IDETestUtils.setIFileContent(iFileToModify, resourceContent);
			} catch (IOException e) {
				// If you get an assertion error here, it means that the resource cannot been get as a string
				// The cause can be an invalid URI, or a charset problem.
				Assert.assertTrue(false);
			}

			// We finally ensure the type listening client is notified (or not) as expected
			NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(
					clientShouldbeNotified, expectedElement);
			waitForResultAndTest(expectedResult);
		}
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
