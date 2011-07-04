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
package org.eclipse.mylyn.docs.intent.core.document.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentFactory;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentDocumentFactoryImpl extends EFactoryImpl implements IntentDocumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentDocumentFactory init() {
		try {
			IntentDocumentFactory theIntentDocumentFactory = (IntentDocumentFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/intent/intentdocument/0.7");
			if (theIntentDocumentFactory != null) {
				return theIntentDocumentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntentDocumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDocumentFactoryImpl() {
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
			case IntentDocumentPackage.INTENT_GENERIC_ELEMENT:
				return (EObject)createIntentGenericElement();
			case IntentDocumentPackage.ANNOTATION_MAPPING:
				return (EObject)createAnnotationMapping();
			case IntentDocumentPackage.INTENT_SECTION_REFERENCE:
				return (EObject)createIntentSectionReference();
			case IntentDocumentPackage.INTENT_SECTION_OR_PARAGRAPH_REFERENCE:
				return (EObject)createIntentSectionOrParagraphReference();
			case IntentDocumentPackage.INTENT_DOCUMENT:
				return (EObject)createIntentDocument();
			case IntentDocumentPackage.INTENT_CHAPTER:
				return (EObject)createIntentChapter();
			case IntentDocumentPackage.INTENT_SECTION:
				return (EObject)createIntentSection();
			case IntentDocumentPackage.INTENT_HEADER_DECLARATION:
				return (EObject)createIntentHeaderDeclaration();
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
			case IntentDocumentPackage.INTENT_SECTION_VISIBILITY:
				return createIntentSectionVisibilityFromString(eDataType, initialValue);
			case IntentDocumentPackage.URI:
				return createURIFromString(eDataType, initialValue);
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
			case IntentDocumentPackage.INTENT_SECTION_VISIBILITY:
				return convertIntentSectionVisibilityToString(eDataType, instanceValue);
			case IntentDocumentPackage.URI:
				return convertURIToString(eDataType, instanceValue);
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
	public IntentGenericElement createIntentGenericElement() {
		IntentGenericElementImpl intentGenericElement = new IntentGenericElementImpl();
		return intentGenericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createAnnotationMapping() {
		AnnotationMappingImpl annotationMapping = new AnnotationMappingImpl();
		return annotationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionReference createIntentSectionReference() {
		IntentSectionReferenceImpl intentSectionReference = new IntentSectionReferenceImpl();
		return intentSectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionOrParagraphReference createIntentSectionOrParagraphReference() {
		IntentSectionOrParagraphReferenceImpl intentSectionOrParagraphReference = new IntentSectionOrParagraphReferenceImpl();
		return intentSectionOrParagraphReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDocument createIntentDocument() {
		IntentDocumentImpl intentDocument = new IntentDocumentImpl();
		return intentDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentChapter createIntentChapter() {
		IntentChapterImpl intentChapter = new IntentChapterImpl();
		return intentChapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSection createIntentSection() {
		IntentSectionImpl intentSection = new IntentSectionImpl();
		return intentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentHeaderDeclaration createIntentHeaderDeclaration() {
		IntentHeaderDeclarationImpl intentHeaderDeclaration = new IntentHeaderDeclarationImpl();
		return intentHeaderDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionVisibility createIntentSectionVisibilityFromString(EDataType eDataType,
			String initialValue) {
		IntentSectionVisibility result = IntentSectionVisibility.get(initialValue);
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
	public String convertIntentSectionVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDocumentPackage getIntentDocumentPackage() {
		return (IntentDocumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntentDocumentPackage getPackage() {
		return IntentDocumentPackage.eINSTANCE;
	}

} //IntentDocumentFactoryImpl
