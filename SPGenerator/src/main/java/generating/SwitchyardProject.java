package generating;

import java.io.File;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import features.contract.ContractFeature;
import features.util.UtilAuthenticationFeature;
import features.util.UtilStateFeature;
import features.util.UtilTransformerFeature;
import main.MainGui;
import util.CustomDOMParser;
import util.Functions;

//singleton

public class SwitchyardProject {

	public static final ClassLoader SWITCHYARD_PROJECT_CLASS_LOADER = SwitchyardProject.class.getClassLoader();

	// just for viewing in form
	// public static String PROJECTS_INIT_DIR = "./projects/";
	
	//will be modified as HostName + MainGui.PROJECT_NAME
	public static String HOST_NAME = "http://localhost:8080/";

	public static final String SCRIPTS_DIR = MainGui.FILES_GENERATED_PATH + "tmp/";
	// public static final String TMP_DIR = "./tmp/";
	public static final String FILES_DIR = "files_sp/";
	public static final String FEATURES_DIR = FILES_DIR + "features/";
	public static final String IMAGES_DIR = FILES_DIR + "images/";
	public static final String VELOCITY_DIR = FILES_DIR + "velocity/";
	public static final String S2T2_JAR_PATH = FILES_DIR + "s2t2-configurator-0.1.1/ie.lero.spl.vizconfig.jar";

	// features
	public static final String SPECIALIZED_FEATURES = FEATURES_DIR + "specialized_features.txt";
	public static final String ESSENTIAL_FEATURES = FEATURES_DIR + "essential_features.txt";
	public static final String INTERNAL_FEATURES_SP = FEATURES_DIR + "internal_features_sp.txt";
	public static final String INTERNAL_FEATURES_SC = FEATURES_DIR + "internal_features_sc.txt";
	public static final String ATTRIBUTES_SP = FEATURES_DIR + "sp_attributes.txt";
	public static final String REDUCE_COMPLEXITY_FEATURES_SP = FEATURES_DIR + "reduce_complexity_features_sp.txt";

	public static final String HIDDEN_SHARED_FEATURES = FEATURES_DIR + "hiddensharedfeatures.xml";
	public static final String HIDDEN_SP_FEATURES = FEATURES_DIR + "hiddenspinternalfeatures.xml";
	
	// images
	public static final String FILE_ICON_OK_PATH = IMAGES_DIR + "ok.png";

	// //content
	public static final String SPECIALIZED_FEATURES_CONTENT = util.Functions.readResourceToString(SPECIALIZED_FEATURES);
	public static final String ESSENTIAL_FEATURES_CONTENT = util.Functions.readResourceToString(ESSENTIAL_FEATURES);
	public static final String INTERNAL_FEATURES_SP_CONTENT = util.Functions.readResourceToString(INTERNAL_FEATURES_SP);
	public static final String INTERNAL_FEATURES_SC_CONTENT = util.Functions.readResourceToString(INTERNAL_FEATURES_SC);
	public static final String ATTRIBUTES_SP_CONTENT = util.Functions.readResourceToString(ATTRIBUTES_SP);
	public static final String REDUCE_COMPLEXITY_FEATURES_SP_CONTENT = util.Functions
			.readResourceToString(REDUCE_COMPLEXITY_FEATURES_SP);
	
	
	public static final byte[] FILE_ICON_OK_PATH_CONTENT = util.Functions.readResourceToByteArray(FILE_ICON_OK_PATH);

	
	// // //content
	// public static final String SPECIALIZED_FEATURES_CONTENT =
	// util.Functions.fileToString(SPECIALIZED_FEATURES);
	// public static final String ESSENTIAL_FEATURES_CONTENT =
	// util.Functions.fileToString(ESSENTIAL_FEATURES);
	// public static final String INTERNAL_FEATURES_SP_CONTENT =
	// util.Functions.fileToString(INTERNAL_FEATURES_SP);
	// public static final String INTERNAL_FEATURES_SC_CONTENT =
	// util.Functions.fileToString(INTERNAL_FEATURES_SC);
	// public static final String ATTRIBUTES_SP_CONTENT =
	// util.Functions.fileToString(ATTRIBUTES_SP);
	// public static final String REDUCE_COMPLEXITY_FEATURES_SP_CONTENT =
	// util.Functions
	// .fileToString(REDUCE_COMPLEXITY_FEATURES_SP);

	// public static String getResourcePath(String path) {
	// return new
	// File(SWITCHYARD_PROJECT_CLASS_LOADER.getResource(path).getFile()).getAbsolutePath();
	// }
	//

	public static String getVelocityDir(String fileName) {
		return VELOCITY_DIR + fileName;
	}

	public String projectsDirPath;// /home/akram/Bureau/

	// public String scriptsDirPath = "./scripts/";
	// public String switchyardProjectInitPath;
	// public String projectName;
	public String projectPath;
	public String metaInf;
	public String pomFilePath;
	public String switchyardFilePath;
	public String beansFilePath;
	public String srcMainDirPath;
	public String pkgSrcMain;
	public String groupId;
	public String artifactId;
	public String mavenCmd;
	public String srcDirPath;
	public String resourcesDirPath;
	public String namespace;
	public String classesDir;

	public String host;

	public String tmpPkgDir;

	public CustomDOMParser switchyardXMLDOMParser;

	public String transfromerPkg;
	public String transfromerDir;

	public String inputDataPkg;
	public String inputDataDir;

	public String outputDataPkg;
	public String outputDataDir;

	public String servicePkg;
	public String serviceDir;

	public String utilPkg;
	public String utilDir;

	public String composerDir;
	public String composerPkg;

	public String mapperDir;
	public String mapperPkg;

	public String statePkg;
	public String stateDir;

	public String resourcePkg;
	public String resourceDir;

	public String javaCamelRouterPkg;
	public String javaCamelRouterDir;

	public final static String TRANSFORMER_DIR = "transformer";
	public final static String INPUT_DIR = "input";
	public final static String OUTPUT_DIR = "output";
	public final static String SERVICE_DIR = "service";
	public final static String UTIL_DIR = "util";
	public final static String COMPOSER_DIR = "composer";
	public final static String MAPPER_DIR = "mapper";
	public final static String STATE_DIR = "state";
	public final static String RESOURCE_DIR = "resource";
	public final static String JAVA_CAMEL_ROUTER_DIR = "camelrouter";
	public final static String CONTRACT_DIR = "files";

	public UtilStateFeature utilStateFeature;
	public UtilTransformerFeature utilTransformerFeature;
	public UtilAuthenticationFeature utilAuthenticationFeature;

	// public String servicesXmlFileName;

	public String contractDirPath;

	public SwitchyardProject(String projectsDirPath, String groupId, String artifactId) {

		this.groupId = groupId;
		this.artifactId = artifactId;

		this.host = "http://localhost:8080/";

		this.projectsDirPath = projectsDirPath + "/";

		// this.projectName = artifactId;
		this.projectPath = this.projectsDirPath + this.artifactId + "/";
		this.srcDirPath = this.projectPath + "src/";

		this.resourcesDirPath = this.srcDirPath + "main/resources/";

		this.contractDirPath = this.resourcesDirPath + CONTRACT_DIR + "/";

		this.tmpPkgDir = this.srcDirPath + "main/java/tmp/";

		// this.switchyardProjectInitPath = "./system/" + projectName;

		this.srcMainDirPath = this.srcDirPath + "main/java/" + groupId + "/";
		this.switchyardFilePath = this.projectPath + "src/main/resources/META-INF/switchyard.xml";

		this.pkgSrcMain = groupId;

		this.pomFilePath = this.projectPath + "pom.xml";
		this.switchyardFilePath = this.resourcesDirPath + "META-INF/switchyard.xml";
		this.beansFilePath = this.resourcesDirPath + "META-INF/beans.xml";

		this.metaInf = this.resourcesDirPath + "META-INF/";

		this.namespace = "urn:" + groupId + ":" + artifactId + ":" + "1.0";

		this.classesDir = this.projectPath + "target/classes";

		this.switchyardXMLDOMParser = new CustomDOMParser(switchyardFilePath);

		// this.servicesXmlFileName = TMP_DIR + "contract" + "_" + groupId + "_"
		// + artifactId + ".xml";

		this.transfromerPkg = this.pkgSrcMain + "." + TRANSFORMER_DIR;
		this.transfromerDir = srcMainDirPath + "/" + TRANSFORMER_DIR + "/";

		this.inputDataPkg = this.pkgSrcMain + "." + INPUT_DIR;
		this.inputDataDir = srcMainDirPath + "/" + INPUT_DIR + "/";

		this.outputDataPkg = this.pkgSrcMain + "." + OUTPUT_DIR;
		this.outputDataDir = srcMainDirPath + "/" + OUTPUT_DIR + "/";

		this.servicePkg = this.pkgSrcMain + "." + SERVICE_DIR;
		this.serviceDir = srcMainDirPath + "/" + SERVICE_DIR + "/";

		this.utilPkg = this.pkgSrcMain + "." + UTIL_DIR;
		this.utilDir = srcMainDirPath + "/" + UTIL_DIR + "/";

		this.composerPkg = this.pkgSrcMain + "." + COMPOSER_DIR;
		this.composerDir = srcMainDirPath + "/" + COMPOSER_DIR + "/";

		this.mapperPkg = this.pkgSrcMain + "." + MAPPER_DIR;
		this.mapperDir = srcMainDirPath + "/" + MAPPER_DIR + "/";

		this.statePkg = this.pkgSrcMain + "." + STATE_DIR;
		this.stateDir = srcMainDirPath + "/" + STATE_DIR + "/";

		this.resourcePkg = this.pkgSrcMain + "." + RESOURCE_DIR;
		this.resourceDir = srcMainDirPath + "/" + RESOURCE_DIR + "/";

		this.javaCamelRouterPkg = this.pkgSrcMain + "." + JAVA_CAMEL_ROUTER_DIR;
		this.javaCamelRouterDir = srcMainDirPath + "/" + JAVA_CAMEL_ROUTER_DIR + "/";
		// this.switchyardFilePath
	}

	// public void generateSwitchyardProject() {
	// try {
	//
	// String generateProjectCmd = "rm -r " + this.projectPath + "\ncp -r " +
	// switchyardProjectInitPath + " "
	// + this.projectPath;
	//
	// System.out.println(generateProjectCmd);
	//
	// Functions.execExtProg(generateProjectCmd, this.scriptsDirPath +
	// "archetype_generate.sh");
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	public void generateMavenProject() {
		try {

			this.mavenCmd = "mvn archetype:generate" + " -DarchetypeGroupId=org.switchyard.archetypes"
					+ " -DarchetypeArtifactId=switchyard-application" + " -DarchetypeVersion=2.0.1.redhat-620133"
					+ " -DgroupId=" + groupId + " -DartifactId=" + artifactId
					// + " -DarchetypeArtifactId=" + archetypeGroupId
					+ " -DinteractiveMode=false";

			Functions.mkdirIfExist(projectsDirPath);
			Functions.mkdirIfExist(SCRIPTS_DIR);
			// Functions.mkdirIfExist(TMP_DIR);

			String generateProjectCmd = "cd " + projectsDirPath + "\n" + this.mavenCmd;

			System.out.println(generateProjectCmd);
			// System.exit(-1);
			// Runtime.getRuntime().exec(generateProjectCmd);

			Functions.execExtProg(generateProjectCmd, SwitchyardProject.SCRIPTS_DIR + "archetype_generate.sh");

			writeConfFiles();
			mkdirProjectDirs();

			// compileProjectMvn();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void configureSwitchyardProject() {
		this.switchyardXMLDOMParser.setDocumentBuilder();
	}

	// public void setMavenCmd() {
	//
	// // this.mavenCmd = "mvn archetype:generate"
	// // + " -DgroupId=" + groupId
	// // + " -DartifactId=" + artifactId
	// // + " -DarchetypeArtifactId=" + archetypeGroupId
	// // + " -DinteractiveMode=false";
	//
	// this.mavenCmd = "mvn archetype:generate" + "
	// -DarchetypeGroupId=org.switchyard.archetypes"
	// + " -DarchetypeArtifactId=switchyard-application" + "
	// -DarchetypeVersion=2.0.1.redhat-620133"
	// + " -DgroupId=" + groupId + " -DartifactId=" + artifactId
	// // + " -DarchetypeArtifactId=" + archetypeGroupId
	// + " -DinteractiveMode=false";
	//
	// // mvn archetype:generate -DgroupId=com.mycompany.app
	// // -DartifactId=my-app
	// // -DarchetypeArtifactId=maven-archetype-quickstart
	// // -DinteractiveMode=false
	//
	// // archetypeGroupId = org.apache.maven.archetypes
	// // groupId = com.mycompany.app
	// // artifactId = my-app
	// }

	public void writeConfFiles() {
		VelocityEngine ve = new VelocityEngine();
//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		StringWriter writer;
		context.put("groupId", groupId);
		context.put("artifactId", artifactId);
		context.put("servicePkg", servicePkg);
		context.put("resourcePkg", resourcePkg);
		context.put("SERVICE_NAME", ContractFeature.SERVICE_NAME);
		context.put("RESOURCE_NAME", ContractFeature.RESOURCE_NAME);

		/* pom */
		Template t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "pom.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.pomFilePath, false);

		/* beans */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "beans.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.beansFilePath, false);

		/* switchyard */
		t = ve.getTemplate(SwitchyardProject.VELOCITY_DIR + "switchyard.vm");
		/* now render the template into a Writer */
		writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer);
		Functions.stringToFile(writer.toString(), this.switchyardFilePath, false);

	}

	public void mkdirProjectDirs() {

		Functions.mkdirIfExist(this.transfromerDir);
		Functions.mkdirIfExist(this.inputDataDir);
		Functions.mkdirIfExist(this.outputDataDir);
		Functions.mkdirIfExist(this.serviceDir);
		Functions.mkdirIfExist(this.utilDir);
		Functions.mkdirIfExist(this.composerDir);
		// Functions.mkdirIfExist(this.mapperDir);
		Functions.mkdirIfExist(this.stateDir);
		Functions.mkdirIfExist(this.resourceDir);
		Functions.mkdirIfExist(this.javaCamelRouterDir);
		Functions.mkdirIfExist(this.contractDirPath);

	}

	public void mkdirUtilFiles() {
		utilStateFeature = new UtilStateFeature(this);
		utilStateFeature.addState();

		utilTransformerFeature = new UtilTransformerFeature(this);
		utilTransformerFeature.addTransformer();

		utilAuthenticationFeature = new UtilAuthenticationFeature(this);
		utilAuthenticationFeature.addAuthentication();

	}

	public void compileProjectMvn() {

		String compileProjectMvnCmd = "cd " + this.projectPath + "\n" + "mvn compile";

		System.out.println(compileProjectMvnCmd);
		// System.exit(-1);
		// Runtime.getRuntime().exec(generateProjectCmd);

		Functions.execExtProg(compileProjectMvnCmd, SwitchyardProject.SCRIPTS_DIR + "compile_project.sh");

	}

	public void exportContract(String scUpdateFamiliarPath, String contractXMLPath) {
		// fm_sc_update
		// contract.xml
	}

	public String getProjectsDirPath() {
		return projectsDirPath;
	}

	public void setProjectsDirPath(String projectsDirPath) {
		this.projectsDirPath = projectsDirPath;
	}

	// public String getScriptsDirPath() {
	// return scriptsDirPath;
	// }
	//
	// public void setScriptsDirPath(String scriptsDirPath) {
	// this.scriptsDirPath = scriptsDirPath;
	// }

	public String getPomFilePath() {
		return pomFilePath;
	}

	public void setPomFilePath(String pomFilePath) {
		this.pomFilePath = pomFilePath;
	}

	public String getProjectRootPath() {
		return projectsDirPath;
	}

	public void setProjectRootPath(String projectRootPath) {
		this.projectsDirPath = projectRootPath;
	}

	// public String getScriptsPath() {
	// return scriptsDirPath;
	// }
	//
	// public void setScriptsPath(String scriptsPath) {
	// this.scriptsDirPath = scriptsPath;
	// }

	// public String getSwitchyardProjectInitPath() {
	// return switchyardProjectInitPath;
	// }
	//
	// public void setSwitchyardProjectInitPath(String
	// switchyardProjectInitPath) {
	// this.switchyardProjectInitPath = switchyardProjectInitPath;
	// }
	//
	// public String getProjectName() {
	// return projectName;
	// }
	//
	// public void setProjectName(String projectName) {
	// this.projectName = projectName;
	// }

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	public String getSwitchyardFilePath() {
		return switchyardFilePath;
	}

	public void setSwitchyardFilePath(String switchyardFilePath) {
		this.switchyardFilePath = switchyardFilePath;
	}

	public String getSrcMainDirPath() {
		return srcMainDirPath;
	}

	public void setSrcMainDirPath(String srcMainDirPath) {
		this.srcMainDirPath = srcMainDirPath;
	}

	public String getPkgSrcMain() {
		return pkgSrcMain;
	}

	public void setPkgSrcMain(String pkgSrcMain) {
		this.pkgSrcMain = pkgSrcMain;
	}

}
