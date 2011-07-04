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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification;

import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.impl.DiffModelImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * Representation of a notification (use the EMF Compare DiffModel).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class RepositoryChangeNotificationImpl extends DiffModelImpl implements RepositoryChangeNotification {

	/**
	 * RepositoryChangeNotificationImpl default constructor.
	 */
	public RepositoryChangeNotificationImpl() {
		super();
	}

	/**
	 * RepositoryChangeNotificationImpl constructor.
	 * 
	 * @param diffModel
	 *            the DiffModel to copy.
	 */
	public RepositoryChangeNotificationImpl(DiffModel diffModel) {
		super();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		String toString = getRightRoots().toString();
		return toString;
	}
}
