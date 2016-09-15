package generating;

//singleton

public class SwitchyardProject {

	// public static final String TMP_DIR = "./tmp/";
	public static final String FILES_DIR = "files_sc/";
	public static final String FEATURES_DIR = FILES_DIR + "features/";
	public static final String IMAGES_DIR = FILES_DIR + "images/";
	public static final String VELOCITY_DIR = FILES_DIR + "velocity/";
	public static final String S2T2_JAR_PATH = FILES_DIR + "s2t2-configurator-0.1.1/ie.lero.spl.vizconfig.jar";

	// features
	public static final String SPECIALIZED_FEATURES = FEATURES_DIR + "specialized_features.txt";
	public static final String ESSENTIAL_FEATURES = FEATURES_DIR + "essential_features.txt";
//	public static final String INTERNAL_FEATURES_SP = FEATURES_DIR + "internal_features_sp.txt";
	public static final String INTERNAL_FEATURES_SC = FEATURES_DIR + "internal_features_sc.txt";
	public static final String ATTRIBUTES_SC = FEATURES_DIR + "sc_attributes.txt";
	public static final String REDUCE_COMPLEXITY_FEATURES_SP = FEATURES_DIR + "reduce_complexity_features_sp.txt";

	public static final String HIDDEN_SHARED_FEATURES = FEATURES_DIR + "hiddensharedfeatures.xml";
	public static final String HIDDEN_SC_FEATURES = FEATURES_DIR + "hiddenscinternalfeatures.xml";

	// images
	public static final String FILE_ICON_OK_PATH = IMAGES_DIR + "ok.png";

	// //content
	public static final String SPECIALIZED_FEATURES_CONTENT = util.Functions.fileToString(SPECIALIZED_FEATURES);
	public static final String ESSENTIAL_FEATURES_CONTENT = util.Functions.fileToString(ESSENTIAL_FEATURES);
//	public static final String INTERNAL_FEATURES_SP_CONTENT = util.Functions.fileToString(INTERNAL_FEATURES_SP);
	public static final String INTERNAL_FEATURES_SC_CONTENT = util.Functions.fileToString(INTERNAL_FEATURES_SC);
	public static final String ATTRIBUTES_SC_CONTENT = util.Functions.fileToString(ATTRIBUTES_SC);
	public static final String REDUCE_COMPLEXITY_FEATURES_SP_CONTENT = util.Functions
			.fileToString(REDUCE_COMPLEXITY_FEATURES_SP);
//	public static final byte[] FILE_ICON_OK_PATH_CONTENT = util.Functions.readResourceToByteArray(FILE_ICON_OK_PATH);

	public static String getVelocityDir(String fileName) {
		return VELOCITY_DIR + fileName;
	}

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

}
