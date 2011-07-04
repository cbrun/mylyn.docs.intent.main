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
package org.eclipse.mylyn.docs.intent.markup.markup.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TextImpl#isLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends BlockContentImpl implements Text {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAttributes() {
		return (Annotations)eGet(MarkupPackage.Literals.HAS_ATTRIBUTES__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Annotations newAttributes) {
		eSet(MarkupPackage.Literals.HAS_ATTRIBUTES__ATTRIBUTES, newAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return (String)eGet(MarkupPackage.Literals.TEXT__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		eSet(MarkupPackage.Literals.TEXT__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Formatting> getFormat() {
		return (EList<Formatting>)eGet(MarkupPackage.Literals.TEXT__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLineBreak() {
		return (Boolean)eGet(MarkupPackage.Literals.TEXT__LINE_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(boolean newLineBreak) {
		eSet(MarkupPackage.Literals.TEXT__LINE_BREAK, newLineBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasAttributes.class) {
			switch (derivedFeatureID) {
				case MarkupPackage.TEXT__ATTRIBUTES: return MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasAttributes.class) {
			switch (baseFeatureID) {
				case MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES: return MarkupPackage.TEXT__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TextImpl
