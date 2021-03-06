package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_4_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_4_1.fml");
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_4_1.fml :***************//");

		SP_command.output.OutputDataClassName_6_4 result_SP_command_ServiceName_6_CapabilityName_6_4_am1 = (SP_command.output.OutputDataClassName_6_4) scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1
				.getResponse();

		String state_SP_command_ServiceName_6_CapabilityName_6_4_am1 = scGenerator_SP_command_ServiceName_6_CapabilityName_6_4_am1
				.getState();

		System.out.println("OutputName_6_4_5 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_5());
		System.out.println("OutputName_6_4_4 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_4());
		System.out.println("OutputName_6_4_6 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_6());
		System.out.println("OutputName_6_4_1 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_1());
		System.out.println("OutputName_6_4_3 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_3());
		System.out.println("OutputName_6_4_2 : "
				+ result_SP_command_ServiceName_6_CapabilityName_6_4_am1
						.getOutputName_6_4_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_6_CapabilityName_6_4_am1);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_4_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_2.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am2.start();
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_5_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_5_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_2_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_7_CapabilityName_7_2_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_2_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_2_3.fml");
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_2_am3.start();
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_2_3.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_2_3.fml *************//
	}
}
