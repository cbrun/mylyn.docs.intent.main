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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Header Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl#getAnnotationMappings <em>Annotation Mappings</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentHeaderDeclarationImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentHeaderDeclarationImpl extends CDOObjectImpl implements IntentHeaderDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentHeaderDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Object> getImports() {
		return (EList<Object>)eGet(IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Object> getAnnotationMappings() {
		return (EMap<String, Object>)eGet(
				IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__ANNOTATION_MAPPINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReference getResource() {
		return (ResourceReference)eGet(IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__RESOURCE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(ResourceReference newResource) {
		eSet(IntentDocumentPackage.Literals.INTENT_HEADER_DECLARATION__RESOURCE, newResource);
	}

} //IntentHeaderDeclarationImpl
