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
package org.xrepl;

import org.eclipse.xtext.util.CancelIndicator;

public interface Evaluator {

	public abstract boolean canEvaluate(String input);

	public abstract Object evaluate(String input) throws Throwable;

	public abstract Object evaluate(String input,
			CancelIndicator cancelIndicator) throws Throwable;

	public abstract void reset();
}