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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Represents a generic State of a IntentDocument parsor StateMachine.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentGenericState {

	/**
	 * The previous state of the stateMachine.
	 */
	protected IntentGenericState previous;

	/**
	 * The element currently being created.
	 */
	protected EObject currentElement;

	/**
	 * BuilderState constructor.
	 * 
	 * @param currentElement
	 *            the current parsed element
	 * @param previous
	 *            the previous state of the state machine.
	 */
	public IntentGenericState(IntentGenericState previous, EObject currentElement) {
		this.previous = previous;
		this.currentElement = currentElement;
	}

	/**
	 * Returns the previous state in the state machine.
	 * 
	 * @return the previous state in the state machine
	 */
	protected IntentGenericState previousState() {
		return previous;
	}

	/**
	 * Indicates the beginning of a Chapter.
	 * 
	 * @return the new state of the state machine
	 */
	public IntentGenericState beginChapter() {
		return this;
	}

	/**
	 * Indicates the end of a Chapter.
	 * 
	 * @return the new state of the state machine
	 */
	public IntentGenericState endStructuredElement() {
		return this;
	}

	/**
	 * Indicates the beginning of a IntentSection.
	 * 
	 * @return the new state of the state machine
	 */
	public IntentGenericState beginSection() {
		return this;
	}

	/**
	 * Indicates the detection of section options (visibility and header References).
	 * 
	 * @param visibility
	 *            the visibility of the section ("hidden", "internal" or null)
	 * @param headerReferences
	 *            list of textual references to header declarations
	 * @return the new state of the state machine
	 */
	public IntentGenericState sectionOptions(String visibility, List<String> headerReferences) {
		return this;

	}

	/**
	 * Indicates the end of a Modeling Unit with the given content.
	 * 
	 * @param modelingUnitContent
	 *            the content of this modeling Unit
	 * @return the new state of the state machine
	 * @throws ParseException
	 *             if the modeling unit parser detect any parse error
	 */
	public IntentGenericState modelingUnitContent(String modelingUnitContent) throws ParseException {

		return this;
	}

	/**
	 * Indicates a Description Unit with the given Content.
	 * 
	 * @param descriptionUnitContent
	 *            the content of the description Unit
	 * @return the new state of the state machine
	 * @throws ParseException
	 *             if the description unit parser detect any parse error
	 */
	public IntentGenericState desriptionUnitContent(String descriptionUnitContent) throws ParseException {
		return this;
	}

}
