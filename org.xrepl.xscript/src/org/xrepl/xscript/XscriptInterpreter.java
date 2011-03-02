/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package org.xrepl.xscript;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

public class XscriptInterpreter extends XbaseInterpreter {
	
	
	public Object _evaluateEPackageImport(XEPackageImport packageUse, IEvaluationContext context, CancelIndicator cancelIndicator) {
		Object ePackage = EPackage.Registry.INSTANCE.get(packageUse.getNsUri());
		if(ePackage == null){
			throw new RuntimeException("Could not resolve EPackage with uri '" + packageUse.getNsUri() + "'");
		}else{
			return ePackage;
		}
	}
	
	public Object _evaluateXScript(XScript literal, IEvaluationContext context, CancelIndicator cancelIndicator) {
		List<XExpression> expressions = literal.getExpressions();
		Object result = null;
		for (XExpression expression : expressions) {
			result = internalEvaluate(expression, context, cancelIndicator);
		}
		return result;
	}
	
	public Object _evaluateXNewEObject(XNewEObject newEObject, IEvaluationContext context, CancelIndicator cancelIndicator) {
		EClass type = newEObject.getType();
		if(type == null || type.eIsProxy()){
			return null;
		}
		return type.getEPackage().getEFactoryInstance().create(type);
	}
	
	public Object _evaluateXImport(XImport xImport, IEvaluationContext context, CancelIndicator cancelIndicator) {
		return xImport.getImportedNamespace();
	}

}
