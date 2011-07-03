package org.xrepl.ui;

import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.xrepl.XreplResourceSetProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class XreplWorkspaceResourceSetProvider extends XreplResourceSetProvider {

	private final String fileExtension;

	@Inject
	public XreplWorkspaceResourceSetProvider(
			@Named(Constants.FILE_EXTENSIONS) String fileExtension,
			PluginProjectFactory projectFactory) {
		this.fileExtension = fileExtension;
		this.projectFactory = projectFactory;
	}

	@Override
	protected ResourceSet createResourceSet() {
		ResourceSet resourceSet = super.createResourceSet();
		if (resourceSet instanceof XtextResourceSet) {
			checkXreplProjectExists((XtextResourceSet) resourceSet);
		}
		return resourceSet;
	}

	private PluginProjectFactory projectFactory;

	private void checkXreplProjectExists(XtextResourceSet resourceSet) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(xreplProjectName());
		if (!project.exists()) {
			projectFactory.addRequiredBundles(Lists
					.newArrayList(referencedBundles()));
			projectFactory.addBuilderIds(JavaCore.BUILDER_ID);
			projectFactory.addProjectNatures(JavaCore.NATURE_ID,
					"org.eclipse.pde.PluginNature");
			projectFactory.setProjectName(xreplProjectName());
			projectFactory.addFolders(Collections.singletonList("src"));
			project = projectFactory.createProject(new NullProgressMonitor(),
					null);
		}
		resourceSet.setClasspathURIContext(JavaCore.create(project));
	}

	protected String referencedBundles() {
		return "org.eclipse.xtext.xbase.lib";
	}

	private String xreplProjectName() {
		return "." + fileExtension;
	}

}
