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
package org.eclipse.mylyn.docs.intent.core.genericunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Reference Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl#getReferencedLabel <em>Referenced Label</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelReferenceInstructionImpl extends UnitInstructionImpl implements LabelReferenceInstruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelReferenceInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.LABEL_REFERENCE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDeclarationReference getReferencedLabel() {
		return (LabelDeclarationReference)eGet(
				GenericUnitPackage.Literals.LABEL_REFERENCE_INSTRUCTION__REFERENCED_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedLabel(LabelDeclarationReference newReferencedLabel) {
		eSet(GenericUnitPackage.Literals.LABEL_REFERENCE_INSTRUCTION__REFERENCED_LABEL, newReferencedLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLabel getType() {
		return (TypeLabel)eGet(GenericUnitPackage.Literals.LABEL_REFERENCE_INSTRUCTION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeLabel newType) {
		eSet(GenericUnitPackage.Literals.LABEL_REFERENCE_INSTRUCTION__TYPE, newType);
	}

} //LabelReferenceInstructionImpl
