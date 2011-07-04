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
package org.eclipse.mylyn.docs.intent.core.genericunit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage
 * @generated
 */
public interface GenericUnitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericUnitFactory eINSTANCE = org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Unit Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Instruction Reference</em>'.
	 * @generated
	 */
	UnitInstructionReference createUnitInstructionReference();

	/**
	 * Returns a new object of class '<em>Label Declaration Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Declaration Reference</em>'.
	 * @generated
	 */
	LabelDeclarationReference createLabelDeclarationReference();

	/**
	 * Returns a new object of class '<em>Intent Section Reference Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Section Reference Instruction</em>'.
	 * @generated
	 */
	IntentSectionReferenceInstruction createIntentSectionReferenceInstruction();

	/**
	 * Returns a new object of class '<em>Label Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Declaration</em>'.
	 * @generated
	 */
	LabelDeclaration createLabelDeclaration();

	/**
	 * Returns a new object of class '<em>Label Reference Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Reference Instruction</em>'.
	 * @generated
	 */
	LabelReferenceInstruction createLabelReferenceInstruction();

	/**
	 * Returns a new object of class '<em>Adressed Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adressed Annotation</em>'.
	 * @generated
	 */
	AdressedAnnotation createAdressedAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericUnitPackage getGenericUnitPackage();

} //GenericUnitFactory
