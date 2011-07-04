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
package org.eclipse.mylyn.docs.intent.markup.wikigen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.wikigen.Article;
import org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument;
import org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument;
import org.eclipse.mylyn.docs.intent.markup.wikigen.HtmlProfile;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenFactory;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikigenPackageImpl extends EPackageImpl implements WikigenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLatexDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genHtmlDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WikigenPackageImpl() {
		super(eNS_URI, WikigenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WikigenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WikigenPackage init() {
		if (isInited) return (WikigenPackage)EPackage.Registry.INSTANCE.getEPackage(WikigenPackage.eNS_URI);

		// Obtain or create and register package
		WikigenPackageImpl theWikigenPackage = (WikigenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WikigenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WikigenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MarkupPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWikigenPackage.createPackageContents();

		// Initialize created meta-data
		theWikigenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWikigenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WikigenPackage.eNS_URI, theWikigenPackage);
		return theWikigenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLatexDocument() {
		return genLatexDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLatexDocument_Title() {
		return (EAttribute)genLatexDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLatexDocument_Filename() {
		return (EAttribute)genLatexDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLatexDocument_Roots() {
		return (EReference)genLatexDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLatexDocument_Authors() {
		return (EAttribute)genLatexDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenHtmlDocument() {
		return genHtmlDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenHtmlDocument_Style() {
		return (EReference)genHtmlDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenHtmlDocument_Roots() {
		return (EReference)genHtmlDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenHtmlDocument_Filename() {
		return (EAttribute)genHtmlDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlProfile() {
		return htmlProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_NbColumns() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_GenerateTOC() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikigenFactory getWikigenFactory() {
		return (WikigenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		genLatexDocumentEClass = createEClass(GEN_LATEX_DOCUMENT);
		createEAttribute(genLatexDocumentEClass, GEN_LATEX_DOCUMENT__TITLE);
		createEAttribute(genLatexDocumentEClass, GEN_LATEX_DOCUMENT__FILENAME);
		createEReference(genLatexDocumentEClass, GEN_LATEX_DOCUMENT__ROOTS);
		createEAttribute(genLatexDocumentEClass, GEN_LATEX_DOCUMENT__AUTHORS);

		genHtmlDocumentEClass = createEClass(GEN_HTML_DOCUMENT);
		createEReference(genHtmlDocumentEClass, GEN_HTML_DOCUMENT__STYLE);
		createEReference(genHtmlDocumentEClass, GEN_HTML_DOCUMENT__ROOTS);
		createEAttribute(genHtmlDocumentEClass, GEN_HTML_DOCUMENT__FILENAME);

		htmlProfileEClass = createEClass(HTML_PROFILE);

		articleEClass = createEClass(ARTICLE);
		createEAttribute(articleEClass, ARTICLE__NB_COLUMNS);
		createEAttribute(articleEClass, ARTICLE__GENERATE_TOC);

		// Create data types
		uriEDataType = createEDataType(URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MarkupPackage theMarkupPackage = (MarkupPackage)EPackage.Registry.INSTANCE.getEPackage(MarkupPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		articleEClass.getESuperTypes().add(this.getHtmlProfile());

		// Initialize classes and features; add operations and parameters
		initEClass(genLatexDocumentEClass, GenLatexDocument.class, "GenLatexDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenLatexDocument_Title(), ecorePackage.getEString(), "title", null, 1, 1, GenLatexDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLatexDocument_Filename(), this.getURI(), "filename", null, 1, 1, GenLatexDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLatexDocument_Roots(), theMarkupPackage.getContainer(), null, "roots", null, 0, -1, GenLatexDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLatexDocument_Authors(), ecorePackage.getEString(), "authors", null, 0, -1, GenLatexDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genHtmlDocumentEClass, GenHtmlDocument.class, "GenHtmlDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenHtmlDocument_Style(), this.getHtmlProfile(), null, "style", null, 0, 1, GenHtmlDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenHtmlDocument_Roots(), theMarkupPackage.getDocument(), null, "roots", null, 0, -1, GenHtmlDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenHtmlDocument_Filename(), ecorePackage.getEString(), "filename", null, 1, 1, GenHtmlDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlProfileEClass, HtmlProfile.class, "HtmlProfile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticle_NbColumns(), ecorePackage.getEInt(), "nbColumns", "3", 1, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_GenerateTOC(), ecorePackage.getEBoolean(), "generateTOC", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WikigenPackageImpl
