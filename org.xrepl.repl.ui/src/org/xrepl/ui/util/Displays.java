package org.xrepl.ui.util;

import org.eclipse.swt.widgets.Display;

public class Displays {

	public static void runInUiThread(Runnable runnable) {
		Display.getDefault().asyncExec(runnable);
	}	



}

