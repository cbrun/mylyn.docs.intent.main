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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitFactory;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericUnitFactoryImpl extends EFactoryImpl implements GenericUnitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericUnitFactory init() {
		try {
			GenericUnitFactory theGenericUnitFactory = (GenericUnitFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/intent/genericunit/0.7");
			if (theGenericUnitFactory != null) {
				return theGenericUnitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericUnitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUnitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenericUnitPackage.UNIT_INSTRUCTION_REFERENCE:
				return (EObject)createUnitInstructionReference();
			case GenericUnitPackage.LABEL_DECLARATION_REFERENCE:
				return (EObject)createLabelDeclarationReference();
			case GenericUnitPackage.INTENT_SECTION_REFERENCE_INSTRUCTION:
				return (EObject)createIntentSectionReferenceInstruction();
			case GenericUnitPackage.LABEL_DECLARATION:
				return (EObject)createLabelDeclaration();
			case GenericUnitPackage.LABEL_REFERENCE_INSTRUCTION:
				return (EObject)createLabelReferenceInstruction();
			case GenericUnitPackage.ADRESSED_ANNOTATION:
				return (EObject)createAdressedAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenericUnitPackage.TYPE_LABEL:
				return createTypeLabelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenericUnitPackage.TYPE_LABEL:
				return convertTypeLabelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitInstructionReference createUnitInstructionReference() {
		UnitInstructionReferenceImpl unitInstructionReference = new UnitInstructionReferenceImpl();
		return unitInstructionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDeclarationReference createLabelDeclarationReference() {
		LabelDeclarationReferenceImpl labelDeclarationReference = new LabelDeclarationReferenceImpl();
		return labelDeclarationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionReferenceInstruction createIntentSectionReferenceInstruction() {
		IntentSectionReferenceInstructionImpl intentSectionReferenceInstruction = new IntentSectionReferenceInstructionImpl();
		return intentSectionReferenceInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDeclaration createLabelDeclaration() {
		LabelDeclarationImpl labelDeclaration = new LabelDeclarationImpl();
		return labelDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelReferenceInstruction createLabelReferenceInstruction() {
		LabelReferenceInstructionImpl labelReferenceInstruction = new LabelReferenceInstructionImpl();
		return labelReferenceInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdressedAnnotation createAdressedAnnotation() {
		AdressedAnnotationImpl adressedAnnotation = new AdressedAnnotationImpl();
		return adressedAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLabel createTypeLabelFromString(EDataType eDataType, String initialValue) {
		TypeLabel result = TypeLabel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeLabelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUnitPackage getGenericUnitPackage() {
		return (GenericUnitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericUnitPackage getPackage() {
		return GenericUnitPackage.eINSTANCE;
	}

} //GenericUnitFactoryImpl
