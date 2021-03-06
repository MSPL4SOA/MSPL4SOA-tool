package SP_aircraftcarrier1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_1.fml *************//
		//
		SCGenerator scGenerator_ServiceName_3_CapabilityName_3_2_am1 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_3_CapabilityName_3_2_am1
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_1.fml");
			scGenerator_ServiceName_3_CapabilityName_3_2_am1.start();
			scGenerator_ServiceName_3_CapabilityName_3_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_1.fml :***************//");

		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_1.fml *************//

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_3_CapabilityName_3_2_am2 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_3_CapabilityName_3_2_am2
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_2.fml");
			scGenerator_ServiceName_3_CapabilityName_3_2_am2.start();
			scGenerator_ServiceName_3_CapabilityName_3_2_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_2_2.fml *************//

		//************* Begin of ./files_generated/SP_aircraftcarrier1/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_2_am3 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_2_am3
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_1_CapabilityName_1_2_3.fml");
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_1_CapabilityName_1_2_3.fml :***************//");

		SP_aircraftcarrier1.output.OutputDataClassName_1_2 result_ServiceName_1_CapabilityName_1_2_am3 = (SP_aircraftcarrier1.output.OutputDataClassName_1_2) scGenerator_ServiceName_1_CapabilityName_1_2_am3
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_2_am3 = scGenerator_ServiceName_1_CapabilityName_1_2_am3
				.getState();

		System.out.println("OutputName_1_2_5 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_5());
		System.out.println("OutputName_1_2_6 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_6());
		System.out.println("OutputName_1_2_3 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_3());
		System.out.println("OutputName_1_2_4 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_4());
		System.out.println("OutputName_1_2_1 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_2());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_2_am3);
		//
		//************* End of ./files_generated/SP_aircraftcarrier1/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
	}
}
