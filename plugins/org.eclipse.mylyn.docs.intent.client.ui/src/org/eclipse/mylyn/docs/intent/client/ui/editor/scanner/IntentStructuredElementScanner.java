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
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentDocumentProvider;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.ColorManager;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.IntentColorConstants;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.IntentFontConstants;
import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * Scanner for detecting IntentStructured elements (like chapter or section declarations).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentStructuredElementScanner extends AbstractIntentScanner {

	public static final String CLOSING = "";

	private static String[] STRUCTURED_KEYWORDS = new String[] {IntentKeyWords.INTENT_KEYWORD_CHAPTER + CLOSING,
			IntentKeyWords.INTENT_KEYWORD_DOCUMENT + CLOSING, IntentKeyWords.INTENT_KEYWORD_SECTION + CLOSING,
			IntentKeyWords.INTENT_KEYWORD_VISIBILITY_HIDDEN, IntentKeyWords.INTENT_KEYWORD_VISIBILITY_INTERNAL,
	};

	/**
	 * The color manager to use for rendering keyWords.
	 */
	protected ColorManager colorManager;

	/**
	 * IntentStructuredElementScanner constructor.
	 * 
	 * @param colorManager
	 *            the color manager to use for rendering keyWords.
	 */
	public IntentStructuredElementScanner(ColorManager colorManager) {
		this.colorManager = colorManager;
		Color backgroundColor = null;

		Color defaultforeGroundColor = colorManager.getColor(IntentColorConstants.DU_DEFAULT_FOREGROUND);
		IToken defaultToken = new Token(new TextAttribute(defaultforeGroundColor, backgroundColor, SWT.NONE,
				IntentFontConstants.getDescriptionFont()));

		Color keyWordForeGroundColor = colorManager.getColor(IntentColorConstants.DU_KEYWORD_FOREGROUND);
		IToken keyWordToken = new Token(new TextAttribute(keyWordForeGroundColor, backgroundColor, SWT.BOLD));

		Color stringforeGroundColor = colorManager.getColor(IntentColorConstants.MU_STRING_FOREGROUND);
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(computeKeyWordRule(defaultToken, keyWordToken));
		rules.addAll(computeStringRules(stringforeGroundColor));
		setRules(rules.toArray(new IRule[rules.size()]));
	}

	/**
	 * Create all the rules related to description unit keyWords.
	 * 
	 * @return a list containing all the rules related to modeling unit keyWords
	 */
	private IRule computeKeyWordRule(IToken defaultToken, IToken keyWordToken) {
		WordRule keyWordsRule = new WordRule(new IntentWordDetector(), defaultToken);
		for (int i = 0; i < STRUCTURED_KEYWORDS.length; i++) {
			keyWordsRule.addWord(STRUCTURED_KEYWORDS[i], keyWordToken);
		}
		return keyWordsRule;
	}

	/**
	 * Create all the rules related to Strings (for example : "example" or 'example').
	 * 
	 * @return a list containing all the rules related to related to Strings
	 */
	private Collection<? extends IRule> computeStringRules(Color stringforeGroundColor) {
		IToken stringToken = new Token(new TextAttribute(stringforeGroundColor, null, SWT.ITALIC));
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new SingleLineRule("\"", "\"", stringToken, '\\'));
		rules.add(new MultiLineRule("'", "'", stringToken, '\\'));
		return rules;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.ui.editor.scanner.AbstractIntentScanner#getConfiguredContentType()
	 */
	@Override
	public String getConfiguredContentType() {
		return IntentDocumentProvider.INTENT_STRUCTURAL_CONTENT;
	}
}
