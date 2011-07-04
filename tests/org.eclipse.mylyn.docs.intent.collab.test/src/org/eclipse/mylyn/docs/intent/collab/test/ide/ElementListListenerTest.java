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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.test.assertioncontainer.NotificationAssertionContainer;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;

/**
 * Tests the correct behavior of elementList Listeners.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ElementListListenerTest extends AbstractWorkspaceRepositoryTest {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.test.AbstractRepositoryTest#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		listenedTestElements = new HashSet<AbstractTestClass>();
		nonListenedTestElements = new HashSet<AbstractTestClass>();
		// We first open a WorkspaceSession.
		try {
			repository.getOrCreateSession();
		} catch (RepositoryConnectionException e) {
			// As this a test, we expect that the repository can be accessed
		}
		initializeContent();
		createElementListeningClients();
	}

	/**
	 * Ensures that the listening client is correctly notified of modification on listened types.
	 */
	public void testNotificationOnListenedElements() {
		// We modify each listened element and expect a notification
		for (AbstractTestClass elementToModify : listenedTestElements) {

			NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(true,
					elementToModify);
			writingClient.modifyElement(elementToModify);
			waitForResultAndTest(expectedResult);
		}
	}

	/**
	 * Ensures that the listening client isn't notified of modification on non-listened types.
	 */
	public void testNotificationOnNonListenedElements() {
		// We modify each listened element and expect a notification
		for (AbstractTestClass elementToModify : nonListenedTestElements) {
			writingClient.modifyElement(elementToModify);
			NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(false, null);
			waitForResultAndTest(expectedResult);
		}
	}

	/**
	 * Ensures that the notification system works correctly with elements added dynamically to the listened
	 * elements.
	 */
	public void testNotificationOnDynamiclyAddedElements() {
		// We create dynamically a new Element
		AbstractTestClass dynamicElementToListen1 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass1(), "sampleTestClass1-dynamic");
		AbstractTestClass dynamicElementToListen2 = writingClient.createNewInstance(
				TestPackagePackage.eINSTANCE.getTestClass1(), "sampleTestClass1-dynamic2");

		// We make the listening Client listen to any change on these elements
		List<EObject> newElementList = new ArrayList<EObject>();
		newElementList.add(dynamicElementToListen1);
		newElementList.add(dynamicElementToListen2);
		listeningClient.addNewElementsToListen(newElementList);

		// We modify each newly created element and expect a notification
		for (EObject newElement : newElementList) {
			AbstractTestClass newTestElement = (AbstractTestClass)newElement;
			writingClient.modifyElement(newTestElement);
			NotificationAssertionContainer expectedResult = new NotificationAssertionContainer(true,
					newTestElement);
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
