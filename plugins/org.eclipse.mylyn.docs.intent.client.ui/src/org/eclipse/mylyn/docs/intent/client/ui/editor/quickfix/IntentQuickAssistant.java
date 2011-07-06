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
package org.eclipse.mylyn.docs.intent.client.ui.editor.quickfix;

import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.quickassist.QuickAssistAssistant;

/**
 * {@link QuickAssistAssistant} used by Intent to provide quick-fixes for synchronization issues.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentQuickAssistant extends QuickAssistAssistant implements IQuickAssistAssistant {

	/**
	 * Default constructor.
	 */
	public IntentQuickAssistant() {
		super();
		setQuickAssistProcessor(new IntentQuickAssistProcessor());
	}

}
