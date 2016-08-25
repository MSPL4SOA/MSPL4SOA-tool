package test;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class MainBasic {

	public static void main(String[] args) {

		//************* ServiceName_1 CapabilityName_1_1_4 **********************//
		try {
			SCGenerator amGenerator;
			amGenerator = new SCGenerator("./files/fm_sc_update.fml");
			amGenerator.setAmFilePath("./files/am/ServiceName_1_CapabilityName_1_1_4.fml");
			
			amGenerator.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			amGenerator.stop();

			Object result = amGenerator.getResponse();
			String state = amGenerator.stateMessagingDP.getState();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		//***********************************************************************//
	}
}
