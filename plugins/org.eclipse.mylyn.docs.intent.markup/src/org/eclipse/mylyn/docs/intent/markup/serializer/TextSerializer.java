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
package org.eclipse.mylyn.docs.intent.markup.serializer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;

/**
 * Class which purpose is to serialize a Text element from a WikiText document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class TextSerializer {

	// CHECKSTYLE:OFF
	public static final char TILDE_SYMBOL = '~'; // should be '\u223C'

	// CHECKSTYLE:ON

	/**
	 * TextSerializer constructor.
	 */
	private TextSerializer() {

	}

	/**
	 * Serialize the given Text element according to its associated formats.
	 * 
	 * @param textElement
	 *            a WikiText Text element.
	 * @return the serialized form of the given element.
	 */
	public static String render(Text textElement) {

		String renderedText = "";

		// Step 1 : calculate the formats to declare and to close.
		List<Formatting> formatsToBegin = calculateFormatToBegin(textElement);
		List<Formatting> formatsToEnd = calculateFormatToEnd(textElement);

		// Step 2 : We declare all the needed formats
		for (Formatting format : formatsToBegin) {
			renderedText += printFormat(format);
		}

		// Step 3 : we print the text
		renderedText += textElement.getData();

		// Step 4 : we close all the need formats
		String renderedFormatsToEndPrioritary = "";
		String renderedFormatsToEndSecondary = "";
		for (Formatting format : formatsToEnd) {
			// starting by the ones declared by this text
			if (formatsToBegin.contains(format)) {
				renderedFormatsToEndPrioritary = printFormat(format) + renderedFormatsToEndPrioritary;
			} else {
				renderedFormatsToEndSecondary = printFormat(format) + renderedFormatsToEndSecondary;
			}
		}
		renderedText += renderedFormatsToEndPrioritary + renderedFormatsToEndSecondary;

		// Step 5 We finally break the line if the given Text has a line break.
		if (textElement.isLineBreak()) {
			renderedText += WikiTextResourceSerializer.LINE_BREAK;
		}
		return renderedText;
	}

	/**
	 * Returns the Textile symbol associated to a given format.
	 * 
	 * @param format
	 *            format to serialize
	 * @return the Textile symbol associated to the given format.
	 */
	private static String printFormat(Formatting format) {
		String result = "";
		switch (format.getValue()) {
			case Formatting.EMPHASIS_VALUE:
				result = "_";
				break;

			case Formatting.STRONG_VALUE:
				result = "*";
				break;

			case Formatting.ITALIC_VALUE:
				result = "__";
				break;

			case Formatting.BOLD_VALUE:
				result = "**";
				break;

			case Formatting.CITATION_VALUE:
				result = "??";
				break;

			case Formatting.DELETED_VALUE:
				result = "-";
				break;

			case Formatting.INSERTED_VALUE:
				result = "+";
				break;

			case Formatting.SUPERSCRIPT_VALUE:
				result = "^";
				break;

			case Formatting.SUBSCRIPT_VALUE:
				result = Character.toString(TILDE_SYMBOL);
				break;

			case Formatting.SPAN_VALUE:
				result = "%";
				break;

			case Formatting.CODE_VALUE:
				result = "@";
				break;

			case Formatting.MONOSPACE_VALUE:
				result = "@";
				break;

			case Formatting.UNDERLINED_VALUE:
				result = "+";
				break;

			case Formatting.QUOTE_VALUE:
				result = "??";
				break;

			// By default (formatting = none), returns the data of the Text element.
			default:
				break;
		}
		return result;
	}

	/**
	 * Returns the format to declare, i.e the formats not shared with the previous text.
	 * 
	 * @param textElement
	 *            text to print.
	 * @return the format to declare for this Text.
	 */
	private static List<Formatting> calculateFormatToBegin(Text textElement) {
		List<Formatting> formatList = textElement.getFormat();
		List<Formatting> result = new ArrayList<Formatting>();

		// We first get the preceding text of the bloc
		Text previousText = getPreviousText(textElement);
		// If the text has no preceding neighbour then all the formats have to be declared
		if (previousText == null) {
			return formatList;
		}
		// Else, for each format of this text element
		for (Formatting format : formatList) {
			// If the previous Text doesn't own it, it has to be declared.
			if (!previousText.getFormat().contains(format)) {
				result.add(format);
			}
		}
		return result;
	}

	/**
	 * Returns the format to close, i.e the formats not shared with the next text.
	 * 
	 * @param textElement
	 *            text to print.
	 * @return the format to close for this Text.
	 */
	private static List<Formatting> calculateFormatToEnd(Text textElement) {
		List<Formatting> formatList = textElement.getFormat();
		List<Formatting> result = new ArrayList<Formatting>();
		// We first get the preceding text of the bloc
		Text nextText = getNextText(textElement);
		// If the text has no following neighbour then all the formats have to be closed
		if (nextText == null) {
			return formatList;
		}
		// Else, for each format of this text element
		for (Formatting format : formatList) {

			// If the following Text doesn't own it, it has to be closed.
			if (!nextText.getFormat().contains(format)) {
				result.add(format);
			}
		}
		return result;
	}

	/**
	 * Return the first Text that precedes the given text in the same bloc. For example : returns A if called
	 * on B Bloc1 { - Text A - Image I - Table T - Text B }
	 * 
	 * @param textElement
	 *            text element to analyse.
	 * @return he first Text that precedes the given text in the same bloc ; null if no Text is found.
	 */
	private static Text getPreviousText(final Text textElement) {
		Text previousText = null;
		List<EObject> blockContent = new ArrayList<EObject>(textElement.eContainer().eContents());
		int indiceTextElement = blockContent.indexOf(textElement);

		if (indiceTextElement != -1) {
			// For each text contained in the same bloc and at the same level than the given text
			ListIterator<EObject> possibleNeighbours = blockContent.listIterator(indiceTextElement);
			while (possibleNeighbours.hasPrevious()) {
				EObject possibleNeighbour = possibleNeighbours.previous();
				if (possibleNeighbour instanceof Text) {
					previousText = (Text)possibleNeighbour;
					break;
				}
			}
		}
		return previousText;
	}

	/**
	 * Return the first Text that follows the given text in the same bloc. For example : returns B if called
	 * on A Bloc1 { - Text A - Image I - Table T - Text B }
	 * 
	 * @param textElement
	 *            text element to analyse.
	 * @return he first Text that follows the given text in the same bloc ; null if no Text is found.
	 */
	private static Text getNextText(Text textElement) {
		Text nextText = null;
		EObject container = textElement.eContainer();
		// For each text contained in the same bloc and at the same level than the given text
		EList<EObject> blockContent = container.eContents();
		ListIterator<EObject> possibleNeighbours = blockContent.listIterator(blockContent
				.indexOf(textElement));
		if (possibleNeighbours.hasNext()) {
			possibleNeighbours.next();
		}
		while (possibleNeighbours.hasNext()) {
			EObject possibleNeighbour = possibleNeighbours.next();
			if (possibleNeighbour instanceof Text) {
				nextText = (Text)possibleNeighbour;
				break;
			}
		}
		return nextText;
	}

}
