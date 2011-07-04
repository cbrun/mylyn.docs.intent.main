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
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ModelingUnitInstructionReferenceImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingUnitInstructionReferenceImpl extends IntentReferenceImpl implements ModelingUnitInstructionReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitInstructionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingUnitPackage.Literals.MODELING_UNIT_INSTRUCTION_REFERENCE;
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

} //ModelingUnitInstructionReferenceImpl
