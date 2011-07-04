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
package org.eclipse.mylyn.docs.intent.core.compiler.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class CompilerFactoryImpl extends EFactoryImpl implements CompilerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static CompilerFactory init() {
		try {
			CompilerFactory theCompilerFactory = (CompilerFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/intent/compilerinfos/0.7");
			if (theCompilerFactory != null) {
				return theCompilerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompilerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompilerPackage.ESTRING_TO_EOBJECT:
				return (EObject)createEStringToEObject();
			case CompilerPackage.TEXTUAL_REFERENCE_TO_CONTRIBUTIONS:
				return (EObject)createTextualReferenceToContributions();
			case CompilerPackage.STRING_TO_EOBJECT_MAP:
				return (EObject)createStringToEObjectMap();
			case CompilerPackage.ETYPE_TO_STRING_TO_EOBJECT_MAP:
				return (EObject)createETypeToStringToEObjectMap();
			case CompilerPackage.EOBJECT_TO_UNRESOLVED_REFERENCES_LIST:
				return (EObject)createEObjectToUnresolvedReferencesList();
			case CompilerPackage.RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY:
				return (EObject)createResourceToContainedElementsMapEntry();
			case CompilerPackage.MODELING_UNIT_TO_STATUS_LIST:
				return (EObject)createModelingUnitToStatusList();
			case CompilerPackage.CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY:
				return (EObject)createCreatedElementToInstructionMapEntry();
			case CompilerPackage.UNRESOLVED_REFERENCE_HOLDER:
				return (EObject)createUnresolvedReferenceHolder();
			case CompilerPackage.COMPILATION_STATUS:
				return (EObject)createCompilationStatus();
			case CompilerPackage.COMPILATION_STATUS_MANAGER:
				return (EObject)createCompilationStatusManager();
			case CompilerPackage.COMPILATION_INFORMATION_HOLDER:
				return (EObject)createCompilationInformationHolder();
			case CompilerPackage.UNRESOLVED_CONTRIBUTION_HOLDER:
				return (EObject)createUnresolvedContributionHolder();
			case CompilerPackage.TRACEABILITY_INDEX:
				return (EObject)createTraceabilityIndex();
			case CompilerPackage.TRACEABILITY_INDEX_ENTRY:
				return (EObject)createTraceabilityIndexEntry();
			case CompilerPackage.COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY:
				return (EObject)createCompiledElementToInstructionEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CompilerPackage.COMPILATION_STATUS_SEVERITY:
				return createCompilationStatusSeverityFromString(eDataType, initialValue);
			case CompilerPackage.COMPILATION_MESSAGE_TYPE:
				return createCompilationMessageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CompilerPackage.COMPILATION_STATUS_SEVERITY:
				return convertCompilationStatusSeverityToString(eDataType, instanceValue);
			case CompilerPackage.COMPILATION_MESSAGE_TYPE:
				return convertCompilationMessageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createEStringToEObject() {
		EStringToEObjectImpl eStringToEObject = new EStringToEObjectImpl();
		return eStringToEObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<UnresolvedContributionHolder>> createTextualReferenceToContributions() {
		TextualReferenceToContributionsImpl textualReferenceToContributions = new TextualReferenceToContributionsImpl();
		return textualReferenceToContributions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StringToEObjectMap createStringToEObjectMap() {
		StringToEObjectMapImpl stringToEObjectMap = new StringToEObjectMapImpl();
		return stringToEObjectMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EClassifier, StringToEObjectMap> createETypeToStringToEObjectMap() {
		ETypeToStringToEObjectMapImpl eTypeToStringToEObjectMap = new ETypeToStringToEObjectMapImpl();
		return eTypeToStringToEObjectMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, EList<UnresolvedReferenceHolder>> createEObjectToUnresolvedReferencesList() {
		EObjectToUnresolvedReferencesListImpl eObjectToUnresolvedReferencesList = new EObjectToUnresolvedReferencesListImpl();
		return eObjectToUnresolvedReferencesList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ResourceDeclaration, EList<EObject>> createResourceToContainedElementsMapEntry() {
		ResourceToContainedElementsMapEntryImpl resourceToContainedElementsMapEntry = new ResourceToContainedElementsMapEntryImpl();
		return resourceToContainedElementsMapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ModelingUnit, EList<CompilationStatus>> createModelingUnitToStatusList() {
		ModelingUnitToStatusListImpl modelingUnitToStatusList = new ModelingUnitToStatusListImpl();
		return modelingUnitToStatusList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, UnitInstruction> createCreatedElementToInstructionMapEntry() {
		CreatedElementToInstructionMapEntryImpl createdElementToInstructionMapEntry = new CreatedElementToInstructionMapEntryImpl();
		return createdElementToInstructionMapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedReferenceHolder createUnresolvedReferenceHolder() {
		UnresolvedReferenceHolderImpl unresolvedReferenceHolder = new UnresolvedReferenceHolderImpl();
		return unresolvedReferenceHolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationStatus createCompilationStatus() {
		CompilationStatusImpl compilationStatus = new CompilationStatusImpl();
		return compilationStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationStatusManager createCompilationStatusManager() {
		CompilationStatusManagerImpl compilationStatusManager = new CompilationStatusManagerImpl();
		return compilationStatusManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationInformationHolder createCompilationInformationHolder() {
		CompilationInformationHolderImpl compilationInformationHolder = new CompilationInformationHolderImpl();
		return compilationInformationHolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedContributionHolder createUnresolvedContributionHolder() {
		UnresolvedContributionHolderImpl unresolvedContributionHolder = new UnresolvedContributionHolderImpl();
		return unresolvedContributionHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityIndex createTraceabilityIndex() {
		TraceabilityIndexImpl traceabilityIndex = new TraceabilityIndexImpl();
		return traceabilityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityIndexEntry createTraceabilityIndexEntry() {
		TraceabilityIndexEntryImpl traceabilityIndexEntry = new TraceabilityIndexEntryImpl();
		return traceabilityIndexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, IntentGenericElement> createCompiledElementToInstructionEntry() {
		CompiledElementToInstructionEntryImpl compiledElementToInstructionEntry = new CompiledElementToInstructionEntryImpl();
		return compiledElementToInstructionEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationStatusSeverity createCompilationStatusSeverityFromString(EDataType eDataType,
			String initialValue) {
		CompilationStatusSeverity result = CompilationStatusSeverity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompilationStatusSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationMessageType createCompilationMessageTypeFromString(EDataType eDataType,
			String initialValue) {
		CompilationMessageType result = CompilationMessageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompilationMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerPackage getCompilerPackage() {
		return (CompilerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompilerPackage getPackage() {
		return CompilerPackage.eINSTANCE;
	}

} // CompilerFactoryImpl
