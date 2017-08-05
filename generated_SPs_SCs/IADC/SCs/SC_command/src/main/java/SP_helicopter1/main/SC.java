package SP_helicopter1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml");
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
					.start();
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_5_4 result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = (SP_helicopter1.output.OutputDataClassName_5_4) scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
				.getResponse();

		String state_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
				.getState();

		System.out.println("OutputName_5_4_9 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_9());
		System.out.println("OutputName_5_4_7 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_7());
		System.out.println("OutputName_5_4_8 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_8());
		System.out.println("OutputName_5_4_5 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_5());
		System.out.println("OutputName_5_4_6 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_6());
		System.out.println("OutputName_5_4_3 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_3());
		System.out.println("OutputName_5_4_4 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_4());
		System.out.println("OutputName_5_4_1 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_1());
		System.out.println("OutputName_5_4_2 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
						.getOutputName_5_4_2());

		System.out.println("State : "
				+ state_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1);
		//
		//************* End of ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml *************//
	}
}
