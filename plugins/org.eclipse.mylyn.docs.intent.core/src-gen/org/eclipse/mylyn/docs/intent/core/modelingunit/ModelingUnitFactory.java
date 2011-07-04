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
package org.eclipse.mylyn.docs.intent.core.modelingunit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage
 * @generated
 */
public interface ModelingUnitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelingUnitFactory eINSTANCE = org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ModelingUnitFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Unit</em>'.
	 * @generated
	 */
	ModelingUnit createModelingUnit();

	/**
	 * Returns a new object of class '<em>Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Reference</em>'.
	 * @generated
	 */
	ResourceReference createResourceReference();

	/**
	 * Returns a new object of class '<em>Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Reference</em>'.
	 * @generated
	 */
	ModelingUnitInstructionReference createModelingUnitInstructionReference();

	/**
	 * Returns a new object of class '<em>Instanciation Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instanciation Instruction Reference</em>'.
	 * @generated
	 */
	InstanciationInstructionReference createInstanciationInstructionReference();

	/**
	 * Returns a new object of class '<em>Resource Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Declaration</em>'.
	 * @generated
	 */
	ResourceDeclaration createResourceDeclaration();

	/**
	 * Returns a new object of class '<em>Intent Section Referencein Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Section Referencein Modeling Unit</em>'.
	 * @generated
	 */
	IntentSectionReferenceinModelingUnit createIntentSectionReferenceinModelingUnit();

	/**
	 * Returns a new object of class '<em>Labelin Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labelin Modeling Unit</em>'.
	 * @generated
	 */
	LabelinModelingUnit createLabelinModelingUnit();

	/**
	 * Returns a new object of class '<em>Annotation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Declaration</em>'.
	 * @generated
	 */
	AnnotationDeclaration createAnnotationDeclaration();

	/**
	 * Returns a new object of class '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Reference</em>'.
	 * @generated
	 */
	TypeReference createTypeReference();

	/**
	 * Returns a new object of class '<em>Instanciation Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instanciation Instruction</em>'.
	 * @generated
	 */
	InstanciationInstruction createInstanciationInstruction();

	/**
	 * Returns a new object of class '<em>Structural Feature Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Feature Affectation</em>'.
	 * @generated
	 */
	StructuralFeatureAffectation createStructuralFeatureAffectation();

	/**
	 * Returns a new object of class '<em>Native Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Value For Structural Feature</em>'.
	 * @generated
	 */
	NativeValueForStructuralFeature createNativeValueForStructuralFeature();

	/**
	 * Returns a new object of class '<em>New Object Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Object Value For Structural Feature</em>'.
	 * @generated
	 */
	NewObjectValueForStructuralFeature createNewObjectValueForStructuralFeature();

	/**
	 * Returns a new object of class '<em>Reference Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Value For Structural Feature</em>'.
	 * @generated
	 */
	ReferenceValueForStructuralFeature createReferenceValueForStructuralFeature();

	/**
	 * Returns a new object of class '<em>Contribution Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contribution Instruction</em>'.
	 * @generated
	 */
	ContributionInstruction createContributionInstruction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelingUnitPackage getModelingUnitPackage();

} //ModelingUnitFactory
