/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mylyn.docs.intent.core.compiler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronizer Compilation Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getWorkingCopyResourceURI <em>Working Copy Resource URI</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getCompiledResourceURI <em>Compiled Resource URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getSynchronizerCompilationStatus()
 * @model
 * @generated
 */
public interface SynchronizerCompilationStatus extends CompilationStatus {
	/**
	 * Returns the value of the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Copy Resource URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Copy Resource URI</em>' attribute.
	 * @see #setWorkingCopyResourceURI(String)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getSynchronizerCompilationStatus_WorkingCopyResourceURI()
	 * @model
	 * @generated
	 */
	String getWorkingCopyResourceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getWorkingCopyResourceURI <em>Working Copy Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Copy Resource URI</em>' attribute.
	 * @see #getWorkingCopyResourceURI()
	 * @generated
	 */
	void setWorkingCopyResourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiled Resource URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiled Resource URI</em>' attribute.
	 * @see #setCompiledResourceURI(String)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getSynchronizerCompilationStatus_CompiledResourceURI()
	 * @model
	 * @generated
	 */
	String getCompiledResourceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getCompiledResourceURI <em>Compiled Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiled Resource URI</em>' attribute.
	 * @see #getCompiledResourceURI()
	 * @generated
	 */
	void setCompiledResourceURI(String value);

} // SynchronizerCompilationStatus
