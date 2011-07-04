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
package org.eclipse.mylyn.docs.intent.markup.serializer;

import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;

/**
 * Serializes the Attributes of an element, like CSSStyle or CSSClass.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class AttributeStyleSerializer {

	// ALIGNEMENT constants
	private static String BLOC_ALIGN_LEFT = "text-align: left;";

	private static String BLOC_ALIGN_CENTER = "text-align: center;";

	private static String BLOC_ALIGN_RIGHT = "text-align: right;";

	private static String BLOC_ALIGN_JUSTIFY = "text-align: justify;";

	// PADDINGS constants
	private static String BLOC_PADDINGLEFTBEGIN = "padding-left: ";

	private static String BLOC_PADDINGEND = "em;";

	private static String BLOC_PADDINGLEFT = BLOC_PADDINGLEFTBEGIN + "[0-9]+" + BLOC_PADDINGEND;

	private static String BLOC_PADDINGRIGHTBEGIN = "padding-right: ";

	private static String BLOC_PADDINGRIGHT = BLOC_PADDINGRIGHTBEGIN + "[0-9]+" + BLOC_PADDINGEND;

	/**
	 * AttributeStyleSerializer constructor.
	 */
	private AttributeStyleSerializer() {
	}

	/**
	 * Returns the serialized form of the given Attributes.
	 * 
	 * @param attr
	 *            attributes to serialized.
	 * @return the serialized form of the given Attributes.
	 */
	public static String renderAttributeForBloc(Annotations attr) {
		String style = "";
		if (attr != null) {
			if (attr.getCSSStyle() != null) {
				style += renderStyle(attr.getCSSStyle());
			}
		}
		return style;
	}

	/**
	 * Calculate the serialized form of the given style by remplacing preformatted styles by the textile
	 * syntax.
	 * 
	 * @param style
	 *            Style to transform.
	 * @return the serialized form of the given style
	 */
	private static String renderStyle(String style) {
		// The preformatedStyles are the ones defines as constants and
		// that have a special traduction in textile.
		String preformattedStyles = "";
		String remainingStyles = style;

		// Step 1 : manage the Alignment.
		String[] alignementResult = manageAlignment(style);
		remainingStyles = alignementResult[1];

		// Step 2 : manage the Padding
		String[] paddingResult = managePadding(remainingStyles);
		remainingStyles = paddingResult[1];

		// Step 3 : add brackets to nonPreformatedStyles (if it hasn't been made)
		if ((remainingStyles.length() > 0) && (!remainingStyles.contains("{"))) {
			remainingStyles = "{" + remainingStyles + "}";
		}

		preformattedStyles = alignementResult[0] + paddingResult[0];

		return preformattedStyles + remainingStyles;
	}

	/**
	 * Replace all the alignements style by the textile symbol.
	 * 
	 * @param style
	 *            Style to replace
	 * @return the first item of this table represent the replaced styles ; the second the styles not
	 *         replaced.
	 */
	private static String[] manageAlignment(String style) {
		// The preformatedStyles are the ones defines as constants and
		// that have a special traduction in textile.
		String preformattedStyles = "";
		String remainingStyles = style;

		if (style.contains(BLOC_ALIGN_JUSTIFY)) {
			preformattedStyles += "<>";
			remainingStyles = remainingStyles.replace(BLOC_ALIGN_JUSTIFY, "");
		}
		if (style.contains(BLOC_ALIGN_LEFT)) {
			preformattedStyles += "<";
			remainingStyles = remainingStyles.replace(BLOC_ALIGN_LEFT, "");
		}
		if (style.contains(BLOC_ALIGN_RIGHT)) {
			preformattedStyles += ">";
			remainingStyles = remainingStyles.replace(BLOC_ALIGN_RIGHT, "");
		}
		if (style.contains(BLOC_ALIGN_CENTER)) {
			preformattedStyles += "=";
			remainingStyles = remainingStyles.replace(BLOC_ALIGN_CENTER, "");
		}
		String[] result = new String[2];
		result[0] = preformattedStyles;
		result[1] = remainingStyles;
		return result;
	}

	/**
	 * Replace all the padding styles by the textile symbol.
	 * 
	 * @param style
	 *            Style to replace
	 * @return the first item of this table represent the replaced styles ; the second the styles not
	 *         replaced.
	 */
	private static String[] managePadding(String style) {
		String preformattedStyles = "";
		String remainingStyles = style;
		boolean styleHasPaddingDeclaration = false;

		boolean isLeftPadding = true;
		String paddingSymbol = "(";
		if (style.matches(BLOC_PADDINGLEFT)) {
			styleHasPaddingDeclaration = true;
			remainingStyles = remainingStyles.replaceAll(BLOC_PADDINGLEFT, "");
		}

		if (style.matches(BLOC_PADDINGRIGHT)) {
			isLeftPadding = false;
			styleHasPaddingDeclaration = true;
			paddingSymbol = ")";
			remainingStyles = remainingStyles.replaceAll(BLOC_PADDINGRIGHT, "");
		}

		if (styleHasPaddingDeclaration) {
			int paddingValue = getPaddingValue(style, isLeftPadding);

			for (int i = 1; i <= paddingValue; i++) {
				preformattedStyles += paddingSymbol;
			}
		}
		String[] result = new String[2];
		result[0] = preformattedStyles;
		result[1] = remainingStyles;
		return result;
	}

	/**
	 * Returns the value of the given padding according to a style definition.
	 * 
	 * @param style
	 *            style of the padding
	 * @param isLeftPadding
	 *            true if the given padding is a left one, false otherwise
	 * @return the value of the given padding according to a style definition
	 */
	private static int getPaddingValue(String style, boolean isLeftPadding) {
		String paddingDeclaration = "";
		if (isLeftPadding) {
			paddingDeclaration = style.replace(style.replaceAll(BLOC_PADDINGLEFT, ""), "");
			paddingDeclaration = paddingDeclaration.replace(BLOC_PADDINGLEFTBEGIN, "");
		} else {
			paddingDeclaration = style.replace(style.replaceAll(BLOC_PADDINGRIGHT, ""), "");
			paddingDeclaration = paddingDeclaration.replace(BLOC_PADDINGRIGHTBEGIN, "");
		}
		paddingDeclaration = paddingDeclaration.replace(BLOC_PADDINGEND, "");

		return Integer.valueOf(paddingDeclaration);

	}

}
