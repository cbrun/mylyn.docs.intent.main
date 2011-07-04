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
package org.eclipse.mylyn.docs.intent.client.ui.editor.scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentEditorDocument;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.query.IntentStructuredElementGetter;
import org.eclipse.mylyn.docs.intent.core.query.UnitGetter;

import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;
import org.eclipse.mylyn.docs.intent.parser.IntentParserUtil;
import org.eclipse.mylyn.docs.intent.serializer.ParsedElementPosition;

/**
 * Scan the document and identify abstract partitions that will be scan precisely by the correct scanner (for
 * example : Modeling Unit, Description Unit).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentBufferedPartitionScanner implements IPartitionTokenScanner {

	/**
	 * Represents an Intent structural content (like section or chapter).
	 */
	public static final String INTENT_STRUCTURAL_CONTENT = "__Intent__structuralcontent";

	/**
	 * Represents an Intent Modeling Unit (from '@M' to 'M@').
	 */
	public static final String INTENT_MODELINGUNIT = "__Intent__modelingunit";

	/**
	 * Represents an Intent Description Unit.
	 */
	public static final String INTENT_DESCRIPTIONUNIT = "__Intent__descriptionunit";

	/**
	 * Represents an Intent title ( only for Structured element).
	 */
	public static final String INTENT_TITLE = "__Intent__title";

	/**
	 * Represents all the content types handled by this partionner.
	 */
	public static final String[] LEGAL_CONTENT_TYPES = new String[] {INTENT_STRUCTURAL_CONTENT, INTENT_MODELINGUNIT,
			INTENT_DESCRIPTIONUNIT, INTENT_TITLE,
	};

	/**
	 * Indicates that no token has been visited yet.
	 */
	private static final int NOT_VISITED_TOKEN = -2;

	/**
	 * Sorted map of the scanned tokens : associate a token with its offset.
	 */
	private SortedMap<Integer, IntentToken> tokenMap;

	/**
	 * Represents the position of the current visited token in the tokenMap.
	 */
	private int currentVisisitedToken;

	/**
	 * Used to detect white space characters.
	 */
	private IntentWhiteSpaceDetector whiteSpaceDetector;

	/**
	 * IntentBufferedPartitionScanner constructor.
	 */
	public IntentBufferedPartitionScanner() {
		super();
		tokenMap = new TreeMap<Integer, IntentToken>();
		currentVisisitedToken = NOT_VISITED_TOKEN;
		whiteSpaceDetector = new IntentWhiteSpaceDetector();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.IPartitionTokenScanner#setPartialRange(org.eclipse.jface.text.IDocument,
	 *      int, int, java.lang.String, int)
	 */
	public void setPartialRange(IDocument document, int offset, int length, String contentType,
			int partitionOffset) {

		// If the given offset is a whitespace character
		// try {
		// if (whiteSpaceDetector.isWhitespace(document.getChar(offset))) {
		// // We just update the position without adding tokens
		// System.out.println("WHITE S");
		// updateTokens(new IntentToken("__withespace", offset, 1), false);
		//
		// } else {
		boolean foundContentType = false;
		if (contentType != null) {
			if (INTENT_MODELINGUNIT.equals(contentType)) {
				updateModelingUnitRange((IntentEditorDocument)document, partitionOffset, length);
				foundContentType = true;
			}
			if (INTENT_DESCRIPTIONUNIT.equals(contentType)) {
				updateDescriptionUnitRange((IntentEditorDocument)document, partitionOffset, offset, length);
				foundContentType = true;
			}
		}
		if (!foundContentType) {
			createNewRange((IntentEditorDocument)document, offset, length);
		}
	}

	// } catch (BadLocationException e) {
	// // TODO : handle this exception
	// e.printStackTrace();
	// }
	//
	// }

	/**
	 * Create a new range, starting at the given offset and stopping at the next flow breaking token.
	 * 
	 * @param document
	 *            the document containing the text to scan
	 * @param offset
	 *            modified offset
	 * @param length
	 *            modification length
	 */
	private void createNewRange(IntentEditorDocument document, int offset, int length) {
		// System.err.println("createNEwRANGE : " + offset);
		// If the previous token was a Description Unit
		IntentToken previousToken = getPreviousToken(offset);
		// System.err.println("previousToken : " + previousToken.getOffset() + "-" + previousToken.getLength()
		// + "-" + previousToken.getData());
		if ((previousToken != null) && (INTENT_DESCRIPTIONUNIT.equals(previousToken.getData()))) {
			// We update this descriptionUnit by adding the new content
			updateDescriptionUnitRange(document, previousToken.getOffset(), offset, length);
		}

	}

	/**
	 * Returns the token containing the given offset or located before it.
	 * 
	 * @param offset
	 *            the offset
	 * @return the token containing the given offset or located before it
	 */
	private IntentToken getPreviousToken(int offset) {
		int lastOffset = NOT_VISITED_TOKEN;
		for (Integer offsetKey : tokenMap.keySet()) {
			if (offsetKey >= offset) {
				lastOffset = offsetKey;
				break;
			} else {
				lastOffset = offsetKey;
			}
		}
		return tokenMap.get(lastOffset);
	}

	/**
	 * Updates the tokens according to the modification of a description unit at the given offset.
	 * 
	 * @param document
	 *            the document containing the text to scan
	 * @param partitionOffset
	 *            the offset that represents the beginning of the description Unit partition
	 * @param offset
	 *            modified offset
	 * @param length
	 *            modification length
	 */
	private void updateDescriptionUnitRange(IntentEditorDocument document, int partitionOffset, int offset,
			int length) {

		String studiedText = document.get().substring(partitionOffset);
		studiedText = IntentParserUtil.getDescriptionUnitContainedInText(studiedText, false);
		updateTokens(new IntentToken(INTENT_DESCRIPTIONUNIT, partitionOffset, studiedText.length()), true);
	}

	/**
	 * Updates the tokens according to the modification of a modeling unit at the given offset.
	 * 
	 * @param document
	 *            the document containing the text to scan
	 * @param offset
	 *            modified offset
	 * @param length
	 *            modification length
	 */
	public void updateModelingUnitRange(IntentEditorDocument document, int offset, int length) {
		String documentText = document.get();
		int modelingUnitBegin = -1;
		int modelingUnitEnd = -1;
		int shiftLeft = 0;

		while ((documentText.indexOf(IntentKeyWords.MODELING_UNIT_BEGIN) != -1) && (modelingUnitBegin < offset)) {

			int newmodelingUnitBegin = documentText.indexOf(IntentKeyWords.MODELING_UNIT_BEGIN);

			if (newmodelingUnitBegin != -1) {
				documentText = documentText
						.substring(newmodelingUnitBegin + IntentKeyWords.MODELING_UNIT_BEGIN.length(),
								documentText.length());
				modelingUnitBegin = shiftLeft + newmodelingUnitBegin
						+ IntentKeyWords.MODELING_UNIT_BEGIN.length();
				shiftLeft = modelingUnitBegin;
			}
		}
		modelingUnitBegin = modelingUnitBegin - IntentKeyWords.MODELING_UNIT_BEGIN.length();

		while ((documentText.lastIndexOf(IntentKeyWords.MODELING_UNIT_END) != -1)
				&& ((modelingUnitEnd == -1) || (modelingUnitEnd > offset))) {
			int newmodelingUnitEnd = documentText.lastIndexOf(IntentKeyWords.MODELING_UNIT_END);
			if (newmodelingUnitEnd != -1) {
				documentText = documentText.substring(0, newmodelingUnitEnd);
				modelingUnitEnd = shiftLeft + newmodelingUnitEnd;

			}
		}
		modelingUnitEnd = modelingUnitEnd + IntentKeyWords.MODELING_UNIT_END.length();

		if ((modelingUnitBegin <= offset) && (modelingUnitEnd >= offset)
				&& (modelingUnitEnd > modelingUnitBegin)) {
			updateTokens(
					new IntentToken(INTENT_MODELINGUNIT, modelingUnitBegin, modelingUnitEnd - modelingUnitBegin),
					true);
		}
	}

	/**
	 * Update the token map by adding the given token and updating the positions of following tokens.
	 * 
	 * @param token
	 *            the token to add
	 * @param isTokenToAdd
	 *            indicates if the given token should be added to the token Map or ignored.
	 */
	private void updateTokens(IntentToken token, boolean isTokenToAdd) {

		List<IntentToken> tokensToUpdate = new ArrayList<IntentToken>();
		Iterator<Integer> iterator = tokenMap.keySet().iterator();
		int shift = 0;

		while (iterator.hasNext()) {
			Integer currentOffset = iterator.next();
			IntentToken currentToken = tokenMap.get(currentOffset);

			// If the new token is in conflict with an old one
			if (areConflictingTokens(token, currentToken)) {
				// We remove the old one
				shift = token.getLength() - currentToken.getLength();
				iterator.remove();
			} else {
				// If the addition of the new token implies that this token should update its position
				if (shift != 0) {
					iterator.remove();
					tokensToUpdate.add(new IntentToken(currentToken.getData(), currentToken.getOffset() + shift,
							currentToken.getLength()));
				}
			}
		}

		if (isTokenToAdd) {
			addToken(token);
		}
		for (IntentToken tokenToUpdate : tokensToUpdate) {
			addToken(tokenToUpdate);
		}
		currentVisisitedToken = NOT_VISITED_TOKEN;
	}

	/**
	 * Indicates if the two given tokens are in conflict.
	 * 
	 * @param token
	 *            the new token
	 * @param currentToken
	 *            the old token to determine if it's in conflict with the new one
	 * @return true if the two given tokens are in conflict, false otherwise.
	 */
	private boolean areConflictingTokens(IntentToken token, IntentToken currentToken) {
		return !((currentToken.getOffset() < token.getOffset()) && (currentToken.getOffset()
				+ currentToken.getLength() < token.getOffset()))
				&& !((currentToken.getOffset() > token.getOffset()) && (currentToken.getOffset()
						+ currentToken.getLength() > token.getOffset()));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.ITokenScanner#setRange(org.eclipse.jface.text.IDocument, int, int)
	 */
	public void setRange(IDocument document, int offset, int length) {
		if (!(document instanceof IntentEditorDocument)) {
			throw new UnsupportedOperationException("This scanner can only parse "
					+ IntentEditorDocument.class.getSimpleName());
		}
		IntentEditorDocument intentDocument = (IntentEditorDocument)document;

		EObject root = (EObject)intentDocument.getAST();

		// Using the ast, we get the position of each partition and create the associated tokens.
		tokenMap.clear();
		for (ModelingUnit mu : UnitGetter.getAllModelingUnitsContainedInElement(root)) {
			ParsedElementPosition position = intentDocument.getIntentPosition(mu);
			addToken(new IntentToken(INTENT_MODELINGUNIT, position.getOffset(), position.getLength()));
		}
		for (DescriptionUnit du : UnitGetter.getAllDescriptionUnitsContainedInElement(root)) {
			ParsedElementPosition position = intentDocument.getIntentPosition(du);
			addToken(new IntentToken(INTENT_DESCRIPTIONUNIT, position.getOffset(), position.getLength()));
		}

		for (IntentStructuredElement structured : IntentStructuredElementGetter.getAllStructuredElement(root)) {
			ParsedElementPosition position = intentDocument.getIntentPosition(structured);
			addToken(new IntentToken(INTENT_STRUCTURAL_CONTENT, position.getOffset(), position.getLength()));
			// If this element has a title, we add a token too.
			if (structured.getTitle() != null) {
				ParsedElementPosition titlePosition = intentDocument.getIntentPosition(structured.getTitle());
				addToken(new IntentToken(INTENT_TITLE, titlePosition.getOffset(), titlePosition.getLength()));
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.ITokenScanner#nextToken()
	 */
	public IToken nextToken() {

		increaseCurrentVisitedToken();
		if (currentVisisitedToken != -1) {

			// System.out.println("RETURNED TOKEN : " + tokenMap.get(currentVisisitedToken).getOffset() +
			// " : "
			// + tokenMap.get(currentVisisitedToken).getLength() + " -"
			// + tokenMap.get(currentVisisitedToken).getData());
			return tokenMap.get(currentVisisitedToken);
		}
		return Token.EOF;
	}

	/**
	 * Sets the current visited token to the next value of the tokenMap.
	 */
	private void increaseCurrentVisitedToken() {
		if (currentVisisitedToken == -1) {
			if (tokenMap.keySet().size() > 0) {
				Iterator<Integer> iterator = tokenMap.keySet().iterator();
				currentVisisitedToken = iterator.next();
			}
		} else {
			Iterator<Integer> iterator = tokenMap.keySet().iterator();
			boolean foundNextToken = false;
			while (iterator.hasNext() && !foundNextToken) {
				Integer offsetValue = iterator.next();
				if (offsetValue > currentVisisitedToken) {
					foundNextToken = true;
					currentVisisitedToken = offsetValue;
				}
			}
			if (!foundNextToken) {
				currentVisisitedToken = -1;
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.ITokenScanner#getTokenOffset()
	 */
	public int getTokenOffset() {
		return tokenMap.get(currentVisisitedToken).getOffset();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.ITokenScanner#getTokenLength()
	 */
	public int getTokenLength() {
		return tokenMap.get(currentVisisitedToken).getLength();
	}

	/**
	 * Add the given token to the token Map.
	 * 
	 * @param token
	 *            the token to add
	 */
	private void addToken(IntentToken token) {
		tokenMap.put(token.getOffset(), token);

	}
}
