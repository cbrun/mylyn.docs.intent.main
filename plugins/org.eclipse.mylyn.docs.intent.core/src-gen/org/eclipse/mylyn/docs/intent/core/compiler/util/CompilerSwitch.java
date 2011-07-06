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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap;
import org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the
 * model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a
 * non-null result is returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage
 * @generated
 */
public class CompilerSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompilerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerSwitch() {
		if (modelPackage == null) {
			modelPackage = CompilerPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CompilerPackage.ESTRING_TO_EOBJECT: {
				@SuppressWarnings("unchecked")
				Map.Entry<String, EObject> eStringToEObject = (Map.Entry<String, EObject>)theEObject;
				T result = caseEStringToEObject(eStringToEObject);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.TEXTUAL_REFERENCE_TO_CONTRIBUTIONS: {
				@SuppressWarnings("unchecked")
				Map.Entry<String, EList<UnresolvedContributionHolder>> textualReferenceToContributions = (Map.Entry<String, EList<UnresolvedContributionHolder>>)theEObject;
				T result = caseTextualReferenceToContributions(textualReferenceToContributions);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.STRING_TO_EOBJECT_MAP: {
				StringToEObjectMap stringToEObjectMap = (StringToEObjectMap)theEObject;
				T result = caseStringToEObjectMap(stringToEObjectMap);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.ETYPE_TO_STRING_TO_EOBJECT_MAP: {
				@SuppressWarnings("unchecked")
				Map.Entry<EClassifier, StringToEObjectMap> eTypeToStringToEObjectMap = (Map.Entry<EClassifier, StringToEObjectMap>)theEObject;
				T result = caseETypeToStringToEObjectMap(eTypeToStringToEObjectMap);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.EOBJECT_TO_UNRESOLVED_REFERENCES_LIST: {
				@SuppressWarnings("unchecked")
				Map.Entry<EObject, EList<UnresolvedReferenceHolder>> eObjectToUnresolvedReferencesList = (Map.Entry<EObject, EList<UnresolvedReferenceHolder>>)theEObject;
				T result = caseEObjectToUnresolvedReferencesList(eObjectToUnresolvedReferencesList);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY: {
				@SuppressWarnings("unchecked")
				Map.Entry<ResourceDeclaration, EList<EObject>> resourceToContainedElementsMapEntry = (Map.Entry<ResourceDeclaration, EList<EObject>>)theEObject;
				T result = caseResourceToContainedElementsMapEntry(resourceToContainedElementsMapEntry);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.MODELING_UNIT_TO_STATUS_LIST: {
				@SuppressWarnings("unchecked")
				Map.Entry<ModelingUnit, EList<CompilationStatus>> modelingUnitToStatusList = (Map.Entry<ModelingUnit, EList<CompilationStatus>>)theEObject;
				T result = caseModelingUnitToStatusList(modelingUnitToStatusList);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY: {
				@SuppressWarnings("unchecked")
				Map.Entry<EObject, UnitInstruction> createdElementToInstructionMapEntry = (Map.Entry<EObject, UnitInstruction>)theEObject;
				T result = caseCreatedElementToInstructionMapEntry(createdElementToInstructionMapEntry);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.UNRESOLVED_REFERENCE_HOLDER: {
				UnresolvedReferenceHolder unresolvedReferenceHolder = (UnresolvedReferenceHolder)theEObject;
				T result = caseUnresolvedReferenceHolder(unresolvedReferenceHolder);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.COMPILATION_STATUS: {
				CompilationStatus compilationStatus = (CompilationStatus)theEObject;
				T result = caseCompilationStatus(compilationStatus);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.COMPILATION_STATUS_MANAGER: {
				CompilationStatusManager compilationStatusManager = (CompilationStatusManager)theEObject;
				T result = caseCompilationStatusManager(compilationStatusManager);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.COMPILATION_INFORMATION_HOLDER: {
				CompilationInformationHolder compilationInformationHolder = (CompilationInformationHolder)theEObject;
				T result = caseCompilationInformationHolder(compilationInformationHolder);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.UNRESOLVED_CONTRIBUTION_HOLDER: {
				UnresolvedContributionHolder unresolvedContributionHolder = (UnresolvedContributionHolder)theEObject;
				T result = caseUnresolvedContributionHolder(unresolvedContributionHolder);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.TRACEABILITY_INDEX: {
				TraceabilityIndex traceabilityIndex = (TraceabilityIndex)theEObject;
				T result = caseTraceabilityIndex(traceabilityIndex);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.TRACEABILITY_INDEX_ENTRY: {
				TraceabilityIndexEntry traceabilityIndexEntry = (TraceabilityIndexEntry)theEObject;
				T result = caseTraceabilityIndexEntry(traceabilityIndexEntry);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY: {
				@SuppressWarnings("unchecked")
				Map.Entry<EObject, IntentGenericElement> compiledElementToInstructionEntry = (Map.Entry<EObject, IntentGenericElement>)theEObject;
				T result = caseCompiledElementToInstructionEntry(compiledElementToInstructionEntry);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CompilerPackage.SYNCHRONIZER_COMPILATION_STATUS: {
				SynchronizerCompilationStatus synchronizerCompilationStatus = (SynchronizerCompilationStatus)theEObject;
				T result = caseSynchronizerCompilationStatus(synchronizerCompilationStatus);
				if (result == null)
					result = caseCompilationStatus(synchronizerCompilationStatus);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the
	 * switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToEObject(Map.Entry<String, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Reference To Contributions</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Reference To Contributions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualReferenceToContributions(Map.Entry<String, EList<UnresolvedContributionHolder>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To EObject Map</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the
	 * switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To EObject Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToEObjectMap(StringToEObjectMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType To String To EObject Map</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType To String To EObject Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypeToStringToEObjectMap(Map.Entry<EClassifier, StringToEObjectMap> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject To Unresolved References List</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject To Unresolved References List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectToUnresolvedReferencesList(Map.Entry<EObject, EList<UnresolvedReferenceHolder>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource To Contained Elements Map Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource To Contained Elements Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceToContainedElementsMapEntry(Map.Entry<ResourceDeclaration, EList<EObject>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Unit To Status List</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Unit To Status List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingUnitToStatusList(Map.Entry<ModelingUnit, EList<CompilationStatus>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Created Element To Instruction Map Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Created Element To Instruction Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatedElementToInstructionMapEntry(Map.Entry<EObject, UnitInstruction> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Reference Holder</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Reference Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedReferenceHolder(UnresolvedReferenceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Status</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the
	 * switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationStatus(CompilationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Status Manager</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Status Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationStatusManager(CompilationStatusManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Information Holder</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Information Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationInformationHolder(CompilationInformationHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Contribution Holder</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Contribution Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedContributionHolder(UnresolvedContributionHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceabilityIndex(TraceabilityIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability Index Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceabilityIndexEntry(TraceabilityIndexEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compiled Element To Instruction Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compiled Element To Instruction Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompiledElementToInstructionEntry(Map.Entry<EObject, IntentGenericElement> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizer Compilation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizer Compilation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizerCompilationStatus(SynchronizerCompilationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch, but this
	 * is the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // CompilerSwitch
