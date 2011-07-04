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
package org.eclipse.mylyn.docs.intent.serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

/**
 * Handle the position of all elements of an Intent element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentPositionManager {

	/**
	 * Maps a unitInstruction with a position.
	 */
	private Map<EObject, ParsedElementPosition> instructionToPosition;

	/**
	 * Maps a unitInstruction with a position corresponding to the declaration.<br/>
	 * For example : for "new Class A { ... }" we will map only the declaration "new Class A " position.
	 */
	private Map<EObject, ParsedElementPosition> instructionToDeclarationPosition;

	/**
	 * Maps an offset with an instruction.
	 */
	private SortedMap<Integer, EObject> positionToInstruction;

	/**
	 * Mapping between elements and their indentation level (does not map all the elements).
	 */
	private Map<EObject, Integer> elementToIndentationLevel;

	/**
	 * List of the lines which have been decorated (the list contains each decorated line's offset).
	 */
	private List<Integer> decoratedLines;

	/**
	 * IntentPositionManager constructor.
	 */
	public IntentPositionManager() {
		instructionToPosition = new HashMap<EObject, ParsedElementPosition>();
		instructionToDeclarationPosition = new HashMap<EObject, ParsedElementPosition>();
		positionToInstruction = new TreeMap<Integer, EObject>();
		elementToIndentationLevel = new HashMap<EObject, Integer>();
		decoratedLines = new ArrayList<Integer>();
	}

	/**
	 * Clear all the information contained in the position manager.
	 */
	public void clear() {
		instructionToPosition.clear();
		instructionToDeclarationPosition.clear();
		positionToInstruction.clear();
		elementToIndentationLevel.clear();
		decoratedLines.clear();
	}

	/**
	 * Returns the position of the given instruction element.
	 * 
	 * @param instruction
	 *            the element for witch we want the position
	 * @return the position of the given instruction element (null if no positition).
	 */
	public ParsedElementPosition getPositionForElement(EObject instruction) {
		if (instructionToDeclarationPosition.get(instruction) != null) {
			return instructionToDeclarationPosition.get(instruction);
		}
		return instructionToPosition.get(instruction);
	}

	/**
	 * Returns the element corresponding to the given position.
	 * 
	 * @param offset
	 *            the current offset
	 * @return the element corresponding to the given position
	 */
	public EObject getElementAtPosition(int offset) {
		EObject foundElement = null;
		Iterator<Integer> offsetIterator = positionToInstruction.keySet().iterator();
		Integer currentOffsetValue = 0;

		while ((currentOffsetValue < offset) && offsetIterator.hasNext()) {
			currentOffsetValue = offsetIterator.next();
			foundElement = positionToInstruction.get(currentOffsetValue);
		}
		return foundElement;
	}

	/**
	 * Adds all the informations contained in the given PositionManager to this IntentPositionManager.
	 * 
	 * @param positionManager
	 *            the entity containing informations about positions.
	 */
	public void addIntentPositionManagerInformations(IntentPositionManager positionManager) {
		this.instructionToPosition.putAll(positionManager.instructionToPosition);
		this.instructionToDeclarationPosition.putAll(positionManager.instructionToDeclarationPosition);
		this.positionToInstruction.putAll(positionManager.positionToInstruction);
		this.elementToIndentationLevel.putAll(positionManager.elementToIndentationLevel);
		this.decoratedLines.addAll(positionManager.decoratedLines);
	}

	/**
	 * Associates the given instruction to the given offset and length.
	 * 
	 * @param instruction
	 *            the instruction to associate with the given position
	 * @param offset
	 *            the offset of the given instruction
	 * @param length
	 *            the lenght of the given instruction
	 */
	public void setPositionForInstruction(EObject instruction, int offset, int length) {
		instructionToPosition.put(instruction, new ParsedElementPosition(offset, length));
		positionToInstruction.put(offset, instruction);
	}

	/**
	 * Associates the given instruction to the given offset and length, and also map the declaration length.
	 * 
	 * @param instruction
	 *            the instruction to associate with the given position
	 * @param offset
	 *            the offset of the given instruction
	 * @param length
	 *            the length of the given instruction
	 * @param declarationLength
	 *            the length of the given instruction declaration
	 */
	public void setDeclarationPositionForInstruction(EObject instruction, int offset, int length,
			int declarationLength) {
		// System.out.println("Setting declaration position : for " + instruction + " : " + offset + "/"
		// + declarationLength);
		instructionToPosition.put(instruction, new ParsedElementPosition(offset, length));
		instructionToDeclarationPosition.put(instruction,
				new ParsedElementPosition(offset, declarationLength));
		positionToInstruction.put(offset, instruction);
	}

	/**
	 * Handles tabulations added at the given tabOffset.
	 * 
	 * @param tabOffset
	 *            the offset where the tabulations are added
	 * @param nbTabs
	 *            number of tabulations added
	 */
	public void handleTabulations(int tabOffset, int nbTabs) {
		Iterator<Integer> offsetIterator = positionToInstruction.keySet().iterator();
		Integer currentOffsetValue = 0;
		Map<Integer, EObject> newPositionToInstructions = new HashMap<Integer, EObject>();

		while (offsetIterator.hasNext()) {
			currentOffsetValue = offsetIterator.next();

			if (currentOffsetValue >= tabOffset) {
				EObject movedElement = positionToInstruction.get(currentOffsetValue);

				newPositionToInstructions.put(currentOffsetValue + nbTabs, movedElement);
				ParsedElementPosition position = instructionToPosition.get(movedElement);
				ParsedElementPosition newPosition = new ParsedElementPosition(position.getOffset() + nbTabs,
						position.getLength());

				instructionToPosition.put(movedElement, newPosition);

				if (instructionToDeclarationPosition.get(movedElement) != null) {
					ParsedElementPosition declarationPosition = instructionToDeclarationPosition
							.get(movedElement);
					ParsedElementPosition newDeclarationPosition = new ParsedElementPosition(
							declarationPosition.getOffset() + nbTabs, declarationPosition.getLength());
					instructionToDeclarationPosition.put(movedElement, newDeclarationPosition);
				}

			}
		}

		for (Integer newOffset : newPositionToInstructions.keySet()) {
			positionToInstruction.remove(newOffset - nbTabs);
			positionToInstruction.put(newOffset, newPositionToInstructions.get(newOffset));
		}
		// TODO : update positionToInstruction
	}

	/**
	 * Sets the indentationLevel of the given element to the given value (shouldn't be used if not necessary).
	 * 
	 * @param element
	 *            the element from which we want to assign an indentation level
	 * @param indentationLevel
	 *            the indentation level to map the given element with
	 */
	public void setIndentationLevel(EObject element, int indentationLevel) {
		elementToIndentationLevel.put(element, indentationLevel);
	}

	/**
	 * Returns the indentation level of the given element, or -1 if this level is unknown.
	 * 
	 * @param element
	 *            the element from which we want to know the indentation level
	 * @return the indentation level of the given element, or -1 if this level is unknown
	 */
	public int getIndentationLevel(EObject element) {
		if (elementToIndentationLevel.get(element) != null) {
			return elementToIndentationLevel.get(element);
		}
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	@Deprecated
	public String toString() {
		String rF = "";
		// for (EObject i : instructionToPosition.keySet()) {
		// rF += "- " + i.eClass().getName() + " => " + instructionToPosition.get(i).getOffset() + "-"
		// + instructionToPosition.get(i).getLength() + "\n";
		// }
		for (Integer pos : positionToInstruction.keySet()) {
			rF += "-" + pos + "=>" + positionToInstruction.get(pos) + "\n";
		}
		return rF;
	}

	/**
	 * Indicates if the line at the given offset is a decoration line (and shouldn't be editable, for
	 * example).
	 * 
	 * @param offset
	 *            the offset of the line
	 * @return true if the line at the given offset have been decorated, false otherwise.
	 */
	public boolean isDecorationLine(int offset) {
		return decoratedLines.contains(offset) || decoratedLines.contains(offset);
	}

	/**
	 * Add the given offset to the decorated lines's offset list.
	 * 
	 * @param newDecoratedLineOffset
	 *            the offset to add
	 */
	public void addDecoratedLine(int newDecoratedLineOffset) {
		decoratedLines.add(newDecoratedLineOffset);
	}

	/**
	 * Update the positions of element located after the given start offset, by adding the gap value to the
	 * old position.
	 * 
	 * @param startOffset
	 *            the start offset
	 * @param gap
	 *            the gap to add to each element
	 */
	public void updatePositions(int startOffset, int gap) {

		List<Integer> positionsToAdd = new ArrayList<Integer>();
		Iterator<Integer> positionIterator = decoratedLines.iterator();
		while (positionIterator.hasNext()) {
			Integer decoratedLinePosition = positionIterator.next();
			if (decoratedLinePosition >= startOffset) {
				positionsToAdd.add(decoratedLinePosition + gap);
				positionIterator.remove();
			}
		}

		for (Integer newPosition : positionsToAdd) {
			decoratedLines.add(newPosition);
		}

		// TODO : update all other elements

	}
}
