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
package org.eclipse.mylyn.docs.intent.core.descriptionunit;

import org.eclipse.mylyn.docs.intent.markup.markup.Container;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Description Bloc</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc#getDescriptionBloc <em>Description Bloc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage#getDescriptionBloc()
 * @model
 * @generated
 */
public interface DescriptionBloc extends DescriptionUnitInstruction {
	/**
	 * Returns the value of the '<em><b>Description Bloc</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Description Bloc</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Bloc</em>' containment reference.
	 * @see #setDescriptionBloc(Container)
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage#getDescriptionBloc_DescriptionBloc()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Container getDescriptionBloc();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc#getDescriptionBloc <em>Description Bloc</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Bloc</em>' containment reference.
	 * @see #getDescriptionBloc()
	 * @generated
	 */
	void setDescriptionBloc(Container value);

} // DescriptionBloc
