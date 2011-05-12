package org.xrepl.xscript.jvmmodel
 
import org.eclipse.xtext.xbase.jvmmodel.*
import org.eclipse.xtext.common.types.*
import org.eclipse.emf.ecore.EObject
import java.util.List

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. 
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>     
 */
class XscriptJvmModelInferrer implements IJvmModelInferrer {

	@Inject IJvmModelAssociator 

   	override List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
   		return newArrayList();
   	}
}
