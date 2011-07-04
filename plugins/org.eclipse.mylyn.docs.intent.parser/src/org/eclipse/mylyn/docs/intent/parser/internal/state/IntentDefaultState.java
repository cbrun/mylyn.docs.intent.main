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

package org.eclipse.mylyn.docs.intent.parser.internal.state;

import org.eclipse.emf.ecore.EObject;

/**
 * Default state for a Intent parser.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentDefaultState extends IntentGenericState {

	/**
	 * IntentGenericState constructor.
	 * 
	 * @param previous
	 *            the previous state of the parser
	 * @param currentElement
	 *            the current parsed element
	 */
	public IntentDefaultState(IntentGenericState previous, EObject currentElement) {
		super(previous, currentElement);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#beginChapter()
	 */
	@Override
	public IntentGenericState beginChapter() {
		return super.beginChapter();
	}

}
