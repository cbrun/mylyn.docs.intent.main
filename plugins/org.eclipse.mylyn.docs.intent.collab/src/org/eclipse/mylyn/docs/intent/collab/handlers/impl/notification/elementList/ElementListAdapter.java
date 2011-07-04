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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.RepositoryChangeNotificationImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotificationFactoryHolder;

/**
 * Adapter used by the ElementListNotificator ; listens a single Object and notify the Notificator for any
 * relevant change made on this object.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ElementListAdapter extends EContentAdapter {

	/**
	 * Notificator to prevent of any change occurred on the watched object.
	 */
	protected ElementListNotificator notificator;

	/**
	 * ElementListAdapter constructor.
	 */
	public ElementListAdapter() {
		super();
	}

	/**
	 * ElementListAdapter constructor.
	 * 
	 * @param notificator
	 *            Notificator to prevent of any change occurred on the watched object
	 */
	public ElementListAdapter(ElementListNotificator notificator) {
		super();
		this.notificator = notificator;
	}

	/**
	 * Sets the notificator to prevent of any change occurred on the watched object.
	 * 
	 * @param notificator
	 *            notificator to prevent of any change occurred on the watched object
	 */
	public void setNotificator(ElementListNotificator notificator) {
		this.notificator = notificator;
	}

	/**
	 * Construct a RepositoryChangeNotification from the given notification. {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		// We don't notify handlers for removing adapter operations neither for Touch notifications
		if ((Notification.REMOVING_ADAPTER != (notification.getEventType())) && (!notification.isTouch())) {
			RepositoryChangeNotification newNotification = RepositoryChangeNotificationFactoryHolder
					.getChangeNotificationFactory().createRepositoryChangeNotification(notification);
			this.notificator.notifyHandlers(newNotification);

		}
	}

	/**
	 * Used to send notifications sent by external elements (like Sessions of a Repository) : creates a new
	 * {@link RepositoryChangeNotification} and sent it to the associated notificator.
	 * 
	 * @param target
	 *            the target of the notification to create
	 */
	public void notifyChangesOnElement(EObject target) {
		RepositoryChangeNotification newNotification = new RepositoryChangeNotificationImpl();
		if (target != null) {
			newNotification.getRightRoots().add(target);
		}
		this.notificator.notifyHandlers(newNotification);
	}
}
