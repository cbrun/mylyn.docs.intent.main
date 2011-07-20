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
package org.eclipse.mylyn.docs.intent.markup.markup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory
 * @model kind="package"
 * @generated
 */
public interface MarkupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "markup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/markup/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "markup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupPackage eINSTANCE = org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ContainerImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.DocumentImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SimpleContainerImpl <em>Simple Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.SimpleContainerImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getSimpleContainer()
	 * @generated
	 */
	int SIMPLE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTAINER__CONTENT = CONTAINER__CONTENT;

	/**
	 * The number of structural features of the '<em>Simple Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.StructureElementImpl <em>Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.StructureElementImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getStructureElement()
	 * @generated
	 */
	int STRUCTURE_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTRIBUTES = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LEVEL = STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockContentImpl <em>Block Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockContentImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getBlockContent()
	 * @generated
	 */
	int BLOCK_CONTENT = 12;

	/**
	 * The number of structural features of the '<em>Block Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ImageImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = BLOCK_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = BLOCK_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = BLOCK_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ATTRIBUTES = BLOCK_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DATA = BLOCK_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FORMAT = BLOCK_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LINE_BREAK = BLOCK_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = BLOCK_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.EntityImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = TEXT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATA = TEXT__DATA;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FORMAT = TEXT__FORMAT;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LINE_BREAK = TEXT__LINE_BREAK;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = BLOCK_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = BLOCK_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Href Or Hash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF_OR_HASH_NAME = BLOCK_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = BLOCK_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Been Declared With HTML Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HAS_BEEN_DECLARED_WITH_HTML_SYNTAX = BLOCK_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = BLOCK_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl <em>Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getAnnotations()
	 * @generated
	 */
	int ANNOTATIONS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__ID = 0;

	/**
	 * The feature id for the '<em><b>CSS Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__CSS_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__TITLE = 3;

	/**
	 * The feature id for the '<em><b>CSS Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__CSS_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.HasAttributesImpl <em>Has Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.HasAttributesImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getHasAttributes()
	 * @generated
	 */
	int HAS_ATTRIBUTES = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ATTRIBUTES__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Has Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ParagraphImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 13;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TipImpl <em>Tip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TipImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTip()
	 * @generated
	 */
	int TIP = 14;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Tip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.WarningImpl <em>Warning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.WarningImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getWarning()
	 * @generated
	 */
	int WARNING = 15;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.InformationImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 16;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.NoteImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 17;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.PanelImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 18;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.DivImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 19;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.FootNoteImpl <em>Foot Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.FootNoteImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getFootNote()
	 * @generated
	 */
	int FOOT_NOTE = 20;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_NOTE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_NOTE__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Foot Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_NOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.QuoteImpl <em>Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.QuoteImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getQuote()
	 * @generated
	 */
	int QUOTE = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.PreformattedImpl <em>Preformatted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.PreformattedImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getPreformatted()
	 * @generated
	 */
	int PREFORMATTED = 22;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFORMATTED__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFORMATTED__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Preformatted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFORMATTED_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.CodeImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 23;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getList()
	 * @generated
	 */
	int LIST = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imbrication Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IMBRICATION_LEVEL = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LIST_TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ITEMS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imbrication Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__IMBRICATION_LEVEL = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__IS_LIST = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 26;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableRowImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 27;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CONTENT = BLOCK__CONTENT;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 28;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Cell Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__IS_CELL_HEADER = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cols Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLS_PAN = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Formatting <em>Formatting</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Formatting
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getFormatting()
	 * @generated
	 */
	int FORMATTING = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListType <em>List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListType
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 30;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.SimpleContainer <em>Simple Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Container</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.SimpleContainer
	 * @generated
	 */
	EClass getSimpleContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.StructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.StructureElement
	 * @generated
	 */
	EClass getStructureElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.markup.markup.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Section#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Section#getLevel()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Level();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.markup.markup.Container#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Container#getContent()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Text#getData()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Data();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Text#getFormat()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#isLineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Break</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Text#isLineBreak()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_LineBreak();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getHrefOrHashName <em>Href Or Hash Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href Or Hash Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Link#getHrefOrHashName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_HrefOrHashName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#isHasBeenDeclaredWithHTMLSyntax <em>Has Been Declared With HTML Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Been Declared With HTML Syntax</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Link#isHasBeenDeclaredWithHTMLSyntax()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_HasBeenDeclaredWithHTMLSyntax();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.markup.markup.Block#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Block#getContent()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations
	 * @generated
	 */
	EClass getAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getId()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSStyle <em>CSS Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CSS Style</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSStyle()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_CSSStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getLanguage()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getTitle()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSClass <em>CSS Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CSS Class</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSClass()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_CSSClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Attributes</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes
	 * @generated
	 */
	EClass getHasAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes#getAttributes()
	 * @see #getHasAttributes()
	 * @generated
	 */
	EReference getHasAttributes_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.BlockContent <em>Block Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Content</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.BlockContent
	 * @generated
	 */
	EClass getBlockContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Tip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tip</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Tip
	 * @generated
	 */
	EClass getTip();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Warning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Warning
	 * @generated
	 */
	EClass getWarning();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.FootNote <em>Foot Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foot Note</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.FootNote
	 * @generated
	 */
	EClass getFootNote();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Quote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Quote
	 * @generated
	 */
	EClass getQuote();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Preformatted <em>Preformatted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preformatted</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Preformatted
	 * @generated
	 */
	EClass getPreformatted();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.List#getListType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getImbricationLevel <em>Imbrication Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imbrication Level</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.List#getImbricationLevel()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ImbricationLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListItem#isIsList <em>Is List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListItem#isIsList()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_IsList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#isIsCellHeader <em>Is Cell Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cell Header</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.TableCell#isIsCellHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_IsCellHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#getColsPan <em>Cols Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols Pan</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.TableCell#getColsPan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_ColsPan();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.markup.markup.Formatting <em>Formatting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Formatting</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Formatting
	 * @generated
	 */
	EEnum getFormatting();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListType
	 * @generated
	 */
	EEnum getListType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkupFactory getMarkupFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.DocumentImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SimpleContainerImpl <em>Simple Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.SimpleContainerImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getSimpleContainer()
		 * @generated
		 */
		EClass SIMPLE_CONTAINER = eINSTANCE.getSimpleContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.StructureElementImpl <em>Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.StructureElementImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getStructureElement()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__LEVEL = eINSTANCE.getSection_Level();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ContainerImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENT = eINSTANCE.getContainer_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ImageImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.EntityImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__DATA = eINSTANCE.getText_Data();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FORMAT = eINSTANCE.getText_Format();

		/**
		 * The meta object literal for the '<em><b>Line Break</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__LINE_BREAK = eINSTANCE.getText_LineBreak();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Href Or Hash Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF_OR_HASH_NAME = eINSTANCE.getLink_HrefOrHashName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Has Been Declared With HTML Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HAS_BEEN_DECLARED_WITH_HTML_SYNTAX = eINSTANCE.getLink_HasBeenDeclaredWithHTMLSyntax();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CONTENT = eINSTANCE.getBlock_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl <em>Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getAnnotations()
		 * @generated
		 */
		EClass ANNOTATIONS = eINSTANCE.getAnnotations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__ID = eINSTANCE.getAnnotations_Id();

		/**
		 * The meta object literal for the '<em><b>CSS Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__CSS_STYLE = eINSTANCE.getAnnotations_CSSStyle();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__LANGUAGE = eINSTANCE.getAnnotations_Language();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__TITLE = eINSTANCE.getAnnotations_Title();

		/**
		 * The meta object literal for the '<em><b>CSS Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__CSS_CLASS = eINSTANCE.getAnnotations_CSSClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.HasAttributesImpl <em>Has Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.HasAttributesImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getHasAttributes()
		 * @generated
		 */
		EClass HAS_ATTRIBUTES = eINSTANCE.getHasAttributes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_ATTRIBUTES__ATTRIBUTES = eINSTANCE.getHasAttributes_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockContentImpl <em>Block Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.BlockContentImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getBlockContent()
		 * @generated
		 */
		EClass BLOCK_CONTENT = eINSTANCE.getBlockContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ParagraphImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TipImpl <em>Tip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TipImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTip()
		 * @generated
		 */
		EClass TIP = eINSTANCE.getTip();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.WarningImpl <em>Warning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.WarningImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getWarning()
		 * @generated
		 */
		EClass WARNING = eINSTANCE.getWarning();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.InformationImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.NoteImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.PanelImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.DivImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.FootNoteImpl <em>Foot Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.FootNoteImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getFootNote()
		 * @generated
		 */
		EClass FOOT_NOTE = eINSTANCE.getFootNote();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.QuoteImpl <em>Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.QuoteImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getQuote()
		 * @generated
		 */
		EClass QUOTE = eINSTANCE.getQuote();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.PreformattedImpl <em>Preformatted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.PreformattedImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getPreformatted()
		 * @generated
		 */
		EClass PREFORMATTED = eINSTANCE.getPreformatted();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.CodeImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>List Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__LIST_TYPE = eINSTANCE.getList_ListType();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '<em><b>Imbrication Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__IMBRICATION_LEVEL = eINSTANCE.getList_ImbricationLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Is List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__IS_LIST = eINSTANCE.getListItem_IsList();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableRowImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Is Cell Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__IS_CELL_HEADER = eINSTANCE.getTableCell_IsCellHeader();

		/**
		 * The meta object literal for the '<em><b>Cols Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COLS_PAN = eINSTANCE.getTableCell_ColsPan();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Formatting <em>Formatting</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.Formatting
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getFormatting()
		 * @generated
		 */
		EEnum FORMATTING = eINSTANCE.getFormatting();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListType <em>List Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListType
		 * @see org.eclipse.mylyn.docs.intent.markup.markup.impl.MarkupPackageImpl#getListType()
		 * @generated
		 */
		EEnum LIST_TYPE = eINSTANCE.getListType();

	}

} //MarkupPackage
