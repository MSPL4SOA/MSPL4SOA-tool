package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_3_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_2_CapabilityName_2_3_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_3_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_3_2.fml");
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_3_am1.start();
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_3_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_3_2.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_3_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_6_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_6_3.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2.start();
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_6_3.fml :***************//");

		SP_command.output.OutputDataClassName_4_6 result_SP_command_ServiceName_4_CapabilityName_4_6_am2 = (SP_command.output.OutputDataClassName_4_6) scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2
				.getResponse();

		String state_SP_command_ServiceName_4_CapabilityName_4_6_am2 = scGenerator_SP_command_ServiceName_4_CapabilityName_4_6_am2
				.getState();

		System.out.println("OutputName_4_6_1 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_6_am2
						.getOutputName_4_6_1());
		System.out.println("OutputName_4_6_2 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_6_am2
						.getOutputName_4_6_2());
		System.out.println("OutputName_4_6_3 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_6_am2
						.getOutputName_4_6_3());
		System.out.println("OutputName_4_6_4 : "
				+ result_SP_command_ServiceName_4_CapabilityName_4_6_am2
						.getOutputName_4_6_4());

		System.out.println("State : "
				+ state_SP_command_ServiceName_4_CapabilityName_4_6_am2);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_6_3.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_4.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_4.fml");
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3.start();
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_4.fml :***************//");

		SP_command.output.OutputDataClassName_1_4 result_SP_command_ServiceName_1_CapabilityName_1_4_am3 = (SP_command.output.OutputDataClassName_1_4) scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_4_am3 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am3
				.getState();

		System.out.println("OutputName_1_4_1 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_4_am3
						.getOutputName_1_4_1());
		System.out.println("OutputName_1_4_2 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_4_am3
						.getOutputName_1_4_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_1_CapabilityName_1_4_am3);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_4.fml *************//
	}
}
