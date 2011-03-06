package org.xrepl.xscript.jvmmodel;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class XscriptJvmModelInferrer implements IJvmModelInferrer {
  private final XscriptJvmModelInferrer _this = this;
  @com.google.inject.Inject private IJvmModelAssociator iJvmModelAssociator;
  
  public List<? extends EObject> inferJvmModel(final EObject sourceObject) {
    ArrayList<? extends EObject> _newArrayList = CollectionLiterals.newArrayList();
    return _newArrayList;
  }
}