package org.xrepl.ui.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.xrepl.ui.WorkspaceAwareEvaluator;
import org.xrepl.ui.XreplWorkspaceResourceSetProvider;
import org.xrepl.xscript.XscriptInterpreter;
import org.xrepl.xscript.ui.internal.XscriptActivator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class WorkspaceEvaluatorTest {

	private WorkspaceAwareEvaluator fixture;
	
	private ResourceSet resourceSet = new XtextResourceSet();

	@Inject
	private XscriptInterpreter interpreter;
	
	@Inject
	private IWorkspaceRoot workspace;
	
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	@Inject
	private XreplWorkspaceResourceSetProvider resourceSetProvider;

	@Before
	public void setUp() throws Exception {
		Injector injector = XscriptActivator.getInstance().getInjector("org.xrepl.xscript.Xscript");
		injector.injectMembers(this);
		
		for(IProject project : workspace.getProjects()){
			project.delete(true, new NullProgressMonitor());
		}
		fixture = new WorkspaceAwareEvaluator(interpreter, resourceSetProvider, fileExtension);
	}

	@Test
	public void shouldCreateAHiddenJavaProject() throws Throwable {
		assertThat(xreplProject().exists(), is(false));
		fixture.evaluate("1");
		assertThat(xreplProject().exists(), is(true));
		assertThat(JavaCore.create(xreplProject()), is(CoreMatchers.notNullValue()));
	}

	@Test
	public void shouldCreateResourcesInProject() throws Throwable {
		fixture.evaluate("1");
		assertThat(resourceUri().contains(xreplProjectName()), is(true));
	}
	
	
	@Test
	public void shouldResolveClassPath() throws Throwable {
		fixture.evaluate("1 + 1");
	}

	private String resourceUri() {
		return resourceSet.getResources().get(0).getURI().trimFileExtension().toString();
	}
	private IProject xreplProject() {
		return workspace.getProject(xreplProjectName());
	}

	private String xreplProjectName() {
		return "." + fileExtension;
	}
	
}
