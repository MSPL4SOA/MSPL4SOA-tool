package state;

import java.io.File;
import java.util.UUID;

import scfactory.SCGenerator;
import util.Functions;

public class StateMessagingDP {

	final public static String HeaderName ="state_header";
	private String state;

	private File stateFile;
	
//	public String serviceName;
//	public String methodName;
	
	public String stateDirPath = "state/";

	
	public StateMessagingDP(SCGenerator amGenerator) {
//		this.serviceName = amGenerator.extractCapabilityFromContract().serviceName;
//		this.methodName = amGenerator.extractCapabilityFromContract().name;
		
		stateDirPath = amGenerator.projectPath + stateDirPath;
		
		stateFile = new File(stateDirPath + amGenerator.extractCapabilityFromContract().serviceName + "." + amGenerator.extractCapabilityFromContract().name + ".txt");
		// + UUID.randomUUID()
		
//		stateFile.delete();
		(new File(stateDirPath)).mkdirs();
	}

	public void setStateInDisk(String state) {

//		I just removed (to test TODO)
//		stateFile.delete();
		Functions.stringToFile(state, stateFile.getAbsolutePath(), false);
		//
		// //////////////////
	}

	public void setStateInMemory(String state) {
		this.state = state;
	}

	private String getStateFromDisk() {
		if (stateFile.exists())
			return Functions.fileToString(stateFile.getAbsolutePath()).trim();

		return "";
	}

	public String getState() {

		if (state == null || state.equals(""))
			return getStateFromDisk();

		return state.trim();
	}
}
