/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xrepl.xscript.xscript.XscriptFactory
 * @model kind="package"
 * @generated
 */
public interface XscriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xscript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xrepl.org/xscript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xscript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XscriptPackage eINSTANCE = org.xrepl.xscript.xscript.impl.XscriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xrepl.xscript.xscript.impl.XNewEObjectImpl <em>XNew EObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xrepl.xscript.xscript.impl.XNewEObjectImpl
   * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXNewEObject()
   * @generated
   */
  int XNEW_EOBJECT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNEW_EOBJECT__TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XNew EObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNEW_EOBJECT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xrepl.xscript.xscript.impl.XImportImpl <em>XImport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xrepl.xscript.xscript.impl.XImportImpl
   * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXImport()
   * @generated
   */
  int XIMPORT = 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIMPORT__STATIC = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIMPORT__EXTENSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIMPORT__IMPORTED_NAMESPACE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XImport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIMPORT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xrepl.xscript.xscript.impl.XEPackageImportImpl <em>XE Package Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xrepl.xscript.xscript.impl.XEPackageImportImpl
   * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXEPackageImport()
   * @generated
   */
  int XE_PACKAGE_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XE_PACKAGE_IMPORT__NS_URI = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XE_PACKAGE_IMPORT__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XE Package Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XE_PACKAGE_IMPORT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xrepl.xscript.xscript.impl.XScriptImpl <em>XScript</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xrepl.xscript.xscript.impl.XScriptImpl
   * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXScript()
   * @generated
   */
  int XSCRIPT = 3;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSCRIPT__EXPRESSIONS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XScript</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSCRIPT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xrepl.xscript.xscript.XNewEObject <em>XNew EObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNew EObject</em>'.
   * @see org.xrepl.xscript.xscript.XNewEObject
   * @generated
   */
  EClass getXNewEObject();

  /**
   * Returns the meta object for the reference '{@link org.xrepl.xscript.xscript.XNewEObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xrepl.xscript.xscript.XNewEObject#getType()
   * @see #getXNewEObject()
   * @generated
   */
  EReference getXNewEObject_Type();

  /**
   * Returns the meta object for class '{@link org.xrepl.xscript.xscript.XImport <em>XImport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XImport</em>'.
   * @see org.xrepl.xscript.xscript.XImport
   * @generated
   */
  EClass getXImport();

  /**
   * Returns the meta object for the attribute '{@link org.xrepl.xscript.xscript.XImport#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.xrepl.xscript.xscript.XImport#isStatic()
   * @see #getXImport()
   * @generated
   */
  EAttribute getXImport_Static();

  /**
   * Returns the meta object for the attribute '{@link org.xrepl.xscript.xscript.XImport#isExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see org.xrepl.xscript.xscript.XImport#isExtension()
   * @see #getXImport()
   * @generated
   */
  EAttribute getXImport_Extension();

  /**
   * Returns the meta object for the attribute '{@link org.xrepl.xscript.xscript.XImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xrepl.xscript.xscript.XImport#getImportedNamespace()
   * @see #getXImport()
   * @generated
   */
  EAttribute getXImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xrepl.xscript.xscript.XEPackageImport <em>XE Package Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XE Package Import</em>'.
   * @see org.xrepl.xscript.xscript.XEPackageImport
   * @generated
   */
  EClass getXEPackageImport();

  /**
   * Returns the meta object for the attribute '{@link org.xrepl.xscript.xscript.XEPackageImport#getNsUri <em>Ns Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Uri</em>'.
   * @see org.xrepl.xscript.xscript.XEPackageImport#getNsUri()
   * @see #getXEPackageImport()
   * @generated
   */
  EAttribute getXEPackageImport_NsUri();

  /**
   * Returns the meta object for the attribute '{@link org.xrepl.xscript.xscript.XEPackageImport#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xrepl.xscript.xscript.XEPackageImport#getName()
   * @see #getXEPackageImport()
   * @generated
   */
  EAttribute getXEPackageImport_Name();

  /**
   * Returns the meta object for class '{@link org.xrepl.xscript.xscript.XScript <em>XScript</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XScript</em>'.
   * @see org.xrepl.xscript.xscript.XScript
   * @generated
   */
  EClass getXScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.xrepl.xscript.xscript.XScript#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xrepl.xscript.xscript.XScript#getExpressions()
   * @see #getXScript()
   * @generated
   */
  EReference getXScript_Expressions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XscriptFactory getXscriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xrepl.xscript.xscript.impl.XNewEObjectImpl <em>XNew EObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xrepl.xscript.xscript.impl.XNewEObjectImpl
     * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXNewEObject()
     * @generated
     */
    EClass XNEW_EOBJECT = eINSTANCE.getXNewEObject();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XNEW_EOBJECT__TYPE = eINSTANCE.getXNewEObject_Type();

    /**
     * The meta object literal for the '{@link org.xrepl.xscript.xscript.impl.XImportImpl <em>XImport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xrepl.xscript.xscript.impl.XImportImpl
     * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXImport()
     * @generated
     */
    EClass XIMPORT = eINSTANCE.getXImport();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XIMPORT__STATIC = eINSTANCE.getXImport_Static();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XIMPORT__EXTENSION = eINSTANCE.getXImport_Extension();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getXImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xrepl.xscript.xscript.impl.XEPackageImportImpl <em>XE Package Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xrepl.xscript.xscript.impl.XEPackageImportImpl
     * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXEPackageImport()
     * @generated
     */
    EClass XE_PACKAGE_IMPORT = eINSTANCE.getXEPackageImport();

    /**
     * The meta object literal for the '<em><b>Ns Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XE_PACKAGE_IMPORT__NS_URI = eINSTANCE.getXEPackageImport_NsUri();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XE_PACKAGE_IMPORT__NAME = eINSTANCE.getXEPackageImport_Name();

    /**
     * The meta object literal for the '{@link org.xrepl.xscript.xscript.impl.XScriptImpl <em>XScript</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xrepl.xscript.xscript.impl.XScriptImpl
     * @see org.xrepl.xscript.xscript.impl.XscriptPackageImpl#getXScript()
     * @generated
     */
    EClass XSCRIPT = eINSTANCE.getXScript();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSCRIPT__EXPRESSIONS = eINSTANCE.getXScript_Expressions();

  }

} //XscriptPackage
