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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Compilation Information Holder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getGeneratedElementList <em>Generated Element List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getElementToUnresolvedReferenceMap <em>Element To Unresolved Reference Map</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getTypeToNameToElementsMap <em>Type To Name To Elements Map</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCreatedElementsToInstructions <em>Created Elements To Instructions</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCurrentGeneratedElementList <em>Current Generated Element List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getResourceToContainedElements <em>Resource To Contained Elements</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getUnresolvedContributions <em>Unresolved Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CompilationInformationHolder extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Generated Element List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Element List</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Element List</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_GeneratedElementList()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EObject> getGeneratedElementList();

	/**
	 * Returns the value of the '<em><b>Element To Unresolved Reference Map</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type list of {@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element To Unresolved Reference Map</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element To Unresolved Reference Map</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_ElementToUnresolvedReferenceMap()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.EObjectToUnresolvedReferencesList<org.eclipse.emf.ecore.EObject, org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder>"
	 * @generated
	 */
	EMap<EObject, EList<UnresolvedReferenceHolder>> getElementToUnresolvedReferenceMap();

	/**
	 * Returns the value of the '<em><b>Type To Name To Elements Map</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EClassifier},
	 * and the value is of type {@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type To Name To Elements Map</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type To Name To Elements Map</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_TypeToNameToElementsMap()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.ETypeToStringToEObjectMap<org.eclipse.emf.ecore.EClassifier, org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap>"
	 * @generated
	 */
	EMap<EClassifier, StringToEObjectMap> getTypeToNameToElementsMap();

	/**
	 * Returns the value of the '<em><b>Created Elements To Instructions</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Elements To Instructions</em>' map isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Elements To Instructions</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_CreatedElementsToInstructions()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.CreatedElementToInstructionMapEntry<org.eclipse.emf.ecore.EObject, org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction>"
	 * @generated
	 */
	EMap<EObject, UnitInstruction> getCreatedElementsToInstructions();

	/**
	 * Returns the value of the '<em><b>Current Generated Element List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Generated Element List</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Generated Element List</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_CurrentGeneratedElementList()
	 * @model
	 * @generated
	 */
	EList<EObject> getCurrentGeneratedElementList();

	/**
	 * Returns the value of the '<em><b>Resource To Contained Elements</b></em>' map.
	 * The key is of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration},
	 * and the value is of type list of {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource To Contained Elements</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource To Contained Elements</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_ResourceToContainedElements()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.ResourceToContainedElementsMapEntry<org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<ResourceDeclaration, EList<EObject>> getResourceToContainedElements();

	/**
	 * Returns the value of the '<em><b>Unresolved Contributions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder},
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Unresolved Contributions</em>' map isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Contributions</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationInformationHolder_UnresolvedContributions()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.TextualReferenceToContributions<org.eclipse.emf.ecore.EString, org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder>"
	 * @generated
	 */
	EMap<String, EList<UnresolvedContributionHolder>> getUnresolvedContributions();

} // CompilationInformationHolder
