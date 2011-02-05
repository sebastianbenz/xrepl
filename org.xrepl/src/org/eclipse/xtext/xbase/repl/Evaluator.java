package org.eclipse.xtext.xbase.repl;

public interface Evaluator {

	public abstract Object evaluate(String code) throws Throwable;

	public abstract void reset();

	public abstract boolean canEvaluate(String input);

}