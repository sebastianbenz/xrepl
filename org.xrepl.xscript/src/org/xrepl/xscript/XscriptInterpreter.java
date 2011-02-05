package org.xrepl.xscript;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

public class XscriptInterpreter extends XbaseInterpreter {
	
	public Object _evaluateUseEPackage(
			XPackageUse packageUse, IEvaluationContext context) {
		Object ePackage = EPackage.Registry.INSTANCE.get(packageUse.getNsUri());
		if(ePackage == null){
			throw new RuntimeException("Could not resolve EPackage with uri '" + packageUse.getNsUri() + "'");
		}else{
			return ePackage;
		}
	}
	
	public Object _evaluateXScript(XScript literal, IEvaluationContext context) {
		List<XExpression> expressions = literal.getExpressions();
		Object result = null;
		for (XExpression expression : expressions) {
			result = internalEvaluate(expression, context);
		}
		return result;
	}
	
	public Object _evaluateNewEObject(
			XNewEObject newEObject, IEvaluationContext context) {
		EClass type = newEObject.getType();
		if(type == null || type.eIsProxy()){
			return null;
		}
		return type.getEPackage().getEFactoryInstance().create(type);
	}

}
