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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentFactory;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;
import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;
import org.eclipse.mylyn.docs.intent.parser.descriptionunit.DescriptionUnitParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;
import org.eclipse.mylyn.docs.intent.serializer.IntentPositionManager;

/**
 * Factorise the behavior of SChapter and SSection states.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class IntentSubSectionContainerState extends IntentDefaultState {

	/**
	 * The parser to use for parsing Modeling Units.
	 */
	private static DescriptionUnitParser descriptionUnitParser;

	/**
	 * Mapping between an identifier and the associated SubSectionContainer.
	 */
	private static Map<String, IntentSubSectionContainer> identifiersToSection;

	/**
	 * Indicates if a title can be associated to this SubSectionContainer (only if its first content is a
	 * descriptionUnit).
	 */
	protected boolean titleCanBeSet;

	/**
	 * IntentSubSectionContainerState constructor.
	 * 
	 * @param offset
	 *            the current element offset
	 * @param declarationLength
	 *            the current element declaration length
	 * @param previous
	 *            the previous state of the parser
	 * @param currentElement
	 *            the intentSubSectionContainer currently being parsed
	 * @param positionManager
	 *            the positionManager where to register positions
	 */
	public IntentSubSectionContainerState(int offset, int declarationLength, IntentGenericState previous,
			EObject currentElement, IntentPositionManager positionManager) {
		super(offset, declarationLength, previous, currentElement, positionManager);
		this.titleCanBeSet = true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#beginSection(java.lang.String,
	 *      java.util.List)
	 */
	@Override
	public IntentGenericState beginSection(int offset, int declarationLength) {
		// The title of this Section cannot be set anymore
		this.titleCanBeSet = false;
		IntentSection subSection = IntentDocumentFactory.eINSTANCE.createIntentSection();
		((IntentSubSectionContainer)currentElement).getIntentContent().add(subSection);
		return new SSection(offset, declarationLength, this, subSection, positionManager);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws ParseException
	 *             if the description unit parser detect any parse error
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#desriptionUnitContent(java.lang.String)
	 */
	@Override
	public IntentGenericState descriptionUnitContent(int offset, int length, String descriptionUnitContent)
			throws ParseException {
		int titleLength = 0;
		String descriptionUnitDescription = descriptionUnitContent;
		// If this descriptionUnit defines the title of this Section
		if (titleCanBeSet()) {
			// We determine this title
			if (descriptionUnitContent.trim().indexOf(IntentKeyWords.INTENT_LINEBREAK) != -1) {
				titleLength = createSectionTitle(offset, descriptionUnitContent)
						+ IntentKeyWords.INTENT_LINEBREAK.length();
				descriptionUnitDescription = descriptionUnitDescription.trim().substring(
						descriptionUnitDescription.trim().indexOf(IntentKeyWords.INTENT_LINEBREAK));
			}
		}
		// The title of this Section cannot be set anymore
		this.titleCanBeSet = false;

		// If the descriptionUnitContent isn't empty
		if (descriptionUnitDescription.trim().length() > 0) {
			DescriptionUnit descriptionUnit = getDescriptionUnitParser().parse(descriptionUnitDescription);
			((IntentSubSectionContainer)this.currentElement).getIntentContent().add(descriptionUnit);
			positionManager.setPositionForInstruction(descriptionUnit, offset + titleLength, length
					- titleLength);
		}

		return this;
	}

	/**
	 * Creates the handled Section's title from the given descriptionUnit content.
	 * 
	 * @param offset
	 *            the title offset
	 * @param descriptionUnitContent
	 *            the descriptionUnit defining the title of the handled section
	 * @return the title length
	 * @throws ParseException
	 *             if the description unit parser detect any parse error
	 */
	private int createSectionTitle(int offset, String descriptionUnitContent) throws ParseException {
		String sectionTitle = descriptionUnitContent.substring(0,
				descriptionUnitContent.trim().indexOf(IntentKeyWords.INTENT_LINEBREAK));
		DescriptionUnit descriptionUnit = getDescriptionUnitParser().parse(sectionTitle.trim());

		for (UnitInstruction title : descriptionUnit.getInstructions()) {
			if (title instanceof DescriptionBloc) {
				EList<StructureElement> contents = ((DescriptionBloc)title).getDescriptionBloc().getContent();
				if (contents.size() != 1) {
					throw new ParseException("The title of this section isn't well formed");
				}

				Block titleBlock = (Block)contents.get(0);
				positionManager.setPositionForInstruction(titleBlock, offset, sectionTitle.trim().length());

				((IntentSubSectionContainer)this.currentElement).setTitle(titleBlock);
				((IntentSubSectionContainer)this.currentElement)
						.setFormattedTitle(createFormattedTitle(sectionTitle));
			}
		}
		return sectionTitle.length();
	}

	/**
	 * Returns the formatted title for the given sectionTitle.
	 * 
	 * @param sectionTitle
	 *            the title to format
	 * @return the formatted title for the given sectionTitle
	 * @throws ParseException
	 *             if the identifier has already been associated to annoter element
	 */
	private String createFormattedTitle(String sectionTitle) throws ParseException {
		String formattedTitle = "";

		for (int i = 0; i < sectionTitle.length(); i++) {
			if (Character.isJavaIdentifierPart(sectionTitle.charAt(i))) {
				formattedTitle += sectionTitle.charAt(i);
			}
		}

		if (identifiersToSection == null) {
			identifiersToSection = new HashMap<String, IntentSubSectionContainer>();
		}
		if (identifiersToSection.get(formattedTitle) != null) {
			// throw new ParseException("This title is already taken.");
		}
		identifiersToSection.put(formattedTitle, (IntentSubSectionContainer)this.currentElement);
		return formattedTitle;
	}

	/**
	 * Indicates if the title of this section can be set.
	 * 
	 * @return true if the title of this section can be set, false otherwise
	 */
	private boolean titleCanBeSet() {
		return titleCanBeSet;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.internal.state.IntentGenericState#endStructuredElement()
	 */
	@Override
	public IntentGenericState endStructuredElement(int offset) {
		positionManager.setDeclarationPositionForInstruction(getCurrentElement(), getOffset(), offset
				- getOffset(), getDeclarationLength());
		return previousState();
	}

	/**
	 * Returns the parser to use for parsing Description Units. If the parser hasn't been created, creates it.
	 * 
	 * @return the parser to use for parsing Description Units
	 */
	private DescriptionUnitParser getDescriptionUnitParser() {
		if (descriptionUnitParser == null) {
			descriptionUnitParser = new DescriptionUnitParser();
		}
		return descriptionUnitParser;
	}
}
