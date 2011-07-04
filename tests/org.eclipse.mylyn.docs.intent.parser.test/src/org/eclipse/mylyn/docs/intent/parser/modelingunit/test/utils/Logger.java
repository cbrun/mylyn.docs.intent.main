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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Util class for log and EObject.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class Logger {

	/**
	 * Logger constructor.
	 */
	private Logger() {

	}

	/**
	 * Recursive method that inspects the given object and logs it.
	 * 
	 * @param obj
	 *            Object to inspect
	 * @param level
	 *            level for indentation
	 * @return a textual representation of the given EObject
	 */
	public static String inspectAndLog(EObject obj, int level) {
		String log = "";
		for (int i = 0; i < level; i++) {
			log += "   ";
		}
		if (level > 0) {
			log += "|---";
		}

		String a = obj.toString().replace("org.eclipse.mylyn.docs.intent.markup.markup.impl.", "")
				.replace("Impl", "");
		a.replaceAll("@[[0-9]*[a-b]*]+", "  ");

		log += obj.eClass().getName() + " ";
		for (EAttribute att : obj.eClass().getEAllAttributes()) {
			log += obj.eGet(att) + " ";
		}
		log += "\n";
		for (EObject objSons : obj.eContents()) {
			log += inspectAndLog(objSons, level + 1);
		}
		return log;
	}
}
