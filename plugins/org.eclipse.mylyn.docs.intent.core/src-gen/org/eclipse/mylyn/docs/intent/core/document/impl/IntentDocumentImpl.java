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
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentDocumentImpl extends IntentStructuredElementImpl implements IntentDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntentChapter> getChapters() {
		return (EList<IntentChapter>)eGet(IntentDocumentPackage.Literals.INTENT_DOCUMENT__CHAPTERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntentHeaderDeclaration> getHeaders() {
		return (EList<IntentHeaderDeclaration>)eGet(IntentDocumentPackage.Literals.INTENT_DOCUMENT__HEADERS,
				true);
	}

} //IntentDocumentImpl
