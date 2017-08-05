package features.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import generating.SwitchyardProject;
import util.Functions;

public class UtilTransformerFeature {

	public static final String XMLSOAPTransformersFileName = "XMLSOAPTransformers";

	public String XMLSOAPTransformersFilePath;
	public String XMLSOAPTransformersFilePkg;

	public SwitchyardProject switchyardProject;

	public UtilTransformerFeature(SwitchyardProject switchyardProject) {

		this.switchyardProject = switchyardProject;
		this.XMLSOAPTransformersFilePath = this.switchyardProject.utilDir + XMLSOAPTransformersFileName;

		this.XMLSOAPTransformersFilePkg = this.switchyardProject.utilPkg + "." + XMLSOAPTransformersFileName;
	}

	public void addTransformer() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t;

		context.put("utilPkg", this.switchyardProject.utilPkg);
		context.put("XMLSOAPTransformersFilePkg", this.XMLSOAPTransformersFilePkg);
		context.put("XMLSOAPTransformersFilePath", this.XMLSOAPTransformersFilePath);
		context.put("XMLSOAPTransformersFileName", XMLSOAPTransformersFileName);

		/* get the Template */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "util_soap_transformer.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		System.out.println(this.XMLSOAPTransformersFilePath);
		Functions.stringToFile(writer.toString(), this.XMLSOAPTransformersFilePath + ".java", false);
		///////
	}

}
