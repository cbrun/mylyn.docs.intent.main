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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.test.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * Saves a given Object in an xmi file.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class XMISaver {

	/**
	 * XMISaver constructor.
	 */
	private XMISaver() {

	}

	/**
	 * Saves the given EObject in the given xmiFile.
	 * 
	 * @param rootToSave
	 *            EObject representing the root to save
	 * @param xmiFile
	 *            file in which the root will be stored
	 * @throws IOException
	 *             if the root cannot be saved in the given file.
	 */
	public static void saveASXMI(EObject rootToSave, File xmiFile) throws IOException {

		// Step 1 : Generation of resource containing the ECore files corresponding to the Packages.
		ResourceSet rs = new ResourceSetImpl();
		List<EPackage> packagesToSave = new ArrayList<EPackage>();
		/*
		 * packagesToSave.add(ModelingUnitPackage.eINSTANCE);
		 * packagesToSave.add(ModelingUnitPackage.eINSTANCE);
		 * packagesToSave.add(ModelingUnitPackage.eINSTANCE);
		 */
		registerEPackage(rs, "org.eclipse.mylyn.docs.intent.core.document", IntentDocumentPackage.eINSTANCE);
		registerEPackage(rs, "org.eclipse.mylyn.docs.intent.core.modelingunit", ModelingUnitPackage.eINSTANCE);
		registerEPackage(rs, "genericUnit", GenericUnitPackage.eINSTANCE);
		registerEPackage(rs, "descriptionUnit", DescriptionUnitPackage.eINSTANCE);
		registerEPackage(rs, "markup", MarkupPackage.eINSTANCE);
		for (Resource r : rs.getResources()) {
			r.save(null);
		}

		// Step 2 : Generation of a resource that will contain the root to save
		URI xmiURI = URI.createFileURI(xmiFile.getAbsolutePath());
		Resource resourceXMI = rs.createResource(xmiURI);
		rs.getPackageRegistry().put(ModelingUnitPackage.eNS_PREFIX, ModelingUnitPackage.eINSTANCE);
		rs.getPackageRegistry().put(GenericUnitPackage.eNS_PREFIX, GenericUnitPackage.eINSTANCE);
		rs.getPackageRegistry().put(IntentDocumentPackage.eNS_PREFIX, GenericUnitPackage.eINSTANCE);
		// Step 2 : We add the root to the resource
		resourceXMI.getContents().add(EcoreUtil.copy(rootToSave));

		// Step 3 : saving this resource as an xmiFile

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		options.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		resourceXMI.save(options);

	}

	private static void registerEPackage(ResourceSet rs, String string, EPackage einstance)
			throws IOException {
		Resource packagesResource = rs.createResource(URI.createURI("expectedResults/packagesModels/"
				+ string + ".ecore"));
		packagesResource.getContents().add(einstance);
	}
}
