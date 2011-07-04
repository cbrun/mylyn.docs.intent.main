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
package org.eclipse.mylyn.docs.intent.parser.internal.state;

import java.util.List;

import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParserImpl;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Represents the behavior of the parser when the current element is a Section.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SSection extends IntentSubSectionContainerState {

	/**
	 * The parser to use for parsing Modeling Units.
	 */
	private static ModelingUnitParser modelingUnitParser;

	/**
	 * SSection constructor.
	 * 
	 * @param previous
	 *            the previous state of the parser
	 * @param section
	 *            the section currently beeing parsed
	 */
	public SSection(IntentGenericState previous, IntentSection section) {
		super(previous, section);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#sectionOptions(java.lang.String,
	 *      java.util.List)
	 */
	@Override
	public IntentGenericState sectionOptions(String visibility, List<String> headerReferences) {
		// Visibility creation
		if (visibility != null) {
			if ("hidden".equals(visibility)) {
				((IntentSection)currentElement).setVisibility(IntentSectionVisibility.HIDDEN);
			} else {
				((IntentSection)currentElement).setVisibility(IntentSectionVisibility.INTERNAL);
			}
		} else {
			((IntentSection)currentElement).setVisibility(IntentSectionVisibility.PUBLIC);
		}

		// Header References creation
		((IntentSection)currentElement).getImportedHeaders().addAll(headerReferences);

		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws ParseException
	 *             if the modeling unit parser detect any parse error.
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#modelingUnitContent(java.lang.String)
	 */
	@Override
	public IntentGenericState modelingUnitContent(String modelingUnitContent) throws ParseException {

		// The title of this Section cannot be set anymore
		this.titleCanBeSet = false;
		ModelingUnit modelingUnit = (ModelingUnit)getModelingUnitParser().parseString(modelingUnitContent);
		((IntentSection)this.currentElement).getIntentContent().add(modelingUnit);
		return this;
	}

	/**
	 * Returns the parser to use for parsing Modeling Units. If the parser hasn't been created, creates it.
	 * 
	 * @return the parser to use for parsing Modeling Units
	 */
	private ModelingUnitParser getModelingUnitParser() {
		if (modelingUnitParser == null) {
			modelingUnitParser = new ModelingUnitParserImpl();
		}
		return modelingUnitParser;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SSection - " + ((IntentSection)this.currentElement).getVisibility();
	}
}
