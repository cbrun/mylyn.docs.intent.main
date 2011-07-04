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

import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;

/**
 * Handles the management of Objects from the Intent Repository : notifies the subscribed clients in case of
 * distant changes on the handled objects ; save (commit) objects on the repository ; locking objects.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface ReadWriteRepositoryObjectHandler extends ReadOnlyRepositoryObjectHandler {

	/**
	 * Sets the entity in charge of conflict handling (local Objects are in an conflict state).
	 * 
	 * @param conflictHandler
	 *            the conflictHandler to Use
	 */
	void setConflictHander(ConfictResolver conflictHandler);

	/**
	 * Save the modifications made after the last save.
	 * 
	 * @throws SaveException
	 *             if any problem occurs during saving
	 * @throws ReadOnlyException
	 *             if the current context is read-only
	 */
	void save() throws SaveException, ReadOnlyException;

	/**
	 * Cancel the modifications made after the last save.
	 * 
	 * @throws ReadOnlyException
	 *             if the current context is read-only
	 */
	void undo() throws ReadOnlyException;

}
