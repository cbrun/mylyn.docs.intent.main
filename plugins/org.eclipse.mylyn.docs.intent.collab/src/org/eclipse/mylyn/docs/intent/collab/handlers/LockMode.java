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
 * Represents the mode of a lock : READ or READ/WRITE.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public enum LockMode {
	/**
	 * READ mode : no one else would be able to access an object with such a lock.
	 */
	READ,
	/**
	 * WRITE mode : no one else would be able to modifiy an object with such a lock.
	 */
	WRITE;
}
