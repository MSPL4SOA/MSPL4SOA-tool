package SP_command.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml");
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1.start();
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml :***************//");

		SP_command.output.OutputDataClassName_1_4 result_SP_command_ServiceName_1_CapabilityName_1_4_am1 = (SP_command.output.OutputDataClassName_1_4) scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_4_am1 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1
				.getState();

		System.out.println("OutputName_1_4_1 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_4_am1
						.getOutputName_1_4_1());
		System.out.println("OutputName_1_4_2 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_4_am1
						.getOutputName_1_4_2());

		System.out.println("State : "
				+ state_SP_command_ServiceName_1_CapabilityName_1_4_am1);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml");
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2.start();
			scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		SP_command.output.OutputDataClassName_1_1 result_SP_command_ServiceName_1_CapabilityName_1_1_am2 = (SP_command.output.OutputDataClassName_1_1) scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_1_am2 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2
				.getState();

		System.out.println("OutputName_1_1_4 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_4());
		System.out.println("OutputName_1_1_5 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_5());
		System.out.println("OutputName_1_1_2 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_SP_command_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_SP_command_ServiceName_1_CapabilityName_1_1_am2);
		//
		//************* End of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml *************//

		//************* Begin of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_4_CapabilityName_4_1_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_1_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml");
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_1_am3.start();
			scGenerator_SP_command_ServiceName_4_CapabilityName_4_1_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml :***************//");

		//
		//************* End of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml *************//
	}
}
