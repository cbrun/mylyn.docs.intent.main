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
package org.eclipse.mylyn.docs.intent.collab.repository;

/**
 * Exception that represents an invalid connection to the repository .
 * <p>
 * This exception can occur :
 * <ul>
 * <li>When creating a repository that cannot been found</li>
 * <li>When trying to send informations to the repository and getting an invalid connection</li>
 * <li>Asynchronously, for example by a ping that failed</li>
 * <li>...</li>
 * </ul>
 * </p>
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class RepositoryConnectionException extends Exception {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = 2812616655492780739L;

	/**
	 * ConnectionException constructor.
	 * 
	 * @param message
	 *            message explaining the cause of this exception.
	 */
	public RepositoryConnectionException(String message) {
		super(message);
	}

}
