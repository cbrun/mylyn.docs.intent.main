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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory
 * @model kind="package"
 * @generated
 */
public interface IntentIndexerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "indexer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/indexer/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentIndexer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentIndexerPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexImpl <em>Intent Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexImpl
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getIntentIndex()
	 * @generated
	 */
	int INTENT_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Intent Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl <em>Intent Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getIntentIndexEntry()
	 * @generated
	 */
	int INTENT_INDEX_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_ENTRY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_ENTRY__REFERENCED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Sub Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_ENTRY__SUB_ENTRIES = 3;

	/**
	 * The number of structural features of the '<em>Intent Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_INDEX_ENTRY_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE <em>INDEX ENTRY TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getINDEX_ENTRY_TYPE()
	 * @generated
	 */
	int INDEX_ENTRY_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex <em>Intent Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Index</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex
	 * @generated
	 */
	EClass getIntentIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex#getEntries()
	 * @see #getIntentIndex()
	 * @generated
	 */
	EReference getIntentIndex_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry <em>Intent Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Index Entry</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry
	 * @generated
	 */
	EClass getIntentIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getName()
	 * @see #getIntentIndexEntry()
	 * @generated
	 */
	EAttribute getIntentIndexEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getType()
	 * @see #getIntentIndexEntry()
	 * @generated
	 */
	EAttribute getIntentIndexEntry_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getReferencedElement()
	 * @see #getIntentIndexEntry()
	 * @generated
	 */
	EReference getIntentIndexEntry_ReferencedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getSubEntries <em>Sub Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Entries</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry#getSubEntries()
	 * @see #getIntentIndexEntry()
	 * @generated
	 */
	EReference getIntentIndexEntry_SubEntries();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE <em>INDEX ENTRY TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INDEX ENTRY TYPE</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE
	 * @generated
	 */
	EEnum getINDEX_ENTRY_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntentIndexerFactory getIntentIndexerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexImpl <em>Intent Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexImpl
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getIntentIndex()
		 * @generated
		 */
		EClass INTENT_INDEX = eINSTANCE.getIntentIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_INDEX__ENTRIES = eINSTANCE.getIntentIndex_Entries();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl <em>Intent Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getIntentIndexEntry()
		 * @generated
		 */
		EClass INTENT_INDEX_ENTRY = eINSTANCE.getIntentIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_INDEX_ENTRY__NAME = eINSTANCE.getIntentIndexEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_INDEX_ENTRY__TYPE = eINSTANCE.getIntentIndexEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_INDEX_ENTRY__REFERENCED_ELEMENT = eINSTANCE.getIntentIndexEntry_ReferencedElement();

		/**
		 * The meta object literal for the '<em><b>Sub Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_INDEX_ENTRY__SUB_ENTRIES = eINSTANCE.getIntentIndexEntry_SubEntries();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE <em>INDEX ENTRY TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE
		 * @see org.eclipse.mylyn.docs.intent.core.indexer.impl.IntentIndexerPackageImpl#getINDEX_ENTRY_TYPE()
		 * @generated
		 */
		EEnum INDEX_ENTRY_TYPE = eINSTANCE.getINDEX_ENTRY_TYPE();

	}

} //IntentIndexerPackage
