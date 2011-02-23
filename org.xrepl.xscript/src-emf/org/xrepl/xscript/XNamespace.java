/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XNamespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xrepl.xscript.XNamespace#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xrepl.xscript.XscriptPackage#getXNamespace()
 * @model
 * @generated
 */
public interface XNamespace extends XScriptExpression
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xrepl.xscript.XscriptPackage#getXNamespace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xrepl.xscript.XNamespace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // XNamespace
