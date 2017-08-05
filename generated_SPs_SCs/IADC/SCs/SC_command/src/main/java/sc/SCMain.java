package sc;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SCMain {

	public static void main(String[] args) {

		// ************* Begin of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_6_CapabilityName_6_3_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1 = new SCGenerator(
				"./files_generated/SP_aircraftcarrier1/fm_sc_update.fml");
		try {
			scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1
					.setAmFilePath("./files_generated/SP_aircraftcarrier1/am/ServiceName_6_CapabilityName_6_3_1.fml");
			scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_aircraftcarrier1/am/ServiceName_6_CapabilityName_6_3_1.fml :***************//");

		SP_aircraftcarrier1.output.OutputDataClassName_6_3 result_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1 = (SP_aircraftcarrier1.output.OutputDataClassName_6_3) scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1
				.getResponse();

		String state_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1 = scGenerator_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1
				.getState();

		System.out.println("OutputName_6_3_2 : "
				+ result_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1.getOutputName_6_3_2());
		System.out.println("OutputName_6_3_1 : "
				+ result_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1.getOutputName_6_3_1());
		System.out.println("OutputName_6_3_3 : "
				+ result_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1.getOutputName_6_3_3());

		System.out.println("State : " + state_SP_aircraftcarrier1_ServiceName_6_CapabilityName_6_3_am1);
		//
		// ************* End of
		// ./files_generated/SP_aircraftcarrier1/am/ServiceName_6_CapabilityName_6_3_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = new SCGenerator(
				"./files_generated/SP_helicopter1/fm_sc_update.fml");
		try {
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
					.setAmFilePath("./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml");
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.start();
			scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml :***************//");

		SP_helicopter1.output.OutputDataClassName_5_4 result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = (SP_helicopter1.output.OutputDataClassName_5_4) scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
				.getResponse();

		String state_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1 = scGenerator_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1
				.getState();

		System.out.println("OutputName_5_4_9 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_9());
		System.out.println("OutputName_5_4_7 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_7());
		System.out.println("OutputName_5_4_8 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_8());
		System.out.println("OutputName_5_4_5 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_5());
		System.out.println("OutputName_5_4_6 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_6());
		System.out.println("OutputName_5_4_3 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_3());
		System.out.println("OutputName_5_4_4 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_4());
		System.out.println("OutputName_5_4_1 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_1());
		System.out.println("OutputName_5_4_2 : "
				+ result_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1.getOutputName_5_4_2());

		System.out.println("State : " + state_SP_helicopter1_ServiceName_5_CapabilityName_5_4_am1);
		//
		// ************* End of
		// ./files_generated/SP_helicopter1/am/ServiceName_5_CapabilityName_5_4_1.fml
		// *************//

		// ************* Begin of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_1.fml
		// *************//
		//
		SCGenerator scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1 = new SCGenerator(
				"./files_generated/SP_infantry1/fm_sc_update.fml");
		try {
			scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1
					.setAmFilePath("./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_1.fml");
			scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.start();
			// The response handler in your AM is asynchronous.
			// Hence, the business logic code here is executed in parallel with
			// the capability invocation.
			Thread.sleep(1000);
			scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\\\\***************The output of ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_1.fml :***************//");

		SP_infantry1.output.OutputDataClassName_5_2 result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1 = (SP_infantry1.output.OutputDataClassName_5_2) scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1
				.getResponse();

		String state_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1 = scGenerator_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1
				.getState();

		System.out.println(
				"OutputName_5_2_1 : " + result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.getOutputName_5_2_1());
		System.out.println(
				"OutputName_5_2_2 : " + result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.getOutputName_5_2_2());
		System.out.println(
				"OutputName_5_2_5 : " + result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.getOutputName_5_2_5());
		System.out.println(
				"OutputName_5_2_3 : " + result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.getOutputName_5_2_3());
		System.out.println(
				"OutputName_5_2_4 : " + result_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1.getOutputName_5_2_4());

		System.out.println("State : " + state_SP_infantry1_ServiceName_5_CapabilityName_5_2_am1);
		//
		// ************* End of
		// ./files_generated/SP_infantry1/am/ServiceName_5_CapabilityName_5_2_1.fml
		// *************//

	}

}
