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
 * Represents an error that occurred in a readOnly context, when trying to :
 * <ul>
 * <li>save or undo this context</li>
 * <li>create a resource on the repository</li>
 * </ul>
 * .
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ReadOnlyException extends Exception {

	/**
	 * Generated Serial version UID.
	 */
	private static final long serialVersionUID = 6004642252756917629L;

	/**
	 * ReadOnlyException constructor.
	 * 
	 * @param message
	 *            the message that represents this error.
	 */
	public ReadOnlyException(String message) {
		super(message);
	}
}
