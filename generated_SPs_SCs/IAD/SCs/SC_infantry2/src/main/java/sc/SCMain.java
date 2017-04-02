package sc;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SCMain {

	public static void main(String[] args) {

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_3_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_3_1.fml");
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_3_1.fml :***************//");

		SP_command.output.OutputDataClassName_6_3 result_SP_command_ServiceName_6_CapabilityName_6_3_am1 = (SP_command.output.OutputDataClassName_6_3) scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1
				.getResponse();

		String state_SP_command_ServiceName_6_CapabilityName_6_3_am1 = scGenerator_SP_command_ServiceName_6_CapabilityName_6_3_am1
				.getState();

		System.out.println(
				"OutputName_6_3_2 : " + result_SP_command_ServiceName_6_CapabilityName_6_3_am1.getOutputName_6_3_2());
		System.out.println(
				"OutputName_6_3_1 : " + result_SP_command_ServiceName_6_CapabilityName_6_3_am1.getOutputName_6_3_1());

		System.out.println("State : " + state_SP_command_ServiceName_6_CapabilityName_6_3_am1);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_6_CapabilityName_6_3_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_2.fml
		// *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_2.fml");
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am2.start();
			scGenerator_SP_command_ServiceName_2_CapabilityName_2_2_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_2.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_2_CapabilityName_2_2_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_3.fml
		// *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_3.fml");
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3.start();
			scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_3.fml :***************//");

		SP_command.output.OutputDataClassName_7_4 result_SP_command_ServiceName_7_CapabilityName_7_4_am3 = (SP_command.output.OutputDataClassName_7_4) scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3
				.getResponse();

		String state_SP_command_ServiceName_7_CapabilityName_7_4_am3 = scGenerator_SP_command_ServiceName_7_CapabilityName_7_4_am3
				.getState();

		System.out.println(
				"OutputName_7_4_2 : " + result_SP_command_ServiceName_7_CapabilityName_7_4_am3.getOutputName_7_4_2());
		System.out.println(
				"OutputName_7_4_1 : " + result_SP_command_ServiceName_7_CapabilityName_7_4_am3.getOutputName_7_4_1());
		System.out.println(
				"OutputName_7_4_4 : " + result_SP_command_ServiceName_7_CapabilityName_7_4_am3.getOutputName_7_4_4());
		System.out.println(
				"OutputName_7_4_3 : " + result_SP_command_ServiceName_7_CapabilityName_7_4_am3.getOutputName_7_4_3());

		System.out.println("State : " + state_SP_command_ServiceName_7_CapabilityName_7_4_am3);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_7_CapabilityName_7_4_3.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_4.fml
		// *************//
		//
		SCGenerator scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am4 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am4
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_4.fml");
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am4.start();
			scGenerator_SP_command_ServiceName_3_CapabilityName_3_1_am4.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_4.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_4.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_2_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_2_1.fml");
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.start();
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_2_1.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_1_2 result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1 = (SP_helicopter1.output.OutputDataClassName_1_2) scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1
				.getResponse();

		String state_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1 = scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1
				.getState();

		System.out.println("OutputName_1_2_5 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_5());
		System.out.println("OutputName_1_2_3 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_3());
		System.out.println("OutputName_1_2_4 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_4());
		System.out.println("OutputName_1_2_1 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_2());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_1_CapabilityName_1_2_am1);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_2_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_2.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_2.fml");
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.start();
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_1_1 result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2 = (SP_helicopter1.output.OutputDataClassName_1_1) scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2
				.getResponse();

		String state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2 = scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2
				.getState();

		System.out.println("OutputName_1_1_8 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_8());
		System.out.println("OutputName_1_1_6 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_6());
		System.out.println("OutputName_1_1_7 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_7());
		System.out.println("OutputName_1_1_4 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_4());
		System.out.println("OutputName_1_1_5 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_5());
		System.out.println("OutputName_1_1_2 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2.getOutputName_1_1_1());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am2);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_3.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_3.fml");
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_3.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_1_1 result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3 = (SP_helicopter1.output.OutputDataClassName_1_1) scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3
				.getResponse();

		String state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3 = scGenerator_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3
				.getState();

		System.out.println("OutputName_1_1_8 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_8());
		System.out.println("OutputName_1_1_6 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_6());
		System.out.println("OutputName_1_1_7 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_7());
		System.out.println("OutputName_1_1_4 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_4());
		System.out.println("OutputName_1_1_5 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_5());
		System.out.println("OutputName_1_1_2 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3.getOutputName_1_1_1());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_1_CapabilityName_1_1_am3);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_1_CapabilityName_1_1_3.fml
		// *************//

	}
}
