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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adressed Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.AdressedAnnotationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdressedAnnotationImpl extends UnitInstructionImpl implements AdressedAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdressedAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.ADRESSED_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getReceiver() {
		return (EList<String>)eGet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__RECEIVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eGet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eSet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return (String)eGet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eSet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(GenericUnitPackage.Literals.ADRESSED_ANNOTATION__TYPE, newType);
	}

} //AdressedAnnotationImpl
