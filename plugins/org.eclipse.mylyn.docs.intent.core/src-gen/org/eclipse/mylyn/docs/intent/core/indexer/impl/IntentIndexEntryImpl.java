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
package org.eclipse.mylyn.docs.intent.core.indexer.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Index Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl#getSubEntries <em>Sub Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentIndexEntryImpl extends CDOObjectImpl implements IntentIndexEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentIndexEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY;
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
		return (String)eGet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INDEX_ENTRY_TYPE getType() {
		return (INDEX_ENTRY_TYPE)eGet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(INDEX_ENTRY_TYPE newType) {
		eSet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentGenericElement getReferencedElement() {
		return (IntentGenericElement)eGet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(IntentGenericElement newReferencedElement) {
		eSet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntentIndexEntry> getSubEntries() {
		return (EList<IntentIndexEntry>)eGet(IntentIndexerPackage.Literals.INTENT_INDEX_ENTRY__SUB_ENTRIES, true);
	}

} //IntentIndexEntryImpl
