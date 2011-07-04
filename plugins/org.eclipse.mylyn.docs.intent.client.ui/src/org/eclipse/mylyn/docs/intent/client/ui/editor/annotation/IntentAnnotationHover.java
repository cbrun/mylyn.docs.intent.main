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
package org.eclipse.mylyn.docs.intent.client.ui.editor.annotation;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;

/**
 * Handles the behavior when the cursor is over an IntentAnnotation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentAnnotationHover implements IAnnotationHover, ITextHover {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.source.IAnnotationHover#getHoverInfo(org.eclipse.jface.text.source.ISourceViewer,
	 *      int)
	 */
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {

		// Iterator ite = sourceViewer.getAnnotationModel().getAnnotationIterator();
		//
		// ArrayList all = new ArrayList();
		//
		// while (ite.hasNext()) {
		// Annotation a = (Annotation)ite.next();
		// if (a instanceof Annotation) {
		// all.add(((Annotation)a).getText());
		// }
		// }
		//
		// StringBuffer total = new StringBuffer();
		// for (int x = 0; x < all.size(); x++) {
		// String str = (String)all.get(x);
		// String append = " " + str;
		// if (x != (all.size() - 1)) {
		// append += "\n";
		// }
		// }
		//
		// return total.toString();
		return "Hover Infos";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer,
	 *      org.eclipse.jface.text.IRegion)
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return null;
	}

}
