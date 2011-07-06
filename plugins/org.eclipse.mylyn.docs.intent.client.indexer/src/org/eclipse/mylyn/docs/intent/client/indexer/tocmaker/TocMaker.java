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
		// Step 1 : use an existing index entry if any
		IntentIndexEntry documentIndexEntry = null;
		if (index.getEntries().isEmpty()) {
			documentIndexEntry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
			index.getEntries().add(documentIndexEntry);
		} else {
			documentIndexEntry = index.getEntries().get(0);
		}

		// Step 2 : compute the title
		String title = StructuredElementHelper.getTitle(document);
		if ((title == null) || (title.length() < 1)) {
			title = "Document";
		}

		// Step 3 : setting index entry informations
		documentIndexEntry.setName(title);
		documentIndexEntry.setReferencedElement(document);
		documentIndexEntry.setType(INDEX_ENTRY_TYPE.INTENT_DOCUMENT);
		int chapterIt = 0;

		// Step 4 : for each chapter contained in this document
		for (IntentChapter chapter : document.getChapters()) {
			IntentIndexEntry candidateChapterEntry = null;
			// Step 4.1 : we use an existing index entry if any
			if (documentIndexEntry.getSubEntries().size() > chapterIt) {
				candidateChapterEntry = documentIndexEntry.getSubEntries().get(chapterIt);
			}
			// Step 4.2 : and compute the entry for this chapter
			computeEntryForChapter(documentIndexEntry, candidateChapterEntry, chapter);
			chapterIt++;
		}
		// Step 5 : Removing old entries that are not used any more
		while (documentIndexEntry.getSubEntries().size() > chapterIt) {
			documentIndexEntry.getSubEntries().remove(chapterIt);
			chapterIt++;
		}
	}

	/**
	 * Returns the IndexEntry describing the given chapter's table of contents.
	 * 
	 * @param documentIndexEntry
	 *            the {@link IntentIndexEntry} of the document containing the given chapter
	 * @param candidateChapterEntry
	 *            the candidate {@link IntentIndexEntry} to use for building this entry (can be null)
	 * @param chapter
	 *            the chapter to consider
	 * @return the entry corresponding to the given chapter's toc
	 */
	private IntentIndexEntry computeEntryForChapter(IntentIndexEntry documentIndexEntry,
			IntentIndexEntry candidateChapterEntry, IntentChapter chapter) {
		// Step 1 : use an existing index entry if any
		IntentIndexEntry chapterEntry = candidateChapterEntry;
		if (candidateChapterEntry == null) {
			chapterEntry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
			documentIndexEntry.getSubEntries().add(chapterEntry);
		}

		// Step 2 : compute the title
		String chapterIndex = getIndex(chapter);
		String title = StructuredElementHelper.getTitle(chapter);
		if ((title == null) || (title.length() < 1)) {
			title = "Untitled Chapter";
		}

		// Step 3 : setting index entry informations
		chapterEntry.setName(chapterIndex + " " + title);
		chapterEntry.setReferencedElement(chapter);
		chapterEntry.setType(INDEX_ENTRY_TYPE.INTENT_CHAPTER);

		// Step 4 : for each section contained in this chapter
		int subSectionIt = 0;
		for (IntentSection section : chapter.getSubSections()) {
			// Step 4.1 : we use an existing index entry if any
			IntentIndexEntry candidateSectionEntry = null;
			if (chapterEntry.getSubEntries().size() > subSectionIt) {
				candidateSectionEntry = chapterEntry.getSubEntries().get(subSectionIt);
			}
			// Step 4.2 : and compute the entry for this section
			computeEntryForSection(chapterEntry, candidateSectionEntry, chapterIndex, section);
			subSectionIt++;
		}
		// Step 5 : Removing old entries that are not used any more
		while (chapterEntry.getSubEntries().size() > subSectionIt) {
			chapterEntry.getSubEntries().remove(subSectionIt);
			subSectionIt++;
		}
		return chapterEntry;

	}

	/**
	 * Returns the IndexEntry describing the given section's table of contents.
	 * 
	 * @param containerIndexEntry
	 *            the {@link IntentIndexEntry} of the element containing the given section
	 * @param candidateSectionEntry
	 *            the candidate {@link IntentIndexEntry} to use for building this entry (can be null)
	 * @param chapterIndex
	 *            index of the chapter containing this section
	 * @param section
	 *            the section to consider
	 * @return the entry corresponding to the given chapter's toc
	 */
	private IntentIndexEntry computeEntryForSection(IntentIndexEntry containerIndexEntry,
			IntentIndexEntry candidateSectionEntry, String chapterIndex, IntentSection section) {
		// Step 1 : use an existing index entry if any
		IntentIndexEntry sectionEntry = candidateSectionEntry;
		if (candidateSectionEntry == null) {
			sectionEntry = IntentIndexerFactory.eINSTANCE.createIntentIndexEntry();
			containerIndexEntry.getSubEntries().add(sectionEntry);
		}

		// Step 2 : compute the title
		String sectionIndex = chapterIndex + getIndex(section);
		String title = StructuredElementHelper.getTitle(section);
		if ((title == null) || (title.length() < 1)) {
			title = "Untitled Section";
		}

		// Step 3 : setting index entry informations
		sectionEntry.setName(sectionIndex + " " + title);
		sectionEntry.setReferencedElement(section);
		sectionEntry.setType(INDEX_ENTRY_TYPE.INTENT_SECTION);

		// Step 4 : for each sub-section contained in this section
		int subSectionIt = 0;
		for (IntentSection subSection : section.getSubSections()) {
			// Step 4.1 : we use an existing index entry if any
			IntentIndexEntry candidateSubSectionEntry = null;
			if (sectionEntry.getSubEntries().size() > subSectionIt) {
				candidateSubSectionEntry = sectionEntry.getSubEntries().get(subSectionIt);
			}
			// Step 4.2 : and compute the entry for this sub-section
			computeEntryForSection(sectionEntry, candidateSubSectionEntry, sectionIndex, subSection);
			subSectionIt++;
		}
		// Step 5 : Removing old entries that are not used any more
		while (sectionEntry.getSubEntries().size() > subSectionIt) {
			sectionEntry.getSubEntries().remove(subSectionIt);
			subSectionIt++;
		}
		return sectionEntry;
	}

	/**
	 * Returns the index for this element, using its hierarchical level (for example "2.1.4").
	 * 
	 * @param element
	 *            a structured element
	 * @return the index of this element
	 */
	private String getIndex(IntentStructuredElement element) {

		int positionInContainer = 0;
		// If the element is contained in a document
		if (element.eContainer() instanceof IntentDocument) {
			// We get its position in this document
			positionInContainer = element.eContainer().eContents().indexOf(element) + 1;
		} else {
			// If the element is contained in a SubSectionContainer (i.e. Section or Chapter)
			if (element.eContainer() instanceof IntentSubSectionContainer) {
				// we get its position in this container
				positionInContainer = ((IntentSubSectionContainer)element.eContainer()).getSubSections()
						.indexOf(element) + 1;
			}
		}
		return Integer.toString(positionInContainer) + ".";
	}

}
