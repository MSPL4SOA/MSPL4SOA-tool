package v2.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

import v2.output.*;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_2_am1 = new SCGenerator("");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_2_am1
					.setAmFilePath("./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml");
			scGenerator_ServiceName_1_CapabilityName_1_2_am1.start();
			scGenerator_ServiceName_1_CapabilityName_1_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		OutputDataClassName_1_2 result_ServiceName_1_CapabilityName_1_2_am1 = (OutputDataClassName_1_2) scGenerator_ServiceName_1_CapabilityName_1_2_am1
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_2_am1 = scGenerator_ServiceName_1_CapabilityName_1_2_am1
				.getState();

		System.out.println("OutputName_1_2_1 : "
				+ result_ServiceName_1_CapabilityName_1_2_am1
						.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : "
				+ result_ServiceName_1_CapabilityName_1_2_am1
						.getOutputName_1_2_2());
		System.out.println("OutputName_1_2_3 : "
				+ result_ServiceName_1_CapabilityName_1_2_am1
						.getOutputName_1_2_3());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_2_am1);
		//
		//************* End of ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml *************//
	}
}
