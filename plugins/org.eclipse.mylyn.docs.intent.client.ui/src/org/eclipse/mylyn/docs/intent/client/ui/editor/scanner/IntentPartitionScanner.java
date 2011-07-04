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
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.mylyn.docs.intent.client.ui.editor.rules.ISequenceRule;
import org.eclipse.mylyn.docs.intent.client.ui.editor.rules.KeywordRule;
import org.eclipse.mylyn.docs.intent.client.ui.editor.rules.SequenceBlockRule;
import org.eclipse.mylyn.docs.intent.client.ui.editor.rules.SequenceRule;

import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;

/**
 * Partition Scanner dividing an Intent Document content into different zones (Modeling Units,
 * Description Units...).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentPartitionScanner extends RuleBasedPartitionScanner {

	public static final String INTENT_MODELINGUNIT = "__Intent__modelingunit";

	public static final String INTENT_DESCRIPTIONUNIT = "__Intent__descriptionunit";

	/**
	 * All legal content types.
	 */
	public static final String[] LEGAL_CONTENT_TYPES = new String[] {INTENT_MODELINGUNIT, INTENT_DESCRIPTIONUNIT,
	};

	/**
	 * IntentPartitionScanner constructor.
	 */
	public IntentPartitionScanner() {
		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		rules.addAll(computeDescriptionUnitRule());
		rules.add(computeModelingUnitRule());

		setPredicateRules(rules.toArray(new IPredicateRule[rules.size()]));
	}

	/**
	 * Create the rules allowing this partition scanner to detect a Modeling Unit zone.
	 * 
	 * @return a list containing the rules allowing this partition scanner to detect a Modeling Unit zone
	 */
	private IPredicateRule computeModelingUnitRule() {
		return new MultiLineRule("@M", "M@", new Token(INTENT_MODELINGUNIT));
	}

	public List<IPredicateRule> computeDescriptionUnitRule() {
		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		/*
		 * new SequenceBlockRule(new KeywordRule( IntentKeyWords.INTENT_KEYWORD_SECTION, true, false, null), new
		 * KeywordRule("{"), new KeywordRule("\\"), null);
		 */
		SequenceRule sectionBeginRule = new SequenceRule(new String[] {IntentKeyWords.INTENT_KEYWORD_SECTION,
				IntentKeyWords.INTENT_KEYWORD_OPEN,
		});
		ISequenceRule chapterBeginRule = new SequenceRule(new String[] {IntentKeyWords.INTENT_KEYWORD_CHAPTER,
				IntentKeyWords.INTENT_KEYWORD_OPEN,
		});
		ISequenceRule documentBeginRule = new SequenceRule(new String[] {IntentKeyWords.INTENT_KEYWORD_DOCUMENT,
				IntentKeyWords.INTENT_KEYWORD_OPEN,
		});
		ISequenceRule modelingUnitEndRule = new KeywordRule("M@");

		List<ISequenceRule> beginRules = new ArrayList<ISequenceRule>();
		beginRules.add(documentBeginRule);
		beginRules.add(chapterBeginRule);
		beginRules.add(sectionBeginRule);
		beginRules.add(modelingUnitEndRule);

		List<ISequenceRule> endRules = new ArrayList<ISequenceRule>();
		endRules.add(new KeywordRule(IntentKeyWords.MODELING_UNIT_BEGIN));

		for (int i = 0; i < beginRules.size(); i++) {
			for (int j = 0; j < endRules.size(); j++) {
				rules.add(new SequenceBlockRule(beginRules.get(i), endRules.get(j), new KeywordRule("\\"),
						new Token(INTENT_DESCRIPTIONUNIT)));
			}
		}

		rules.add(new SequenceBlockRule(modelingUnitEndRule, new KeywordRule(String
				.valueOf((char)ICharacterScanner.EOF)), new KeywordRule("\\"), new Token(INTENT_DESCRIPTIONUNIT)));
		return rules;

	}

}
