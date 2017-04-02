package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_1.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1.start();
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_1.fml :***************//");

		SP_command.output.OutputDataClassName_4_3 result_SP_command_ServiceName_4_CapabilityName_4_3_am1 = (SP_command.output.OutputDataClassName_4_3) scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1
				.getResponse();

		String state_SP_command_ServiceName_4_CapabilityName_4_3_am1 = scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am1
				.getState();

		System.out.println("OutputName_4_3_1 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_3_am1
						.getOutputName_4_3_1());
		System.out.println("OutputName_4_3_2 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_3_am1
						.getOutputName_4_3_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_4_CapabilityName_4_3_am1);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_3.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_3.fml :***************//");

		SP_command.output.OutputDataClassName_4_3 result_SP_command_ServiceName_4_CapabilityName_4_3_am2 = (SP_command.output.OutputDataClassName_4_3) scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2
				.getResponse();

		String state_SP_command_ServiceName_4_CapabilityName_4_3_am2 = scGenerator_SP_command_ServiceName_4_CapabilityName_4_3_am2
				.getState();

		System.out.println("OutputName_4_3_1 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_3_am2
						.getOutputName_4_3_1());
		System.out.println("OutputName_4_3_2 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_3_am2
						.getOutputName_4_3_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_4_CapabilityName_4_3_am2);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_3_3.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_4_4.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_4_4.fml");
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3.start();
			scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_4_4.fml :***************//");

		SP_command.output.OutputDataClassName_5_4 result_SP_command_ServiceName_5_CapabilityName_5_4_am3 = (SP_command.output.OutputDataClassName_5_4) scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3
				.getResponse();

		String state_SP_command_ServiceName_5_CapabilityName_5_4_am3 = scGenerator_SP_command_ServiceName_5_CapabilityName_5_4_am3
				.getState();

		System.out.println("OutputName_5_4_5 : "
				+ result_SP_command_ServiceName_5_CapabilityName_5_4_am3
						.getOutputName_5_4_5());
		System.out.println("OutputName_5_4_3 : "
				+ result_SP_command_ServiceName_5_CapabilityName_5_4_am3
						.getOutputName_5_4_3());
		System.out.println("OutputName_5_4_4 : "
				+ result_SP_command_ServiceName_5_CapabilityName_5_4_am3
						.getOutputName_5_4_4());
		System.out.println("OutputName_5_4_1 : "
				+ result_SP_command_ServiceName_5_CapabilityName_5_4_am3
						.getOutputName_5_4_1());
		System.out.println("OutputName_5_4_2 : "
				+ result_SP_command_ServiceName_5_CapabilityName_5_4_am3
						.getOutputName_5_4_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_5_CapabilityName_5_4_am3);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_5_CapabilityName_5_4_4.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_5.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am4 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am4
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_5.fml");
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am4.start();
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am4.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_5.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_5.fml *************//
	}
}
