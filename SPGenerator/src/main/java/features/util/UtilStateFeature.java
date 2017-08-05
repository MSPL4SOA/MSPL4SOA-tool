package features.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import generating.SwitchyardProject;
import util.Functions;

public class UtilStateFeature {
	
	public SwitchyardProject switchyardProject;
	
	public final static String STATE_FILE_NAME = "StateBase";
	public final static String STATE_HEADER_NAME = "state_header";
	
	public String stateFilePath;
	public String stateFilePkg;
	
	public UtilStateFeature(SwitchyardProject switchyardProject) {
		this.switchyardProject = switchyardProject;
		
		this.stateFilePath = this.switchyardProject.utilDir + STATE_FILE_NAME;
		this.stateFilePkg = this.switchyardProject.utilPkg + "." + STATE_FILE_NAME;
	}

	public void addState() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("statePkg", this.switchyardProject.statePkg);
		context.put("utilPkg", this.switchyardProject.utilPkg);

		context.put("stateFilePkg", this.stateFilePkg);
		context.put("stateFilePath", this.stateFilePath);
		context.put("STATE_FILE_NAME", STATE_FILE_NAME);
		context.put("STATE_HEADER_NAME", STATE_HEADER_NAME);

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "util_state.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		 System.out.println(writer);
		 System.out.println(this.stateFilePath);
		Functions.stringToFile(writer.toString(), this.stateFilePath + ".java", false);
		///////
		//

	}
}
