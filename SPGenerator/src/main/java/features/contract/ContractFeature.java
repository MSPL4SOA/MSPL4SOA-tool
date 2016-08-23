package features.contract;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import generating.SwitchyardProject;
import util.Functions;

public class ContractFeature {
	
	public SwitchyardProject switchyardProject;

	public final static String SERVICE_NAME = "DownloadContract";
	public final static String RESOURCE_NAME = "ResourceDownloadContract";

	public ContractFeature(SwitchyardProject switchyardProject) {
		this.switchyardProject = switchyardProject;
	}

	
	public void addContractFeature() {

		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer = new StringWriter();
		context.put("servicePkg", this.switchyardProject.servicePkg);
		context.put("resourcePkg", this.switchyardProject.resourcePkg);

		
		Template t;
		
		System.out.println("-------------------------------------------");
		t= ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "download_contract_interface.vm");
		/* now render the template into a Writer */
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.switchyardProject.serviceDir + SERVICE_NAME + ".java", false);
		
		
		
		System.out.println("-------------------------------------------");
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "download_contract_impl.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer.toString());
		Functions.stringToFile(writer.toString(), this.switchyardProject.serviceDir + SERVICE_NAME + "Bean.java", false);
		
		
		System.out.println("-------------------------------------------");
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "download_contract_resource.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer.toString());
		Functions.stringToFile(writer.toString(), this.switchyardProject.resourceDir + RESOURCE_NAME + ".java", false);
	}
}
