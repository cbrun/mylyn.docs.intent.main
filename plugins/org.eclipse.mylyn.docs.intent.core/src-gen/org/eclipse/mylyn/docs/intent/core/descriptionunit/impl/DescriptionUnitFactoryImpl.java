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
package org.eclipse.mylyn.docs.intent.core.descriptionunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitFactory;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionUnitFactoryImpl extends EFactoryImpl implements DescriptionUnitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptionUnitFactory init() {
		try {
			DescriptionUnitFactory theDescriptionUnitFactory = (DescriptionUnitFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/intent/descriptionunit/0.7");
			if (theDescriptionUnitFactory != null) {
				return theDescriptionUnitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DescriptionUnitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionUnitFactoryImpl() {
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
			case DescriptionUnitPackage.DESCRIPTION_UNIT:
				return (EObject)createDescriptionUnit();
			case DescriptionUnitPackage.DESCRIPTION_BLOC:
				return (EObject)createDescriptionBloc();
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
	public DescriptionUnit createDescriptionUnit() {
		DescriptionUnitImpl descriptionUnit = new DescriptionUnitImpl();
		return descriptionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBloc createDescriptionBloc() {
		DescriptionBlocImpl descriptionBloc = new DescriptionBlocImpl();
		return descriptionBloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionUnitPackage getDescriptionUnitPackage() {
		return (DescriptionUnitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DescriptionUnitPackage getPackage() {
		return DescriptionUnitPackage.eINSTANCE;
	}

} //DescriptionUnitFactoryImpl
