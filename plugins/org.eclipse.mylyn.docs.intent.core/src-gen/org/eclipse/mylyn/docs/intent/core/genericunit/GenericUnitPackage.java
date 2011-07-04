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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitFactory
 * @model kind="package"
 * @generated
 */
public interface GenericUnitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericunit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/genericunit/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentGU";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericUnitPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl <em>Generic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getGenericUnit()
	 * @generated
	 */
	int GENERIC_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_UNIT__COMPILATION_STATUS = IntentDocumentPackage.INTENT_GENERIC_ELEMENT__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_UNIT__INSTRUCTIONS = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_UNIT__UNIT_NAME = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_UNIT_FEATURE_COUNT = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl <em>Unit Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getUnitInstruction()
	 * @generated
	 */
	int UNIT_INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION__COMPILATION_STATUS = IntentDocumentPackage.INTENT_GENERIC_ELEMENT__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION__UNIT = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION__LINE_BREAK = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION_FEATURE_COUNT = IntentDocumentPackage.INTENT_GENERIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionReferenceImpl <em>Unit Instruction Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionReferenceImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getUnitInstructionReference()
	 * @generated
	 */
	int UNIT_INSTRUCTION_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION_REFERENCE__INTENT_HREF = IntentDocumentPackage.INTENT_REFERENCE__INTENT_HREF;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT = IntentDocumentPackage.INTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Instruction Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INSTRUCTION_REFERENCE_FEATURE_COUNT = IntentDocumentPackage.INTENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationReferenceImpl <em>Label Declaration Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationReferenceImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelDeclarationReference()
	 * @generated
	 */
	int LABEL_DECLARATION_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION_REFERENCE__INTENT_HREF = IntentDocumentPackage.INTENT_REFERENCE__INTENT_HREF;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION_REFERENCE__REFERENCED_ELEMENT = IntentDocumentPackage.INTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Declaration Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION_REFERENCE_FEATURE_COUNT = IntentDocumentPackage.INTENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl <em>Intent Section Reference Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getIntentSectionReferenceInstruction()
	 * @generated
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION = 4;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION__COMPILATION_STATUS = UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION__UNIT = UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION__LINE_BREAK = UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION__REFERENCED_OBJECT = UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text To Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION__TEXT_TO_PRINT = UNIT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intent Section Reference Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_INSTRUCTION_FEATURE_COUNT = UNIT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl <em>Label Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelDeclaration()
	 * @generated
	 */
	int LABEL_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__COMPILATION_STATUS = UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__UNIT = UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__LINE_BREAK = UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The feature id for the '<em><b>Label Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__LABEL_VALUE = UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text To Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__TEXT_TO_PRINT = UNIT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION__TYPE = UNIT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Label Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DECLARATION_FEATURE_COUNT = UNIT_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl <em>Label Reference Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelReferenceInstruction()
	 * @generated
	 */
	int LABEL_REFERENCE_INSTRUCTION = 6;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION__COMPILATION_STATUS = UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION__UNIT = UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION__LINE_BREAK = UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The feature id for the '<em><b>Referenced Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION__REFERENCED_LABEL = UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION__TYPE = UNIT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Reference Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REFERENCE_INSTRUCTION_FEATURE_COUNT = UNIT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl <em>Adressed Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getAdressedAnnotation()
	 * @generated
	 */
	int ADRESSED_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__COMPILATION_STATUS = UNIT_INSTRUCTION__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__UNIT = UNIT_INSTRUCTION__UNIT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__LINE_BREAK = UNIT_INSTRUCTION__LINE_BREAK;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__RECEIVER = UNIT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__SOURCE = UNIT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__MESSAGE = UNIT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION__TYPE = UNIT_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Adressed Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSED_ANNOTATION_FEATURE_COUNT = UNIT_INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel <em>Type Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getTypeLabel()
	 * @generated
	 */
	int TYPE_LABEL = 8;

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit <em>Generic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Unit</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit
	 * @generated
	 */
	EClass getGenericUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getInstructions()
	 * @see #getGenericUnit()
	 * @generated
	 */
	EReference getGenericUnit_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getUnitName()
	 * @see #getGenericUnit()
	 * @generated
	 */
	EAttribute getGenericUnit_UnitName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction <em>Unit Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Instruction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction
	 * @generated
	 */
	EClass getUnitInstruction();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unit</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit()
	 * @see #getUnitInstruction()
	 * @generated
	 */
	EReference getUnitInstruction_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#isLineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Break</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#isLineBreak()
	 * @see #getUnitInstruction()
	 * @generated
	 */
	EAttribute getUnitInstruction_LineBreak();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference <em>Unit Instruction Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Instruction Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference
	 * @generated
	 */
	EClass getUnitInstructionReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference#getReferencedElement()
	 * @see #getUnitInstructionReference()
	 * @generated
	 */
	EReference getUnitInstructionReference_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference <em>Label Declaration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Declaration Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference
	 * @generated
	 */
	EClass getLabelDeclarationReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference#getReferencedElement()
	 * @see #getLabelDeclarationReference()
	 * @generated
	 */
	EReference getLabelDeclarationReference_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction <em>Intent Section Reference Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Section Reference Instruction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction
	 * @generated
	 */
	EClass getIntentSectionReferenceInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Object</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getReferencedObject()
	 * @see #getIntentSectionReferenceInstruction()
	 * @generated
	 */
	EReference getIntentSectionReferenceInstruction_ReferencedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getTextToPrint <em>Text To Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text To Print</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getTextToPrint()
	 * @see #getIntentSectionReferenceInstruction()
	 * @generated
	 */
	EAttribute getIntentSectionReferenceInstruction_TextToPrint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration <em>Label Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Declaration</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration
	 * @generated
	 */
	EClass getLabelDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getLabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Value</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getLabelValue()
	 * @see #getLabelDeclaration()
	 * @generated
	 */
	EAttribute getLabelDeclaration_LabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getTextToPrint <em>Text To Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text To Print</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getTextToPrint()
	 * @see #getLabelDeclaration()
	 * @generated
	 */
	EAttribute getLabelDeclaration_TextToPrint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getType()
	 * @see #getLabelDeclaration()
	 * @generated
	 */
	EAttribute getLabelDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction <em>Label Reference Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Reference Instruction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction
	 * @generated
	 */
	EClass getLabelReferenceInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction#getReferencedLabel <em>Referenced Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Label</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction#getReferencedLabel()
	 * @see #getLabelReferenceInstruction()
	 * @generated
	 */
	EReference getLabelReferenceInstruction_ReferencedLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction#getType()
	 * @see #getLabelReferenceInstruction()
	 * @generated
	 */
	EAttribute getLabelReferenceInstruction_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation <em>Adressed Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adressed Annotation</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation
	 * @generated
	 */
	EClass getAdressedAnnotation();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Receiver</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getReceiver()
	 * @see #getAdressedAnnotation()
	 * @generated
	 */
	EAttribute getAdressedAnnotation_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getSource()
	 * @see #getAdressedAnnotation()
	 * @generated
	 */
	EAttribute getAdressedAnnotation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getMessage()
	 * @see #getAdressedAnnotation()
	 * @generated
	 */
	EAttribute getAdressedAnnotation_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation#getType()
	 * @see #getAdressedAnnotation()
	 * @generated
	 */
	EAttribute getAdressedAnnotation_Type();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel <em>Type Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Label</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel
	 * @generated
	 */
	EEnum getTypeLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericUnitFactory getGenericUnitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl <em>Generic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getGenericUnit()
		 * @generated
		 */
		EClass GENERIC_UNIT = eINSTANCE.getGenericUnit();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_UNIT__INSTRUCTIONS = eINSTANCE.getGenericUnit_Instructions();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_UNIT__UNIT_NAME = eINSTANCE.getGenericUnit_UnitName();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl <em>Unit Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getUnitInstruction()
		 * @generated
		 */
		EClass UNIT_INSTRUCTION = eINSTANCE.getUnitInstruction();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_INSTRUCTION__UNIT = eINSTANCE.getUnitInstruction_Unit();

		/**
		 * The meta object literal for the '<em><b>Line Break</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INSTRUCTION__LINE_BREAK = eINSTANCE.getUnitInstruction_LineBreak();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionReferenceImpl <em>Unit Instruction Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionReferenceImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getUnitInstructionReference()
		 * @generated
		 */
		EClass UNIT_INSTRUCTION_REFERENCE = eINSTANCE.getUnitInstructionReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT = eINSTANCE
				.getUnitInstructionReference_ReferencedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationReferenceImpl <em>Label Declaration Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationReferenceImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelDeclarationReference()
		 * @generated
		 */
		EClass LABEL_DECLARATION_REFERENCE = eINSTANCE.getLabelDeclarationReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_DECLARATION_REFERENCE__REFERENCED_ELEMENT = eINSTANCE
				.getLabelDeclarationReference_ReferencedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl <em>Intent Section Reference Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.IntentSectionReferenceInstructionImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getIntentSectionReferenceInstruction()
		 * @generated
		 */
		EClass INTENT_SECTION_REFERENCE_INSTRUCTION = eINSTANCE.getIntentSectionReferenceInstruction();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SECTION_REFERENCE_INSTRUCTION__REFERENCED_OBJECT = eINSTANCE
				.getIntentSectionReferenceInstruction_ReferencedObject();

		/**
		 * The meta object literal for the '<em><b>Text To Print</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_SECTION_REFERENCE_INSTRUCTION__TEXT_TO_PRINT = eINSTANCE
				.getIntentSectionReferenceInstruction_TextToPrint();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl <em>Label Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelDeclaration()
		 * @generated
		 */
		EClass LABEL_DECLARATION = eINSTANCE.getLabelDeclaration();

		/**
		 * The meta object literal for the '<em><b>Label Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_DECLARATION__LABEL_VALUE = eINSTANCE.getLabelDeclaration_LabelValue();

		/**
		 * The meta object literal for the '<em><b>Text To Print</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_DECLARATION__TEXT_TO_PRINT = eINSTANCE.getLabelDeclaration_TextToPrint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_DECLARATION__TYPE = eINSTANCE.getLabelDeclaration_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl <em>Label Reference Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelReferenceInstructionImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getLabelReferenceInstruction()
		 * @generated
		 */
		EClass LABEL_REFERENCE_INSTRUCTION = eINSTANCE.getLabelReferenceInstruction();

		/**
		 * The meta object literal for the '<em><b>Referenced Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_REFERENCE_INSTRUCTION__REFERENCED_LABEL = eINSTANCE
				.getLabelReferenceInstruction_ReferencedLabel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_REFERENCE_INSTRUCTION__TYPE = eINSTANCE.getLabelReferenceInstruction_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl <em>Adressed Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getAdressedAnnotation()
		 * @generated
		 */
		EClass ADRESSED_ANNOTATION = eINSTANCE.getAdressedAnnotation();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSED_ANNOTATION__RECEIVER = eINSTANCE.getAdressedAnnotation_Receiver();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSED_ANNOTATION__SOURCE = eINSTANCE.getAdressedAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSED_ANNOTATION__MESSAGE = eINSTANCE.getAdressedAnnotation_Message();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSED_ANNOTATION__TYPE = eINSTANCE.getAdressedAnnotation_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel <em>Type Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel
		 * @see org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl#getTypeLabel()
		 * @generated
		 */
		EEnum TYPE_LABEL = eINSTANCE.getTypeLabel();

	}

} //GenericUnitPackage
