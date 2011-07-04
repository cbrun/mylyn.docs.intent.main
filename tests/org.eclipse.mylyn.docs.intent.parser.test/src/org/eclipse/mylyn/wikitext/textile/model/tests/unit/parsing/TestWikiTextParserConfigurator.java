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
package org.eclipse.mylyn.wikitext.textile.model.tests.unit.parsing;

/**
 * Contains all the configuration informations about the Wikitext Parser tests.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class TestWikiTextParserConfigurator {

	/**
	 * Indicates the location of the folder containing all the dataTests files.
	 */
	private static final String DATATESTS_FOLDER = "dataTests/wikiText/";

	/**
	 * Indicates the location of the folder containing all the expected files.
	 */
	private static final String GENERATED_FOLDER = "generatedForTest/wikiText/";

	/**
	 * TestConfigurator constructor.
	 */
	private TestWikiTextParserConfigurator() {

	}

	/**
	 * Indicates the location of the folder containing all the dataTests files.
	 * 
	 * @return the location of the folder containing all the dataTests files.
	 */
	public static String getDatatestsFolder() {
		return DATATESTS_FOLDER;
	}

	/**
	 * Indicates the location of the folder containing all the generated files.
	 * 
	 * @return Indicates the location of the folder containing all the expected files.
	 */
	public static String getGeneratedFolder() {
		return GENERATED_FOLDER;
	}

}
