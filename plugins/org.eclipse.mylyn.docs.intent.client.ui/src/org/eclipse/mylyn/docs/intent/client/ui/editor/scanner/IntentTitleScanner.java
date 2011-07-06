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

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentDocumentProvider;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.ColorManager;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.IntentColorConstants;
import org.eclipse.mylyn.docs.intent.client.ui.editor.configuration.IntentFontConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * Scanner for the title partitions.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentTitleScanner extends IntentDescriptionUnitScanner {

	/**
	 * IntentTitleScanner constructor.
	 * 
	 * @param colorManager
	 *            the color manager to use
	 */
	public IntentTitleScanner(ColorManager colorManager) {
		super(colorManager);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.ui.editor.scanner.IntentDescriptionUnitScanner#computeKeyWordRule(org.eclipse.jface.text.rules.IToken,
	 *      org.eclipse.jface.text.rules.IToken)
	 */
	@Override
	protected IRule computeKeyWordRule(IToken defaultToken, IToken keyWordToken) {
		Color defaultForeGroundColor = colorManager.getColor(IntentColorConstants.DU_TITLE_FOREGROUND);
		IToken newDefaultToken = new Token(new TextAttribute(defaultForeGroundColor, null, SWT.NONE,
				IntentFontConstants.getTitleFont()));
		return super.computeKeyWordRule(newDefaultToken, keyWordToken);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.ui.editor.scanner.IntentDescriptionUnitScanner#getConfiguredContentType()
	 */
	@Override
	public String getConfiguredContentType() {
		return IntentDocumentProvider.INTENT_TITLE;
	}
}
