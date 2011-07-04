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
package org.eclipse.mylyn.docs.intent.collab.ide.adapters;

import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer;

/**
 * Default WorkspaceReStructurer used to restructure the resource Set of the workspace repository :
 * <p>
 * for example : - divide all the A instances in different resources - regroup all the B instances in the same
 * resource...
 * </p>
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class DefaultWorkspaceRepositoryStructurer implements RepositoryStructurer {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer#structure(org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter)
	 */
	public void structure(RepositoryAdapter repositoryAdapter) throws ReadOnlyException {
		if (!(repositoryAdapter instanceof WorkspaceAdapter)) {
			throw new IllegalArgumentException("Cannot Strucure the repository using a "
					+ repositoryAdapter.getClass().getName() + " : must be "
					+ WorkspaceAdapter.class.getName());
		}
		// the default implementation is to do nothing

	}
}
