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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mylyn.docs.intent.markup.resource.WikitextResourceFactory;
import org.eclipse.mylyn.docs.intent.markup.serializer.WikiTextResourceSerializer;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.test.utils.FileToStringConverter;
import org.junit.Test;

/**
 * Test simple parsing of textile files.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TestWikiTextParserGeneral {

	static String[] getTextSerializations(String fileToTest) {
		String fileToGenerate = fileToTest;

		// Step 1 : creation of an inputStream on the file to Test.
		// InputStream input = getClass().getClassLoader().getResourceAsStream(
		// TestParsingTextile.PARSING_TEST_DATA + fileToTest);
		InputStream input = null;
		try {
			input = new FileInputStream(new File(TestWikiTextParserConfigurator.getDatatestsFolder()
					+ fileToTest));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		// Step 2 : creation of a Wikitext Resource linked from this inputStream.
		Resource resourceTextile = new WikitextResourceFactory().createResource(URI
				.createFileURI(TestWikiTextParserConfigurator.getGeneratedFolder() + fileToGenerate));

		// Step 3 : Generation of a textile file.
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put(XMLResource.OPTION_ENCODING, "UTF8");
			resourceTextile.load(input, options);

			resourceTextile.save(options);

			// Step 4 : Build the result
			String expected;

			expected = FileToStringConverter.getFileAsString(new File(TestWikiTextParserConfigurator
					.getDatatestsFolder() + fileToTest));

			String actual = FileToStringConverter.getFileAsString(new File(TestWikiTextParserConfigurator
					.getGeneratedFolder() + fileToGenerate));
			String fromResource = WikiTextResourceSerializer.getSerializer().serialize(resourceTextile);

			String[] result = new String[3];
			result[0] = expected;
			result[1] = actual;
			result[2] = fromResource;
			return result;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	static void compareTextSerialization(String fileToTest) {

		String[] serialization = getTextSerializations(fileToTest);
		String expected = serialization[0];
		String actual = serialization[1];
		String fromResource = serialization[2];

		// We ensure that the 2 files are equals,
		// and that these files are also equals to the resource's serialisation.
		Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, fromResource);

	}

	/*
	 * @Test public void testSimpleDocument() { // Objectives : // parse a simple document(entities, images,
	 * code and TOC). compareTextSerialization("simpleDocument.textile"); }
	 */

	@Test
	public void testLists() {
		// Objectives :
		// parse correctly all types of lits (embedded...).
		compareTextSerialization("lists.textile");
	}

	@Test
	public void testFormats() {
		// Objectives :
		// render correctly embedded and complex formats
		compareTextSerialization("manyFormats.textile");

	}

	@Test
	public void testEmbededImages() {
		// Objectives :
		// render correctly Image embedded in lists.
		compareTextSerialization("new_noteworthy.textile");
	}

	@Test
	public void testCharacterEscaped() {
		// Objectives
		// Test CharacterEscaped Managment (for all HTMLEntities like <br/> see the SpecificElement Tests)
		compareTextSerialization("User_Guide.textile");
	}

	@Test
	public void testTable() {
		// Objectives
		// Correctly render a Table (and also blocQuotes ended by new Sections).
		compareTextSerialization("Using_Compare_Services.textile");
		compareTextSerialization("tables.textile");

	}

	@Test
	public void testLinks() {
		// Objectives :
		// parse correctly internal and external links
		// TODO : internal links (seems difficult)
		compareTextSerialization("testLink.textile");
	}

	@Test
	public void testFancyText() {
		// Objectives :
		// parse correctly fancy paragraphs with padding, alignement...
		compareTextSerialization("fancyText.textile");
	}

	@Test
	public void testCompleteExamples() {
		// Objectives :
		// Preformatted text, links, TOC...
		compareTextSerialization("EMF_Compare_Export_Tutorial.textile");
		compareTextSerialization("Adapting_Comparison_Process.textile");
	}

	@Test
	public void performanceTest() {
		// Objectives :
		// Parse a big Textile file correctly and rapidly.
		compareTextSerialization("specifier-guide.textile");
	}

}
