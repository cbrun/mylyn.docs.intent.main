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
package org.eclipse.mylyn.docs.intent.client.ui.editor.configuration;

import org.eclipse.swt.graphics.RGB;

/**
 * Constants for all the colors used by an Intent Editor.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentColorConstants {

	// -----------------------------------
	// Color constant for MODELING UNITS
	// ----------------------------------
	public static final RGB MU_BACKGROUND = new RGB(221, 221, 221);

	public static final RGB MU_KEYWORD_FOREGROUND = new RGB(139, 10, 80);

	public static final RGB MU_DEFAULT_FOREGROUND = new RGB(0, 0, 0);

	public static final RGB MU_STRING_FOREGROUND = new RGB(0, 0, 180);

	public static final RGB MU_DECORATION_LINE_FOREGROUND = new RGB(84, 84, 84);

	public static final RGB MU_DECORATION_BACKGROUND = new RGB(192, 192, 192);

	public static final int MU_DECORATION_LINE_WIDTH = 2;

	// -----------------------------------
	// Color constant for DECRIPTION UNITS
	// ----------------------------------
	public static final RGB DU_BACKGROUND = null;

	public static final RGB DU_KEYWORD_FOREGROUND = new RGB(139, 10, 80);

	public static final RGB DU_DEFAULT_FOREGROUND = new RGB(0, 0, 0); // new RGB(63, 95, 191);

	public static final RGB DU_TITLE_FOREGROUND = new RGB(0, 0, 0);

	/**
	 * IntentColorConstant constructor.
	 */
	private IntentColorConstants() {

	}
}
