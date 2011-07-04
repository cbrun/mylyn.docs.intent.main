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

/**
 * Creates a RepositoryObjectHandler in READ or READ/WRITE mode.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryObjectHandlerFactory {

	/**
	 * Creates a RepositoryObjectHandler in ReadOnly mode (no saving capabilities).
	 * 
	 * @return a ReadOnlyRepositoryObjectHandler
	 */
	ReadOnlyRepositoryObjectHandler createReadOnlyRepositoryObjectHandler();

	/**
	 * Creates a RepositoryObjectHandler in Read/Write mode.
	 * 
	 * @return a ReadWriteRepositoryObjectHandler
	 */
	ReadWriteRepositoryObjectHandler createtReadWriteRepositoryObjectHandler();
}
