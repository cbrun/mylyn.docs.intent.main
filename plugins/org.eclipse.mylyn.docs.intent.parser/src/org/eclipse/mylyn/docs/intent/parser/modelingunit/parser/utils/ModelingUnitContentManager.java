/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Manages and reorder the content of modeling units elements.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 * @param <T>
 *            the managed type (should be as abstract as possible)
 */
public class ModelingUnitContentManager<T> {

	private Map<Location, T> contentMap = new TreeMap<Location, T>();

	/**
	 * Adds all content into the manager. @see addContent(Location, T) for more details
	 * 
	 * @param content
	 *            the content to add
	 */
	public void addAllContent(Map<Location, T> content) {
		for (Entry<Location, T> entry : content.entrySet()) {
			addContent(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * Adds a single element only if there are no elements containing its location. If a previously added
	 * element is contained by the given element, it is replaced.
	 * 
	 * @param location
	 *            the element location
	 * @param element
	 *            the element
	 */
	public void addContent(Location location, T element) {
		List<Location> toRemove = new ArrayList<Location>();
		for (Location existingLocation : contentMap.keySet()) {
			if (existingLocation.contains(location)) {
				return;
			} else if (location.contains(existingLocation)) {
				toRemove.add(existingLocation);
			}
		}
		for (Location existingLocation : toRemove) {
			contentMap.remove(existingLocation);
		}
		contentMap.put(location, element);
	}

	/**
	 * Returns the content map.
	 * 
	 * @return the content map
	 */
	public Map<Location, T> getContent() {
		return contentMap;
	}

	/**
	 * Validates the content of the given string according to the recorded entries.
	 * 
	 * @param string
	 *            the string
	 * @param rootOffset
	 *            the root offset, used to compute errors locations
	 * @throws ParseException
	 *             if an error has been found
	 */
	public void validateContent(String string, int rootOffset) throws ParseException {
		validateContent(string, 0, string.length(), rootOffset);
	}

	/**
	 * Validates the content of the given string according to the recorded entries.
	 * 
	 * @param string
	 *            the string
	 * @param startOffset
	 *            the start to consider in the string
	 * @param endOffset
	 *            the end to consider in the string
	 * @param rootOffset
	 *            the root offset, used to compute errors locations
	 * @throws ParseException
	 *             if an error has been found
	 */
	public void validateContent(String string, int startOffset, int endOffset, int rootOffset)
			throws ParseException {
		int lastOffset = startOffset;
		for (Location location : contentMap.keySet()) {
			if (lastOffset < location.getStartOffset()) {
				validateZone(string, lastOffset, location.getStartOffset(), rootOffset);
			}
			lastOffset = location.getEndOffset() + 1;
		}
		if (lastOffset < endOffset) {
			validateZone(string, lastOffset, endOffset, rootOffset);
		}
	}

	/**
	 * Validates the zone. An undefined zone is valid if it is composed of space or comments.
	 * 
	 * @param string
	 *            the string
	 * @param startOffset
	 *            the start to consider in the string
	 * @param endOffset
	 *            the end to consider in the string
	 * @param rootOffset
	 *            the root offset, used to compute errors locations
	 * @throws ParseException
	 *             if an error has been found
	 */
	private void validateZone(String string, int startOffset, int endOffset, int rootOffset)
			throws ParseException {
		String invalidContent = "<UNDEFINED>";
		try {
			invalidContent = string.substring(startOffset, endOffset);
		} catch (IndexOutOfBoundsException e) {
			// do nothing
		}
		if (!isSpace(invalidContent) && !isComment(invalidContent.trim())) {
			throw new ParseException("Unrecognized content", startOffset + rootOffset, endOffset
					- startOffset);
		}
	}

	/**
	 * Returns true if the given string is composed of spaces.
	 * 
	 * @param string
	 *            the string
	 * @return true if the given string is composed of spaces
	 */
	private static boolean isSpace(String string) {
		return Pattern.matches("\\s+", string);
	}

	/**
	 * Returns true if the given string is composed of comments.
	 * 
	 * @param string
	 *            the string
	 * @return true if the given string is composed of comments
	 */
	private static boolean isComment(String string) {
		boolean res = true;
		String[] lines = string.split("[\n\r]");
		for (int i = 0; i < lines.length; i++) {
			res &= Pattern.matches("\\s*//.*", lines[i]) || isSpace(lines[i]);
		}
		return res;
	}

}
