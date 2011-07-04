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
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Section Reference Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl#getReferencedObject <em>Referenced Object</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl#getTextToPrint <em>Text To Print</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentSectionReferenceInstructionImpl extends UnitInstructionImpl implements IntentSectionReferenceInstruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSectionReferenceInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.INTENT_SECTION_REFERENCE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionOrParagraphReference getReferencedObject() {
		return (IntentSectionOrParagraphReference)eGet(
				GenericUnitPackage.Literals.INTENT_SECTION_REFERENCE_INSTRUCTION__REFERENCED_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedObject(IntentSectionOrParagraphReference newReferencedObject) {
		eSet(GenericUnitPackage.Literals.INTENT_SECTION_REFERENCE_INSTRUCTION__REFERENCED_OBJECT,
				newReferencedObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextToPrint() {
		return (String)eGet(GenericUnitPackage.Literals.INTENT_SECTION_REFERENCE_INSTRUCTION__TEXT_TO_PRINT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextToPrint(String newTextToPrint) {
		eSet(GenericUnitPackage.Literals.INTENT_SECTION_REFERENCE_INSTRUCTION__TEXT_TO_PRINT, newTextToPrint);
	}

} //IntentSectionReferenceInstructionImpl
