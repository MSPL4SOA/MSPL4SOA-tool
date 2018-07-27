package SP_helicopter1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_1.fml *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_1.fml");
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
					.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_1.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_1_1 result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1 = (SP_helicopter1.output.OutputDataClassName_1_1) scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
				.getResponse();

		String state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1 = scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
				.getState();

		System.out.println("OutputName_1_1_8 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_8());
		System.out.println("OutputName_1_1_6 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_6());
		System.out.println("OutputName_1_1_7 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_7());
		System.out.println("OutputName_1_1_4 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_4());
		System.out.println("OutputName_1_1_5 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_5());
		System.out.println("OutputName_1_1_2 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am1);
		//
		//************* End of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_1.fml *************//

		//************* Begin of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_2.fml *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am2 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am2
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_2.fml");
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am2
					.start();
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am2
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_2.fml *************//

		//************* Begin of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_3.fml *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am3 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am3
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_3.fml");
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am3
					.start();
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_2_am3
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_3.fml :***************//");

		//
		//************* End of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_2_3.fml *************//
	}
}
