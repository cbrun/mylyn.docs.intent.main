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
package org.eclipse.mylyn.docs.intent.markup.wikigen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenFactory
 * @model kind="package"
 * @generated
 */
public interface WikigenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wikigen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/markup/generator/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wikigen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WikigenPackage eINSTANCE = org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl <em>Gen Latex Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getGenLatexDocument()
	 * @generated
	 */
	int GEN_LATEX_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LATEX_DOCUMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LATEX_DOCUMENT__FILENAME = 1;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LATEX_DOCUMENT__ROOTS = 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LATEX_DOCUMENT__AUTHORS = 3;

	/**
	 * The number of structural features of the '<em>Gen Latex Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LATEX_DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl <em>Gen Html Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getGenHtmlDocument()
	 * @generated
	 */
	int GEN_HTML_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HTML_DOCUMENT__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HTML_DOCUMENT__ROOTS = 1;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HTML_DOCUMENT__FILENAME = 2;

	/**
	 * The number of structural features of the '<em>Gen Html Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HTML_DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.HtmlProfileImpl <em>Html Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.HtmlProfileImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getHtmlProfile()
	 * @generated
	 */
	int HTML_PROFILE = 2;

	/**
	 * The number of structural features of the '<em>Html Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_PROFILE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 3;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NB_COLUMNS = HTML_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate TOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__GENERATE_TOC = HTML_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = HTML_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getURI()
	 * @generated
	 */
	int URI = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument <em>Gen Latex Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Latex Document</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument
	 * @generated
	 */
	EClass getGenLatexDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getTitle()
	 * @see #getGenLatexDocument()
	 * @generated
	 */
	EAttribute getGenLatexDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getFilename()
	 * @see #getGenLatexDocument()
	 * @generated
	 */
	EAttribute getGenLatexDocument_Filename();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getRoots()
	 * @see #getGenLatexDocument()
	 * @generated
	 */
	EReference getGenLatexDocument_Roots();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Authors</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getAuthors()
	 * @see #getGenLatexDocument()
	 * @generated
	 */
	EAttribute getGenLatexDocument_Authors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument <em>Gen Html Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Html Document</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument
	 * @generated
	 */
	EClass getGenHtmlDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getStyle()
	 * @see #getGenHtmlDocument()
	 * @generated
	 */
	EReference getGenHtmlDocument_Style();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getRoots()
	 * @see #getGenHtmlDocument()
	 * @generated
	 */
	EReference getGenHtmlDocument_Roots();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getFilename()
	 * @see #getGenHtmlDocument()
	 * @generated
	 */
	EAttribute getGenHtmlDocument_Filename();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.HtmlProfile <em>Html Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Profile</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.HtmlProfile
	 * @generated
	 */
	EClass getHtmlProfile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Columns</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.Article#getNbColumns()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_NbColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#isGenerateTOC <em>Generate TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate TOC</em>'.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.Article#isGenerateTOC()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_GenerateTOC();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
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
	WikigenFactory getWikigenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl <em>Gen Latex Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getGenLatexDocument()
		 * @generated
		 */
		EClass GEN_LATEX_DOCUMENT = eINSTANCE.getGenLatexDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LATEX_DOCUMENT__TITLE = eINSTANCE.getGenLatexDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LATEX_DOCUMENT__FILENAME = eINSTANCE.getGenLatexDocument_Filename();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LATEX_DOCUMENT__ROOTS = eINSTANCE.getGenLatexDocument_Roots();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LATEX_DOCUMENT__AUTHORS = eINSTANCE.getGenLatexDocument_Authors();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl <em>Gen Html Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getGenHtmlDocument()
		 * @generated
		 */
		EClass GEN_HTML_DOCUMENT = eINSTANCE.getGenHtmlDocument();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_HTML_DOCUMENT__STYLE = eINSTANCE.getGenHtmlDocument_Style();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_HTML_DOCUMENT__ROOTS = eINSTANCE.getGenHtmlDocument_Roots();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_HTML_DOCUMENT__FILENAME = eINSTANCE.getGenHtmlDocument_Filename();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.HtmlProfileImpl <em>Html Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.HtmlProfileImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getHtmlProfile()
		 * @generated
		 */
		EClass HTML_PROFILE = eINSTANCE.getHtmlProfile();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NB_COLUMNS = eINSTANCE.getArticle_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Generate TOC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__GENERATE_TOC = eINSTANCE.getArticle_GenerateTOC();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.impl.WikigenPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //WikigenPackage
