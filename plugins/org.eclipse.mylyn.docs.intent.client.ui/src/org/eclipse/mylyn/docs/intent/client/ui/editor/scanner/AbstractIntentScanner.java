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

import org.eclipse.jface.text.rules.RuleBasedScanner;

/**
 * A simple rule based scanner that all scanner of a IntentEditor should extend.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractIntentScanner extends RuleBasedScanner {

	/**
	 * Returns the type of the tokens read by this scanner.
	 * 
	 * @return the type of the tokens
	 */
	public abstract String getConfiguredContentType();

}
