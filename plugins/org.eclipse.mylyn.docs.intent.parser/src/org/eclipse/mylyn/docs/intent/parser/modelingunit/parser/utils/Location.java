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

/**
 * Stores the location of a given element.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class Location implements Comparable<Location> {
	private Integer startOffset;

	private Integer endOffset;

	/**
	 * Creates a new location using the given parameters.
	 * 
	 * @param startOffset
	 *            the starting offset of the element
	 * @param endOffset
	 *            the ending offset of the element
	 */
	public Location(int startOffset, int endOffset) {
		super();
		this.startOffset = startOffset;
		this.endOffset = endOffset;
	}

	/**
	 * Computes if a given location is contained inside of the current element.
	 * 
	 * @param location
	 *            the given element
	 * @return true if the current element contains the given element
	 */
	public boolean contains(Location location) {
		return location.startOffset > startOffset && location.endOffset < endOffset;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Location location) {
		return startOffset.compareTo(location.startOffset);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{" + startOffset + "->" + endOffset + "}";
	}

	/**
	 * Returns the start offset.
	 * 
	 * @return the start offset
	 */
	public Integer getStartOffset() {
		return startOffset;
	}

	/**
	 * Returns the end offset.
	 * 
	 * @return the end offset
	 */
	public Integer getEndOffset() {
		return endOffset;
	}
}
