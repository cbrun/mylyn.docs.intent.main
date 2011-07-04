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
package org.eclipse.mylyn.docs.intent.collab.handlers;

import java.util.Set;

/**
 * A strategy used to customize the default conflict resolution behaviour of {@link CDOTransaction
 * transactions}.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface ConfictResolver {

	/**
	 * Returns the RepositoryObjectHandler associated to this ConfictResolver.
	 * 
	 * @return the RepositoryObjectHandler associated to this ConfictResolver.
	 */
	ReadWriteRepositoryObjectHandler getObjectHandler();

	/**
	 * Sets the RepositoryObjectHandler to associate with this ConfictResolver.
	 * 
	 * @param objectHandler
	 *            the RepositoryObjectHandler to associate with this ConfictResolver.
	 */
	void setObjectHandler(ReadWriteRepositoryObjectHandler objectHandler);

	/**
	 * Resolve conflicts (i.e situations where local objects are in a conflict state).
	 * 
	 * @param conflicts
	 *            local objects that are in conflict.
	 */
	void resolveConflicts(Set<Object> conflicts);

	// TODO The implementor might want to use/extend {@link AbstractObjectConflictResolver}.
}
