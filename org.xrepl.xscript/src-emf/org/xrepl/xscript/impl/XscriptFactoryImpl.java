/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xrepl.xscript.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XscriptFactoryImpl extends EFactoryImpl implements XscriptFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XscriptFactory init()
	{
		try
		{
			XscriptFactory theXscriptFactory = (XscriptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xrepl.org/xscript/"); 
			if (theXscriptFactory != null)
			{
				return theXscriptFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XscriptFactoryImplCustom();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XscriptFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case XscriptPackage.XSCRIPT: return createXScript();
			case XscriptPackage.XIMPORT: return createXImport();
			case XscriptPackage.XNAMESPACE: return createXNamespace();
			case XscriptPackage.XE_PACKAGE_IMPORT: return createXEPackageImport();
			case XscriptPackage.XNEW_EOBJECT: return createXNewEObject();
			case XscriptPackage.XE_CLASS_TYPE: return createXEClassType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XScript createXScript()
	{
		XScriptImplCustom xScript = new XScriptImplCustom();
		return xScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImport createXImport()
	{
		XImportImplCustom xImport = new XImportImplCustom();
		return xImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNamespace createXNamespace()
	{
		XNamespaceImplCustom xNamespace = new XNamespaceImplCustom();
		return xNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEPackageImport createXEPackageImport()
	{
		XEPackageImportImplCustom xePackageImport = new XEPackageImportImplCustom();
		return xePackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNewEObject createXNewEObject()
	{
		XNewEObjectImplCustom xNewEObject = new XNewEObjectImplCustom();
		return xNewEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEClassType createXEClassType()
	{
		XEClassTypeImplCustom xeClassType = new XEClassTypeImplCustom();
		return xeClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XscriptPackage getXscriptPackage()
	{
		return (XscriptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XscriptPackage getPackage()
	{
		return XscriptPackage.eINSTANCE;
	}

} //XscriptFactoryImpl
