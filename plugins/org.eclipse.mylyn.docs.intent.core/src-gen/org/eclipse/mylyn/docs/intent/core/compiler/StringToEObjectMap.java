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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>String To EObject Map</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap#getNameToElement <em>Name To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getStringToEObjectMap()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StringToEObjectMap extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name To Element</b></em>' map. The key is of type
	 * {@link java.lang.String}, and the value is of type {@link org.eclipse.emf.ecore.EObject}, <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name To Element</em>' map isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name To Element</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getStringToEObjectMap_NameToElement()
	 * @model mapType=
	 *        "org.eclipse.mylyn.docs.intent.core.compiler.EStringToEObject<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<String, EObject> getNameToElement();

} // StringToEObjectMap
