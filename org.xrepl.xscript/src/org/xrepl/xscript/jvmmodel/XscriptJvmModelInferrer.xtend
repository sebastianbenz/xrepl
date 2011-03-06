package org.xrepl.xscript.jvmmodel
 
import org.eclipse.xtext.xbase.jvmmodel.*
import org.eclipse.emf.ecore.EObject
import java.util.List

/**
 * Infers a JVM model from the source model. 
 *
 * The JVM model should contain all elements in the Java code generated from your source model. 
 * Other Xtend models link against the JVM model rather than against the source model. The JVM
 * model elemens should be associated wiht their source element using the IJvmModelAssociator.     
 */
class XscriptJvmModelInferrer implements IJvmModelInferrer {

	@Inject IJvmModelAssociator 

   	List<? extends EObject> inferJvmModel(EObject sourceObject) {
   		return newArrayList();
   	}
}
