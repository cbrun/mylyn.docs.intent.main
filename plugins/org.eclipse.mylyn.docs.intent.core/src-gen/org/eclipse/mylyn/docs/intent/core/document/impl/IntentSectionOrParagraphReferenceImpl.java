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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Section Or Paragraph Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionOrParagraphReferenceImpl#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentSectionOrParagraphReferenceImpl extends IntentReferenceImpl implements IntentSectionOrParagraphReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSectionOrParagraphReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_SECTION_OR_PARAGRAPH_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement getReferencedObject() {
		return (StructureElement)eGet(
				IntentDocumentPackage.Literals.INTENT_SECTION_OR_PARAGRAPH_REFERENCE__REFERENCED_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedObject(StructureElement newReferencedObject) {
		eSet(IntentDocumentPackage.Literals.INTENT_SECTION_OR_PARAGRAPH_REFERENCE__REFERENCED_OBJECT,
				newReferencedObject);
	}

} //IntentSectionOrParagraphReferenceImpl
