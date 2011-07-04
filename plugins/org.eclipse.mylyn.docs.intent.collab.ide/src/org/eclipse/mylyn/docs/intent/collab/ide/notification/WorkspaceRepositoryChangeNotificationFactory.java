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
package org.eclipse.mylyn.docs.intent.collab.ide.notification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.RepositoryChangeNotificationImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactory;

/**
 * Factory used to convert a specific notification (for example a ResourceNotification comming from the
 * WorkspaceSession) into a standard {@link RepositoryChangeNotification}.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WorkspaceRepositoryChangeNotificationFactory implements RepositoryChangeNotificationFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactory#createRepositoryChangeNotification(java.lang.Object)
	 */
	public RepositoryChangeNotification createRepositoryChangeNotification(Object specificChangeNotification) {

		RepositoryChangeNotification genericChangeNotification = null;
		// We dispatch the creation of the repositoryChangeNotification
		if (specificChangeNotification instanceof Notification) {
			genericChangeNotification = createFromEMFNotification((Notification)specificChangeNotification);
		}
		if (specificChangeNotification instanceof Resource) {
			genericChangeNotification = createFromChangedResource((Resource)specificChangeNotification);
		}
		return genericChangeNotification;
	}

	/**
	 * Converts the given EMF Notification into a RepositoryChangeNotification.
	 * 
	 * @param notification
	 *            the notification to convert
	 * @return the RepositoryChangeNotification corresponding to the given EMF Notification
	 */
	public static RepositoryChangeNotification createFromEMFNotification(Notification notification) {
		EObject target = (EObject)notification.getNotifier();

		// int featureID = notification.getFeatureID(target.getClass());
		// EStructuralFeature feature = target.eClass().getEStructuralFeature(featureID);
		// notification.getNewValue();

		RepositoryChangeNotification newNotification = new RepositoryChangeNotificationImpl();
		newNotification.getRightRoots().add(target);
		return newNotification;
	}

	/**
	 * Converts the given resource that contains changed Elements into a RepositoryChangeNotification.
	 * 
	 * @param changedResource
	 *            the notification to convert
	 * @return the RepositoryChangeNotification corresponding to the given changes
	 */
	private RepositoryChangeNotification createFromChangedResource(Resource changedResource) {
		RepositoryChangeNotification newNotification = new RepositoryChangeNotificationImpl();
		newNotification.getRightRoots().addAll(changedResource.getContents());
		return newNotification;
	}

}
