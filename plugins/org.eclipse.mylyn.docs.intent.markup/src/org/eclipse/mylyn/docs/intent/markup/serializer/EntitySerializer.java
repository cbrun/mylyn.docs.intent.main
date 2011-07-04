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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.mylyn.docs.intent.markup.markup.Entity;

/**
 * Serializer of Entity elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class EntitySerializer {

	private static String COPYRIGHT_CODE = "#169";

	private static String COPYRIGHT_TRADUCTION = "(c)";

	private static String TRADEMARK_CODE = "#8482";

	private static String TRADEMARK_TRADUCTION = "(tm)";

	private static String REGISTERED_CODE = "#174";

	private static String REGISTERED_TRADUCTION = "(r)";

	private static String DASH_CODE = "#8211";

	private static String DASH_TRADUCTION = "-";

	private static String SIMPLEQUOTE_CODE = "#8217";

	private static String SIMPLEQUOTE2_CODE = "#8249";

	private static String SIMPLEQUOTE3_CODE = "#8250";

	private static String SIMPLEQUOTE_TRADUCTION = "'";

	private static String LEFTDOUBLEQUOTE_CODE = "#171";

	private static String LEFTDOUBLEQUOTE_TRADUCTION = "\"";

	private static String RIGHTDOUBLEQUOTE_CODE = "#187";

	private static String RIGHTDOUBLEQUOTE_TRADUCTION = "\"";

	private static String TABULATION_SYMBOL = "<dd/>";

	private static String TABULATION_TRADUCTION = "<dd/>";

	/**
	 * HasMap mapping an entity code (example : '#169') to its traduction in Textile ('(c)').
	 */
	private static Map<String, String> entityMapping;

	/**
	 * EntitySerializer constructor.
	 */
	private EntitySerializer() {

	}

	/**
	 * Serialize the given Entity element according to its associated formats.
	 * 
	 * @param entity
	 *            a WikiText Entity element.
	 * @return the serialized form of the given element.
	 */
	public static String render(Entity entity) {
		// We ensure that the map has been initialized.
		initializeEntityMapping();
		if (entityMapping.containsKey(entity.getData())) {
			return entityMapping.get(entity.getData());
		} else {
			// By default, we return the unknowSymbol string;
			return entity.getData();
		}
	}

	/**
	 * Initialize the mapping between entity's codes and their traductions in textile.
	 */
	private static void initializeEntityMapping() {
		if (entityMapping == null) {
			entityMapping = new HashMap<String, String>();
			entityMapping.put(COPYRIGHT_CODE, COPYRIGHT_TRADUCTION);
			entityMapping.put(TRADEMARK_CODE, TRADEMARK_TRADUCTION);
			entityMapping.put(REGISTERED_CODE, REGISTERED_TRADUCTION);
			entityMapping.put(DASH_CODE, DASH_TRADUCTION);
			entityMapping.put(SIMPLEQUOTE_CODE, SIMPLEQUOTE_TRADUCTION);
			entityMapping.put(SIMPLEQUOTE2_CODE, SIMPLEQUOTE_TRADUCTION);
			entityMapping.put(SIMPLEQUOTE3_CODE, SIMPLEQUOTE_TRADUCTION);
			entityMapping.put(LEFTDOUBLEQUOTE_CODE, LEFTDOUBLEQUOTE_TRADUCTION);
			entityMapping.put(RIGHTDOUBLEQUOTE_CODE, RIGHTDOUBLEQUOTE_TRADUCTION);

			entityMapping.put(TABULATION_SYMBOL, TABULATION_TRADUCTION);
		}
	}
}
