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
package org.eclipse.mylyn.docs.intent.markup.test.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * XMI serializer.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class XMISaver {

	private XMISaver() {
		// prevents instantiation
	}

	public static void saveASXMI(Resource wikiTextResource, String nameFileToSave) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());

		// Generation of an xmi file
		ResourceSet rs = new ResourceSetImpl();
		String absoluteXMIFilePath = new File("generatedModels/" + nameFileToSave).getAbsolutePath();
		URI xmiURI = URI.createFileURI(absoluteXMIFilePath);
		Resource resourceXMI = rs.createResource(xmiURI);

		for (EObject root : wikiTextResource.getContents()) {
			resourceXMI.getContents().add(EcoreUtil.copy(root));
		}

		// Step 4 : saving the resource
		try {
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			options.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
			resourceXMI.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
