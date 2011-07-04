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
package org.eclipse.mylyn.docs.intent.serializer.descriptionunit.internal;

import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc;
import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;
import org.eclipse.mylyn.docs.intent.serializer.descriptionunit.DescriptionUnitSerializer;

/**
 * Return the serialized for of the given description bloc.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class DescriptionBlocSerializer {

	/**
	 * DescriptionBlocSerializer constructor.
	 */
	private DescriptionBlocSerializer() {

	}

	/**
	 * Serialize the given description bloc using the given serializer.
	 * 
	 * @param descriptionBloc
	 *            the descriptionBloc to serialize
	 * @param serializer
	 *            the serialize to use
	 * @param tabulationPrefix
	 *            the Prefix to use for prefixing each line
	 * @return the serialised form of the given DescriptionBloc
	 */
	public static String serialize(DescriptionBloc descriptionBloc, DescriptionUnitSerializer serializer,
			String tabulationPrefix) {
		boolean endsWithLineBreak = false;
		String serializedDescriptionBloc = "";

		serializedDescriptionBloc += serializer.getMarkupSerializer().serialize(
				descriptionBloc.getDescriptionBloc());
		if (serializedDescriptionBloc.lastIndexOf('\n') != -1
				&& serializedDescriptionBloc.lastIndexOf('\n') == serializedDescriptionBloc.length() - 1) {
			endsWithLineBreak = true;
		}
		serializedDescriptionBloc = serializedDescriptionBloc.replace("\n", "\n" + tabulationPrefix);

		if (endsWithLineBreak) {
			serializedDescriptionBloc = serializedDescriptionBloc.substring(0,
					serializedDescriptionBloc.length() - tabulationPrefix.length());
		}
		if (descriptionBloc.isLineBreak()) {
			serializedDescriptionBloc += IntentKeyWords.INTENT_LINEBREAK + tabulationPrefix;
		}

		serializer.getPositionManager().setPositionForInstruction(descriptionBloc,
				serializer.getCurrentOffset(), serializedDescriptionBloc.length());
		return serializedDescriptionBloc;
	}
}
