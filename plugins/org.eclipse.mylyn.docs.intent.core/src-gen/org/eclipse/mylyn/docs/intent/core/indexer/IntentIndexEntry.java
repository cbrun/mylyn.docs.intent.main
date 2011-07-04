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
package org.eclipse.mylyn.docs.intent.core.indexer;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Index Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getSubEntries <em>Sub Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getIntentIndexEntry()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IntentIndexEntry extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getIntentIndexEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE
	 * @see #setType(INDEX_ENTRY_TYPE)
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getIntentIndexEntry_Type()
	 * @model required="true"
	 * @generated
	 */
	INDEX_ENTRY_TYPE getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(INDEX_ENTRY_TYPE value);

	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(IntentGenericElement)
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getIntentIndexEntry_ReferencedElement()
	 * @model
	 * @generated
	 */
	IntentGenericElement getReferencedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(IntentGenericElement value);

	/**
	 * Returns the value of the '<em><b>Sub Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Entries</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getIntentIndexEntry_SubEntries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<IntentIndexEntry> getSubEntries();

} // IntentIndexEntry
