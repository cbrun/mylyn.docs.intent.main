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
package org.eclipse.mylyn.docs.intent.client.ui.editor.outline;

import org.eclipse.emf.ecore.EObject;

/**
 * Holds information useful for the outline information holder.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentOutlineInformationHolder {

	/**
	 * The element to hold.
	 */
	private EObject element;

	/**
	 * Indicates if the given element is the root off the opened document.
	 */
	private boolean isRoot;

	/**
	 * IntentOutlineInformationHolder constructor.
	 * 
	 * @param element
	 *            the element to hold
	 * @param isRoot
	 *            indicates if the given element is the root off the opened document
	 */
	public IntentOutlineInformationHolder(EObject element, boolean isRoot) {
		this.element = element;
		this.isRoot = isRoot;
	}

	/**
	 * Returns the hold element.
	 * 
	 * @return the hold element
	 */
	public EObject getElement() {
		return element;
	}

	/**
	 * Indicates if the given element is the root off the opened document.
	 * 
	 * @return true if the given element is the root off the opened document, false otherwise
	 */
	public boolean isRoot() {
		return isRoot;
	}

}
