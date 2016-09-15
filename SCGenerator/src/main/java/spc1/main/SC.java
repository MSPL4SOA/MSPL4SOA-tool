package spc1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/spc1/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_1_am1 = new SCGenerator(
				"./files_generated/spc1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_1_am1
					.setAmFilePath("./files_generated/spc1/am/ServiceName_1_CapabilityName_1_1_2.fml");
			scGenerator_ServiceName_1_CapabilityName_1_1_am1.start();
			scGenerator_ServiceName_1_CapabilityName_1_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/spc1/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		spc1.output.OutputDataClassName_1_1 result_ServiceName_1_CapabilityName_1_1_am1 = (spc1.output.OutputDataClassName_1_1) scGenerator_ServiceName_1_CapabilityName_1_1_am1
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_1_am1 = scGenerator_ServiceName_1_CapabilityName_1_1_am1
				.getState();

		System.out.println("OutputName_1_1_2 : "
				+ result_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_1 : "
				+ result_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_1_am1);
		//
		//************* End of ./files_generated/spc1/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
	}
}
