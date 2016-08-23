package features.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import generating.SwitchyardProject;
import util.Functions;

public class UtilAuthenticationFeature {
	
public SwitchyardProject switchyardProject;
	
	public final static String AUTH_FILE_NAME = "ConsumerHeader";
	
	public String authFilePath;
	public String authFilePkg;
	
	public UtilAuthenticationFeature(SwitchyardProject switchyardProject) {
		this.switchyardProject = switchyardProject;
		
		this.authFilePath = this.switchyardProject.utilDir + AUTH_FILE_NAME;
		this.authFilePkg = this.switchyardProject.utilPkg + "." + AUTH_FILE_NAME;
	}

	public void addAuthentication() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("utilPkg", this.switchyardProject.utilPkg);

		context.put("authFilePkg", this.authFilePkg);
		context.put("authFilePath", this.authFilePath);
		context.put("AUTH_FILE_NAME", AUTH_FILE_NAME);

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "util_authentication.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		 System.out.println(writer);
		 System.out.println(this.authFilePath);
		Functions.stringToFile(writer.toString(), this.authFilePath + ".java", false);
		///////
		//

	}
	
	public String getAuthFilePath() {
		return authFilePath;
	}
	
	public String getAuthFilePkg() {
		return authFilePkg;
	}
	
	public static String getAuthFileName() {
		return AUTH_FILE_NAME;
	}

}
