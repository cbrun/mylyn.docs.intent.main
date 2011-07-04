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
package org.eclipse.mylyn.docs.intent.markup.test.utils;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Formatter.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class FormatterTextileWhiteSpaces {
	
	private FormatterTextileWhiteSpaces() {
		// prevents instantiation
	}

	public static void main(String[] args) {
		File file = new File("dataTests/specifier-guideAncienPresqueCorrect.textile");
		File fileOutput = new File("dataTests/specifier-guide.textile");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			fos = new FileOutputStream(fileOutput);

			while (dis.available() != 0) {
				String s = dis.readLine();
				/*
				 * s = s.trim(); if (s.startsWith("h")){ s ="\n" + s + "\n"; } if (!s.equals("")){s+="\n";}
				 */
				// s.replace("h5.  ","h5. ");
				if (s.startsWith("!")) {
					s += "\n";
				}
				s += "\n";
				fos.write(s.getBytes());

			}
			fis.close();
			bis.close();
			dis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[Done.]");
	}

}
