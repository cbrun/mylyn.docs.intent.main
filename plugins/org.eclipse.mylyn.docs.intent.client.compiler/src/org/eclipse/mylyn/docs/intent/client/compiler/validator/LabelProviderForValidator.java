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
package org.eclipse.mylyn.docs.intent.client.compiler.validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Label Provider used to create clear validation messages.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class LabelProviderForValidator implements EValidator.SubstitutionLabelProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getObjectLabel(org.eclipse.emf.ecore.EObject)
	 */
	public String getObjectLabel(EObject eObject) {
		String returnedLabel = eObject.eClass().getName();
		String idLabel = null;
		String nameLabel = null;
		// If the element has an ID attribute of type EString
		// or a "name" attribute of type EString, on return the value of this attribute
		// By default, we return the name of its eClass.
		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			if (attribute.isID() && "EString".equals(attribute.getEAttributeType().getName())) {
				idLabel = (String)eObject.eGet(attribute);
			}

			if ("name".equals(attribute.getName())
					&& "EString".equals(attribute.getEAttributeType().getName())) {
				nameLabel = (String)eObject.eGet(attribute);
			}
		}

		if (idLabel != null) {
			returnedLabel = idLabel;
		} else {
			if (nameLabel != null) {
				returnedLabel = nameLabel;
			}
		}
		return returnedLabel;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getFeatureLabel(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getValueLabel(org.eclipse.emf.ecore.EDataType,
	 *      java.lang.Object)
	 */
	public String getValueLabel(EDataType eDataType, Object value) {
		return EcoreUtil.convertToString(eDataType, value);
	}

}
