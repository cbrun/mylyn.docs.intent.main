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
package org.eclipse.mylyn.docs.intent.client.indexer.tocmaker;

import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;
import org.eclipse.mylyn.docs.intent.core.query.StructuredElementHelper;

/**
 * Entity used to make the index (table of content) of an Intent document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TocMaker {

	/**
	 * Replace the given index content with the given document's table of contents.
	 * 
	 * @param index
	 *            the index to update
	 * @param document
	 *            the Intent document
	 */
	public void computeIndex(IntentIndex index, IntentDocument document) {
		index.getEntries().clear();
		IntentIndexEntry entry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
		String title = StructuredElementHelper.getTitle(document);
		if ((title == null) || (title.length() < 1)) {
			title = "Document";
		}
		entry.setName(title);
		entry.setReferencedElement(document);
		entry.setType(INDEX_ENTRY_TYPE.INTENT_DOCUMENT);
		for (IntentChapter chapter : document.getChapters()) {
			entry.getSubEntries().add(computeEntryForChapter(chapter));
		}
		index.getEntries().add(entry);
	}

	/**
	 * Returns the IndexEntry describing the given chapter's table of contents.
	 * 
	 * @param chapter
	 *            the chapter to consider
	 * @return the entry corresponding to the given chapter's toc
	 */
	private IntentIndexEntry computeEntryForChapter(IntentChapter chapter) {
		IntentIndexEntry entry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
		String chapterIndex = getIndex(chapter);
		String title = StructuredElementHelper.getTitle(chapter);
		if ((title == null) || (title.length() < 1)) {
			title = "Unitled Chapter";
		}
		entry.setName(chapterIndex + " " + title);
		entry.setReferencedElement(chapter);
		entry.setType(INDEX_ENTRY_TYPE.INTENT_CHAPTER);

		for (IntentSection section : chapter.getSubSections()) {
			entry.getSubEntries().add(computeEntryForSection(chapterIndex, section));
		}
		return entry;

	}

	/**
	 * Returns the index for this element (for example 1.2.3).
	 * 
	 * @param element
	 *            a structured element
	 * @return the index of this element
	 */
	private String getIndex(IntentStructuredElement element) {
		int positionInContainer = 0;
		if (element.eContainer() instanceof IntentDocument) {
			positionInContainer = element.eContainer().eContents().indexOf(element) + 1;
		} else {
			if (element.eContainer() instanceof IntentSubSectionContainer) {
				positionInContainer = ((IntentSubSectionContainer)element.eContainer()).getSubSections()
						.indexOf(element) + 1;
			}
		}
		return Integer.toString(positionInContainer) + ".";
	}

	/**
	 * Returns the IndexEntry describing the given section's table of contents.
	 * 
	 * @param chapterIndex
	 *            index of the chapter containing this section
	 * @param section
	 *            the section to consider
	 * @return the entry corresponding to the given chapter's toc
	 */
	private IntentIndexEntry computeEntryForSection(String chapterIndex, IntentSection section) {
		IntentIndexEntry entry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
		String sectionIndex = chapterIndex + getIndex(section);
		String title = StructuredElementHelper.getTitle(section);
		if ((title == null) || (title.length() < 1)) {
			title = "Untitled Section";
		}
		entry.setName(sectionIndex + " " + title);
		entry.setReferencedElement(section);
		entry.setType(INDEX_ENTRY_TYPE.INTENT_SECTION);

		for (IntentSection subSection : section.getSubSections()) {
			entry.getSubEntries().add(computeEntryForSection(sectionIndex, subSection));
		}
		return entry;
	}
}
