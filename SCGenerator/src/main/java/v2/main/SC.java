package v2.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_1.fml *************//
		//
		SCGenerator scGenerator_ServiceName_2_CapabilityName_2_1_am1 = new SCGenerator(
				"./files_generated/v2/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_2_CapabilityName_2_1_am1
					.setAmFilePath("./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_1.fml");
			scGenerator_ServiceName_2_CapabilityName_2_1_am1.start();
			scGenerator_ServiceName_2_CapabilityName_2_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_1.fml :***************//");

		//
		//************* End of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_1.fml *************//

		//************* Begin of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_2_CapabilityName_2_1_am2 = new SCGenerator(
				"./files_generated/v2/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_2_CapabilityName_2_1_am2
					.setAmFilePath("./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_2.fml");
			
			scGenerator_ServiceName_2_CapabilityName_2_1_am1.checkAMConsistency();
			scGenerator_ServiceName_2_CapabilityName_2_1_am2.start();
			scGenerator_ServiceName_2_CapabilityName_2_1_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_2.fml :***************//");

		//
		//************* End of ./files_generated/v2/am/ServiceName_2_CapabilityName_2_1_2.fml *************//


		//************* Begin of ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_2_am3 = new SCGenerator(
				"./files_generated/v2/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_2_am3
					.setAmFilePath("./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_3.fml");
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.start();
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_3.fml :***************//");

		v2.output.OutputDataClassName_1_2 result_ServiceName_1_CapabilityName_1_2_am3 = (v2.output.OutputDataClassName_1_2) scGenerator_ServiceName_1_CapabilityName_1_2_am3
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_2_am3 = scGenerator_ServiceName_1_CapabilityName_1_2_am3
				.getState();

		System.out.println("OutputName_1_2_1 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_2());
		System.out.println("OutputName_1_2_3 : "
				+ result_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_3());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_2_am3);
		//
		//************* End of ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
	}
}
