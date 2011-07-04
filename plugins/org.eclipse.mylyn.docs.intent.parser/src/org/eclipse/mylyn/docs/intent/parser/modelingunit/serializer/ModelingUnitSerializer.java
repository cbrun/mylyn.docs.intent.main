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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer;

import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.internal.ModelingUnitElementDispatcher;
import org.eclipse.mylyn.docs.intent.serializer.IntentPositionManager;

/**
 * Serializes a ModelingUnit under a textual format.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ModelingUnitSerializer {

	/**
	 * Define the symbol for lineBreak, used by all elements.
	 */
	public static final String LINE_BREAK = IntentKeyWords.INTENT_LINEBREAK;

	/**
	 * Define the symbol for a whitespace, used by all elements.
	 */
	public static final String WHITESPACE = IntentKeyWords.INTENT_WHITESPACE;

	/**
	 * Instance of the Serializer (singleton).
	 */
	private static ModelingUnitSerializer serializer;

	/**
	 * Dispatcher used to render the WikiText element according to its type.
	 */
	private ModelingUnitElementDispatcher dispatcher;

	/**
	 * Default constructor : create a new Dispatcher.
	 */
	public ModelingUnitSerializer() {
		dispatcher = new ModelingUnitElementDispatcher();
	}

	/**
	 * Returns the current instance of the serializer.
	 * 
	 * @return the current instance of the serializer.
	 */
	public static ModelingUnitSerializer getSerializer() {
		if (serializer == null) {
			serializer = new ModelingUnitSerializer();
		}
		return serializer;
	}

	/**
	 * Serialize the given ModelingUnit in a textual form.
	 * 
	 * @param modelingUnit
	 *            ModelingUnit to serialize.
	 * @return the serialized form of the given ModelingUnit
	 */
	public String serialize(ModelingUnit modelingUnit) {
		return serialize(modelingUnit, 0);
	}

	/**
	 * Serialize the given ModelingUnit in a textual form.
	 * 
	 * @param modelingUnit
	 *            ModelingUnit to serialize.
	 * @param currentOffset
	 *            the currentOffset when this modelingUnit occurred
	 * @return the serialized form of the given ModelingUnit
	 */
	public String serialize(ModelingUnit modelingUnit, int currentOffset) {
		String serializedForm = "";
		dispatcher.setCurrentOffset(currentOffset);
		serializedForm += dispatcher.doSwitch(modelingUnit);
		return serializedForm;
	}

	/**
	 * Update the offsets when adding tabulations.
	 * 
	 * @param currentOffset
	 *            the offset where the tabulations are added
	 * @param nbTabs
	 *            number of tabulations to add
	 */
	public void addTabulations(int currentOffset, int nbTabs) {
		this.dispatcher.handleTabulations(currentOffset, nbTabs);
	}

	/**
	 * Returns the positionManager associated to this ElementDispatcher.
	 * 
	 * @return the positionManager associated to this ElementDispatcher
	 */
	public IntentPositionManager getPositionManager() {
		return this.dispatcher.getPositionManager();
	}
}
