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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl#getLabelValue <em>Label Value</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl#getTextToPrint <em>Text To Print</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.LabelDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelDeclarationImpl extends UnitInstructionImpl implements LabelDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.LABEL_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelValue() {
		return (String)eGet(GenericUnitPackage.Literals.LABEL_DECLARATION__LABEL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelValue(String newLabelValue) {
		eSet(GenericUnitPackage.Literals.LABEL_DECLARATION__LABEL_VALUE, newLabelValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextToPrint() {
		return (String)eGet(GenericUnitPackage.Literals.LABEL_DECLARATION__TEXT_TO_PRINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextToPrint(String newTextToPrint) {
		eSet(GenericUnitPackage.Literals.LABEL_DECLARATION__TEXT_TO_PRINT, newTextToPrint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLabel getType() {
		return (TypeLabel)eGet(GenericUnitPackage.Literals.LABEL_DECLARATION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeLabel newType) {
		eSet(GenericUnitPackage.Literals.LABEL_DECLARATION__TYPE, newType);
	}

} //LabelDeclarationImpl
