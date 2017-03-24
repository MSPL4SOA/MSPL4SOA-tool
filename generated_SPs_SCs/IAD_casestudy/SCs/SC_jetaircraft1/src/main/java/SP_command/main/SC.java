package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml");
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am1.start();
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_3_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_3_2.fml");
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_3_2.fml :***************//");

		SP_command.output.OutputDataClassName_1_3 result_SP_command_ServiceName_1_CapabilityName_1_3_am2 = (SP_command.output.OutputDataClassName_1_3) scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_3_am2 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_3_am2
				.getState();

		System.out.println("OutputName_1_3_8 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_8());
		System.out.println("OutputName_1_3_9 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_9());
		System.out.println("OutputName_1_3_6 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_6());
		System.out.println("OutputName_1_3_7 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_7());
		System.out.println("OutputName_1_3_4 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_4());
		System.out.println("OutputName_1_3_5 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_5());
		System.out.println("OutputName_1_3_2 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_2());
		System.out.println("OutputName_1_3_3 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_3());
		System.out.println("OutputName_1_3_1 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_3_am2
						.getOutputName_1_3_1());

		System.out.println("State : "
				+ state_SP_command_ServiceName_1_CapabilityName_1_3_am2);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_3_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_2_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_5_CapabilityName_5_2_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_2_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_2_3.fml");
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_2_am3.start();
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_2_3.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_2_3.fml *************//
	}
}
