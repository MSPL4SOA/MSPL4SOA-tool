package sc;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SCMain {

	public static void main(String[] args) {

		// ************* Begin of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1.start();
			scGenerator_SP_aircraftcarrier1_ServiceName_2_CapabilityName_2_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_2_CapabilityName_2_1_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml
		// *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2.start();
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_1_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_1_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml
		// *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml :***************//");

		SP_aircraftcarrier1.output.OutputDataClassName_3_3 result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = (SP_aircraftcarrier1.output.OutputDataClassName_3_3) scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
				.getResponse();

		String state_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3 = scGenerator_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3
				.getState();

		System.out.println("OutputName_3_3_2 : "
				+ result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3.getOutputName_3_3_2());
		System.out.println("OutputName_3_3_1 : "
				+ result_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3.getOutputName_3_3_1());

		System.out.println("State : " + state_SP_aircraftcarrier1_ServiceName_3_CapabilityName_3_3_am3);
		//
		// ************* End of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_3_CapabilityName_3_3_3.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml
		// *************//
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
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml :***************//");

		SP_command.output.OutputDataClassName_1_4 result_SP_command_ServiceName_1_CapabilityName_1_4_am1 = (SP_command.output.OutputDataClassName_1_4) scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_4_am1 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_4_am1
				.getState();

		System.out.println(
				"OutputName_1_4_1 : " + result_SP_command_ServiceName_1_CapabilityName_1_4_am1.getOutputName_1_4_1());
		System.out.println(
				"OutputName_1_4_2 : " + result_SP_command_ServiceName_1_CapabilityName_1_4_am1.getOutputName_1_4_2());

		System.out.println("State : " + state_SP_command_ServiceName_1_CapabilityName_1_4_am1);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml
		// *************//
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
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		SP_command.output.OutputDataClassName_1_1 result_SP_command_ServiceName_1_CapabilityName_1_1_am2 = (SP_command.output.OutputDataClassName_1_1) scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2
				.getResponse();

		String state_SP_command_ServiceName_1_CapabilityName_1_1_am2 = scGenerator_SP_command_ServiceName_1_CapabilityName_1_1_am2
				.getState();

		System.out.println(
				"OutputName_1_1_4 : " + result_SP_command_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_4());
		System.out.println(
				"OutputName_1_1_5 : " + result_SP_command_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_5());
		System.out.println(
				"OutputName_1_1_2 : " + result_SP_command_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_2());
		System.out.println(
				"OutputName_1_1_3 : " + result_SP_command_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_3());
		System.out.println(
				"OutputName_1_1_1 : " + result_SP_command_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_1());

		System.out.println("State : " + state_SP_command_ServiceName_1_CapabilityName_1_1_am2);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_1_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml
		// *************//
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
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_4_CapabilityName_4_1_3.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml");
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1.start();
			scGenerator_SP_helicopter1_ServiceName_3_CapabilityName_3_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_3_CapabilityName_3_2_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_2.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_2.fml");
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_2.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_2_3 result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2 = (SP_helicopter1.output.OutputDataClassName_2_3) scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2
				.getResponse();

		String state_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2 = scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2
				.getState();

		System.out.println("OutputName_2_3_1 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2.getOutputName_2_3_1());
		System.out.println("OutputName_2_3_2 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2.getOutputName_2_3_2());
		System.out.println("OutputName_2_3_3 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2.getOutputName_2_3_3());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am2);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_3.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_3.fml");
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3.start();
			scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_3.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_2_3 result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3 = (SP_helicopter1.output.OutputDataClassName_2_3) scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3
				.getResponse();

		String state_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3 = scGenerator_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3
				.getState();

		System.out.println("OutputName_2_3_1 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3.getOutputName_2_3_1());
		System.out.println("OutputName_2_3_2 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3.getOutputName_2_3_2());
		System.out.println("OutputName_2_3_3 : "
				+ result_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3.getOutputName_2_3_3());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_2_CapabilityName_2_3_am3);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_2_CapabilityName_2_3_3.fml
		// *************//

	}

}
