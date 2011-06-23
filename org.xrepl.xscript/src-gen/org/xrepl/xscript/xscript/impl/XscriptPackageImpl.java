/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

import org.xrepl.xscript.xscript.XEPackageImport;
import org.xrepl.xscript.xscript.XImport;
import org.xrepl.xscript.xscript.XNewEObject;
import org.xrepl.xscript.xscript.XScript;
import org.xrepl.xscript.xscript.XscriptFactory;
import org.xrepl.xscript.xscript.XscriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XscriptPackageImpl extends EPackageImpl implements XscriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xNewEObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xePackageImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xScriptEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xrepl.xscript.xscript.XscriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XscriptPackageImpl()
  {
    super(eNS_URI, XscriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XscriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XscriptPackage init()
  {
    if (isInited) return (XscriptPackage)EPackage.Registry.INSTANCE.getEPackage(XscriptPackage.eNS_URI);

    // Obtain or create and register package
    XscriptPackageImpl theXscriptPackage = (XscriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XscriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XscriptPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theXscriptPackage.createPackageContents();

    // Initialize created meta-data
    theXscriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXscriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XscriptPackage.eNS_URI, theXscriptPackage);
    return theXscriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXNewEObject()
  {
    return xNewEObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXNewEObject_Type()
  {
    return (EReference)xNewEObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXImport()
  {
    return xImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXImport_Static()
  {
    return (EAttribute)xImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXImport_Extension()
  {
    return (EAttribute)xImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXImport_ImportedNamespace()
  {
    return (EAttribute)xImportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXEPackageImport()
  {
    return xePackageImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXEPackageImport_NsUri()
  {
    return (EAttribute)xePackageImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXEPackageImport_Name()
  {
    return (EAttribute)xePackageImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXScript()
  {
    return xScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXScript_Expressions()
  {
    return (EReference)xScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XscriptFactory getXscriptFactory()
  {
    return (XscriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xNewEObjectEClass = createEClass(XNEW_EOBJECT);
    createEReference(xNewEObjectEClass, XNEW_EOBJECT__TYPE);

    xImportEClass = createEClass(XIMPORT);
    createEAttribute(xImportEClass, XIMPORT__STATIC);
    createEAttribute(xImportEClass, XIMPORT__EXTENSION);
    createEAttribute(xImportEClass, XIMPORT__IMPORTED_NAMESPACE);

    xePackageImportEClass = createEClass(XE_PACKAGE_IMPORT);
    createEAttribute(xePackageImportEClass, XE_PACKAGE_IMPORT__NS_URI);
    createEAttribute(xePackageImportEClass, XE_PACKAGE_IMPORT__NAME);

    xScriptEClass = createEClass(XSCRIPT);
    createEReference(xScriptEClass, XSCRIPT__EXPRESSIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    xNewEObjectEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    xImportEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    xePackageImportEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    xScriptEClass.getESuperTypes().add(theXbasePackage.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(xNewEObjectEClass, XNewEObject.class, "XNewEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXNewEObject_Type(), ecorePackage.getEClass(), null, "type", null, 0, 1, XNewEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xImportEClass, XImport.class, "XImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXImport_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, XImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXImport_Extension(), ecorePackage.getEBoolean(), "extension", null, 0, 1, XImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, XImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xePackageImportEClass, XEPackageImport.class, "XEPackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXEPackageImport_NsUri(), ecorePackage.getEString(), "nsUri", null, 0, 1, XEPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXEPackageImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, XEPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xScriptEClass, XScript.class, "XScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXScript_Expressions(), theXbasePackage.getXExpression(), null, "expressions", null, 0, -1, XScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //XscriptPackageImpl
