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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.test.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Transforms a file Content to a String.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class FileToStringConverter {

	/**
	 * FileToStringConverter constructor.
	 */
	private FileToStringConverter() {

	}

	/**
	 * Returns the content of the given file as a String.
	 * 
	 * @param file
	 *            file containing the information to extract.
	 * @return the content of the given file as a String
	 * @throws IOException
	 *             if the file doesn't exists
	 */
	public static String getFileAsString(File file) throws IOException {
		String result = "";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedReader dis = null;
		StringBuffer sb = new StringBuffer();

		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new BufferedReader(new InputStreamReader(bis));

		while (dis.ready()) {
			sb.append(dis.readLine() + "\n");
		}
		// Was deprecated, but still usefull :
		// dis = new DataInputStream(bis);
		// while (dis.available() != 0) {
		// sb.append(dis.readLine() + "\n");

		fis.close();
		bis.close();
		dis.close();

		result = sb.toString();
		return result;

	}
}
