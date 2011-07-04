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
package org.eclipse.mylyn.docs.intent.compare;

/**
 * Represents a Merging Exception.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class MergingException extends Exception {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = 4797692160335834225L;

	/**
	 * constructor.
	 * 
	 * @param message
	 *            Message explaining the causes of the error.
	 */
	public MergingException(String message) {
		super(message);
	}

}
