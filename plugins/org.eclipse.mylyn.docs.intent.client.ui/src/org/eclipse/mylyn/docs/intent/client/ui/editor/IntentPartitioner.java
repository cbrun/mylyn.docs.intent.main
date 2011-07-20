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
package org.eclipse.mylyn.docs.intent.client.ui.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.TypedRegion;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.query.IntentStructuredElementGetter;
import org.eclipse.mylyn.docs.intent.core.query.UnitGetter;
import org.eclipse.mylyn.docs.intent.parser.IntentParser;
import org.eclipse.mylyn.docs.intent.serializer.ParsedElementPosition;

/**
 * Computes the partitions of a document using the Intent parser.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class IntentPartitioner implements IDocumentPartitioner {
	private static final int PARSING_JOB_DELAY = 200;

	/** The legal content types of this partitioner. */
	protected final String[] fLegalContentTypes;

	/** The partitioner's document. */
	protected IDocument fDocument;

	private Job parsingJob;

	private List<ITypedRegion> regions = new ArrayList<ITypedRegion>();

	private IntentParser parser = new IntentParser();

	/**
	 * Creates a new Partitioner using the given content types.
	 * 
	 * @param legalContentTypes
	 *            the content types
	 */
	public IntentPartitioner(String[] legalContentTypes) {
		fLegalContentTypes = TextUtilities.copy(legalContentTypes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#connect(org.eclipse.jface.text.IDocument)
	 */
	public void connect(IDocument document) {
		fDocument = document;
		updateRegions();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#disconnect()
	 */
	public void disconnect() {
		// do nothing

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#documentAboutToBeChanged(org.eclipse.jface.text.DocumentEvent)
	 */
	public void documentAboutToBeChanged(DocumentEvent event) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#getLegalContentTypes()
	 */
	public String[] getLegalContentTypes() {
		return TextUtilities.copy(fLegalContentTypes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#getContentType(int)
	 */
	public String getContentType(int offset) {
		ITypedRegion region = getPartition(offset);
		if (region != null) {
			return region.getType();
		}
		return IntentDocumentProvider.INTENT_DESCRIPTIONUNIT;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#documentChanged(org.eclipse.jface.text.DocumentEvent)
	 */
	public boolean documentChanged(final DocumentEvent event) {
		if (event.fText.length() == 0) {
			// shift backward
			shiftRegions(event.fOffset, -event.fLength);
		} else {
			// shift forward
			shiftRegions(event.fOffset, event.fText.length() - event.fLength);
		}
		if (parsingJob != null) {
			parsingJob.cancel();
		}
		parsingJob = new Job("parse") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				updateRegions();
				return Status.OK_STATUS;
			}
		};
		parsingJob.schedule(PARSING_JOB_DELAY);
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#computePartitioning(int, int)
	 */
	public ITypedRegion[] computePartitioning(int offset, int length) {
		ITypedRegion[] res = regions.toArray(new ITypedRegion[regions.size()]);
		Arrays.sort(res, new Comparator<ITypedRegion>() {
			
			public int compare(ITypedRegion o1, ITypedRegion o2) {
				return Integer.valueOf(o1.getOffset()).compareTo(Integer.valueOf(o2.getOffset()));
			}
		});
		return res;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IDocumentPartitioner#getPartition(int)
	 */
	public ITypedRegion getPartition(int offset) {
		for (ITypedRegion region : regions) {
			if (region.getOffset() <= offset && (region.getOffset() + region.getLength()) >= offset) {
				return region;
			}
		}
		return new TypedRegion(offset, 1, IntentDocumentProvider.INTENT_DESCRIPTIONUNIT);
	}

	/**
	 * Shift the regions.
	 * 
	 * @param offset
	 *            the offset from where the shift begins
	 * @param shift
	 *            the shift length
	 */
	private void shiftRegions(int offset, int shift) {
		List<ITypedRegion> shiftRegions = new ArrayList<ITypedRegion>();
		for (ITypedRegion region : regions) {
			ITypedRegion tmp = null;
			if (region.getOffset() <= offset && (region.getOffset() + region.getLength()) >= offset) {
				tmp = shiftRegionLength(region, shift);
			} else if (region.getOffset() > offset) {
				tmp = shiftRegionOffset(region, shift);
			} else {
				tmp = region;
			}
			if (tmp != null) {
				shiftRegions.add(tmp);
			}
		}
		regions = shiftRegions;
	}

	/**
	 * Shifts the current region.
	 * 
	 * @param region
	 *            the region
	 * @param shift
	 *            the shift to apply
	 * @return the shifted region, or null if the region is invalidated
	 */
	private ITypedRegion shiftRegionLength(ITypedRegion region, int shift) {
		if ((region.getLength() + shift) > 0) {
			return createRegion(region.getOffset(), region.getLength() + shift, region.getType());
		}
		return null;
	}

	/**
	 * Shifts a following region.
	 * 
	 * @param region
	 *            the region
	 * @param shift
	 *            the shift to apply
	 * @return the shifted region, or null if the region is invalidated
	 */
	private ITypedRegion shiftRegionOffset(ITypedRegion region, int shift) {
		if ((region.getOffset() + shift) > 0) {
			return createRegion(region.getOffset() + shift, region.getLength(), region.getType());
		}
		return null;
	}

	private ITypedRegion createRegion(int offset, int length, String type) {
		if ((length > 0) && (offset >= 0) && ((offset + length) <= fDocument.getLength())) {
			return new TypedRegion(offset, length, type);
		}
		return null;
	}

	/**
	 * Updates the regions by reparsing the document.
	 */
	private void updateRegions() {
		List<ITypedRegion> regionsList = new ArrayList<ITypedRegion>();
		if (!(fDocument instanceof IntentEditorDocument)) {
			throw new UnsupportedOperationException("This scanner can only parse "
					+ IntentEditorDocument.class.getSimpleName());
		}
		try {
			parser.getPositionManager().clear();
			EObject root = parser.parse(fDocument.get());
			if (root != null) {
				for (ModelingUnit mu : UnitGetter.getAllModelingUnitsContainedInElement(root)) {
					ParsedElementPosition position = parser.getPositionForElement(mu);
					ITypedRegion tmp = createRegion(position.getOffset(), position.getLength(),
							IntentDocumentProvider.INTENT_MODELINGUNIT);
					if (tmp != null) {
						regionsList.add(tmp);
					}
				}
				for (DescriptionUnit du : UnitGetter.getAllDescriptionUnitsContainedInElement(root)) {
					ParsedElementPosition position = parser.getPositionForElement(du);
					ITypedRegion tmp = createRegion(position.getOffset(), position.getLength(),
							IntentDocumentProvider.INTENT_DESCRIPTIONUNIT);
					if (tmp != null) {
						regionsList.add(tmp);
					}
				}
				for (IntentStructuredElement structured : IntentStructuredElementGetter
						.getAllStructuredElement(root)) {
					ParsedElementPosition position = parser.getPositionForElement(structured);
					ITypedRegion tmp = createRegion(position.getOffset(), position.getLength(),
							IntentDocumentProvider.INTENT_STRUCTURAL_CONTENT);
					if (tmp != null) {
						regionsList.add(tmp);
					}
					// If this element has a title, we add a token too.
					if (structured.getTitle() != null) {
						ParsedElementPosition titlePosition = parser.getPositionForElement(structured
								.getTitle());
						ITypedRegion tmp2 = createRegion(titlePosition.getOffset(), titlePosition.getLength(),
								IntentDocumentProvider.INTENT_TITLE);
						if (tmp2 != null) {
							regionsList.add(tmp2);
						}
					}
				}
			}
			regions = regionsList;
			// CHECKSTYLE:OFF
		} catch (Exception e) {
			// CHECKSTYLE:ON
			// fail silently
			regions = new ArrayList<ITypedRegion>();
		}
	}
}
