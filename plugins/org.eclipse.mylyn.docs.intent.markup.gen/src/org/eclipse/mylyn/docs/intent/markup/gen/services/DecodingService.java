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
package org.eclipse.mylyn.docs.intent.markup.gen.services;

import org.eclipse.mylyn.docs.intent.markup.markup.Entity;

/**
 * Service to decode HTML entities.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 * 
 */
public class DecodingService {
	
	public String decode(Entity a) {
		String codePoint = a.getData();
		if (codePoint.startsWith("#")) {
			codePoint = codePoint.substring(1);
		}
		int point = Integer.valueOf(codePoint);
		if (point < Character.MAX_VALUE) {
			return Character.valueOf((char) point).toString();
		}
		return "";
	}
}
