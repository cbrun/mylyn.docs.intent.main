/**
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package org.eclipse.mylyn.docs.intent.retro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.mylyn.docs.intent.retro.RetroFactory
 * @model kind="package"
 * @generated
 */
public interface RetroPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "retro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mylyn/intent/retro";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "retro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RetroPackage eINSTANCE = org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.BundleImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXPORTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Define</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DEFINE = 2;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.NameSpaceImpl <em>Name Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.NameSpaceImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getNameSpace()
	 * @generated
	 */
	int NAME_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE__CATEGORY = 1;

	/**
	 * The number of structural features of the '<em>Name Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.FeatureImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.DevelopperFeatureImpl <em>Developper Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.DevelopperFeatureImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getDevelopperFeature()
	 * @generated
	 */
	int DEVELOPPER_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPPER_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Developper Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPPER_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl <em>End User Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getEndUserFeature()
	 * @generated
	 */
	int END_USER_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Tested By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_FEATURE__IS_TESTED_BY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessible Through</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_FEATURE__ACCESSIBLE_THROUGH = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End User Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.APIImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getAPI()
	 * @generated
	 */
	int API = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = DEVELOPPER_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Available Through</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__AVAILABLE_THROUGH = DEVELOPPER_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tested By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TESTED_BY = DEVELOPPER_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = DEVELOPPER_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getUnitTest()
	 * @generated
	 */
	int UNIT_TEST = 6;

	/**
	 * The feature id for the '<em><b>Junit Class Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__JUNIT_CLASS_QUALIFIED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Testing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__IS_TESTING = 1;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.ProjectImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Unit Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__UNIT_TESTS = 1;

	/**
	 * The feature id for the '<em><b>Acceptance Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACCEPTANCE_TESTS = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getAcceptanceTest()
	 * @generated
	 */
	int ACCEPTANCE_TEST = 8;

	/**
	 * The feature id for the '<em><b>Swt Bot Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__SWT_BOT_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Testing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__IS_TESTING = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BUNDLES = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INTERACTIONS = 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.InteractionImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 10;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.CategoryImpl
	 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.retro.Bundle#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exports</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Bundle#getExports()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Exports();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.Bundle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Bundle#getId()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Bundle#getDefine <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Define</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Bundle#getDefine()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Define();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.NameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Space</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.NameSpace
	 * @generated
	 */
	EClass getNameSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.NameSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.NameSpace#getId()
	 * @see #getNameSpace()
	 * @generated
	 */
	EAttribute getNameSpace_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.retro.NameSpace#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.NameSpace#getCategory()
	 * @see #getNameSpace()
	 * @generated
	 */
	EReference getNameSpace_Category();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.DevelopperFeature <em>Developper Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developper Feature</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.DevelopperFeature
	 * @generated
	 */
	EClass getDevelopperFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature <em>End User Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End User Feature</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.EndUserFeature
	 * @generated
	 */
	EClass getEndUserFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy <em>Is Tested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Tested By</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy()
	 * @see #getEndUserFeature()
	 * @generated
	 */
	EReference getEndUserFeature_IsTestedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getAccessibleThrough <em>Accessible Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessible Through</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getAccessibleThrough()
	 * @see #getEndUserFeature()
	 * @generated
	 */
	EReference getEndUserFeature_AccessibleThrough();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.retro.API#getAvailableThrough <em>Available Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Through</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.API#getAvailableThrough()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_AvailableThrough();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.retro.API#getTestedBy <em>Tested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tested By</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.API#getTestedBy()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_TestedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.UnitTest
	 * @generated
	 */
	EClass getUnitTest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getJunitClassQualifiedName <em>Junit Class Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Junit Class Qualified Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.UnitTest#getJunitClassQualifiedName()
	 * @see #getUnitTest()
	 * @generated
	 */
	EAttribute getUnitTest_JunitClassQualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getIsTesting <em>Is Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Testing</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.UnitTest#getIsTesting()
	 * @see #getUnitTest()
	 * @generated
	 */
	EReference getUnitTest_IsTesting();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.Project#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Project#getId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Project#getUnitTests <em>Unit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Tests</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Project#getUnitTests()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_UnitTests();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Project#getAcceptanceTests <em>Acceptance Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Tests</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Project#getAcceptanceTests()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_AcceptanceTests();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.AcceptanceTest
	 * @generated
	 */
	EClass getAcceptanceTest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getSwtBotClassName <em>Swt Bot Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swt Bot Class Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getSwtBotClassName()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EAttribute getAcceptanceTest_SwtBotClassName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getIsTesting <em>Is Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Testing</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getIsTesting()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EReference getAcceptanceTest_IsTesting();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getPackage()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	EAttribute getAcceptanceTest_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Product#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product#getBundles()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Bundles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Product#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product#getCategories()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.retro.Product#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Product#getInteractions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Interactions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.retro.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.retro.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.retro.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RetroFactory getRetroFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.BundleImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXPORTS = eINSTANCE.getBundle_Exports();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__ID = eINSTANCE.getBundle_Id();

		/**
		 * The meta object literal for the '<em><b>Define</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__DEFINE = eINSTANCE.getBundle_Define();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.NameSpaceImpl <em>Name Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.NameSpaceImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getNameSpace()
		 * @generated
		 */
		EClass NAME_SPACE = eINSTANCE.getNameSpace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_SPACE__ID = eINSTANCE.getNameSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_SPACE__CATEGORY = eINSTANCE.getNameSpace_Category();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.DevelopperFeatureImpl <em>Developper Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.DevelopperFeatureImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getDevelopperFeature()
		 * @generated
		 */
		EClass DEVELOPPER_FEATURE = eINSTANCE.getDevelopperFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl <em>End User Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getEndUserFeature()
		 * @generated
		 */
		EClass END_USER_FEATURE = eINSTANCE.getEndUserFeature();

		/**
		 * The meta object literal for the '<em><b>Is Tested By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_USER_FEATURE__IS_TESTED_BY = eINSTANCE.getEndUserFeature_IsTestedBy();

		/**
		 * The meta object literal for the '<em><b>Accessible Through</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_USER_FEATURE__ACCESSIBLE_THROUGH = eINSTANCE.getEndUserFeature_AccessibleThrough();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.FeatureImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.APIImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Available Through</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__AVAILABLE_THROUGH = eINSTANCE.getAPI_AvailableThrough();

		/**
		 * The meta object literal for the '<em><b>Tested By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__TESTED_BY = eINSTANCE.getAPI_TestedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getUnitTest()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnitTest();

		/**
		 * The meta object literal for the '<em><b>Junit Class Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__JUNIT_CLASS_QUALIFIED_NAME = eINSTANCE.getUnitTest_JunitClassQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Is Testing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST__IS_TESTING = eINSTANCE.getUnitTest_IsTesting();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.ProjectImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_Id();

		/**
		 * The meta object literal for the '<em><b>Unit Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__UNIT_TESTS = eINSTANCE.getProject_UnitTests();

		/**
		 * The meta object literal for the '<em><b>Acceptance Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ACCEPTANCE_TESTS = eINSTANCE.getProject_AcceptanceTests();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getAcceptanceTest()
		 * @generated
		 */
		EClass ACCEPTANCE_TEST = eINSTANCE.getAcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Swt Bot Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_TEST__SWT_BOT_CLASS_NAME = eINSTANCE.getAcceptanceTest_SwtBotClassName();

		/**
		 * The meta object literal for the '<em><b>Is Testing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPTANCE_TEST__IS_TESTING = eINSTANCE.getAcceptanceTest_IsTesting();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTANCE_TEST__PACKAGE = eINSTANCE.getAcceptanceTest_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__BUNDLES = eINSTANCE.getProduct_Bundles();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORIES = eINSTANCE.getProduct_Categories();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__INTERACTIONS = eINSTANCE.getProduct_Interactions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.InteractionImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.retro.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.CategoryImpl
		 * @see org.eclipse.mylyn.docs.intent.retro.impl.RetroPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

	}

} //RetroPackage
