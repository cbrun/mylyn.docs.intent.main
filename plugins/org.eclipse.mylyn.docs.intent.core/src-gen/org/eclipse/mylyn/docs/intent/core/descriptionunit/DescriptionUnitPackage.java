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
package org.eclipse.mylyn.docs.intent.core.descriptionunit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to
 * represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionUnitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "descriptionunit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/descriptionunit/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentDU";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionUnitPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitImpl <em>Description Unit</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitImpl
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionUnit()
	 * @generated
	 */
	int DESCRIPTION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT__COMPILATION_STATUS = GenericUnitPackage.GENERIC_UNIT__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT__INSTRUCTIONS = GenericUnitPackage.GENERIC_UNIT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT__UNIT_NAME = GenericUnitPackage.GENERIC_UNIT__UNIT_NAME;

	/**
	 * The number of structural features of the '<em>Description Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT_FEATURE_COUNT = GenericUnitPackage.GENERIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitInstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitInstructionImpl
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionUnitInstruction()
	 * @generated
	 */
	int DESCRIPTION_UNIT_INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT_INSTRUCTION__COMPILATION_STATUS = GenericUnitPackage.UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT_INSTRUCTION__UNIT = GenericUnitPackage.UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT_INSTRUCTION__LINE_BREAK = GenericUnitPackage.UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_UNIT_INSTRUCTION_FEATURE_COUNT = GenericUnitPackage.UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionBlocImpl <em>Description Bloc</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionBlocImpl
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionBloc()
	 * @generated
	 */
	int DESCRIPTION_BLOC = 2;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BLOC__COMPILATION_STATUS = DESCRIPTION_UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BLOC__UNIT = DESCRIPTION_UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BLOC__LINE_BREAK = DESCRIPTION_UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The feature id for the '<em><b>Description Bloc</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BLOC__DESCRIPTION_BLOC = DESCRIPTION_UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BLOC_FEATURE_COUNT = DESCRIPTION_UNIT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit <em>Description Unit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Unit</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit
	 * @generated
	 */
	EClass getDescriptionUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitInstruction
	 * @generated
	 */
	EClass getDescriptionUnitInstruction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc <em>Description Bloc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Bloc</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc
	 * @generated
	 */
	EClass getDescriptionBloc();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc#getDescriptionBloc <em>Description Bloc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Bloc</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc#getDescriptionBloc()
	 * @see #getDescriptionBloc()
	 * @generated
	 */
	EReference getDescriptionBloc_DescriptionBloc();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DescriptionUnitFactory getDescriptionUnitFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitImpl <em>Description Unit</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitImpl
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionUnit()
		 * @generated
		 */
		EClass DESCRIPTION_UNIT = eINSTANCE.getDescriptionUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitInstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitInstructionImpl
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionUnitInstruction()
		 * @generated
		 */
		EClass DESCRIPTION_UNIT_INSTRUCTION = eINSTANCE.getDescriptionUnitInstruction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionBlocImpl <em>Description Bloc</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionBlocImpl
		 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl#getDescriptionBloc()
		 * @generated
		 */
		EClass DESCRIPTION_BLOC = eINSTANCE.getDescriptionBloc();

		/**
		 * The meta object literal for the '<em><b>Description Bloc</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_BLOC__DESCRIPTION_BLOC = eINSTANCE.getDescriptionBloc_DescriptionBloc();

	}

} // DescriptionUnitPackage
