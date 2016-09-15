package scfactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.cxf.tools.wsdlto.WSDLToJava;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import familiar.FMFactory;
import features.bean.Capability;
import features.bean.Contract;
import features.bean.Service;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import util.FileSearch;
import util.Functions;
import util.JavaCodeFormatter;

public class SCProject {

	public Contract contract;

	public String fmSCUpdateFML;

	public String fmSCUpdateFML_eq_;

	public String host;

	public static final ClassLoader SC_PROJECT_CLASS_LOADER = SCProject.class.getClassLoader();

	public static final String FILES_DIR = "./files_sc/";
	public static final String S2T2_JAR_PATH = FILES_DIR + "s2t2-configurator-0.1.1/ie.lero.spl.vizconfig.jar";
	public static final String FEATURES_Dir = FILES_DIR + "features/";
	public static final String VELOCITY_DIR = FILES_DIR + "velocity/";
	public static final String IMAGES_DIR = FILES_DIR + "images/";

	public static final String SC_ATTRIBUTES_PATH = FEATURES_Dir + "sc_attributes.txt";
	public static final String BINDING_SOAP_XML_PATH = FILES_DIR + "soap/binding.xjb";
	public static final String FILE_ICON_OK_PATH = IMAGES_DIR + "ok.png";

	public static final String SC_ATTRIBUTES_CONTENT = util.Functions.fileToString(SC_ATTRIBUTES_PATH);
	public static final String BINDING_SOAP_XML_CONTENT = util.Functions.fileToString(BINDING_SOAP_XML_PATH);
	public static final ImageIcon FILE_ICON_OK_CONTENT = new ImageIcon(FILE_ICON_OK_PATH);

	// public static InputStream getResourcePath(String path) {
	// return SC_PROJECT_CLASS_LOADER.getResourceAsStream(path);
	// }
	//
	// public static InputStream getVelocityResourcePath(String fileName) {
	// return getResourcePath(VELOCITY_DIR + fileName);
	// }

	public static final String SRC_Dir = "./src/main/java/";
	public static String FILES_GENERATED_DIR = "./files_generated/";
	public static final String TMP_DIR = FILES_GENERATED_DIR + "tmp/";

	public static String AM_DIR;
	public static String AM_S2T2_DIR;
	public static String CAPABILITY_DIR;

	public static final String AM_DIR_NAME = "am/";
	public static final String AM_S2T2_DIR_NAME = "am_s2t2/";
	public static final String CAPABILITY_DIR_NAME = "capability/";

	public static final String CONTRACT_NAME = "contract.xml";
	public static final String FM_SC_UPDATE_FML_NAME = "fm_sc_update.fml";
	public static final String FM_SC_UPDATE_S2T2_NAME = "fm_sc_update.fmprimitives";

	public static String CONTRACT_PATH;
	public String fmSCUpdateFMLPath;
	public static String FM_SC_UPDATE_S2T2_PATH;

	// public static String CONTRACT_CONTENT;
	// public static String FM_SC_UPDATE_FML_CONTENT;
	// public static String FM_SC_UPDATE_S2T2_CONTENT;

	public String soapPkg;
	public String soapDir;

	public FMBDD fmbdd;
	public FeatureModelVariable fmvFMSCUpdate;

	public static void main(String args[]) {
		try {
			SCProject scProject = new SCProject("http://localhost:8080");
			scProject.downloadFiles();
			scProject.configureSC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public SCProject(String host) {

		// http://localhost:8080
		this.host = host;
		fmbdd = FMBDD.getInstance();

		// contractPath = FILES_Dir + "contract.xml";
		// fmSCUpdateFMLPath = FILES_Dir + "fm_sc_update.fml";
		// fmSCUpdateS2T2Path = FILES_Dir + "fm_sc_update.fmprimitives";

		// soapPkg = "gen.soap";

		new File(TMP_DIR).mkdirs();

	}

	// public void mkdirProject() {
	// Functions.mkdirIfExist(FILES_GENERATED_Dir);
	// Functions.mkdirIfExist(AM_Dir);
	// Functions.mkdirIfExist(AM_S2T2_Dir);
	// Functions.mkdirIfExist(CAPABILITY_Dir);
	// }

	public void downloadFiles() {

		ClientBuilder.newBuilder();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(this.host + "/rest/");

		// String responseString =
		// target.path("DownloadContract/contract.xml").request().method("GET")
		// .readEntity(String.class);

		String responseString = target.path("DownloadContract/fm_sc_update.fml").request().method("GET")
				.readEntity(String.class);

		fmSCUpdateFML = responseString.replaceAll(";", ";\n");

		fmSCUpdateFML_eq_ = fmSCUpdateFML;

		try {
			contract = FMFactory.convertFMSCUpdateToContractXML(fmSCUpdateFML_eq_);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// format file

		try {
			fmvFMSCUpdate = fmbdd.FM("fmscupdate", fmSCUpdateFML_eq_);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// contract.host = this.host;
		// CONTRACT_PATH = TMP_DIR + "/" + CONTRACT_NAME;
		// Functions.stringToFile(responseString, CONTRACT_PATH, false);

		// contract = (Contract) util.JAXBUtil.unmarshall(CONTRACT_PATH,
		// Contract.class);
		// contract.host = this.host;

		System.out.println(contract.projectName);

		//
		FILES_GENERATED_DIR += contract.projectName + "/";
		AM_DIR = FILES_GENERATED_DIR + AM_DIR_NAME;
		AM_S2T2_DIR = FILES_GENERATED_DIR + AM_S2T2_DIR_NAME;
		CAPABILITY_DIR = FILES_GENERATED_DIR + CAPABILITY_DIR_NAME;
		CONTRACT_PATH = FILES_GENERATED_DIR + CONTRACT_NAME;
		fmSCUpdateFMLPath = FILES_GENERATED_DIR + FM_SC_UPDATE_FML_NAME;
		FM_SC_UPDATE_S2T2_PATH = FILES_GENERATED_DIR + FM_SC_UPDATE_S2T2_NAME;

		System.out.println(CONTRACT_PATH);

		Functions.mkdirIfExist(FILES_GENERATED_DIR);
		Functions.mkdirIfExist(AM_DIR);
		Functions.mkdirIfExist(AM_S2T2_DIR);
		Functions.mkdirIfExist(CAPABILITY_DIR);
		//

		Functions.stringToFile(fmSCUpdateFML, fmSCUpdateFMLPath, false);
		util.JAXBUtil.marshall(contract, CONTRACT_PATH);

		// ----------------------//

		// Functions.stringToFile(
		// fmBDD.FM("fm_sc_update", responseString).toString(),
		// fmSCUpdateFMLPath, false);

		// ----------------------//

		responseString = target.path("DownloadContract/fm_sc_update.fmprimitives").request().method("GET")
				.readEntity(String.class);
		Functions.stringToFile(responseString, FM_SC_UPDATE_S2T2_PATH, false);

	}

	public void configureSC() throws Exception {

		generateInput();
		generateOutput();
		configureSOAP();

	}

	private void configureSOAP() throws IOException {
		ArrayList<String> inMessages = new ArrayList<String>();
		ArrayList<String> outMessages = new ArrayList<String>();
		ArrayList<String> inOutMessages = new ArrayList<String>();

		soapPkg = contract.projectName + ".soap"; // "gen.soap";
		soapDir = soapPkg.replaceAll("\\.", "/") + "/";

		boolean soapAtOnce = false;

		for (Service service : contract.services) {

			if (service.soapExist() == false)
				continue;

			soapAtOnce = true;

			String[] argswsdlToJava = new String[] { "-verbose", "-exsh", "false", "-dns", "true", "-asyncMethods",
					"-b", BINDING_SOAP_XML_PATH, "-d", SRC_Dir, "-p", soapPkg,
					host + "/" + service.interfaceName + "/" + service.interfaceName + "?wsdl" };

			WSDLToJava.main(argswsdlToJava);

			for (Capability capability : service.capabilities) {

				// String capabilityId = "_" + service.number + "_" +
				// capability.number;
				//
				// capability.serviceName = service.interfaceName;
				// capability.dataInputClassName =
				// AMGenerator.getFeatureValue(fmvFMSCUpdate,
				// "InputDataClassName" + capabilityId);
				// capability.dataOutputClassName =
				// AMGenerator.getFeatureValue(fmvFMSCUpdate,
				// "OutputDataClassName" + capabilityId);

				// System.out.println("out :: ");
				// System.out.println(capability.serviceName);
				// System.out.println(capabilityId);
				//// System.out.println(fmvFMSCUpdate);
				// System.out.println(capability.dataInputClassName);
				// System.out.println(capability.dataOutputClassName);

				inMessages.add(capability.dataInputClassName);
				outMessages.add(capability.dataOutputClassName);

			}

			inOutMessages.addAll(inMessages);
			inOutMessages.addAll(outMessages);
		}

		// System.exit(-1);

		if (soapAtOnce == false)
			return;

		FileSearch fileSearch = new FileSearch();
		fileSearch.searchDirectory(new File(SRC_Dir + soapDir), "^.*.java$");
		int count = fileSearch.getResult().size();
		if (count == 0) {
			System.out.println("\nNo result found!");
		} else {
			// System.out.println("\nFound " + count + " result!\n");
			for (File file : fileSearch.getResult()) {

				// System.out.println(file.getName().substring(0,
				// file.getName().indexOf(".")));

				// delete + ".java"
				if (inOutMessages.contains(file.getName().substring(0, file.getName().indexOf(".")))) {

					Files.deleteIfExists(Paths.get(file.getAbsolutePath()));

				} else {
					String fileContent = Functions.fileToString(file.getAbsolutePath());

					for (String input : inMessages) {
						fileContent = fileContent.replaceAll(soapPkg + "." + input, input);
					}

					for (String output : outMessages) {
						fileContent = fileContent.replaceAll(soapPkg + "." + output, output);
					}

					String add = "import " + contract.dataOutputPkg + ".*;\nimport " + contract.dataInputPkg + ".*;\n";

					fileContent = fileContent.replaceAll("package " + soapPkg + ";", "package " + soapPkg + ";\n" + add)
							.replaceAll("@XmlRegistrypublic", "@XmlRegistry public");

					Functions.stringToFile(fileContent, file.getAbsolutePath(), false);

					JavaCodeFormatter.formattingCode(file);
				}
			}
		}
	}

	private void generateInput() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, VELOCITY_DIR);
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t = ve.getTemplate("input_data.vm");
		context.put("inputDataPkg", contract.dataInputPkg);

		for (Service service : contract.services) {

			for (Capability capability : service.getCapabilities()) {

				if (capability.getInputs() != null && capability.getInputs().size() != 0) {

					context.put("service", service);
					context.put("capability", capability);

					/* get the Template */

					/* now render the template into a Writer */
					writer = new StringWriter();
					t.merge(context, writer);
					System.out.println(writer);

					String dirData = contract.dataInputPkg;
					dirData = SRC_Dir + dirData.replaceAll("\\.", "/").trim() + "/";
					(new File(dirData)).mkdirs();

					String fileOutPath = dirData + capability.dataInputClassName.trim() + ".java";
					Functions.stringToFile(writer.toString(), fileOutPath, false);

					JavaCodeFormatter.formattingCode(new File(fileOutPath));

					// System.out.println(dirData +
					// capability.dataInputClassName.trim() + ".java");

				}
			}
		}
	}

	private void generateOutput() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, VELOCITY_DIR);
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		Template t = ve.getTemplate("output_data.vm");
		context.put("outputDataPkg", contract.dataOutputPkg.trim());

		for (Service service : contract.services) {

			for (Capability capability : service.getCapabilities()) {

				if (capability.getOutputs() != null && capability.getOutputs().size() != 0) {

					context.put("service", service);
					context.put("capability", capability);

					/* get the Template */

					/* now render the template into a Writer */
					writer = new StringWriter();
					t.merge(context, writer);
					System.out.println(writer);

					String dirData = contract.dataOutputPkg;

					dirData = SRC_Dir + dirData.replaceAll("\\.", "/").trim() + "/";
					(new File(dirData)).mkdirs();

					String fileOutPath = dirData + capability.dataOutputClassName.trim() + ".java";

					Functions.stringToFile(writer.toString(), fileOutPath, false);

					JavaCodeFormatter.formattingCode(new File(fileOutPath));
				}
			}
		}
	}
}
