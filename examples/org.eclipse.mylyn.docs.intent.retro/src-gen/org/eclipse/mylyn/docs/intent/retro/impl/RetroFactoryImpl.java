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
package org.eclipse.mylyn.docs.intent.retro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mylyn.docs.intent.retro.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RetroFactoryImpl extends EFactoryImpl implements RetroFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RetroFactory init() {
		try {
			RetroFactory theRetroFactory = (RetroFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/mylyn/intent/retro"); 
			if (theRetroFactory != null) {
				return theRetroFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RetroFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetroFactoryImpl() {
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
			case RetroPackage.BUNDLE: return (EObject)createBundle();
			case RetroPackage.NAME_SPACE: return (EObject)createNameSpace();
			case RetroPackage.DEVELOPPER_FEATURE: return (EObject)createDevelopperFeature();
			case RetroPackage.END_USER_FEATURE: return (EObject)createEndUserFeature();
			case RetroPackage.API: return (EObject)createAPI();
			case RetroPackage.UNIT_TEST: return (EObject)createUnitTest();
			case RetroPackage.PROJECT: return (EObject)createProject();
			case RetroPackage.ACCEPTANCE_TEST: return (EObject)createAcceptanceTest();
			case RetroPackage.PRODUCT: return (EObject)createProduct();
			case RetroPackage.INTERACTION: return (EObject)createInteraction();
			case RetroPackage.CATEGORY: return (EObject)createCategory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameSpace createNameSpace() {
		NameSpaceImpl nameSpace = new NameSpaceImpl();
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopperFeature createDevelopperFeature() {
		DevelopperFeatureImpl developperFeature = new DevelopperFeatureImpl();
		return developperFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUserFeature createEndUserFeature() {
		EndUserFeatureImpl endUserFeature = new EndUserFeatureImpl();
		return endUserFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest createUnitTest() {
		UnitTestImpl unitTest = new UnitTestImpl();
		return unitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest createAcceptanceTest() {
		AcceptanceTestImpl acceptanceTest = new AcceptanceTestImpl();
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetroPackage getRetroPackage() {
		return (RetroPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RetroPackage getPackage() {
		return RetroPackage.eINSTANCE;
	}

} //RetroFactoryImpl
