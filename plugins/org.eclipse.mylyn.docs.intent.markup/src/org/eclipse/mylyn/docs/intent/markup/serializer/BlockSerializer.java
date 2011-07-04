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
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.mylyn.docs.intent.markup.markup.Paragraph;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;

/**
 * Serializes block elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class BlockSerializer {

	public static final String PARAGRAPH_PREFIX = "p.";

	public static final String DOT = ".";

	public static final String PREFORMATTED_EXTENDED_PREFIX = "pre..";

	public static final String CODE_PREFIX = "bc.";

	public static final String CODE_EXTENDED_PREFIX = "bc..";

	public static final String QUOTE_EXTENDED_PREFIX = "bq..";

	/**
	 * Indicates if the last serialized block was preformatted, in order to know if the prefix p. has to be
	 * used for a new paragraph.
	 */
	private static Boolean lastBlocWasPreformatted = false;

	/**
	 * BlockSerializer constructor.
	 */
	private BlockSerializer() {

	}

	/**
	 * Simply concatenate the serialized form of each BlockContent contained in the given bloc.
	 * 
	 * @param wikiElement
	 *            Block to serialize.
	 * @param dispatcher
	 *            Dispatcher used to call the correct serialization for each content
	 * @return serialized form of the given wikiElement.
	 */
	public static String render(Block wikiElement, WikiTextElementDispatcher dispatcher) {

		String prefix = "";
		// If the given block has style and is not a TableCell, we have to render it with a prefix.
		if (!(wikiElement instanceof TableCell)
				&& (AttributeStyleSerializer.renderAttributeForBloc(wikiElement.getAttributes()).length() > 0)) {
			prefix = WikiTextResourceSerializer.LINE_BREAK + PARAGRAPH_PREFIX + " "
					+ WikiTextResourceSerializer.LINE_BREAK;
			return renderWithBlocPrefix(wikiElement, dispatcher, prefix)
					+ WikiTextResourceSerializer.LINE_BREAK;
		} else {
			if (lastElementWasParagraph(wikiElement)) {
				prefix = WikiTextResourceSerializer.LINE_BREAK;
			}
		}
		return renderWithBlocPrefix(wikiElement, dispatcher, prefix);
	}

	/**
	 * Returns true if the previous element of the given block's container was a paragraph.
	 * 
	 * @param block
	 *            Block to analyse.
	 * @return true if the previous element of the given block's container was a paragraph, false otherwise.
	 */
	private static boolean lastElementWasParagraph(Block block) {
		List<EObject> containerContent = new ArrayList<EObject>(block.eContainer().eContents());
		int indiceBlock = containerContent.indexOf(block);

		// For each text contained in the same bloc and at the same level than the given text
		ListIterator<EObject> possibleNeighbours = containerContent.listIterator(indiceBlock);
		if (possibleNeighbours.hasPrevious()) {
			EObject previous = possibleNeighbours.previous();
			if (previous instanceof Paragraph) {
				EList<BlockContent> contents = ((Block)previous).getContent();
				return !(contents.get(contents.size() - 1) instanceof Image);
			}
		}
		return false;

	}

	/**
	 * Simply concatenate the bloc prefix to the serialized form of each BlockContent contained in the given
	 * bloc.
	 * 
	 * @param wikiElement
	 *            Block to serialize.
	 * @param dispatcher
	 *            Dispatcher used to call the correct serialization for each content
	 * @param blockPrefix
	 *            prefix of the bloc (example : '*' for a bulleted list)
	 * @return serialized form of this block.
	 */
	public static String renderWithBlocPrefix(Block wikiElement, WikiTextElementDispatcher dispatcher,
			String blockPrefix) {

		// Step 1 : We first render the Block's prefix and style
		String renderedContent = renderPrefixAndStyle(wikiElement, blockPrefix);

		// Step 2 : We update the lastBlocWasPreformatted field
		if (prefixMatchesWithPreformattedBloc(blockPrefix)) {
			renderedContent = WikiTextResourceSerializer.LINE_BREAK + renderedContent;
			lastBlocWasPreformatted = true;
		} else {
			lastBlocWasPreformatted = false;
			if (prefixMatchesWithQuote(blockPrefix)) {
				renderedContent = WikiTextResourceSerializer.LINE_BREAK + renderedContent;
			}
		}

		// Step 3 : Calling the dispatcher to print all contents.
		String lastContent = "";
		for (BlockContent blocContent : wikiElement.getContent()) {
			renderedContent += lastContent;
			lastContent = dispatcher.doSwitch(blocContent);
		}
		if (!lastContent.equals(WikiTextResourceSerializer.LINE_BREAK)) {
			renderedContent += lastContent;
		}

		return renderedContent;
	}

	/**
	 * Return the string corresponding to the serialized form of the prefix and the styles of the given bloc.
	 * 
	 * @param block
	 *            block to render
	 * @param blockPrefix
	 *            prefix of this bloc.
	 * @return the string corresponding to the serialized form of the prefix and the styles of the given bloc.
	 */
	private static String renderPrefixAndStyle(Block block, String blockPrefix) {
		String renderedPrefixAndStyle = "";
		if (blockPrefix.length() > 0) {
			String blockPrefixEnd = "";

			// We first get the beginning of the blockPrefix.
			if (blockPrefix.contains(DOT)) {
				blockPrefixEnd = blockPrefix.substring(blockPrefix.indexOf(DOT), blockPrefix.length());
				renderedPrefixAndStyle = blockPrefix.substring(0, blockPrefix.indexOf(DOT));
			} else {
				renderedPrefixAndStyle = blockPrefix;
			}
			// Now that we have the prefix, we insert the style
			renderedPrefixAndStyle += AttributeStyleSerializer.renderAttributeForBloc(block.getAttributes());

			// We redress the dots at the end of the blockPrefix
			renderedPrefixAndStyle += blockPrefixEnd;

		}
		return renderedPrefixAndStyle;
	}

	/**
	 * Returns true if the prefix matches with a preformatted or a code bloc.
	 * 
	 * @param prefix
	 *            prefix to analyse
	 * @return true if the prefix matches with a preformatted or a code bloc, false otherwise.
	 */
	private static boolean prefixMatchesWithPreformattedBloc(String prefix) {
		boolean matchesPreformated = prefix.contains(PREFORMATTED_EXTENDED_PREFIX);
		matchesPreformated = matchesPreformated || prefix.contains(CODE_EXTENDED_PREFIX);
		return matchesPreformated;
	}

	/**
	 * Returns true if the prefix matches with a quote bloc.
	 * 
	 * @param prefix
	 *            prefix to analyse
	 * @return true if the prefix matches with a quote bloc, false otherwise.
	 */
	private static boolean prefixMatchesWithQuote(String prefix) {
		boolean matchesPreformated = prefix.contains(QUOTE_EXTENDED_PREFIX);
		return matchesPreformated;
	}

	/**
	 * Indicates if the following paragraph will have to explicitly declare its prefix ; it's the case for
	 * preformatted bloc for example.
	 * 
	 * @return true if the following paragraph will have to explicitly declare its prefix, false otherwise.
	 */
	public static Boolean usePrefix() {
		return lastBlocWasPreformatted;
	}

	/**
	 * Means that the following paragraph will not have to explicitly declare its prefix.
	 */
	public static void breakPreformatted() {
		lastBlocWasPreformatted = false;
	}

	/**
	 * Indicates if the given element is the first element of its containing block.
	 * 
	 * @param element
	 *            element considered.
	 * @return true if the given element is the first element of its containing block, false otherwise.
	 */
	static boolean isFirstElementofBlock(BlockContent element) {
		EObject container = element.eContainer();
		if (container instanceof Block) {
			return ((Block)container).getContent().indexOf(element) == 0;
		}
		return false;
	}

	/**
	 * Returns true if the given element is the last element of its containing section.
	 * 
	 * @param element
	 *            the element to test
	 * @return true if the given element is the last element of its containing section
	 */
	static boolean isLastElementOfBlockAndSection(BlockContent element) {
		EObject container = element.eContainer();
		EList<BlockContent> listOfContents = null;
		if (container instanceof Block) {
			listOfContents = ((Block)container).getContent();
			boolean lastOfBlock = listOfContents.lastIndexOf(element) == (listOfContents.size() - 1);
			if (lastOfBlock) {
				return SectionSerializer.isLastElementOfSection((Block)container);
			}
		}
		return false;
	}
}
