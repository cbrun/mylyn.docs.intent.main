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
package org.eclipse.mylyn.docs.intent.core.modelingunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentReferenceImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ResourceReferenceImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ResourceReferenceImpl#isLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceReferenceImpl extends IntentReferenceImpl implements ResourceReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingUnitPackage.Literals.RESOURCE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration getReferencedElement() {
		return (ResourceDeclaration)eGet(ModelingUnitPackage.Literals.RESOURCE_REFERENCE__REFERENCED_ELEMENT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(ResourceDeclaration newReferencedElement) {
		eSet(ModelingUnitPackage.Literals.RESOURCE_REFERENCE__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLineBreak() {
		return (Boolean)eGet(ModelingUnitPackage.Literals.RESOURCE_REFERENCE__LINE_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(boolean newLineBreak) {
		eSet(ModelingUnitPackage.Literals.RESOURCE_REFERENCE__LINE_BREAK, newLineBreak);
	}

} //ResourceReferenceImpl
