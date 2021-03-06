/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xrepl.xscript.xscript.XscriptPackage
 * @generated
 */
public interface XscriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XscriptFactory eINSTANCE = org.xrepl.xscript.xscript.impl.XscriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XNew EObject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XNew EObject</em>'.
   * @generated
   */
  XNewEObject createXNewEObject();

  /**
   * Returns a new object of class '<em>XImport</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XImport</em>'.
   * @generated
   */
  XImport createXImport();

  /**
   * Returns a new object of class '<em>XE Package Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XE Package Import</em>'.
   * @generated
   */
  XEPackageImport createXEPackageImport();

  /**
   * Returns a new object of class '<em>XScript</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XScript</em>'.
   * @generated
   */
  XScript createXScript();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XscriptPackage getXscriptPackage();

} //XscriptFactory
