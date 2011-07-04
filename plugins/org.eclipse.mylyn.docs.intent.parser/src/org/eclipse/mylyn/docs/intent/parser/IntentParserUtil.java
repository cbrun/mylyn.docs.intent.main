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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser;

/**
 * Provides useful parsing methods.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentParserUtil {

	/**
	 * Regular expression that represents a backslash.
	 */
	private static final String EXPREG_BACKSLASH = "\\";

	/**
	 * Regular expression that represents a space area (that only contains whitespaces, tabulations or
	 * linebreaks).
	 */
	private static final String EXPREG_MANY_SPACES = "\\s*";

	/**
	 * All the tokens that implies the end of a descriptionUnit.
	 */
	private static final String[] ENDING_DESCRIPTION_UNIT_TOKENS = {
			EXPREG_BACKSLASH + IntentKeyWords.INTENT_KEYWORD_CLOSE,

			// Document {
			IntentKeyWords.INTENT_KEYWORD_DOCUMENT + EXPREG_MANY_SPACES + EXPREG_BACKSLASH
					+ IntentKeyWords.INTENT_KEYWORD_OPEN,
			// Chapter {
			IntentKeyWords.INTENT_KEYWORD_CHAPTER + EXPREG_MANY_SPACES + EXPREG_BACKSLASH
					+ IntentKeyWords.INTENT_KEYWORD_OPEN,
			// @M
			EXPREG_MANY_SPACES + ModelingUnitParser.MODELING_UNIT_PREFIX + EXPREG_MANY_SPACES,
			// section ([(headers)])? {
			IntentKeyWords.INTENT_KEYWORD_SECTION + EXPREG_MANY_SPACES + EXPREG_BACKSLASH
					+ IntentKeyWords.INTENT_KEYWORD_OPEN,
	};

	/**
	 * All the tokens that breaks the current flow.
	 */
	private static final String[] FLOW_BREAKING_TOKENS = {IntentKeyWords.INTENT_KEYWORD_CLOSE,
			IntentKeyWords.INTENT_KEYWORD_OPEN, ModelingUnitParser.MODELING_UNIT_PREFIX,
			ModelingUnitParser.MODELING_UNIT_SUFFIX,
	};

	/**
	 * IntentParserUtil constructor.
	 */
	private IntentParserUtil() {

	}

	/**
	 * Returns a table containing all the tokens that implies the end of a descriptionUnit.
	 * 
	 * @return a table containing all the tokens that implies the end of a descriptionUnit
	 */
	public static String[] getEndingDescriptionUnitTokens() {
		return ENDING_DESCRIPTION_UNIT_TOKENS;
	}

	/**
	 * Returns the next Offset containing a flow breaker token in the given String.
	 * 
	 * @param currentlyParsedContent
	 *            the String to inspect
	 * @return the next Offset containing useful informations in the given String, -1 if no valid character
	 *         can be found
	 */
	public static int getNextOffset(String currentlyParsedContent) {

		// We calculate the offset of the next occurrence of each flowBreaking tokens
		Integer[] possibleNextOffsets = new Integer[FLOW_BREAKING_TOKENS.length];

		for (int i = 0; i < FLOW_BREAKING_TOKENS.length; i++) {
			possibleNextOffsets[i] = currentlyParsedContent.indexOf(FLOW_BREAKING_TOKENS[i]);
			if (possibleNextOffsets[i] > -1) {
				possibleNextOffsets[i] += FLOW_BREAKING_TOKENS[i].length();
			}
		}

		// We return the offset of the first token encountered
		return getNextOffSetInTable(possibleNextOffsets);
	}

	/**
	 * Returns the offSet to consider in the given table of all detected offsets.
	 * 
	 * @param possibleNextOffsets
	 *            table of all detected offsets
	 * @return the offSet to consider in the given table of all detected offsets
	 */
	private static int getNextOffSetInTable(Integer[] possibleNextOffsets) {
		int nextOffset = -1;
		for (int i = 0; i < possibleNextOffsets.length; i++) {
			if ((possibleNextOffsets[i] > -1)
					&& ((nextOffset == -1) || (possibleNextOffsets[i] < nextOffset))) {
				nextOffset = possibleNextOffsets[i];
			}
		}
		return nextOffset;
	}

	/**
	 * Returns the descriptionUnit contained in the given text.
	 * 
	 * @param text
	 *            the text to analyze, starting with a description unit an containing several elements
	 * @param trim
	 *            indicates if the description Unit bust me trimmed or not
	 * @return the first descriptionUnit contained in the given text
	 */
	public static String getDescriptionUnitContainedInText(String text, boolean trim) {

		String returnedDescriptionUnit = text;
		for (String endingDescriptionUnitKeyword : ENDING_DESCRIPTION_UNIT_TOKENS) {

			Pattern ptr = Pattern.compile(endingDescriptionUnitKeyword);
			Matcher matcher = ptr.matcher(returnedDescriptionUnit);
			// If the parsed Sentence contains this keyWord (i.e. ends a description unit), we remove it
			if (matcher.find()) {
				returnedDescriptionUnit = returnedDescriptionUnit.substring(0, matcher.start());
				if (trim) {
					returnedDescriptionUnit = returnedDescriptionUnit.trim();
				}
			}
		}
		return returnedDescriptionUnit + "\n";
	}

}
