package testeq3.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_1.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_1_am1 = new SCGenerator(
				"./files_generated/testeq3/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_1_am1
					.setAmFilePath("./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_1.fml");
			scGenerator_ServiceName_1_CapabilityName_1_1_am1.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_1_CapabilityName_1_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_1.fml :***************//");

		testeq3.output.OutputDataClassName_1_1 result_ServiceName_1_CapabilityName_1_1_am1 = (testeq3.output.OutputDataClassName_1_1) scGenerator_ServiceName_1_CapabilityName_1_1_am1
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_1_am1 = scGenerator_ServiceName_1_CapabilityName_1_1_am1
				.getState();

		System.out.println("OutputName_1_1_2 : "
				+ result_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_ServiceName_1_CapabilityName_1_1_am1
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_1_am1);
		//
		//************* End of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_1.fml *************//

		//************* Begin of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_1_am2 = new SCGenerator(
				"./files_generated/testeq3/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_1_am2
					.setAmFilePath("./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_2.fml");
			scGenerator_ServiceName_1_CapabilityName_1_1_am2.start();
			// The response handler in your AM is asynchronous. 
			// Hence, the business logic code here is executed in parallel with the capability invocation.
			Thread.sleep(1000);
			scGenerator_ServiceName_1_CapabilityName_1_1_am2.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		testeq3.output.OutputDataClassName_1_1 result_ServiceName_1_CapabilityName_1_1_am2 = (testeq3.output.OutputDataClassName_1_1) scGenerator_ServiceName_1_CapabilityName_1_1_am2
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_1_am2 = scGenerator_ServiceName_1_CapabilityName_1_1_am2
				.getState();

		System.out.println("OutputName_1_1_2 : "
				+ result_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_ServiceName_1_CapabilityName_1_1_am2
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_1_am2);
		//
		//************* End of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_2.fml *************//

		//************* Begin of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_3.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_1_am3 = new SCGenerator(
				"./files_generated/testeq3/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_1_am3
					.setAmFilePath("./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_3.fml");
			scGenerator_ServiceName_1_CapabilityName_1_1_am3.start();
			scGenerator_ServiceName_1_CapabilityName_1_1_am3.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_3.fml :***************//");

		testeq3.output.OutputDataClassName_1_1 result_ServiceName_1_CapabilityName_1_1_am3 = (testeq3.output.OutputDataClassName_1_1) scGenerator_ServiceName_1_CapabilityName_1_1_am3
				.getResponse();

		String state_ServiceName_1_CapabilityName_1_1_am3 = scGenerator_ServiceName_1_CapabilityName_1_1_am3
				.getState();

		System.out.println("OutputName_1_1_2 : "
				+ result_ServiceName_1_CapabilityName_1_1_am3
						.getOutputName_1_1_2());
		System.out.println("OutputName_1_1_3 : "
				+ result_ServiceName_1_CapabilityName_1_1_am3
						.getOutputName_1_1_3());
		System.out.println("OutputName_1_1_1 : "
				+ result_ServiceName_1_CapabilityName_1_1_am3
						.getOutputName_1_1_1());

		System.out.println("State : "
				+ state_ServiceName_1_CapabilityName_1_1_am3);
		//
		//************* End of ./files_generated/testeq3/am/ServiceName_1_CapabilityName_1_1_3.fml *************//
	}
}
