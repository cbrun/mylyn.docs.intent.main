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
package org.eclipse.mylyn.docs.intent.core.document;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage
 * @generated
 */
public interface IntentDocumentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentDocumentFactory eINSTANCE = org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Intent Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Generic Element</em>'.
	 * @generated
	 */
	IntentGenericElement createIntentGenericElement();

	/**
	 * Returns a new object of class '<em>Intent Section Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Section Reference</em>'.
	 * @generated
	 */
	IntentSectionReference createIntentSectionReference();

	/**
	 * Returns a new object of class '<em>Intent Section Or Paragraph Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Section Or Paragraph Reference</em>'.
	 * @generated
	 */
	IntentSectionOrParagraphReference createIntentSectionOrParagraphReference();

	/**
	 * Returns a new object of class '<em>Intent Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Document</em>'.
	 * @generated
	 */
	IntentDocument createIntentDocument();

	/**
	 * Returns a new object of class '<em>Intent Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Chapter</em>'.
	 * @generated
	 */
	IntentChapter createIntentChapter();

	/**
	 * Returns a new object of class '<em>Intent Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Section</em>'.
	 * @generated
	 */
	IntentSection createIntentSection();

	/**
	 * Returns a new object of class '<em>Intent Header Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Header Declaration</em>'.
	 * @generated
	 */
	IntentHeaderDeclaration createIntentHeaderDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntentDocumentPackage getIntentDocumentPackage();

} //IntentDocumentFactory
