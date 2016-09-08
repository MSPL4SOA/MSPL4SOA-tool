package a1.main;

import scfactory.SCGenerator;
import scfactory.SCGeneratorException;

public class SC {

	public static void main(String[] args) {

		//************* Begin of ./files_generated/a1/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
		//
		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_1_am1 = new SCGenerator(
				"./files_generated/a1/fm_sc_update.fml");
		try {
			scGenerator_ServiceName_1_CapabilityName_1_1_am1
//					.setAmFilePath("./files_generated/a1/am/ServiceName_1_CapabilityName_1_1_2.fml");
			.setAmFilePath("./files_generated/a1/am/ServiceName_2_CapabilityName_2_2_1.fml");

			scGenerator_ServiceName_1_CapabilityName_1_1_am1.start();
			scGenerator_ServiceName_1_CapabilityName_1_1_am1.stop();
		} catch (SCGeneratorException e) {
			e.printStackTrace();
		}
		System.out
				.println("\\\\***************The output of ./files_generated/a1/am/ServiceName_1_CapabilityName_1_1_2.fml :***************//");

		//
		//************* End of ./files_generated/a1/am/ServiceName_1_CapabilityName_1_1_2.fml *************//
	}
}
