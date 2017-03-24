package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_3_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_3_1.fml");
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_3_1.fml :***************//");

		SP_command.output.OutputDataClassName_7_3 result_SP_command_ServiceName_7_CapabilityName_7_3_am1 = (SP_command.output.OutputDataClassName_7_3) scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1
				.getResponse();

		String state_SP_command_ServiceName_7_CapabilityName_7_3_am1 = scGenerator_SP_command_ServiceName_7_CapabilityName_7_3_am1
				.getState();

		System.out.println("OutputName_7_3_1 : "
				+ result_SP_command_ServiceName_7_CapabilityName_7_3_am1
						.getOutputName_7_3_1());

		System.out.println("State : "
				+ state_SP_command_ServiceName_7_CapabilityName_7_3_am1);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_3_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_2.fml");
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2.start();
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_2.fml :***************//");

		SP_command.output.OutputDataClassName_7_4 result_SP_command_ServiceName_7_CapabilityName_7_4_am2 = (SP_command.output.OutputDataClassName_7_4) scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2
				.getResponse();

		String state_SP_command_ServiceName_7_CapabilityName_7_4_am2 = scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am2
				.getState();

		System.out.println("OutputName_7_4_2 : "
				+ result_SP_command_ServiceName_7_CapabilityName_7_4_am2
						.getOutputName_7_4_2());
		System.out.println("OutputName_7_4_1 : "
				+ result_SP_command_ServiceName_7_CapabilityName_7_4_am2
						.getOutputName_7_4_1());
		System.out.println("OutputName_7_4_4 : "
				+ result_SP_command_ServiceName_7_CapabilityName_7_4_am2
						.getOutputName_7_4_4());
		System.out.println("OutputName_7_4_3 : "
				+ result_SP_command_ServiceName_7_CapabilityName_7_4_am2
						.getOutputName_7_4_3());

		System.out.println("State : "
				+ state_SP_command_ServiceName_7_CapabilityName_7_4_am2);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_3.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am3.start();
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_3.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_3.fml *************//
	}
}
