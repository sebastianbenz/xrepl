package org.xrepl.generator;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.Naming;

import com.google.common.collect.Lists;

public class Junit4Fragment extends AbstractGeneratorFragment {
	private static final Logger log = Logger.getLogger(Junit4Fragment.class);

	private String projectName;
	
	public void setReplProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		if (getNaming().getPathTestProject()!=null) {
			if (log.isInfoEnabled()) {
				log.info("generating Junit4 Test support classes");
			}
			super.generate(grammar, ctx);
		} else {
			log.warn("skip execution of '"+getClass().getName()+"' due to missing configuration");
		}
	}

	@Override
	protected List<Object> getParameters(Grammar grammar) {
		return Lists.<Object>newArrayList(this);
	}

	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (getNaming().getPathTestProject()==null) {
			issues.addWarning("Missing test project path configuration 'Generator#pathTestProject' required for fragment '"+getClass().getName()+"'.");
		}
	}

	@Override
	public String[] getExportedPackagesUi(Grammar grammar) {
		return new String[] { getNaming().activatorPackageName()};
	}


}
