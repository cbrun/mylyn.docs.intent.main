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
import org.eclipse.mylyn.docs.intent.serializer.IntentPositionManager;

/**
 * Default state for a Intent parser.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class IntentDefaultState extends IntentGenericState {

	/**
	 * IntentGenericState constructor.
	 * 
	 * @param offset
	 *            the offset of the current element
	 * @param declarationLength
	 *            the declaration length of the current element
	 * @param previous
	 *            the previous state of the parser
	 * @param currentElement
	 *            the current parsed element
	 * @param positionManager
	 *            the positionManager where to register positions
	 */
	public IntentDefaultState(int offset, int declarationLength, IntentGenericState previous,
			EObject currentElement, IntentPositionManager positionManager) {
		super(offset, declarationLength, previous, currentElement, positionManager);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#beginChapter()
	 */
	@Override
	public IntentGenericState beginChapter(int offset, int declarationLength) {
		return super.beginChapter(offset, declarationLength);
	}

}
