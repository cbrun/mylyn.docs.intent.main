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
package org.eclipse.mylyn.docs.intent.markup.builder.state.utils;

/**
 * Analyse unescaped String detected by the parseur and traduces it.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class CharacterEscapedAnalyser {

	/**
	 * The constructor is private and not accessible.
	 */
	private CharacterEscapedAnalyser() {

	}

	/**
	 * Returns true if the given String represents a link declaration.
	 * 
	 * @param unescaped
	 *            String to analyse
	 * @return true if the given String represents a link declaration, false otherwise.
	 */
	public static boolean isLinkDeclaration(String unescaped) {
		return unescaped.contains("<a") && unescaped.contains("href=");
	}

	/**
	 * Returns the name associated to the given link.
	 * 
	 * @param unescaped
	 *            Link to parse.
	 * @return the name associated to the given link.
	 */
	public static String getLinkName(String unescaped) {
		return unescaped.replaceAll("<a[ ]*href=[\"[a-z]*[.-_]]*>", "").replace("</a>", "").trim();
	}

	/**
	 * Returns the href associated to the given link.
	 * 
	 * @param unescaped
	 *            Link to parse.
	 * @return the href associated to the given link.
	 */
	public static String getLinkHref(String unescaped) {

		try {
			String href = unescaped.replaceAll(">.*</a>", "");
			href = href.substring(href.indexOf('\"') + 1, href.length() - 1);
			href = href.substring(0, href.indexOf('\"'));
			return href;
		} catch (NullPointerException e) {
			return "";
		}
	}

	/**
	 * Returns the title associated to the given link.
	 * 
	 * @param unescaped
	 *            Link to parse.
	 * @return the title associated to the given link.
	 */
	public static String getLinkTitle(String unescaped) {
		String title = "";
		if (unescaped.contains("title=\"")) {
			try {
				title = unescaped.replaceAll(">.*</a>", "");
				title = title.substring(0, title.lastIndexOf("\""));
				title = title.substring(title.lastIndexOf("\"") + 1, title.length());
			} catch (NullPointerException e) {
				return "";
			}

		}
		return title;
	}

	/**
	 * Indicates if the given String is a lineBreak declaration.
	 * 
	 * @param unescaped
	 *            String to parse.
	 * @return true if the given String is a lineBreak declaration, false otherwise.
	 */
	public static boolean isLineBreak(String unescaped) {
		return "<br/>".equals(unescaped.trim()) || "<br />".equals(unescaped.trim());
	}

	/**
	 * Indicates if the given String is a tabulation declaration.
	 * 
	 * @param unescaped
	 *            String to parse.
	 * @return true if the given String is a tabulation declaration, false otherwise.
	 */
	public static boolean isTabulation(String unescaped) {
		return "<dd/>".equals(unescaped.trim()) || "<dd />".equals(unescaped.trim());
	}

}
