/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.common.types.TypesPackage;

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
 * @see org.xrepl.xscript.XscriptFactory
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
	String eNS_URI = "http://www.xrepl.org/xscript/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Xscript";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XscriptPackage eINSTANCE = org.xrepl.xscript.impl.XscriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XScriptImpl <em>XScript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XScriptImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXScript()
	 * @generated
	 */
	int XSCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCRIPT__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>XScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCRIPT_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.XScriptExpression <em>XScript Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.XScriptExpression
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXScriptExpression()
	 * @generated
	 */
	int XSCRIPT_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>XScript Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCRIPT_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XImportImpl <em>XImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XImportImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXImport()
	 * @generated
	 */
	int XIMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT__IMPORTED_NAMESPACE = XSCRIPT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT__EXTENSION = XSCRIPT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT__STATIC = XSCRIPT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_FEATURE_COUNT = XSCRIPT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XNamespaceImpl <em>XNamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XNamespaceImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXNamespace()
	 * @generated
	 */
	int XNAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMESPACE__NAME = XSCRIPT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMESPACE_FEATURE_COUNT = XSCRIPT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XEPackageImportImpl <em>XE Package Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XEPackageImportImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXEPackageImport()
	 * @generated
	 */
	int XE_PACKAGE_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Ns Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_PACKAGE_IMPORT__NS_URI = XSCRIPT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_PACKAGE_IMPORT__NAME = XSCRIPT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XE Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_PACKAGE_IMPORT_FEATURE_COUNT = XSCRIPT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XNewEObjectImpl <em>XNew EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XNewEObjectImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXNewEObject()
	 * @generated
	 */
	int XNEW_EOBJECT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNEW_EOBJECT__TYPE = XSCRIPT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XNew EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNEW_EOBJECT_FEATURE_COUNT = XSCRIPT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.xrepl.xscript.impl.XEClassTypeImpl <em>XE Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xrepl.xscript.impl.XEClassTypeImpl
	 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXEClassType()
	 * @generated
	 */
	int XE_CLASS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__ANNOTATIONS = TypesPackage.JVM_GENERIC_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__DECLARING_TYPE = TypesPackage.JVM_GENERIC_TYPE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__VISIBILITY = TypesPackage.JVM_GENERIC_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__SIMPLE_NAME = TypesPackage.JVM_GENERIC_TYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__IDENTIFIER = TypesPackage.JVM_GENERIC_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__ARRAY_TYPE = TypesPackage.JVM_GENERIC_TYPE__ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__SUPER_TYPES = TypesPackage.JVM_GENERIC_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__MEMBERS = TypesPackage.JVM_GENERIC_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__ABSTRACT = TypesPackage.JVM_GENERIC_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__STATIC = TypesPackage.JVM_GENERIC_TYPE__STATIC;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__FINAL = TypesPackage.JVM_GENERIC_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__PACKAGE_NAME = TypesPackage.JVM_GENERIC_TYPE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__TYPE_PARAMETERS = TypesPackage.JVM_GENERIC_TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE__INTERFACE = TypesPackage.JVM_GENERIC_TYPE__INTERFACE;

	/**
	 * The number of structural features of the '<em>XE Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XE_CLASS_TYPE_FEATURE_COUNT = TypesPackage.JVM_GENERIC_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XScript <em>XScript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XScript</em>'.
	 * @see org.xrepl.xscript.XScript
	 * @generated
	 */
	EClass getXScript();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XImport <em>XImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XImport</em>'.
	 * @see org.xrepl.xscript.XImport
	 * @generated
	 */
	EClass getXImport();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.xrepl.xscript.XImport#getImportedNamespace()
	 * @see #getXImport()
	 * @generated
	 */
	EAttribute getXImport_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XImport#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.xrepl.xscript.XImport#isExtension()
	 * @see #getXImport()
	 * @generated
	 */
	EAttribute getXImport_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XImport#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.xrepl.xscript.XImport#isStatic()
	 * @see #getXImport()
	 * @generated
	 */
	EAttribute getXImport_Static();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XNamespace <em>XNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XNamespace</em>'.
	 * @see org.xrepl.xscript.XNamespace
	 * @generated
	 */
	EClass getXNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XNamespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xrepl.xscript.XNamespace#getName()
	 * @see #getXNamespace()
	 * @generated
	 */
	EAttribute getXNamespace_Name();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XEPackageImport <em>XE Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XE Package Import</em>'.
	 * @see org.xrepl.xscript.XEPackageImport
	 * @generated
	 */
	EClass getXEPackageImport();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XEPackageImport#getNsUri <em>Ns Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Uri</em>'.
	 * @see org.xrepl.xscript.XEPackageImport#getNsUri()
	 * @see #getXEPackageImport()
	 * @generated
	 */
	EAttribute getXEPackageImport_NsUri();

	/**
	 * Returns the meta object for the attribute '{@link org.xrepl.xscript.XEPackageImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xrepl.xscript.XEPackageImport#getName()
	 * @see #getXEPackageImport()
	 * @generated
	 */
	EAttribute getXEPackageImport_Name();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XNewEObject <em>XNew EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XNew EObject</em>'.
	 * @see org.xrepl.xscript.XNewEObject
	 * @generated
	 */
	EClass getXNewEObject();

	/**
	 * Returns the meta object for the reference '{@link org.xrepl.xscript.XNewEObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xrepl.xscript.XNewEObject#getType()
	 * @see #getXNewEObject()
	 * @generated
	 */
	EReference getXNewEObject_Type();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XScriptExpression <em>XScript Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XScript Expression</em>'.
	 * @see org.xrepl.xscript.XScriptExpression
	 * @generated
	 */
	EClass getXScriptExpression();

	/**
	 * Returns the meta object for class '{@link org.xrepl.xscript.XEClassType <em>XE Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XE Class Type</em>'.
	 * @see org.xrepl.xscript.XEClassType
	 * @generated
	 */
	EClass getXEClassType();

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
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XScriptImpl <em>XScript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XScriptImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXScript()
		 * @generated
		 */
		EClass XSCRIPT = eINSTANCE.getXScript();

		/**
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XImportImpl <em>XImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XImportImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXImport()
		 * @generated
		 */
		EClass XIMPORT = eINSTANCE.getXImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getXImport_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XIMPORT__EXTENSION = eINSTANCE.getXImport_Extension();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XIMPORT__STATIC = eINSTANCE.getXImport_Static();

		/**
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XNamespaceImpl <em>XNamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XNamespaceImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXNamespace()
		 * @generated
		 */
		EClass XNAMESPACE = eINSTANCE.getXNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNAMESPACE__NAME = eINSTANCE.getXNamespace_Name();

		/**
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XEPackageImportImpl <em>XE Package Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XEPackageImportImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXEPackageImport()
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
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XNewEObjectImpl <em>XNew EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XNewEObjectImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXNewEObject()
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
		 * The meta object literal for the '{@link org.xrepl.xscript.XScriptExpression <em>XScript Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.XScriptExpression
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXScriptExpression()
		 * @generated
		 */
		EClass XSCRIPT_EXPRESSION = eINSTANCE.getXScriptExpression();

		/**
		 * The meta object literal for the '{@link org.xrepl.xscript.impl.XEClassTypeImpl <em>XE Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xrepl.xscript.impl.XEClassTypeImpl
		 * @see org.xrepl.xscript.impl.XscriptPackageImpl#getXEClassType()
		 * @generated
		 */
		EClass XE_CLASS_TYPE = eINSTANCE.getXEClassType();

	}

} //XscriptPackage