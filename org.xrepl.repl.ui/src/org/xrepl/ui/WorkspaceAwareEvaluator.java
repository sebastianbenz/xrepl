package org.xrepl.ui;

import static com.google.common.collect.Sets.newHashSet;
import static org.eclipse.emf.common.util.URI.createPlatformResourceURI;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.xrepl.DefaultEvaluator;
import org.xrepl.XreplResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.name.Named;

@SuppressWarnings("restriction")
public class WorkspaceAwareEvaluator extends DefaultEvaluator {

	@Inject
	public WorkspaceAwareEvaluator(IExpressionInterpreter interpreter,
			XreplResourceSetProvider resourceSetProvider,
			@Named(Constants.FILE_EXTENSIONS) String fileExtension) {
		super(interpreter, resourceSetProvider, fileExtension);
		configure(interpreter);
	}

	@Override
	protected URI newResourceUri() {
		return createPlatformResourceURI("." + getFileExtension() + "/src/"
				+ newResourceName(), true);
	}

	protected void configure(IExpressionInterpreter interpreter) {
		if (!(interpreter instanceof XbaseInterpreter)) {
			return;
		}
		if (!(getResourceSet() instanceof XtextResourceSet)) {
			return;
		}
		ClassLoader cl = getClass().getClassLoader();
		Object context = ((XtextResourceSet) getResourceSet())
				.getClasspathURIContext();
		if (!(context instanceof IJavaProject)) {
			return;
		}
		try {
			final IJavaProject jp = (IJavaProject) context;
			IClasspathEntry[] classpath = jp.getResolvedClasspath(true);
			final IWorkspaceRoot root = jp.getProject().getWorkspace()
					.getRoot();
			Set<URL> urls = newHashSet();
			for (int i = 0; i < classpath.length; i++) {
				final IClasspathEntry entry = classpath[i];
				if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
					IPath outputLocation = entry.getOutputLocation();
					if (outputLocation == null) {
						outputLocation = jp.getOutputLocation();
					}
					IFolder folder = root.getFolder(outputLocation);
					if (folder.exists()) {
						urls.add(new URL(folder.getRawLocationURI()
								.toASCIIString() + "/"));
					}
				} else if (entry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
					IPath outputLocation = entry.getOutputLocation();
					if (outputLocation == null) {
						IProject project = (IProject) jp.getProject()
								.getWorkspace().getRoot()
								.getContainerForLocation(entry.getPath());
						IJavaProject javaProject = JavaCore.create(project);
						outputLocation = javaProject.getOutputLocation();
					}
					IFolder folder = root.getFolder(outputLocation);
					if (folder.exists()) {
						urls.add(new URL(folder.getRawLocationURI()
								.toASCIIString() + "/"));
					}
				} else {
					urls.add(entry.getPath().toFile().toURI().toURL());
				}
			}
			cl = new URLClassLoader(urls.toArray(new URL[urls.size()]));
		} catch (Exception e) {
			e.printStackTrace();
		}
		((XbaseInterpreter) interpreter).setClassLoader(cl);
	}

}
