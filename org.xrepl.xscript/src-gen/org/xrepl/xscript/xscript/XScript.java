/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XScript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xrepl.xscript.xscript.XScript#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xrepl.xscript.xscript.XscriptPackage#getXScript()
 * @model
 * @generated
 */
public interface XScript extends XExpression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xrepl.xscript.xscript.XscriptPackage#getXScript_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getExpressions();

} // XScript
