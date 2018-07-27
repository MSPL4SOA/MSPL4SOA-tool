package sc;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class MainSC {

	public static void main(String[] args) {

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_3_CapabilityName_3_1_am1 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_3_CapabilityName_3_1_am1
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml");
			scGenerator_ServiceName_3_CapabilityName_3_1_am1.start();
			scGenerator_ServiceName_3_CapabilityName_3_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml :***************//");

		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_3_CapabilityName_3_1_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_2.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_4_am2 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_4_am2
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_2.fml");
			scGenerator_ServiceName_1_CapabilityName_1_4_am2.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_1_CapabilityName_1_4_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_2.fml :***************//");

		SP_command.output.OutputDataClassName_1_4 result_ServiceName_1_CapabilityName_1_4_am2 = (SP_command.output.OutputDataClassName_1_4) scGenerator_ServiceName_1_CapabilityName_1_4_am2
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_4_am2 = scGenerator_ServiceName_1_CapabilityName_1_4_am2.getState();

		System.out.println("OutputName_1_4_1 : " + result_ServiceName_1_CapabilityName_1_4_am2.getOutputName_1_4_1());
		System.out.println("OutputName_1_4_2 : " + result_ServiceName_1_CapabilityName_1_4_am2.getOutputName_1_4_2());

		System.out.println("State : " + state_ServiceName_1_CapabilityName_1_4_am2);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_4_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_2_3.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_2_am3 = new SCGenerator(
				"./files_generated/SP_command/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_2_am3
					.setAmFilePath("./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_2_3.fml");
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.start();
			scGenerator_ServiceName_1_CapabilityName_1_2_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_2_3.fml :***************//");

		SP_command.output.OutputDataClassName_1_2 result_ServiceName_1_CapabilityName_1_2_am3 = (SP_command.output.OutputDataClassName_1_2) scGenerator_ServiceName_1_CapabilityName_1_2_am3
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_2_am3 = scGenerator_ServiceName_1_CapabilityName_1_2_am3.getState();

		System.out.println("OutputName_1_2_7 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_7());
		System.out.println("OutputName_1_2_5 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_5());
		System.out.println("OutputName_1_2_6 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_6());
		System.out.println("OutputName_1_2_3 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_3());
		System.out.println("OutputName_1_2_4 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_4());
		System.out.println("OutputName_1_2_1 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_1());
		System.out.println("OutputName_1_2_2 : " + result_ServiceName_1_CapabilityName_1_2_am3.getOutputName_1_2_2());

		System.out.println("State : " + state_ServiceName_1_CapabilityName_1_2_am3);
		//
		// ************* End of
		// ./files_generated/SP_command/am/ServiceName_1_CapabilityName_1_2_3.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_infantry1/am/ServiceName_2_CapabilityName_2_2_1.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_2_CapabilityName_2_2_am1 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_2_CapabilityName_2_2_am1
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_2_CapabilityName_2_2_1.fml");
			scGenerator_ServiceName_2_CapabilityName_2_2_am1.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_2_CapabilityName_2_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_2_CapabilityName_2_2_1.fml :***************//");

		SP_infantry1.output.OutputDataClassName_2_2 result_ServiceName_2_CapabilityName_2_2_am1 = (SP_infantry1.output.OutputDataClassName_2_2) scGenerator_ServiceName_2_CapabilityName_2_2_am1
				.getResponse();

		String state_ServiceName_2_CapabilityName_2_2_am1 = scGenerator_ServiceName_2_CapabilityName_2_2_am1.getState();

		System.out.println("OutputName_2_2_2 : " + result_ServiceName_2_CapabilityName_2_2_am1.getOutputName_2_2_2());
		System.out.println("OutputName_2_2_3 : " + result_ServiceName_2_CapabilityName_2_2_am1.getOutputName_2_2_3());
		System.out.println("OutputName_2_2_4 : " + result_ServiceName_2_CapabilityName_2_2_am1.getOutputName_2_2_4());
		System.out.println("OutputName_2_2_5 : " + result_ServiceName_2_CapabilityName_2_2_am1.getOutputName_2_2_5());
		System.out.println("OutputName_2_2_1 : " + result_ServiceName_2_CapabilityName_2_2_am1.getOutputName_2_2_1());

		System.out.println("State : " + state_ServiceName_2_CapabilityName_2_2_am1);
		//
		// ************* End of
		// ./files_generated/SP_infantry1/am/ServiceName_2_CapabilityName_2_2_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_2.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_5_CapabilityName_5_2_am2 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_5_CapabilityName_5_2_am2
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_2.fml");
			scGenerator_ServiceName_5_CapabilityName_5_2_am2.start();
			scGenerator_ServiceName_5_CapabilityName_5_2_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_2.fml :***************//");

		SP_infantry1.output.OutputDataClassName_5_2 result_ServiceName_5_CapabilityName_5_2_am2 = (SP_infantry1.output.OutputDataClassName_5_2) scGenerator_ServiceName_5_CapabilityName_5_2_am2
				.getResponse();

		String state_ServiceName_5_CapabilityName_5_2_am2 = scGenerator_ServiceName_5_CapabilityName_5_2_am2.getState();

		System.out.println("OutputName_5_2_1 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_1());
		System.out.println("OutputName_5_2_2 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_2());
		System.out.println("OutputName_5_2_7 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_7());
		System.out.println("OutputName_5_2_8 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_8());
		System.out.println("OutputName_5_2_5 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_5());
		System.out.println("OutputName_5_2_6 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_6());
		System.out.println("OutputName_5_2_3 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_3());
		System.out.println("OutputName_5_2_4 : " + result_ServiceName_5_CapabilityName_5_2_am2.getOutputName_5_2_4());

		System.out.println("State : " + state_ServiceName_5_CapabilityName_5_2_am2);
		//
		// ************* End of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_2.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_5_3.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_5_CapabilityName_5_5_am3 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_5_CapabilityName_5_5_am3
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_5_3.fml");
			scGenerator_ServiceName_5_CapabilityName_5_5_am3.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_5_CapabilityName_5_5_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_5_3.fml :***************//");

		SP_infantry1.output.OutputDataClassName_5_5 result_ServiceName_5_CapabilityName_5_5_am3 = (SP_infantry1.output.OutputDataClassName_5_5) scGenerator_ServiceName_5_CapabilityName_5_5_am3
				.getResponse();

		String state_ServiceName_5_CapabilityName_5_5_am3 = scGenerator_ServiceName_5_CapabilityName_5_5_am3.getState();

		System.out.println("OutputName_5_5_1 : " + result_ServiceName_5_CapabilityName_5_5_am3.getOutputName_5_5_1());

		System.out.println("State : " + state_ServiceName_5_CapabilityName_5_5_am3);
		//
		// ************* End of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_5_3.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_5_4.fml
		// *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_5_am4 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_5_am4
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_5_4.fml");
			scGenerator_ServiceName_1_CapabilityName_1_5_am4.start();
			scGenerator_ServiceName_1_CapabilityName_1_5_am4.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_5_4.fml :***************//");

		SP_infantry1.output.OutputDataClassName_1_5 result_ServiceName_1_CapabilityName_1_5_am4 = (SP_infantry1.output.OutputDataClassName_1_5) scGenerator_ServiceName_1_CapabilityName_1_5_am4
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_5_am4 = scGenerator_ServiceName_1_CapabilityName_1_5_am4.getState();

		System.out.println("OutputName_1_5_4 : " + result_ServiceName_1_CapabilityName_1_5_am4.getOutputName_1_5_4());
		System.out.println("OutputName_1_5_5 : " + result_ServiceName_1_CapabilityName_1_5_am4.getOutputName_1_5_5());
		System.out.println("OutputName_1_5_2 : " + result_ServiceName_1_CapabilityName_1_5_am4.getOutputName_1_5_2());
		System.out.println("OutputName_1_5_3 : " + result_ServiceName_1_CapabilityName_1_5_am4.getOutputName_1_5_3());
		System.out.println("OutputName_1_5_1 : " + result_ServiceName_1_CapabilityName_1_5_am4.getOutputName_1_5_1());

		System.out.println("State : " + state_ServiceName_1_CapabilityName_1_5_am4);
		//
		// ************* End of
		// ./files_generated/SP_infantry1/am/ServiceName_1_CapabilityName_1_5_4.fml
		// *************//

	}
}
