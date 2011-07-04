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
package org.eclipse.mylyn.docs.intent.markup.builder.query;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Define queries for any EObject element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class EObjectQuery {

	/**
	 * Model element to manage.
	 */
	private EObject root;

	/**
	 * EObjectQuery constructor.
	 * 
	 * @param root
	 *            Model element to manage
	 */
	public EObjectQuery(EObject root) {
		this.root = root;
	}

	/**
	 * Returns the serialized from of the managed root.
	 * 
	 * @return the serialized from of the managed root.
	 */
	public String serialize() {

		// Copies the root to avoid modifying it
		final EObject copyRoot = EcoreUtil.copy(root);
		URI uri = URI.createFileURI("resource.xml");
		final Resource newResource = new XMIResourceImpl(uri);
		newResource.getContents().add(copyRoot);
		final StringWriter writer = new StringWriter();
		// Should not throw ClassCast since uri calls for an xml resource
		try {
			((XMLResource)copyRoot.eResource()).save(writer, Collections.EMPTY_MAP);
		} catch (IOException e) {
			/*
			 * No IOException is possible as there are no IO here.
			 */
		}
		final String result = writer.toString();
		writer.flush();
		return result;
	}
}
