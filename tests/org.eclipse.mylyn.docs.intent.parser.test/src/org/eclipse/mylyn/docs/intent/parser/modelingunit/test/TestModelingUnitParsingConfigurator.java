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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.test;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Contains all the configuration informations about the Modeling Parser tests.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class TestModelingUnitParsingConfigurator {

	/**
	 * Indicates the location of the folder containing all the dataTests files.
	 */
	private static final String DATATESTS_FOLDER = "dataTests/modelingUnits/";

	/**
	 * Indicates the location of the folder containing all the expected files.
	 */
	private static final String EXPECTED_FOLDER = "expectedResults/modelingUnits/";

	/**
	 * Extension shared by all the test files.
	 */
	private static final String FILE_EXTENSIONS = ".intent";

	/**
	 * TestConfigurator constructor.
	 */
	private TestModelingUnitParsingConfigurator() {

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
	 * Indicates the location of the folder containing all the expected files.
	 * 
	 * @return Indicates the location of the folder containing all the expected files.
	 */
	public static String getExpectedFolder() {
		return EXPECTED_FOLDER;
	}

	/**
	 * Indicates the extension shared by all the test files.
	 * 
	 * @return the extension shared by all the test files
	 */
	public static String getFileExtensions() {
		return FILE_EXTENSIONS;
	}

	/**
	 * Returns the AST corresponding to the file located at the given filePath parsed by the given parser.
	 * 
	 * @param modelingUnitParser
	 *            the parser to call.
	 * @param filePath
	 *            path of the file starting from the DATATESTS_FOLDER and without any extension
	 * @return the AST corresponding to the file located at the given filePath
	 * @throws ParseException
	 *             if the parser has detected errors
	 * @throws IOException
	 *             if the given filePath is invalid
	 */
	public static EObject parseFile(ModelingUnitParser modelingUnitParser, String filePath)
			throws ParseException, IOException {
		return modelingUnitParser.parseFile(TestModelingUnitParsingConfigurator.getDatatestsFolder()
				+ filePath + TestModelingUnitParsingConfigurator.getFileExtensions());
	}
}
