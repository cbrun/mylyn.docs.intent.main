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
package org.eclipse.mylyn.docs.intent.core.compiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to
 * represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory
 * @model kind="package"
 * @generated
 */
public interface CompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/compilerinfos/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentCompilerInfos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	CompilerPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl <em>EString To EObject</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEStringToEObject()
	 * @generated
	 */
	int ESTRING_TO_EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl <em>Textual Reference To Contributions</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTextualReferenceToContributions()
	 * @generated
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Textual Reference To Contributions</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl <em>String To EObject Map</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStringToEObjectMap()
	 * @generated
	 */
	int STRING_TO_EOBJECT_MAP = 2;

	/**
	 * The feature id for the '<em><b>Name To Element</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EOBJECT_MAP__NAME_TO_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>String To EObject Map</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EOBJECT_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl <em>EType To String To EObject Map</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getETypeToStringToEObjectMap()
	 * @generated
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EType To String To EObject Map</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl <em>EObject To Unresolved References List</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EObject To Unresolved References List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
	 * <em>Resource To Contained Elements Map Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resource To Contained Elements Map Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl <em>Modeling Unit To Status List</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelingUnitToStatusList()
	 * @generated
	 */
	int MODELING_UNIT_TO_STATUS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Modeling Unit To Status List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
	 * <em>Created Element To Instruction Map Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Created Element To Instruction Map Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl <em>Unresolved Reference Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedReferenceHolder()
	 * @generated
	 */
	int UNRESOLVED_REFERENCE_HOLDER = 8;

	/**
	 * The feature id for the '<em><b>Textual Reference</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Containment Reference</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Instruction Container</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Concerned Feature</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Unresolved Reference Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl <em>Compilation Status</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatus()
	 * @generated
	 */
	int COMPILATION_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Compilation Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl <em>Compilation Status Manager</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusManager()
	 * @generated
	 */
	int COMPILATION_STATUS_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Compilation Status List</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER__COMPILATION_STATUS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Modeling Unit To Status List</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER__MODELING_UNIT_TO_STATUS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Compilation Status Manager</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl <em>Compilation Information Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationInformationHolder()
	 * @generated
	 */
	int COMPILATION_INFORMATION_HOLDER = 11;

	/**
	 * The feature id for the '<em><b>Generated Element List</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__GENERATED_ELEMENT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Element To Unresolved Reference Map</b></em>' map.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__ELEMENT_TO_UNRESOLVED_REFERENCE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Type To Name To Elements Map</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__TYPE_TO_NAME_TO_ELEMENTS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Created Elements To Instructions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__CREATED_ELEMENTS_TO_INSTRUCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Current Generated Element List</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__CURRENT_GENERATED_ELEMENT_LIST = 4;

	/**
	 * The feature id for the '<em><b>Resource To Contained Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__RESOURCE_TO_CONTAINED_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Unresolved Contributions</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__UNRESOLVED_CONTRIBUTIONS = 6;

	/**
	 * The number of structural features of the '<em>Compilation Information Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl <em>Unresolved Contribution Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedContributionHolder()
	 * @generated
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER = 12;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED = 0;

	/**
	 * The feature id for the '<em><b>Referenced Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION = 1;

	/**
	 * The number of structural features of the '<em>Unresolved Contribution Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl <em>Traceability Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndex()
	 * @generated
	 */
	int TRACEABILITY_INDEX = 13;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Traceability Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl <em>Traceability Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndexEntry()
	 * @generated
	 */
	int TRACEABILITY_INDEX_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Generated Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Compilation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Resource Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Contained Element To Instructions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__CONTAINED_ELEMENT_TO_INSTRUCTIONS = 3;

	/**
	 * The number of structural features of the '<em>Traceability Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl <em>Compiled Element To Instruction Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompiledElementToInstructionEntry()
	 * @generated
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Compiled Element To Instruction Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusSeverity()
	 * @generated
	 */
	int COMPILATION_STATUS_SEVERITY = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationMessageType()
	 * @generated
	 */
	int COMPILATION_MESSAGE_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To EObject</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EString To EObject</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getEStringToEObject();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEObject()
	 * @generated
	 */
	EAttribute getEStringToEObject_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEObject()
	 * @generated
	 */
	EReference getEStringToEObject_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Textual Reference To Contributions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Reference To Contributions</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getTextualReferenceToContributions();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextualReferenceToContributions()
	 * @generated
	 */
	EAttribute getTextualReferenceToContributions_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextualReferenceToContributions()
	 * @generated
	 */
	EReference getTextualReferenceToContributions_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap <em>String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To EObject Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap
	 * @generated
	 */
	EClass getStringToEObjectMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap#getNameToElement <em>Name To Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Name To Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap#getNameToElement()
	 * @see #getStringToEObjectMap()
	 * @generated
	 */
	EReference getStringToEObjectMap_NameToElement();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EType To String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType To String To EObject Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EClassifier"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap"
	 * @generated
	 */
	EClass getETypeToStringToEObjectMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getETypeToStringToEObjectMap()
	 * @generated
	 */
	EReference getETypeToStringToEObjectMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getETypeToStringToEObjectMap()
	 * @generated
	 */
	EReference getETypeToStringToEObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EObject To Unresolved References List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject To Unresolved References List</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getEObjectToUnresolvedReferencesList();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	EReference getEObjectToUnresolvedReferencesList_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	EReference getEObjectToUnresolvedReferencesList_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Resource To Contained Elements Map Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource To Contained Elements Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueMany="true"
	 * @generated
	 */
	EClass getResourceToContainedElementsMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	EReference getResourceToContainedElementsMapEntry_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	EReference getResourceToContainedElementsMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Modeling Unit To Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Unit To Status List</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus" valueMany="true"
	 * @generated
	 */
	EClass getModelingUnitToStatusList();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getModelingUnitToStatusList()
	 * @generated
	 */
	EReference getModelingUnitToStatusList_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getModelingUnitToStatusList()
	 * @generated
	 */
	EReference getModelingUnitToStatusList_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Created Element To Instruction Map Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created Element To Instruction Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction"
	 * @generated
	 */
	EClass getCreatedElementToInstructionMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	EReference getCreatedElementToInstructionMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	EReference getCreatedElementToInstructionMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder <em>Unresolved Reference Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Reference Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder
	 * @generated
	 */
	EClass getUnresolvedReferenceHolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference <em>Textual Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textual Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EAttribute getUnresolvedReferenceHolder_TextualReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference <em>Containment Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EAttribute getUnresolvedReferenceHolder_ContainmentReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer <em>Instruction Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction Container</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EReference getUnresolvedReferenceHolder_InstructionContainer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature <em>Concerned Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concerned Feature</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EReference getUnresolvedReferenceHolder_ConcernedFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus <em>Compilation Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus
	 * @generated
	 */
	EClass getCompilationStatus();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EReference getCompilationStatus_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Severity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager <em>Compilation Status Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Status Manager</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager
	 * @generated
	 */
	EClass getCompilationStatusManager();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getCompilationStatusList <em>Compilation Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compilation Status List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getCompilationStatusList()
	 * @see #getCompilationStatusManager()
	 * @generated
	 */
	EReference getCompilationStatusManager_CompilationStatusList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getModelingUnitToStatusList <em>Modeling Unit To Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Modeling Unit To Status List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getModelingUnitToStatusList()
	 * @see #getCompilationStatusManager()
	 * @generated
	 */
	EReference getCompilationStatusManager_ModelingUnitToStatusList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder <em>Compilation Information Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Information Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder
	 * @generated
	 */
	EClass getCompilationInformationHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getGeneratedElementList <em>Generated Element List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Element List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getGeneratedElementList()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_GeneratedElementList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getElementToUnresolvedReferenceMap <em>Element To Unresolved Reference Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Element To Unresolved Reference Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getElementToUnresolvedReferenceMap()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_ElementToUnresolvedReferenceMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getTypeToNameToElementsMap <em>Type To Name To Elements Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Type To Name To Elements Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getTypeToNameToElementsMap()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_TypeToNameToElementsMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCreatedElementsToInstructions <em>Created Elements To Instructions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Created Elements To Instructions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCreatedElementsToInstructions()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_CreatedElementsToInstructions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCurrentGeneratedElementList <em>Current Generated Element List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Generated Element List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCurrentGeneratedElementList()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_CurrentGeneratedElementList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getResourceToContainedElements <em>Resource To Contained Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resource To Contained Elements</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getResourceToContainedElements()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_ResourceToContainedElements();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getUnresolvedContributions <em>Unresolved Contributions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Unresolved Contributions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getUnresolvedContributions()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_UnresolvedContributions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder <em>Unresolved Contribution Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Contribution Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder
	 * @generated
	 */
	EClass getUnresolvedContributionHolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved()
	 * @see #getUnresolvedContributionHolder()
	 * @generated
	 */
	EAttribute getUnresolvedContributionHolder_Resolved();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution <em>Referenced Contribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Contribution</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution()
	 * @see #getUnresolvedContributionHolder()
	 * @generated
	 */
	EReference getUnresolvedContributionHolder_ReferencedContribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex <em>Traceability Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Index</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex
	 * @generated
	 */
	EClass getTraceabilityIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex#getEntries()
	 * @see #getTraceabilityIndex()
	 * @generated
	 */
	EReference getTraceabilityIndex_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry <em>Traceability Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Index Entry</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry
	 * @generated
	 */
	EClass getTraceabilityIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath <em>Generated Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Resource Path</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EAttribute getTraceabilityIndexEntry_GeneratedResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime <em>Compilation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compilation Time</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EAttribute getTraceabilityIndexEntry_CompilationTime();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Declaration</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EReference getTraceabilityIndexEntry_ResourceDeclaration();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getContainedElementToInstructions <em>Contained Element To Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Contained Element To Instructions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getContainedElementToInstructions()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EReference getTraceabilityIndexEntry_ContainedElementToInstructions();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Compiled Element To Instruction Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiled Element To Instruction Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject" keyRequired="true"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement" valueRequired="true"
	 * @generated
	 */
	EClass getCompiledElementToInstructionEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCompiledElementToInstructionEntry()
	 * @generated
	 */
	EReference getCompiledElementToInstructionEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCompiledElementToInstructionEntry()
	 * @generated
	 */
	EReference getCompiledElementToInstructionEntry_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compilation Status Severity</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @generated
	 */
	EEnum getCompilationStatusSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compilation Message Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @generated
	 */
	EEnum getCompilationMessageType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompilerFactory getCompilerFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl <em>EString To EObject</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEStringToEObject()
		 * @generated
		 */
		EClass ESTRING_TO_EOBJECT = eINSTANCE.getEStringToEObject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_EOBJECT__KEY = eINSTANCE.getEStringToEObject_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_EOBJECT__VALUE = eINSTANCE.getEStringToEObject_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl <em>Textual Reference To Contributions</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTextualReferenceToContributions()
		 * @generated
		 */
		EClass TEXTUAL_REFERENCE_TO_CONTRIBUTIONS = eINSTANCE.getTextualReferenceToContributions();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__KEY = eINSTANCE
				.getTextualReferenceToContributions_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__VALUE = eINSTANCE
				.getTextualReferenceToContributions_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl <em>String To EObject Map</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStringToEObjectMap()
		 * @generated
		 */
		EClass STRING_TO_EOBJECT_MAP = eINSTANCE.getStringToEObjectMap();

		/**
		 * The meta object literal for the '<em><b>Name To Element</b></em>' map feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_EOBJECT_MAP__NAME_TO_ELEMENT = eINSTANCE.getStringToEObjectMap_NameToElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl <em>EType To String To EObject Map</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getETypeToStringToEObjectMap()
		 * @generated
		 */
		EClass ETYPE_TO_STRING_TO_EOBJECT_MAP = eINSTANCE.getETypeToStringToEObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_TO_STRING_TO_EOBJECT_MAP__KEY = eINSTANCE.getETypeToStringToEObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_TO_STRING_TO_EOBJECT_MAP__VALUE = eINSTANCE.getETypeToStringToEObjectMap_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
		 * <em>EObject To Unresolved References List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEObjectToUnresolvedReferencesList()
		 * @generated
		 */
		EClass EOBJECT_TO_UNRESOLVED_REFERENCES_LIST = eINSTANCE.getEObjectToUnresolvedReferencesList();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__KEY = eINSTANCE
				.getEObjectToUnresolvedReferencesList_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__VALUE = eINSTANCE
				.getEObjectToUnresolvedReferencesList_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl <em>Resource To Contained Elements Map Entry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceToContainedElementsMapEntry()
		 * @generated
		 */
		EClass RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY = eINSTANCE.getResourceToContainedElementsMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__KEY = eINSTANCE
				.getResourceToContainedElementsMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__VALUE = eINSTANCE
				.getResourceToContainedElementsMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl <em>Modeling Unit To Status List</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelingUnitToStatusList()
		 * @generated
		 */
		EClass MODELING_UNIT_TO_STATUS_LIST = eINSTANCE.getModelingUnitToStatusList();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT_TO_STATUS_LIST__KEY = eINSTANCE.getModelingUnitToStatusList_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT_TO_STATUS_LIST__VALUE = eINSTANCE.getModelingUnitToStatusList_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl <em>Created Element To Instruction Map Entry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCreatedElementToInstructionMapEntry()
		 * @generated
		 */
		EClass CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY = eINSTANCE.getCreatedElementToInstructionMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__KEY = eINSTANCE
				.getCreatedElementToInstructionMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__VALUE = eINSTANCE
				.getCreatedElementToInstructionMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl <em>Unresolved Reference Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedReferenceHolder()
		 * @generated
		 */
		EClass UNRESOLVED_REFERENCE_HOLDER = eINSTANCE.getUnresolvedReferenceHolder();

		/**
		 * The meta object literal for the '<em><b>Textual Reference</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE = eINSTANCE
				.getUnresolvedReferenceHolder_TextualReference();

		/**
		 * The meta object literal for the '<em><b>Containment Reference</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE = eINSTANCE
				.getUnresolvedReferenceHolder_ContainmentReference();

		/**
		 * The meta object literal for the '<em><b>Instruction Container</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER = eINSTANCE
				.getUnresolvedReferenceHolder_InstructionContainer();

		/**
		 * The meta object literal for the '<em><b>Concerned Feature</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE = eINSTANCE
				.getUnresolvedReferenceHolder_ConcernedFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl <em>Compilation Status</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatus()
		 * @generated
		 */
		EClass COMPILATION_STATUS = eINSTANCE.getCompilationStatus();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_STATUS__TARGET = eINSTANCE.getCompilationStatus_Target();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__MESSAGE = eINSTANCE.getCompilationStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__SEVERITY = eINSTANCE.getCompilationStatus_Severity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__TYPE = eINSTANCE.getCompilationStatus_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl <em>Compilation Status Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusManager()
		 * @generated
		 */
		EClass COMPILATION_STATUS_MANAGER = eINSTANCE.getCompilationStatusManager();

		/**
		 * The meta object literal for the '<em><b>Compilation Status List</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_STATUS_MANAGER__COMPILATION_STATUS_LIST = eINSTANCE
				.getCompilationStatusManager_CompilationStatusList();

		/**
		 * The meta object literal for the '<em><b>Modeling Unit To Status List</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_STATUS_MANAGER__MODELING_UNIT_TO_STATUS_LIST = eINSTANCE
				.getCompilationStatusManager_ModelingUnitToStatusList();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl <em>Compilation Information Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationInformationHolder()
		 * @generated
		 */
		EClass COMPILATION_INFORMATION_HOLDER = eINSTANCE.getCompilationInformationHolder();

		/**
		 * The meta object literal for the '<em><b>Generated Element List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__GENERATED_ELEMENT_LIST = eINSTANCE
				.getCompilationInformationHolder_GeneratedElementList();

		/**
		 * The meta object literal for the '<em><b>Element To Unresolved Reference Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__ELEMENT_TO_UNRESOLVED_REFERENCE_MAP = eINSTANCE
				.getCompilationInformationHolder_ElementToUnresolvedReferenceMap();

		/**
		 * The meta object literal for the '<em><b>Type To Name To Elements Map</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__TYPE_TO_NAME_TO_ELEMENTS_MAP = eINSTANCE
				.getCompilationInformationHolder_TypeToNameToElementsMap();

		/**
		 * The meta object literal for the '<em><b>Created Elements To Instructions</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__CREATED_ELEMENTS_TO_INSTRUCTIONS = eINSTANCE
				.getCompilationInformationHolder_CreatedElementsToInstructions();

		/**
		 * The meta object literal for the '<em><b>Current Generated Element List</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__CURRENT_GENERATED_ELEMENT_LIST = eINSTANCE
				.getCompilationInformationHolder_CurrentGeneratedElementList();

		/**
		 * The meta object literal for the '<em><b>Resource To Contained Elements</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__RESOURCE_TO_CONTAINED_ELEMENTS = eINSTANCE
				.getCompilationInformationHolder_ResourceToContainedElements();

		/**
		 * The meta object literal for the '<em><b>Unresolved Contributions</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__UNRESOLVED_CONTRIBUTIONS = eINSTANCE
				.getCompilationInformationHolder_UnresolvedContributions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl <em>Unresolved Contribution Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedContributionHolder()
		 * @generated
		 */
		EClass UNRESOLVED_CONTRIBUTION_HOLDER = eINSTANCE.getUnresolvedContributionHolder();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED = eINSTANCE
				.getUnresolvedContributionHolder_Resolved();

		/**
		 * The meta object literal for the '<em><b>Referenced Contribution</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION = eINSTANCE
				.getUnresolvedContributionHolder_ReferencedContribution();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl <em>Traceability Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndex()
		 * @generated
		 */
		EClass TRACEABILITY_INDEX = eINSTANCE.getTraceabilityIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX__ENTRIES = eINSTANCE.getTraceabilityIndex_Entries();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl <em>Traceability Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndexEntry()
		 * @generated
		 */
		EClass TRACEABILITY_INDEX_ENTRY = eINSTANCE.getTraceabilityIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Generated Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH = eINSTANCE
				.getTraceabilityIndexEntry_GeneratedResourcePath();

		/**
		 * The meta object literal for the '<em><b>Compilation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME = eINSTANCE
				.getTraceabilityIndexEntry_CompilationTime();

		/**
		 * The meta object literal for the '<em><b>Resource Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION = eINSTANCE
				.getTraceabilityIndexEntry_ResourceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Contained Element To Instructions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX_ENTRY__CONTAINED_ELEMENT_TO_INSTRUCTIONS = eINSTANCE
				.getTraceabilityIndexEntry_ContainedElementToInstructions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl <em>Compiled Element To Instruction Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompiledElementToInstructionEntry()
		 * @generated
		 */
		EClass COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY = eINSTANCE.getCompiledElementToInstructionEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__KEY = eINSTANCE
				.getCompiledElementToInstructionEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__VALUE = eINSTANCE
				.getCompiledElementToInstructionEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusSeverity()
		 * @generated
		 */
		EEnum COMPILATION_STATUS_SEVERITY = eINSTANCE.getCompilationStatusSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationMessageType()
		 * @generated
		 */
		EEnum COMPILATION_MESSAGE_TYPE = eINSTANCE.getCompilationMessageType();

	}

} // CompilerPackage
