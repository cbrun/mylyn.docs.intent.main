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

/**
 * Represents the behavior of the parser when the current element is a Chapter.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SChapter extends IntentSubSectionContainerState {

	/**
	 * SChapter constructor.
	 * 
	 * @param previous
	 *            the previous state of the parser
	 * @param chapter
	 *            the chapter currently beeing parsed
	 */
	public SChapter(IntentGenericState previous, IntentChapter chapter) {
		super(previous, chapter);
	}

}
