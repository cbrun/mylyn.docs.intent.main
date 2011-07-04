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
package org.eclipse.mylyn.docs.intent.collab.utils;

/**
 * Holds a reference to a Repository Creator that can be used for creating Repositories or RepositoryAdapters.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class RepositoryCreatorHolder {

	/**
	 * The RepositoryCreator that will be used for creating Repositories or RepositoryAdapters.
	 */
	private static RepositoryCreator creator;

	/**
	 * RepositoryCreatorHolder constructor.
	 */
	private RepositoryCreatorHolder() {

	}

	/**
	 * Returns a RepositoryCreator that can be used for creating Repositories or RepositoryAdapters.
	 * 
	 * @return a RepositoryCreator that can be used for creating Repositories or RepositoryAdapters
	 */
	public static RepositoryCreator getCreator() {
		return creator;
	}

	/**
	 * Sets the RepositoryCreator that will be used for creating Repositories or RepositoryAdapters.
	 * 
	 * @param newCreator
	 *            the RepositoryCreator that will be used for creating Repositories or RepositoryAdapters
	 */
	public static void setCreator(RepositoryCreator newCreator) {
		creator = newCreator;
	}
}
