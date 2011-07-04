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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Structured Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl#getCompilationStatus <em>Compilation Status</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentStructuredElementImpl#getFormattedTitle <em>Formatted Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntentStructuredElementImpl extends SectionImpl implements IntentStructuredElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentStructuredElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_STRUCTURED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompilationStatus> getCompilationStatus() {
		return (EList<CompilationStatus>)eGet(
				IntentDocumentPackage.Literals.INTENT_GENERIC_ELEMENT__COMPILATION_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormattedTitle() {
		return (String)eGet(IntentDocumentPackage.Literals.INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormattedTitle(String newFormattedTitle) {
		eSet(IntentDocumentPackage.Literals.INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE, newFormattedTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IntentGenericElement.class) {
			switch (derivedFeatureID) {
				case IntentDocumentPackage.INTENT_STRUCTURED_ELEMENT__COMPILATION_STATUS:
					return IntentDocumentPackage.INTENT_GENERIC_ELEMENT__COMPILATION_STATUS;
				default:
					return -1;
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
		if (baseClass == IntentGenericElement.class) {
			switch (baseFeatureID) {
				case IntentDocumentPackage.INTENT_GENERIC_ELEMENT__COMPILATION_STATUS:
					return IntentDocumentPackage.INTENT_STRUCTURED_ELEMENT__COMPILATION_STATUS;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IntentStructuredElementImpl
