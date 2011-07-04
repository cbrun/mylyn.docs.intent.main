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
package org.eclipse.mylyn.docs.intent.serializer.genericunit;

import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.util.GenericUnitSwitch;

/**
 * Serialize element of a Generic Unit.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class GenericUnitSerializer extends GenericUnitSwitch<String> {

	/**
	 * The Prefix to use for prefixing each line.
	 */
	private String tabulationPrefix;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.util.GenericUnitSwitch#caseLabelDeclaration(org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration)
	 */
	@Override
	public String caseLabelDeclaration(LabelDeclaration object) {
		return LabelDeclarationSerializer.serialize(object, tabulationPrefix);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.util.GenericUnitSwitch#caseLabelReferenceInstruction(org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction)
	 */
	@Override
	public String caseLabelReferenceInstruction(LabelReferenceInstruction object) {
		return LabelOrSectionReferenceSerializer.serialize(object, tabulationPrefix);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.util.GenericUnitSwitch#caseIntentSectionReferenceInstruction(org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction)
	 */
	@Override
	public String caseIntentSectionReferenceInstruction(IntentSectionReferenceInstruction object) {
		return LabelOrSectionReferenceSerializer.serialize(object, tabulationPrefix);
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
