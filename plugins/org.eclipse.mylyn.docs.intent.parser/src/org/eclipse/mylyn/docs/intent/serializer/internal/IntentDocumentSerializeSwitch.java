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
package org.eclipse.mylyn.docs.intent.serializer.internal;

import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.util.IntentDocumentSwitch;

/**
 * Dispatch the serialization of an element according to its type (acts like an EMF switch).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentDocumentSerializeSwitch extends IntentDocumentSwitch<String> {

	/**
	 * The DocumentSerializer associated to this Switch.
	 */
	private IntentElementSerializer serializer;

	/**
	 * IntentDocumentSerializeSwitch constructor.
	 * 
	 * @param documentSerializer
	 *            the DocumentSerializer associated to this Switch
	 */
	public IntentDocumentSerializeSwitch(IntentElementSerializer documentSerializer) {
		this.serializer = documentSerializer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.document.util.IntentDocumentSwitch#caseIntentDocument(org.eclipse.mylyn.docs.intent.core.document.IntentDocument)
	 */
	@Override
	public String caseIntentDocument(IntentDocument object) {
		return IntentDocumentSerializer.serialize(object, serializer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.document.util.IntentDocumentSwitch#caseChapter(org.eclipse.mylyn.docs.intent.core.document.IntentChapter)
	 */
	@Override
	public String caseIntentChapter(IntentChapter object) {
		return IntentChapterSerializer.serialize(object, serializer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.document.util.IntentDocumentSwitch#caseSection(org.eclipse.mylyn.docs.intent.core.document.IntentSection)
	 */
	@Override
	public String caseIntentSection(IntentSection object) {
		return IntentSectionSerializer.serialize(object, serializer);
	}
}
