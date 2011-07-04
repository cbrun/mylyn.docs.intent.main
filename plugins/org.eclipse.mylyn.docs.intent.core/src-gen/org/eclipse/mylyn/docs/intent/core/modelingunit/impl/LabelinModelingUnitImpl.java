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
package org.eclipse.mylyn.docs.intent.core.modelingunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labelin Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.LabelinModelingUnitImpl#getIntentHref <em>Intent Href</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.LabelinModelingUnitImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelinModelingUnitImpl extends LabelDeclarationImpl implements LabelinModelingUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelinModelingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingUnitPackage.Literals.LABELIN_MODELING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntentHref() {
		return (String)eGet(IntentDocumentPackage.Literals.INTENT_REFERENCE__INTENT_HREF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntentHref(String newIntentHref) {
		eSet(IntentDocumentPackage.Literals.INTENT_REFERENCE__INTENT_HREF, newIntentHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitInstruction getReferencedElement() {
		return (ModelingUnitInstruction)eGet(
				ModelingUnitPackage.Literals.MODELING_UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(ModelingUnitInstruction newReferencedElement) {
		eSet(ModelingUnitPackage.Literals.MODELING_UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT,
				newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelingUnitInstruction.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == IntentReference.class) {
			switch (derivedFeatureID) {
				case ModelingUnitPackage.LABELIN_MODELING_UNIT__INTENT_HREF:
					return IntentDocumentPackage.INTENT_REFERENCE__INTENT_HREF;
				default:
					return -1;
			}
		}
		if (baseClass == ModelingUnitInstructionReference.class) {
			switch (derivedFeatureID) {
				case ModelingUnitPackage.LABELIN_MODELING_UNIT__REFERENCED_ELEMENT:
					return ModelingUnitPackage.MODELING_UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelingUnitInstruction.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == IntentReference.class) {
			switch (baseFeatureID) {
				case IntentDocumentPackage.INTENT_REFERENCE__INTENT_HREF:
					return ModelingUnitPackage.LABELIN_MODELING_UNIT__INTENT_HREF;
				default:
					return -1;
			}
		}
		if (baseClass == ModelingUnitInstructionReference.class) {
			switch (baseFeatureID) {
				case ModelingUnitPackage.MODELING_UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT:
					return ModelingUnitPackage.LABELIN_MODELING_UNIT__REFERENCED_ELEMENT;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LabelinModelingUnitImpl
