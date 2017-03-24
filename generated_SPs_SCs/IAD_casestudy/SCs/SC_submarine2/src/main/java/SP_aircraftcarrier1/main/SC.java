package SP_aircraftcarrier1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1
					.start();
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml :***************//");

		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml *************//

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2
					.start();
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml *************//

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
					.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml :***************//");

		SP_aircraftcarrier1.output.OutputDataClassName_3_3 result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = (SP_aircraftcarrier1.output.OutputDataClassName_3_3) scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
				.getResponse();

		String state_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
				.getState();

		System.out
				.println("OutputName_3_3_2 : "
						+ result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
								.getOutputName_3_3_2());
		System.out
				.println("OutputName_3_3_1 : "
						+ result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
								.getOutputName_3_3_1());

		System.out
				.println("State : "
						+ state_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3);
		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml *************//
	}
}
