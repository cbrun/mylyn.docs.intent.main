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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl;

import org.eclipse.mylyn.docs.intent.collab.handlers.ConfictResolver;
import org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;

/**
 * Handles the management of Objects from the Intent Repository : notifies the subscribed clients in case of
 * distant changes on the handled objects ; save (commit) objects on the repository ; locking objects.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ReadWriteRepositoryObjectHandlerImpl extends AbstractRepositoryObjectHandler implements ReadWriteRepositoryObjectHandler {

	/**
	 * ReadWriteRepositoryObjectHandlerImpl constructor : launch a save context (don't use this if you already
	 * have created a save context).
	 * 
	 * @param repositoryAdapter
	 *            Adapter used by this RepositoryObjectHandler to communicate with the concrete repository
	 */
	public ReadWriteRepositoryObjectHandlerImpl(RepositoryAdapter repositoryAdapter) {
		super();
		this.setRepositoryAdapter(repositoryAdapter);
		this.getRepositoryAdapter().openSaveContext();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws ReadOnlyException
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler#save()
	 */
	public void save() throws SaveException, ReadOnlyException {
		this.getRepositoryAdapter().save();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler#undo()
	 */
	public void undo() throws ReadOnlyException {
		this.getRepositoryAdapter().undo();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryObjectHandler#stop()
	 */
	@Override
	public void stop() {
		this.getRepositoryAdapter().closeContext();
		super.stop();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler#setConflictHander(org.eclipse.mylyn.docs.intent.collab.handlers.ConfictResolver)
	 */
	public void setConflictHander(ConfictResolver conflictHandler) {
		// TODO Auto-generated method stub

	}

}
