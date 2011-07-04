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
package org.eclipse.mylyn.docs.intent.parser;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser;

/**
 * Keywords for describing a IntentDocument.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface IntentKeyWords {

	// -----------------------------------------
	// Structural or general KeyWords
	// -----------------------------------------
	/**
	 * Keyword describing a IntentDocument.
	 */
	String INTENT_KEYWORD_DOCUMENT = "Document";

	/**
	 * Keyword describing a section.
	 */
	String INTENT_KEYWORD_SECTION = "Section";

	/**
	 * Keyword describing a Chapter.
	 */
	String INTENT_KEYWORD_CHAPTER = "Chapter";

	/**
	 * Keyword describing an internal visibility.
	 */
	String INTENT_KEYWORD_VISIBILITY_INTERNAL = "internal";

	/**
	 * Keyword describing an hidden visibility.
	 */
	String INTENT_KEYWORD_VISIBILITY_HIDDEN = "hidden";

	/**
	 * Keyword describing the opening of a Structured element (Section, Chapter, Document).
	 */
	String INTENT_KEYWORD_OPEN = "{";

	/**
	 * Keyword describing the closing of a Structured element (Section, Chapter, Document).
	 */
	String INTENT_KEYWORD_CLOSE = "}";

	/**
	 * Keyword describing the opening of a header reference zone (inside a section declaration).
	 */
	String INTENT_KEYWORD_HEADER_REFERENCE_OPEN = "[";

	/**
	 * Keyword allowing to separate each header reference inside a header reference declaration.
	 */
	String INTENT_KEYWORD_HEADER_REFERENCE_SEPARATOR = ",";

	/**
	 * Keyword describing the closing of a header reference zone (in a section declaration).
	 */
	String INTENT_KEYWORD_HEADER_CLOSE = "]";

	/**
	 * Symbolises a WhiteSpace.
	 */
	String INTENT_WHITESPACE = " ";

	/**
	 * Symbolises a lineBreak.
	 */
	String INTENT_LINEBREAK = "\n";

	// ----------------------------------------------------
	// Elements relative to the Intent approach
	// ----------------------------------------------------
	String INTENT_FCT_LAZY_LABEL_DECLARATION = "@lazylabel";

	String INTENT_FCT_EXPLICIT_LABEL_DECLARATION = "@label";

	String INTENT_FCT_REFERENCE = "@see";

	// ----------------------------------------------------
	// Elements relative to Modeling Units
	// ----------------------------------------------------
	String MODELING_UNIT_BEGIN = ModelingUnitParser.MODELING_UNIT_PREFIX;

	String MODELING_UNIT_END = ModelingUnitParser.MODELING_UNIT_SUFFIX;
}
