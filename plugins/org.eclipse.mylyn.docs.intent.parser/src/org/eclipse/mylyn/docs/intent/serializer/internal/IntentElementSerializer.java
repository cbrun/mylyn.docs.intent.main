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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitFormatter;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;
import org.eclipse.mylyn.docs.intent.serializer.IntentPositionManager;
import org.eclipse.mylyn.docs.intent.serializer.ParsedElementPosition;
import org.eclipse.mylyn.docs.intent.serializer.descriptionunit.DescriptionUnitSerializer;

/**
 * Serializer which serialize any IntentStructuredElement and its content ; acts like an EMF Switch an dispatch
 * the serialization of each element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentElementSerializer {

	private IntentDocumentSerializeSwitch serializerSwitch;

	private ModelingUnitSerializer modelingUnitSerializer;

	private DescriptionUnitSerializer descriptionUnitSerializer;

	private int currentOffset;

	private int currentIndentationLevel;

	private IntentPositionManager positionManager;

	private String modelingUnitPrefixDecoration;

	private String modelingUnitSuffixDecoration;

	/**
	 * IntentElementSerializer constructor.
	 * 
	 * @param modelingUnitPrefixDecoration
	 *            the String to use for prefixing each Modeling Unit (leave null if no use)
	 * @param modelingUnitSuffixDecoration
	 *            the String to use for suffixing each Modeling Unit (leave null if no use)
	 */
	public IntentElementSerializer(String modelingUnitPrefixDecoration, String modelingUnitSuffixDecoration) {
		this.positionManager = new IntentPositionManager();
		this.serializerSwitch = new IntentDocumentSerializeSwitch(this);
		this.modelingUnitSerializer = new ModelingUnitSerializer();
		this.descriptionUnitSerializer = new DescriptionUnitSerializer();
		this.modelingUnitPrefixDecoration = modelingUnitPrefixDecoration;
		this.modelingUnitSuffixDecoration = modelingUnitSuffixDecoration;
	}

	/**
	 * Clears all informations contained by the serializer (elements positions, current offset...).
	 */
	public void clear() {
		this.positionManager.clear();
		this.setCurrentOffset(0);
		this.setCurrentIndendationLevel(0);
	}

	/**
	 * Return the serialized form of the given Element.
	 * 
	 * @param content
	 *            the element to serialize
	 * @return the serialized form of the given IntentStructuredElement
	 */
	public String serialize(EObject content) {

		String serializedFrom = "";
		// We can have different type for the given content :
		// Case 1 : ModelingUnit
		if (content instanceof ModelingUnit) {
			serializedFrom = handleModelingUnitSerialization(content);
		}
		// Case 2 : DescriptionUnit
		if (content instanceof DescriptionUnit) {
			serializedFrom = handleDescriptionUnitSerialization(content);
		}

		// By default, we consider it is an Intent element
		if (content instanceof IntentStructuredElement) {
			serializedFrom = serializerSwitch.doSwitch(content);
		}

		return serializedFrom;

	}

	/**
	 * Handles a description Unit serialization by using a DescriptionUnitSerializer and Formatter.
	 * 
	 * @param descriptionUnit
	 *            the description Unit to serialize
	 * @return the serialized form of the given description Unit.
	 */
	private String handleDescriptionUnitSerialization(EObject descriptionUnit) {
		String serializedDescriptionUnit = descriptionUnitSerializer.serialize(
				(DescriptionUnit)descriptionUnit, tabulation(), getCurrentOffset());

		this.setCurrentOffset(this.getCurrentOffset() + serializedDescriptionUnit.length());

		this.positionManager.addIntentPositionManagerInformations(descriptionUnitSerializer.getPositionManager());
		return serializedDescriptionUnit;
	}

	/**
	 * Handles a modeling Unit serialization by using a ModelingUnitSerializer and Formatter.
	 * 
	 * @param modelingUnit
	 *            the modelingUnit to serialize
	 * @return the serialized form of the given modelingUnit.
	 */
	private String handleModelingUnitSerialization(EObject modelingUnit) {
		this.positionManager.setIndentationLevel(modelingUnit, getCurrentIndendationLevel());
		int initialOffset = getCurrentOffset();
		int length = 0;
		int prefixLength = 0;
		String serializedModelingUnit = "";
		if (modelingUnitPrefixDecoration != null) {
			serializedModelingUnit += modelingUnitPrefixDecoration;
			this.positionManager.addDecoratedLine(initialOffset);
			setCurrentOffset(initialOffset + modelingUnitPrefixDecoration.length());
			prefixLength = serializedModelingUnit.length();
		}
		serializedModelingUnit += modelingUnitSerializer.serialize((ModelingUnit)modelingUnit,
				getCurrentOffset());

		String serializedModelingUnitFormatted = ModelingUnitFormatter.indentAccordingToBrackets(
				modelingUnitSerializer, serializedModelingUnit, getCurrentIndendationLevel(), initialOffset);

		length = serializedModelingUnitFormatted.length() - prefixLength - getCurrentIndendationLevel() * 2;

		ParsedElementPosition pos = modelingUnitSerializer.getPositionManager().getPositionForElement(
				modelingUnit);
		modelingUnitSerializer.getPositionManager().setPositionForInstruction(modelingUnit, pos.getOffset(),
				length);

		if (modelingUnitSuffixDecoration != null) {
			this.positionManager.addDecoratedLine(initialOffset + serializedModelingUnitFormatted.length());
			serializedModelingUnitFormatted += tabulation() + modelingUnitSuffixDecoration;
		}

		this.setCurrentOffset(initialOffset + serializedModelingUnitFormatted.length());
		this.positionManager.addIntentPositionManagerInformations(modelingUnitSerializer.getPositionManager());

		return serializedModelingUnitFormatted;
	}

	/**
	 * Returns the current Offset of this dispatcher.
	 * 
	 * @return the current Offset of this dispatcher
	 */
	public int getCurrentOffset() {
		return currentOffset;
	}

	/**
	 * Sets the current Offset of this dispatcher.
	 * 
	 * @param offset
	 *            the current Offset of this dispatcher
	 */
	public void setCurrentOffset(int offset) {
		this.currentOffset = offset;
	}

	/**
	 * Returns the current indentation level.
	 * 
	 * @return the current indentation level
	 */
	public int getCurrentIndendationLevel() {
		return this.currentIndentationLevel;
	}

	/**
	 * Sets the current indentation level.
	 * 
	 * @param indentationLevel
	 *            the current indentation level
	 */
	public void setCurrentIndendationLevel(int indentationLevel) {
		this.currentIndentationLevel = indentationLevel;
	}

	/**
	 * Returns a String representing the indentation level with tabulations.
	 * 
	 * @return a String representing the indentation level with tabulations
	 */
	public String tabulation() {
		String lineJump = "";
		for (int i = 0; i < getCurrentIndendationLevel(); i++) {
			lineJump += "\t";
		}
		return lineJump;
	}

	/**
	 * Associates the given element to the given offset and length.
	 * 
	 * @param element
	 *            the element to associate with the given position
	 * @param offset
	 *            the offset of the given element
	 * @param length
	 *            the lenght of the given element
	 */
	public void setPositionForElement(EObject element, int offset, int length) {
		positionManager.setPositionForInstruction(element, offset, length);
	}

	/**
	 * Associates the given element to the given offset and length, and also map the declaration length.
	 * 
	 * @param element
	 *            the instruction to associate with the given position
	 * @param offset
	 *            the offset of the given element
	 * @param length
	 *            the length of the given element
	 * @param declarationLength
	 *            the length of the given element declaration
	 */
	public void setDeclarationPositionForElement(EObject element, int offset, int length,
			int declarationLength) {
		positionManager.setDeclarationPositionForInstruction(element, offset, length, declarationLength);
	}

	/**
	 * Returns the position of the given element.
	 * 
	 * @param instruction
	 *            the element for witch we want the position
	 * @return the position of the given element (null if no position).
	 */
	public ParsedElementPosition getPositionForElement(EObject instruction) {
		return positionManager.getPositionForElement(instruction);
	}

	/**
	 * Returns the element corresponding to the given position.
	 * 
	 * @param offset
	 *            the current offset
	 * @return the element corresponding to the given position
	 */
	public EObject getElementAtPosition(int offset) {
		return positionManager.getElementAtPosition(offset);
	}

	/**
	 * Returns the position manager of this serializer.
	 * 
	 * @return the position manager of this serializer.
	 */
	public IntentPositionManager getPositionManager() {
		return this.positionManager;
	}

}
