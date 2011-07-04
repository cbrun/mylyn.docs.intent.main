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
package org.eclipse.mylyn.docs.intent.core.compiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Unresolved Reference Holder</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl#getTextualReference <em>Textual Reference</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl#isContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl#getInstructionContainer <em>Instruction Container</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl#getConcernedFeature <em>Concerned Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedReferenceHolderImpl extends CDOObjectImpl implements UnresolvedReferenceHolder {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedReferenceHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextualReference() {
		return (String)eGet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextualReference(String newTextualReference) {
		eSet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE, newTextualReference);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainmentReference() {
		return (Boolean)eGet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentReference(boolean newContainmentReference) {
		eSet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE,
				newContainmentReference);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnitInstruction getInstructionContainer() {
		return (UnitInstruction)eGet(
				CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionContainer(UnitInstruction newInstructionContainer) {
		eSet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER,
				newInstructionContainer);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getConcernedFeature() {
		return (EStructuralFeature)eGet(
				CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernedFeature(EStructuralFeature newConcernedFeature) {
		eSet(CompilerPackage.Literals.UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE, newConcernedFeature);
	}

} // UnresolvedReferenceHolderImpl
