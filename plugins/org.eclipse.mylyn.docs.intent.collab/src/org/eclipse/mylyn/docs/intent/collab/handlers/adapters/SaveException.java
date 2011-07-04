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
 * Represents an exception that has occured on the save action of a RepositoryObjectHandler.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SaveException extends Exception {

	/**
	 * Generated serialVersionUID.
	 */
	private static final long serialVersionUID = 5262970741740341231L;

	/**
	 * SaveException constructor.
	 * 
	 * @param message
	 *            the message that represents this error.
	 */
	public SaveException(String message) {
		super(message);
	}
}
