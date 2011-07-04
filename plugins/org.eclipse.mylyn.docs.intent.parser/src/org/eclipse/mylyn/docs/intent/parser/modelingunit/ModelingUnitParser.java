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
package org.eclipse.mylyn.docs.intent.parser.modelingunit;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * Parser of a Modeling Unit.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public interface ModelingUnitParser {

	/**
	 * Prefix that indicates the beginning of a Modeling Unit.
	 */
	String MODELING_UNIT_PREFIX = "@M";

	/**
	 * Suffix that indicates the end of a Modeling Unit.
	 */
	String MODELING_UNIT_SUFFIX = "M@";

	/**
	 * Parse the given String and return its AST.
	 * 
	 * @param stringToParse
	 *            String representing the Modeling Unit to parse
	 * @return the AST corresponding to the given String
	 * @throws ParseException
	 *             if the given String cannot be parsed
	 */
	EObject parseString(String stringToParse) throws ParseException;

	/**
	 * Parse the file located at the given filePath and return its AST.
	 * 
	 * @param filePath
	 *            Location of the file to parse
	 * @return the AST corresponding to the file content
	 * @throws ParseException
	 *             if the given File cannot be parsed
	 * @throws IOException
	 *             if the given File doesn't exists
	 */
	EObject parseFile(String filePath) throws ParseException, IOException;

}
