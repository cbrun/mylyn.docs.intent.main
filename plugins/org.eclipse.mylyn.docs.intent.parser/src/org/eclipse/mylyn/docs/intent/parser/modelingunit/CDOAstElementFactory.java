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
package org.eclipse.mylyn.docs.intent.parser.modelingunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * An alternative AstElementFactory defined to avoid class cast exception when trying to cast CDO's Basic
 * EStore Elist in BasicEList.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CDOAstElementFactory implements IAstFactory {

	/**
	 * The delegate factory to use.
	 */
	private final IAstFactory delegateFactory;

	/**
	 * Default constructor.
	 * 
	 * @param factory
	 *            the IAstFactory to use
	 */
	public CDOAstElementFactory(IAstFactory factory) {
		this.delegateFactory = factory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.parser.IAstFactory#add(org.eclipse.emf.ecore.EObject, java.lang.String,
	 *      java.lang.Object, java.lang.String, org.eclipse.xtext.parsetree.AbstractNode)
	 */
	@SuppressWarnings("unchecked")
	public void add(EObject object, String feature, Object value, String ruleName, AbstractNode node)
			throws ValueConverterException {

		if (value == null) {
			return;
		}
		final EStructuralFeature structuralFeature = object.eClass().getEStructuralFeature(feature);
		if (structuralFeature == null) {
			throw new IllegalArgumentException(object.eClass().getName() + "." + feature + " does not exist");
		}
		if (value instanceof EObject && !(object.eGet(structuralFeature) instanceof BasicEList)) {
			try {
				if (value instanceof EObject) {
					((EList<EObject>)object.eGet(structuralFeature)).add((EObject)value);
				} else {
					final Object tokenValue = getTokenValue(value, ruleName, node);
					((Collection<Object>)object.eGet(structuralFeature)).add(tokenValue);
				}
			} catch (ValueConverterException e) {
				throw e;
			} catch (NullPointerException e) {
				throw new ValueConverterException(
						"A NullPointerException occured. This indicates a missing value converter or a bug in its implementation.",
						node, e);
				// CHECKSTYLE:OFF
			} catch (Exception e) {
				// CHECKSTYLE:ON
				throw new ValueConverterException(null, node, e);
			}
		} else {
			delegateFactory.add(object, feature, value, ruleName, node);
		}
	}

	private Object getTokenValue(Object tokenOrValue, String ruleName, AbstractNode node)
			throws ValueConverterException {
		try {
			Method declaredMethod = DefaultEcoreElementFactory.class.getDeclaredMethod("getTokenValue",
					Object.class, String.class, AbstractNode.class);
			declaredMethod.setAccessible(true);
			return declaredMethod.invoke(delegateFactory, tokenOrValue, ruleName, node);
		} catch (SecurityException e) {
			throw new ValueConverterException(null, node, e);
		} catch (NoSuchMethodException e) {
			throw new ValueConverterException(null, node, e);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(null, node, e);
		} catch (IllegalAccessException e) {
			throw new ValueConverterException(null, node, e);
		} catch (InvocationTargetException e) {
			throw new ValueConverterException(null, node, e);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.parser.IAstFactory#create(org.eclipse.emf.ecore.EClassifier)
	 */
	public EObject create(EClassifier clazz) {
		return delegateFactory.create(clazz);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.parser.IAstFactory#set(org.eclipse.emf.ecore.EObject, java.lang.String,
	 *      java.lang.Object, java.lang.String, org.eclipse.xtext.parsetree.AbstractNode)
	 */
	public void set(EObject element, String feature, Object value, String lexerRule, AbstractNode node)
			throws ValueConverterException {
		delegateFactory.set(element, feature, value, lexerRule, node);

	}
}
