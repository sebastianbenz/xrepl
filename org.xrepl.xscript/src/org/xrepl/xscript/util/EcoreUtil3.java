/*******************************************************************************
 * Copyright (c) 2009 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 Sebastian Benz and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Sebastian Benz - Initial API and implementation
 *
 * </copyright>
 *
 * 
 */
package org.xrepl.xscript.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public final class EcoreUtil3 {

	private EcoreUtil3() {
		// should not be instantiated
	}

	public static boolean isInstantiatable(EClass eClass) {
		return !eClass.isAbstract() && !eClass.isInterface();
	}

	public static boolean isSubClass(EClass eClass, EClass potentialSubclass) {
		if (potentialSubclass == null) {
			return false;
		}

		if (eClass == potentialSubclass) {
			return true;
		}
		for (EClass superType : potentialSubclass.getEAllSuperTypes()) {
			if (eClass == superType) {
				return true;
			}
		}

		return false;
	}

	public static boolean isEReference(EStructuralFeature eFeature) {
		return eFeature instanceof EReference
				&& !((EReference) eFeature).isContainment();
	}

	public static boolean isEContainment(EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EReference) {
			EReference eReference = (EReference) eStructuralFeature;
			return eReference.isContainment();
		}
		return false;
	}

	public static boolean isEAttribute(EStructuralFeature eFeature) {
		if (eFeature == null) {
			return false;
		}
		return eFeature instanceof EAttribute;
	}

	public static boolean isStringAttribute(EStructuralFeature eFeature) {
		if (eFeature.getEType() instanceof EDataType) {
			EDataType dataType = (EDataType) eFeature.getEType();
			return dataType.getInstanceClass() == String.class;
		}
		return false;
	}

	public static boolean isIntegerAttribute(EStructuralFeature eFeature) {
		if (eFeature.getEType() instanceof EDataType) {
			EDataType dataType = (EDataType) eFeature.getEType();
			Class<?> instanceClass = dataType.getInstanceClass();
			return instanceClass == int.class || instanceClass == short.class
					|| instanceClass == long.class
					|| instanceClass == BigInteger.class;
		}
		return false;
	}

	public static boolean isBooleanAttribute(EStructuralFeature eFeature) {
		if (eFeature.getEType() instanceof EDataType) {
			EDataType dataType = (EDataType) eFeature.getEType();
			return dataType.getInstanceClass() == boolean.class;
		}
		return false;
	}

	public static boolean hasFeature(EClass eClass, EStructuralFeature eFeature) {
		return eClass.getEAllStructuralFeatures().contains(eFeature);
	}

	@SuppressWarnings("unchecked")
	public static void setOrAddValue(EObject eObject,
			EStructuralFeature eFeature, Object newValue) {
		if (eFeature.isMany()) {
			EList<Object> eList = (EList<Object>) eObject.eGet(eFeature);
			eList.add(newValue);
		} else {
			if (newValue instanceof EObject) {
				EObject newEValue = (EObject) newValue;
				if (newEValue.eIsProxy()) {
					org.eclipse.emf.ecore.util.EcoreUtil.resolve(newEValue,
							eObject);
				}
			}
			eObject.eSet(eFeature, newValue);
		}

	}

	public static boolean isDoubleAttribute(EStructuralFeature eFeature) {
		if (eFeature.getEType() instanceof EDataType) {
			EDataType dataType = (EDataType) eFeature.getEType();
			Class<?> instanceClass = dataType.getInstanceClass();
			return instanceClass == double.class
					|| instanceClass == BigDecimal.class;
		}
		return false;
	}

	public static Iterable<EAttribute> getAllAttributes(EClass eClass,
			final Class<String> type) {
		return Iterables.filter(eClass.getEAllAttributes(),
				new Predicate<EAttribute>() {

					public boolean apply(EAttribute input) {
						if (input.getEType() instanceof EDataType) {
							EDataType dataType = (EDataType) input.getEType();
							return dataType.getInstanceClass() == type;
						}
						return false;
					}
				});
	}

	public static boolean isDateAttribute(EStructuralFeature eFeature) {
		if (eFeature.getEType() instanceof EDataType) {
			EDataType dataTyp = (EDataType) eFeature.getEType();
			return dataTyp.getInstanceClass() == Date.class;
		}
		return false;
	}

	public static boolean isEnum(EClassifier eType) {
		return eType instanceof EEnum;
	}

	public static Iterable<? extends EObject> getAssignableFeatures(
			EClass eClass) {
		return Iterables.filter(eClass.getEAllStructuralFeatures(),
				new Predicate<EStructuralFeature>() {

					public boolean apply(EStructuralFeature input) {
						return input.isChangeable();
					}
				});
	}

	public static EEnumLiteral getEnumLiteral(EEnum enumType,
			final Enumerator enumerator) {
		return Iterables.find(enumType.getELiterals(),
				new Predicate<EEnumLiteral>() {

					public boolean apply(EEnumLiteral input) {
						return enumerator.toString().equals(input.getLiteral());
					}
				});
	}

	public static boolean isDuplicate(
			Collection<EStructuralFeature> existingFeatures,
			EStructuralFeature eFeature) {
		return !eFeature.isMany() && existingFeatures.contains(eFeature);
	}

//	public static boolean isDuplicate(EList<Feature> existingFeatures,
//			EStructuralFeature featureToCheck) {
//		if (featureToCheck.isMany()) {
//			return false;
//		}
//		for (Feature feature : existingFeatures) {
//			if (feature.getEFeature() == featureToCheck) {
//				return true;
//			}
//		}
//		return false;
//	}
}
