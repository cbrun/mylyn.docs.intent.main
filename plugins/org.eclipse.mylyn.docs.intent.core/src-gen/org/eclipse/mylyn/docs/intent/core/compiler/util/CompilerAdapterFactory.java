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
package org.eclipse.mylyn.docs.intent.core.compiler.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage
 * @generated
 */
public class CompilerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompilerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CompilerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance
	 * object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CompilerSwitch<Adapter> modelSwitch = new CompilerSwitch<Adapter>() {
		@Override
		public Adapter caseEStringToEObject(Map.Entry<String, EObject> object) {
			return createEStringToEObjectAdapter();
		}

		@Override
		public Adapter caseTextualReferenceToContributions(
				Map.Entry<String, EList<UnresolvedContributionHolder>> object) {
			return createTextualReferenceToContributionsAdapter();
		}

		@Override
		public Adapter caseStringToEObjectMap(StringToEObjectMap object) {
			return createStringToEObjectMapAdapter();
		}

		@Override
		public Adapter caseETypeToStringToEObjectMap(Map.Entry<EClassifier, StringToEObjectMap> object) {
			return createETypeToStringToEObjectMapAdapter();
		}

		@Override
		public Adapter caseEObjectToUnresolvedReferencesList(
				Map.Entry<EObject, EList<UnresolvedReferenceHolder>> object) {
			return createEObjectToUnresolvedReferencesListAdapter();
		}

		@Override
		public Adapter caseResourceToContainedElementsMapEntry(
				Map.Entry<ResourceDeclaration, EList<EObject>> object) {
			return createResourceToContainedElementsMapEntryAdapter();
		}

		@Override
		public Adapter caseModelingUnitToStatusList(Map.Entry<ModelingUnit, EList<CompilationStatus>> object) {
			return createModelingUnitToStatusListAdapter();
		}

		@Override
		public Adapter caseCreatedElementToInstructionMapEntry(Map.Entry<EObject, UnitInstruction> object) {
			return createCreatedElementToInstructionMapEntryAdapter();
		}

		@Override
		public Adapter caseUnresolvedReferenceHolder(UnresolvedReferenceHolder object) {
			return createUnresolvedReferenceHolderAdapter();
		}

		@Override
		public Adapter caseCompilationStatus(CompilationStatus object) {
			return createCompilationStatusAdapter();
		}

		@Override
		public Adapter caseCompilationStatusManager(CompilationStatusManager object) {
			return createCompilationStatusManagerAdapter();
		}

		@Override
		public Adapter caseCompilationInformationHolder(CompilationInformationHolder object) {
			return createCompilationInformationHolderAdapter();
		}

		@Override
		public Adapter caseUnresolvedContributionHolder(UnresolvedContributionHolder object) {
			return createUnresolvedContributionHolderAdapter();
		}

		@Override
		public Adapter caseTraceabilityIndex(TraceabilityIndex object) {
			return createTraceabilityIndexAdapter();
		}

		@Override
		public Adapter caseTraceabilityIndexEntry(TraceabilityIndexEntry object) {
			return createTraceabilityIndexEntryAdapter();
		}

		@Override
		public Adapter caseCompiledElementToInstructionEntry(Map.Entry<EObject, IntentGenericElement> object) {
			return createCompiledElementToInstructionEntryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To EObject</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Textual Reference To Contributions</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createTextualReferenceToContributionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap <em>String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap
	 * @generated
	 */
	public Adapter createStringToEObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EType To String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createETypeToStringToEObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EObject To Unresolved References List</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEObjectToUnresolvedReferencesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Resource To Contained Elements Map Entry</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createResourceToContainedElementsMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Modeling Unit To Status List</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createModelingUnitToStatusListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Created Element To Instruction Map Entry</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createCreatedElementToInstructionMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder <em>Unresolved Reference Holder</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder
	 * @generated
	 */
	public Adapter createUnresolvedReferenceHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus <em>Compilation Status</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus
	 * @generated
	 */
	public Adapter createCompilationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager <em>Compilation Status Manager</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager
	 * @generated
	 */
	public Adapter createCompilationStatusManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder <em>Compilation Information Holder</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder
	 * @generated
	 */
	public Adapter createCompilationInformationHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder <em>Unresolved Contribution Holder</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder
	 * @generated
	 */
	public Adapter createUnresolvedContributionHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex <em>Traceability Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex
	 * @generated
	 */
	public Adapter createTraceabilityIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry <em>Traceability Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry
	 * @generated
	 */
	public Adapter createTraceabilityIndexEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Compiled Element To Instruction Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createCompiledElementToInstructionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // CompilerAdapterFactory
