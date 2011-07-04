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
package org.eclipse.mylyn.docs.intent.collab.handlers.adapters;

/**
 * Repository Structurer used to restructure automaticly the resources contained in the repository :
 * <p>
 * for example : - divide all the A instances in different resources - regroup all the B instances in the same
 * resource...
 * </p>
 * The usage of this class isn't an obligation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryStructurer {
	/**
	 * Structures the resources contained in the repository :
	 * <p>
	 * for example :
	 * <ul>
	 * <li>divides all the A instances in different resources</li>
	 * <li>regroups all the B instances in the same resource</li>
	 * <li>...</li>
	 * </ul>
	 * </p>
	 * 
	 * @param repositoryAdapter
	 *            the RepositoryAdapter to use for restructuring the repository.
	 * @throws ReadOnlyException
	 *             if the current context associated to the given adapter is read-only
	 */
	void structure(RepositoryAdapter repositoryAdapter) throws ReadOnlyException;
}
