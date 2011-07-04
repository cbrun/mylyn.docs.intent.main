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
package org.eclipse.mylyn.docs.intent.collab.test.assertioncontainer;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;

/**
 * Class which purpose is to store expected properties about a received {@link RepositoryChangeNotification},
 * and to compare such a notification with the expected result.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class NotificationAssertionContainer {

	/**
	 * Indicates if a notification is expected.
	 */
	private boolean expectedNotification;

	/**
	 * Represents the expected target of the notification.
	 */
	private AbstractTestClass expectedTarget;

	/**
	 * NotificationAssertionContainer constructor.
	 * 
	 * @param expectedNotification
	 *            indicates if a notification is expected
	 * @param expectedTarget
	 *            the expected target of the notification (the element thas has changed)
	 */
	public NotificationAssertionContainer(boolean expectedNotification, final AbstractTestClass expectedTarget) {
		this.expectedNotification = expectedNotification;
		this.expectedTarget = expectedTarget;
	}

	/**
	 * Indicates if the given notification is conform to the specified expected result.
	 * 
	 * @param notification
	 *            the notification to determine if it's conform to the expected result (a null value
	 *            represents the fact that no notification has been received)
	 * @return true if the given notification is conform to the specified expected result, false otherwise.
	 */
	public boolean isNotificationConformToExpected(RepositoryChangeNotification notification) {
		boolean isNotificationConformToExpected = true;

		// We first test if a notification was expected
		isNotificationConformToExpected = isNotificationConformToExpected
				&& (expectedNotification == (notification != null));
		if (!isNotificationConformToExpected) {
			System.err.println();
			System.err.println("received notification : " + notification + " expected : "
					+ expectedNotification);
		}
		if ((notification != null) && expectedNotification) {
			// Then we check that the notification is relative to the expected target
			isNotificationConformToExpected = isNotificationConformToExpected
					&& (EcoreUtil.equals(notification.getRightRoots().get(0), expectedTarget));
			if (!isNotificationConformToExpected) {
				System.err.println(" got :" + notification.getRightRoots());
				System.err.println("expected :" + expectedTarget.eResource());
			}
		}
		return isNotificationConformToExpected;
	}
}
