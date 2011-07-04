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
package org.eclipse.mylyn.docs.intent.markup.builder.operation;

import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;

/**
 * Allows to sets the attributes of an HasAttributes entity from an Attributes entity (given by the WikiText
 * parsor).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class HasAttributeCopyAttributes {

	/**
	 * HasAttributes element to correctly set.
	 */
	private HasAttributes elem;

	/**
	 * HasAttributeCopyAttributes constructor.
	 * 
	 * @param elem
	 *            HasAttributes element to correctly set
	 */
	public HasAttributeCopyAttributes(HasAttributes elem) {
		this.elem = elem;
	}

	/**
	 * sets the attributes of an HasAttributes entity from an Attributes entity (given by the WikiText
	 * parsor).
	 * 
	 * @param attr
	 *            Attributes given by the WikiText PArsor
	 */
	public void setValues(Attributes attr) {
		if (elem.getAttributes() == null) {
			elem.setAttributes(MarkupFactory.eINSTANCE.createAnnotations());
		}
		elem.getAttributes().setCSSStyle(attr.getCssStyle());
		elem.getAttributes().setCSSClass(attr.getCssClass());
		elem.getAttributes().setId(attr.getId());
		elem.getAttributes().setLanguage(attr.getLanguage());
		elem.getAttributes().setTitle(attr.getTitle());
	}

}
