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
package org.eclipse.mylyn.docs.intent.collab.test.ide.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * Utility class providing usefull methods for dealing with Files.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class FileUtils {

	/**
	 * FileUtils constructor.
	 */
	private FileUtils() {

	}

	/**
	 * A tool method to get the content of the file specified by its absolute path.
	 * <p>
	 * Imported from the AbstractAcceloTest class of org.eclipse.acceleo.engine.tests.unit
	 * 
	 * @author <a href="mailto:freddy.allilaire@obeo.fr">Freddy Allilaire</a>
	 *         <p>
	 *         Use example : <br/>
	 *         <code>
	 * String resourceContent = FileUtils.getAbsoluteFileContent(resourceToModifyAbsolutePath);<br/>
	 * resourceContent = resourceContent.replace("something", "somethingElse");<br/>
	 * FileUtils.setAbsoluteFileContent(resourceToModifyAbsolutePath, resourceContent);</code>
	 *         </p>
	 *         </p>
	 * @param fileName
	 *            the absolute path of the file
	 * @return the content of the file
	 * @throws IOException
	 *             if I/O error occurs
	 */
	public static String getAbsoluteFileContent(String fileName) throws IOException {
		return getAbsoluteFileContent(fileName, null);
	}

	/**
	 * A tool method to get the content of the file specified by its absolute path. Uses the given encoding to
	 * read the file.
	 * <p>
	 * Imported from the AbstractAcceloTest class of org.eclipse.acceleo.engine.tests.unit
	 * 
	 * @author <a href="mailto:freddy.allilaire@obeo.fr">Freddy Allilaire</a>
	 *         <p>
	 *         Use example : <br/>
	 *         <code>
	 * String resourceContent = FileUtils.getAbsoluteFileContent(resourceToModifyAbsolutePath);<br/>
	 * resourceContent = resourceContent.replace("something", "somethingElse");<br/>
	 * FileUtils.setAbsoluteFileContent(resourceToModifyAbsolutePath, resourceContent);</code>
	 *         </p>
	 *         </p>
	 * @param fileName
	 *            the absolute path of the file
	 * @param charset
	 *            Charset that's to be used for reading this file.
	 * @return the content of the file
	 * @throws IOException
	 *             if I/O error occurs
	 */
	public static String getAbsoluteFileContent(String fileName, String charset) throws IOException {
		StringBuilder buffer = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			Reader reader;
			if (charset != null) {
				InputStream inputStream = new FileInputStream(fileName);
				reader = new InputStreamReader(inputStream, charset);
			} else {
				reader = new FileReader(fileName);
			}
			bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				buffer.append(line);
				line = bufferedReader.readLine();
			}
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		return buffer.toString();
	}

	/**
	 * Puts into the file located at the given fileAbsolutePath the given content.
	 * <p>
	 * Use example : <br/>
	 * <code>
	 * String resourceContent = FileUtils.getAbsoluteFileContent(resourceToModifyAbsolutePath);<br/>
	 * resourceContent = resourceContent.replace("something", "somethingElse");<br/>
	 * FileUtils.setAbsoluteFileContent(resourceToModifyAbsolutePath, resourceContent);</code>
	 * </p>
	 * 
	 * @param fileAbsolutePath
	 *            the absolute path of the file
	 * @param content
	 *            the content to put into the file
	 * @throws IOException
	 *             if any I/O error occurs
	 */
	public static void setAbsoluteFileContent(String fileAbsolutePath, String content) throws IOException {
		setAbsoluteFileContent(fileAbsolutePath, null, content);
	}

	/**
	 * Puts into the file located at the given fileAbsolutePath the given content.
	 * <p>
	 * Use example : <br/>
	 * <code>
	 * String resourceContent = FileUtils.getAbsoluteFileContent(resourceToModifyAbsolutePath);<br/>
	 * resourceContent = resourceContent.replace("something", "somethingElse");<br/>
	 * FileUtils.setAbsoluteFileContent(resourceToModifyAbsolutePath, resourceContent);</code>
	 * </p>
	 * 
	 * @param fileAbsolutePath
	 *            the absolute path of the file
	 * @param charset
	 *            Charset that's to be used for reading this file (for example 'utf-8').
	 * @param content
	 *            the content to put into the file
	 * @throws IOException
	 *             if any I/O error occurs
	 */
	public static void setAbsoluteFileContent(String fileAbsolutePath, String charset, String content)
			throws IOException {
		BufferedWriter bufferedWriter = null;
		try {
			Writer writer;
			if (charset != null) {
				OutputStream outputStream = new FileOutputStream(fileAbsolutePath);
				writer = new OutputStreamWriter(outputStream, charset);
			} else {
				writer = new FileWriter(fileAbsolutePath);
			}
			bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(content);
		} finally {
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}

}
