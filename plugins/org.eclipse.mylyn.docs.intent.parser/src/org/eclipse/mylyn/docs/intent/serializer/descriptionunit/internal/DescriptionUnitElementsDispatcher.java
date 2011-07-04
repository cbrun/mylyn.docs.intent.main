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
import org.eclipse.mylyn.docs.intent.core.descriptionunit.util.DescriptionUnitSwitch;
import org.eclipse.mylyn.docs.intent.serializer.descriptionunit.DescriptionUnitSerializer;

/**
 * Dispatch the serialization of a Description Unit element to the correct serializer.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class DescriptionUnitElementsDispatcher extends DescriptionUnitSwitch<String> {

	/**
	 * The Prefix to use for prefixing each line.
	 */
	private String tabulationPrefix;

	/**
	 * The serializer used to serialize pure documentation sections.
	 */
	private DescriptionUnitSerializer serializer;

	/**
	 * DescriptionUnitElementsDispatcher constructor.
	 * 
	 * @param generalSerializer
	 *            the general description Unit serializer
	 */
	public DescriptionUnitElementsDispatcher(DescriptionUnitSerializer generalSerializer) {
		this.serializer = generalSerializer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.util.DescriptionUnitSwitch#caseDescriptionBloc(org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc)
	 */
	@Override
	public String caseDescriptionBloc(DescriptionBloc object) {
		String serializedDescriptionBloc = DescriptionBlocSerializer.serialize(object, serializer,
				tabulationPrefix);

		return serializedDescriptionBloc;
	}

	/**
	 * Sets the Prefix to use for prefixing each line.
	 * 
	 * @param tabulationPrefix
	 *            the Prefix to use for prefixing each line
	 */
	public void setTabulationPrefix(String tabulationPrefix) {
		this.tabulationPrefix = tabulationPrefix;
	}

}
