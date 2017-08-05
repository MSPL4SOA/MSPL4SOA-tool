package SP_helicopter1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml");
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
					.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_3_2 result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1 = (SP_helicopter1.output.OutputDataClassName_3_2) scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
				.getResponse();

		String state_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1 = scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
				.getState();

		System.out.println("OutputName_3_2_5 : "
				+ result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
						.getOutputName_3_2_5());
		System.out.println("OutputName_3_2_3 : "
				+ result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
						.getOutputName_3_2_3());
		System.out.println("OutputName_3_2_4 : "
				+ result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
						.getOutputName_3_2_4());
		System.out.println("OutputName_3_2_1 : "
				+ result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
						.getOutputName_3_2_1());
		System.out.println("OutputName_3_2_2 : "
				+ result_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
						.getOutputName_3_2_2());

		System.out.println("State : "
				+ state_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1);
		//
		//************* End of ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml *************//
	}
}
