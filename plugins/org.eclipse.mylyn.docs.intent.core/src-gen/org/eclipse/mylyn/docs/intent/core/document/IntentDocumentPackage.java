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
package org.eclipse.mylyn.docs.intent.core.document;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

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
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentFactory
 * @model kind="package"
 * @generated
 */
public interface IntentDocumentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "document";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/intentdocument/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentDocument";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentDocumentPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl <em>Intent Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentGenericElement()
	 * @generated
	 */
	int INTENT_GENERIC_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_GENERIC_ELEMENT__COMPILATION_STATUS = 0;

	/**
	 * The number of structural features of the '<em>Intent Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_GENERIC_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.AnnotationMappingImpl <em>Annotation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.AnnotationMappingImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getAnnotationMapping()
	 * @generated
	 */
	int ANNOTATION_MAPPING = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl <em>Intent Structured Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentStructuredElement()
	 * @generated
	 */
	int INTENT_STRUCTURED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__CONTENT = MarkupPackage.SECTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__ATTRIBUTES = MarkupPackage.SECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__TITLE = MarkupPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__LEVEL = MarkupPackage.SECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__COMPILATION_STATUS = MarkupPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE = MarkupPackage.SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intent Structured Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT = MarkupPackage.SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAPPING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl <em>Intent Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentReference()
	 * @generated
	 */
	int INTENT_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_REFERENCE__INTENT_HREF = 0;

	/**
	 * The number of structural features of the '<em>Intent Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionReferenceImpl <em>Intent Section Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionReferenceImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionReference()
	 * @generated
	 */
	int INTENT_SECTION_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE__INTENT_HREF = INTENT_REFERENCE__INTENT_HREF;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE__REFERENCED_ELEMENT = INTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intent Section Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_REFERENCE_FEATURE_COUNT = INTENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionOrParagraphReferenceImpl <em>Intent Section Or Paragraph Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionOrParagraphReferenceImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionOrParagraphReference()
	 * @generated
	 */
	int INTENT_SECTION_OR_PARAGRAPH_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_OR_PARAGRAPH_REFERENCE__INTENT_HREF = INTENT_REFERENCE__INTENT_HREF;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_OR_PARAGRAPH_REFERENCE__REFERENCED_OBJECT = INTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intent Section Or Paragraph Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_OR_PARAGRAPH_REFERENCE_FEATURE_COUNT = INTENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl <em>Intent Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentDocument()
	 * @generated
	 */
	int INTENT_DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__CONTENT = INTENT_STRUCTURED_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__ATTRIBUTES = INTENT_STRUCTURED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__TITLE = INTENT_STRUCTURED_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__LEVEL = INTENT_STRUCTURED_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__COMPILATION_STATUS = INTENT_STRUCTURED_ELEMENT__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__FORMATTED_TITLE = INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__CHAPTERS = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT__HEADERS = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intent Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DOCUMENT_FEATURE_COUNT = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl <em>Intent Sub Section Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSubSectionContainer()
	 * @generated
	 */
	int INTENT_SUB_SECTION_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__CONTENT = INTENT_STRUCTURED_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__ATTRIBUTES = INTENT_STRUCTURED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__TITLE = INTENT_STRUCTURED_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__LEVEL = INTENT_STRUCTURED_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__COMPILATION_STATUS = INTENT_STRUCTURED_ELEMENT__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__FORMATTED_TITLE = INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE;

	/**
	 * The feature id for the '<em><b>Intent Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__SUB_SECTIONS = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__UNITS = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER__DESCRIPTION_UNITS = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Intent Sub Section Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT = INTENT_STRUCTURED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentChapterImpl <em>Intent Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentChapterImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentChapter()
	 * @generated
	 */
	int INTENT_CHAPTER = 8;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__CONTENT = INTENT_SUB_SECTION_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__ATTRIBUTES = INTENT_SUB_SECTION_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__TITLE = INTENT_SUB_SECTION_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__LEVEL = INTENT_SUB_SECTION_CONTAINER__LEVEL;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__COMPILATION_STATUS = INTENT_SUB_SECTION_CONTAINER__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__FORMATTED_TITLE = INTENT_SUB_SECTION_CONTAINER__FORMATTED_TITLE;

	/**
	 * The feature id for the '<em><b>Intent Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__INTENT_CONTENT = INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__SUB_SECTIONS = INTENT_SUB_SECTION_CONTAINER__SUB_SECTIONS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__UNITS = INTENT_SUB_SECTION_CONTAINER__UNITS;

	/**
	 * The feature id for the '<em><b>Description Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER__DESCRIPTION_UNITS = INTENT_SUB_SECTION_CONTAINER__DESCRIPTION_UNITS;

	/**
	 * The number of structural features of the '<em>Intent Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_CHAPTER_FEATURE_COUNT = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl <em>Intent Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSection()
	 * @generated
	 */
	int INTENT_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__CONTENT = INTENT_SUB_SECTION_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__ATTRIBUTES = INTENT_SUB_SECTION_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__TITLE = INTENT_SUB_SECTION_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__LEVEL = INTENT_SUB_SECTION_CONTAINER__LEVEL;

	/**
	 * The feature id for the '<em><b>Compilation Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__COMPILATION_STATUS = INTENT_SUB_SECTION_CONTAINER__COMPILATION_STATUS;

	/**
	 * The feature id for the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__FORMATTED_TITLE = INTENT_SUB_SECTION_CONTAINER__FORMATTED_TITLE;

	/**
	 * The feature id for the '<em><b>Intent Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__INTENT_CONTENT = INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__SUB_SECTIONS = INTENT_SUB_SECTION_CONTAINER__SUB_SECTIONS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__UNITS = INTENT_SUB_SECTION_CONTAINER__UNITS;

	/**
	 * The feature id for the '<em><b>Description Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__DESCRIPTION_UNITS = INTENT_SUB_SECTION_CONTAINER__DESCRIPTION_UNITS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__VISIBILITY = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complete Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__COMPLETE_LEVEL = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modeling Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__MODELING_UNITS = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__IMPORTED_HEADERS = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declared Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION__DECLARED_HEADERS = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Intent Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_SECTION_FEATURE_COUNT = INTENT_SUB_SECTION_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl <em>Intent Header Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentHeaderDeclaration()
	 * @generated
	 */
	int INTENT_HEADER_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_HEADER_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_HEADER_DECLARATION__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Annotation Mappings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_HEADER_DECLARATION__ANNOTATION_MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_HEADER_DECLARATION__RESOURCE = 3;

	/**
	 * The number of structural features of the '<em>Intent Header Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_HEADER_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility <em>Intent Section Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionVisibility()
	 * @generated
	 */
	int INTENT_SECTION_VISIBILITY = 11;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see String
	 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getURI()
	 * @generated
	 */
	int URI = 12;

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement <em>Intent Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Generic Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement
	 * @generated
	 */
	EClass getIntentGenericElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement#getCompilationStatus <em>Compilation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement#getCompilationStatus()
	 * @see #getIntentGenericElement()
	 * @generated
	 */
	EReference getIntentGenericElement_CompilationStatus();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Annotation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Mapping</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.mylyn.docs.intent.core.document.URI"
	 * @generated
	 */
	EClass getAnnotationMapping();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationMapping()
	 * @generated
	 */
	EAttribute getAnnotationMapping_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationMapping()
	 * @generated
	 */
	EAttribute getAnnotationMapping_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement <em>Intent Structured Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Structured Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement
	 * @generated
	 */
	EClass getIntentStructuredElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement#getFormattedTitle <em>Formatted Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatted Title</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement#getFormattedTitle()
	 * @see #getIntentStructuredElement()
	 * @generated
	 */
	EAttribute getIntentStructuredElement_FormattedTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentReference <em>Intent Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentReference
	 * @generated
	 */
	EClass getIntentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.document.IntentReference#getIntentHref <em>Intent Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intent Href</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentReference#getIntentHref()
	 * @see #getIntentReference()
	 * @generated
	 */
	EAttribute getIntentReference_IntentHref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference <em>Intent Section Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Section Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference
	 * @generated
	 */
	EClass getIntentSectionReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference#getReferencedElement()
	 * @see #getIntentSectionReference()
	 * @generated
	 */
	EReference getIntentSectionReference_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference <em>Intent Section Or Paragraph Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Section Or Paragraph Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference
	 * @generated
	 */
	EClass getIntentSectionOrParagraphReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference#getReferencedObject()
	 * @see #getIntentSectionOrParagraphReference()
	 * @generated
	 */
	EReference getIntentSectionOrParagraphReference_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentDocument <em>Intent Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Document</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocument
	 * @generated
	 */
	EClass getIntentDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getChapters <em>Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapters</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getChapters()
	 * @see #getIntentDocument()
	 * @generated
	 */
	EReference getIntentDocument_Chapters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getHeaders()
	 * @see #getIntentDocument()
	 * @generated
	 */
	EReference getIntentDocument_Headers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer <em>Intent Sub Section Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Sub Section Container</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer
	 * @generated
	 */
	EClass getIntentSubSectionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getIntentContent <em>Intent Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intent Content</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getIntentContent()
	 * @see #getIntentSubSectionContainer()
	 * @generated
	 */
	EReference getIntentSubSectionContainer_IntentContent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getSubSections()
	 * @see #getIntentSubSectionContainer()
	 * @generated
	 */
	EReference getIntentSubSectionContainer_SubSections();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getUnits()
	 * @see #getIntentSubSectionContainer()
	 * @generated
	 */
	EReference getIntentSubSectionContainer_Units();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getDescriptionUnits <em>Description Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Description Units</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer#getDescriptionUnits()
	 * @see #getIntentSubSectionContainer()
	 * @generated
	 */
	EReference getIntentSubSectionContainer_DescriptionUnits();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentChapter <em>Intent Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Chapter</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentChapter
	 * @generated
	 */
	EClass getIntentChapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection <em>Intent Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Section</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection
	 * @generated
	 */
	EClass getIntentSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection#getVisibility()
	 * @see #getIntentSection()
	 * @generated
	 */
	EAttribute getIntentSection_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getCompleteLevel <em>Complete Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Level</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection#getCompleteLevel()
	 * @see #getIntentSection()
	 * @generated
	 */
	EAttribute getIntentSection_CompleteLevel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getModelingUnits <em>Modeling Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modeling Units</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection#getModelingUnits()
	 * @see #getIntentSection()
	 * @generated
	 */
	EReference getIntentSection_ModelingUnits();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getImportedHeaders <em>Imported Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imported Headers</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection#getImportedHeaders()
	 * @see #getIntentSection()
	 * @generated
	 */
	EAttribute getIntentSection_ImportedHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getDeclaredHeaders <em>Declared Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Headers</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSection#getDeclaredHeaders()
	 * @see #getIntentSection()
	 * @generated
	 */
	EReference getIntentSection_DeclaredHeaders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration <em>Intent Header Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Header Declaration</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration
	 * @generated
	 */
	EClass getIntentHeaderDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getName()
	 * @see #getIntentHeaderDeclaration()
	 * @generated
	 */
	EAttribute getIntentHeaderDeclaration_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getImports()
	 * @see #getIntentHeaderDeclaration()
	 * @generated
	 */
	EAttribute getIntentHeaderDeclaration_Imports();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getAnnotationMappings <em>Annotation Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Annotation Mappings</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getAnnotationMappings()
	 * @see #getIntentHeaderDeclaration()
	 * @generated
	 */
	EReference getIntentHeaderDeclaration_AnnotationMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getResource()
	 * @see #getIntentHeaderDeclaration()
	 * @generated
	 */
	EReference getIntentHeaderDeclaration_Resource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility <em>Intent Section Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intent Section Visibility</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility
	 * @generated
	 */
	EEnum getIntentSectionVisibility();

	/**
	 * Returns the meta object for data type '{@link String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see String
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntentDocumentFactory getIntentDocumentFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl <em>Intent Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentGenericElement()
		 * @generated
		 */
		EClass INTENT_GENERIC_ELEMENT = eINSTANCE.getIntentGenericElement();

		/**
		 * The meta object literal for the '<em><b>Compilation Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_GENERIC_ELEMENT__COMPILATION_STATUS = eINSTANCE
				.getIntentGenericElement_CompilationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.AnnotationMappingImpl <em>Annotation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.AnnotationMappingImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getAnnotationMapping()
		 * @generated
		 */
		EClass ANNOTATION_MAPPING = eINSTANCE.getAnnotationMapping();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAPPING__KEY = eINSTANCE.getAnnotationMapping_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAPPING__VALUE = eINSTANCE.getAnnotationMapping_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl <em>Intent Structured Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentStructuredElement()
		 * @generated
		 */
		EClass INTENT_STRUCTURED_ELEMENT = eINSTANCE.getIntentStructuredElement();

		/**
		 * The meta object literal for the '<em><b>Formatted Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE = eINSTANCE
				.getIntentStructuredElement_FormattedTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl <em>Intent Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentReference()
		 * @generated
		 */
		EClass INTENT_REFERENCE = eINSTANCE.getIntentReference();

		/**
		 * The meta object literal for the '<em><b>Intent Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_REFERENCE__INTENT_HREF = eINSTANCE.getIntentReference_IntentHref();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionReferenceImpl <em>Intent Section Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionReferenceImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionReference()
		 * @generated
		 */
		EClass INTENT_SECTION_REFERENCE = eINSTANCE.getIntentSectionReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SECTION_REFERENCE__REFERENCED_ELEMENT = eINSTANCE
				.getIntentSectionReference_ReferencedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionOrParagraphReferenceImpl <em>Intent Section Or Paragraph Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionOrParagraphReferenceImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionOrParagraphReference()
		 * @generated
		 */
		EClass INTENT_SECTION_OR_PARAGRAPH_REFERENCE = eINSTANCE.getIntentSectionOrParagraphReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SECTION_OR_PARAGRAPH_REFERENCE__REFERENCED_OBJECT = eINSTANCE
				.getIntentSectionOrParagraphReference_ReferencedObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl <em>Intent Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentDocument()
		 * @generated
		 */
		EClass INTENT_DOCUMENT = eINSTANCE.getIntentDocument();

		/**
		 * The meta object literal for the '<em><b>Chapters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_DOCUMENT__CHAPTERS = eINSTANCE.getIntentDocument_Chapters();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_DOCUMENT__HEADERS = eINSTANCE.getIntentDocument_Headers();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl <em>Intent Sub Section Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSubSectionContainer()
		 * @generated
		 */
		EClass INTENT_SUB_SECTION_CONTAINER = eINSTANCE.getIntentSubSectionContainer();

		/**
		 * The meta object literal for the '<em><b>Intent Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT = eINSTANCE
				.getIntentSubSectionContainer_IntentContent();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SUB_SECTION_CONTAINER__SUB_SECTIONS = eINSTANCE
				.getIntentSubSectionContainer_SubSections();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SUB_SECTION_CONTAINER__UNITS = eINSTANCE.getIntentSubSectionContainer_Units();

		/**
		 * The meta object literal for the '<em><b>Description Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SUB_SECTION_CONTAINER__DESCRIPTION_UNITS = eINSTANCE
				.getIntentSubSectionContainer_DescriptionUnits();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentChapterImpl <em>Intent Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentChapterImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentChapter()
		 * @generated
		 */
		EClass INTENT_CHAPTER = eINSTANCE.getIntentChapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl <em>Intent Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSection()
		 * @generated
		 */
		EClass INTENT_SECTION = eINSTANCE.getIntentSection();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_SECTION__VISIBILITY = eINSTANCE.getIntentSection_Visibility();

		/**
		 * The meta object literal for the '<em><b>Complete Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_SECTION__COMPLETE_LEVEL = eINSTANCE.getIntentSection_CompleteLevel();

		/**
		 * The meta object literal for the '<em><b>Modeling Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SECTION__MODELING_UNITS = eINSTANCE.getIntentSection_ModelingUnits();

		/**
		 * The meta object literal for the '<em><b>Imported Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_SECTION__IMPORTED_HEADERS = eINSTANCE.getIntentSection_ImportedHeaders();

		/**
		 * The meta object literal for the '<em><b>Declared Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_SECTION__DECLARED_HEADERS = eINSTANCE.getIntentSection_DeclaredHeaders();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl <em>Intent Header Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentHeaderDeclaration()
		 * @generated
		 */
		EClass INTENT_HEADER_DECLARATION = eINSTANCE.getIntentHeaderDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_HEADER_DECLARATION__NAME = eINSTANCE.getIntentHeaderDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_HEADER_DECLARATION__IMPORTS = eINSTANCE.getIntentHeaderDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Annotation Mappings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_HEADER_DECLARATION__ANNOTATION_MAPPINGS = eINSTANCE
				.getIntentHeaderDeclaration_AnnotationMappings();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_HEADER_DECLARATION__RESOURCE = eINSTANCE.getIntentHeaderDeclaration_Resource();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility <em>Intent Section Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getIntentSectionVisibility()
		 * @generated
		 */
		EEnum INTENT_SECTION_VISIBILITY = eINSTANCE.getIntentSectionVisibility();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see String
		 * @see org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //IntentDocumentPackage
