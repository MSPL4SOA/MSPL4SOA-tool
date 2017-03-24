package SP_infantry1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_3_1.fml *************//
		//
		SCGenerator scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_3_1.fml");
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
					.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_3_1.fml :***************//");

		SP_infantry1.output.OutputDataClassName_3_3 result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1 = (SP_infantry1.output.OutputDataClassName_3_3) scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
				.getResponse();

		String state_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1 = scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
				.getState();

		System.out.println("OutputName_3_3_4 : "
				+ result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
						.getOutputName_3_3_4());
		System.out.println("OutputName_3_3_5 : "
				+ result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
						.getOutputName_3_3_5());
		System.out.println("OutputName_3_3_2 : "
				+ result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
						.getOutputName_3_3_2());
		System.out.println("OutputName_3_3_3 : "
				+ result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
						.getOutputName_3_3_3());
		System.out.println("OutputName_3_3_1 : "
				+ result_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1
						.getOutputName_3_3_1());

		System.out.println("State : "
				+ state_SP_infantry1_ServiceName_3_CapabilityName_3_3_am1);
		//
		//************* End of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_3_1.fml *************//

		//************* Begin of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_1_2.fml *************//
		//
		SCGenerator scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_1_am2 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_1_am2
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_1_2.fml");
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_1_am2
					.start();
			scGenerator_SP_infantry1_ServiceName_3_CapabilityName_3_1_am2
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_1_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_infantry1/am/ServiceName_3_CapabilityName_3_1_2.fml *************//

		//************* Begin of ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
		//
		SCGenerator scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_2_3.fml");
			scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
					.start();
			scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
					.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_2_3.fml :***************//");

		SP_infantry1.output.OutputDataClassName_1_2 result_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3 = (SP_infantry1.output.OutputDataClassName_1_2) scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
				.getResponse();

		String state_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3 = scGenerator_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
				.getState();

		System.out.println("OutputName_1_2_3 : "
				+ result_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_3());
		System.out.println("OutputName_1_2_4 : "
				+ result_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_4());
		System.out.println("OutputName_1_2_1 : "
				+ result_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : "
				+ result_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3
						.getOutputName_1_2_2());

		System.out.println("State : "
				+ state_SP_infantry1_ServiceName_1_CapabilityName_1_2_am3);
		//
		//************* End of ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_2_3.fml *************//
	}
}
