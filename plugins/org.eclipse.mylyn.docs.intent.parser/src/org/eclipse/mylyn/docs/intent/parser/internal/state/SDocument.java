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

import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentFactory;

/**
 * Represents the behavior of the parser when the current element is a IntentDocument.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SDocument extends IntentDefaultState {

	/**
	 * SDocument constructor.
	 * 
	 * @param previous
	 *            the previous state of the parser
	 * @param document
	 *            the document currently being parsed
	 */
	public SDocument(IntentGenericState previous, IntentDocument document) {
		super(previous, document);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentDefaultState#beginChapter()
	 */
	@Override
	public IntentGenericState beginChapter() {
		IntentChapter chapter = IntentDocumentFactory.eINSTANCE.createIntentChapter();
		((IntentDocument)currentElement).getChapters().add(chapter);
		return new SChapter(this, chapter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#endStructuredElement()
	 */
	@Override
	public IntentGenericState endStructuredElement() {
		return previousState();
	}

}
