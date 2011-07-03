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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.xrepl.EvaluationController.Factory;

import com.google.inject.Inject;

public class CommandLineRepl {
	
	private EvaluationController evaluator;
	
	@Inject
	public CommandLineRepl(InputField inputField, OutputView outputView,
			Factory evaluatorFactory) {
		super();
		evaluator = evaluatorFactory.create(inputField, outputView);
	}


	public void run() throws IOException {
		BufferedReader input = createReader(System.in);

		while (true) {
			evalAndPrint(read(input));
		}

	}

	private void evalAndPrint(String read) {
		evaluator.evaluate(read);
	}

	private String read(BufferedReader reader) throws IOException {
		StringBuilder input = new StringBuilder();
		do {
			input.append(reader.readLine());
		} while (!evaluator.canEvaluate(input.toString()));
		return input.toString();
	}

	private BufferedReader createReader(InputStream inputStream) {
		return new BufferedReader(new InputStreamReader(inputStream));
	}

}
