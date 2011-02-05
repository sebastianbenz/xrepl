/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xrepl.xscript.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.xrepl.xscript.XPackageUse;
import org.xrepl.xscript.XscriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPackage Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xrepl.xscript.impl.XPackageUseImpl#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link org.xrepl.xscript.impl.XPackageUseImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XPackageUseImpl extends XExpressionImpl implements XPackageUse {
	/**
	 * The default value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsUri()
	 * @generated
	 * @ordered
	 */
	protected String nsUri = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPackageUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XscriptPackage.Literals.XPACKAGE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsUri() {
		return nsUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsUri(String newNsUri) {
		String oldNsUri = nsUri;
		nsUri = newNsUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XscriptPackage.XPACKAGE_USE__NS_URI, oldNsUri, nsUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XscriptPackage.XPACKAGE_USE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XscriptPackage.XPACKAGE_USE__NS_URI:
				return getNsUri();
			case XscriptPackage.XPACKAGE_USE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XscriptPackage.XPACKAGE_USE__NS_URI:
				setNsUri((String)newValue);
				return;
			case XscriptPackage.XPACKAGE_USE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XscriptPackage.XPACKAGE_USE__NS_URI:
				setNsUri(NS_URI_EDEFAULT);
				return;
			case XscriptPackage.XPACKAGE_USE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XscriptPackage.XPACKAGE_USE__NS_URI:
				return NS_URI_EDEFAULT == null ? nsUri != null : !NS_URI_EDEFAULT.equals(nsUri);
			case XscriptPackage.XPACKAGE_USE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nsUri: ");
		result.append(nsUri);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XPackageUseImpl
