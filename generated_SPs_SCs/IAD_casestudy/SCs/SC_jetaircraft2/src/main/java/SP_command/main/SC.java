package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_1.fml");
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am1.start();
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_1.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_3_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_3_CapabilityName_3_3_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_3_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_3_2.fml");
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_3_am2.start();
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_3_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_3_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_3_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_2_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_2_3.fml");
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_2_3.fml :***************//");

		SP_command.output.OutputDataClassName_3_2 result_SP_command_ServiceName_3_CapabilityName_3_2_am3 = (SP_command.output.OutputDataClassName_3_2) scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3
				.getResponse();

		String state_SP_command_ServiceName_3_CapabilityName_3_2_am3 = scGenerator_SP_command_ServiceName_3_CapabilityName_3_2_am3
				.getState();

		System.out.println("OutputName_3_2_1 : "
				+ result_SP_command_ServiceName_3_CapabilityName_3_2_am3
						.getOutputName_3_2_1());
		System.out.println("OutputName_3_2_2 : "
				+ result_SP_command_ServiceName_3_CapabilityName_3_2_am3
						.getOutputName_3_2_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_3_CapabilityName_3_2_am3);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_2_3.fml *************//
	}
}
