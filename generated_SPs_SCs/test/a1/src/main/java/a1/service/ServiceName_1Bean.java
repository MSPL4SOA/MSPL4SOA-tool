package a1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import a1.input.InputDataClassName_1_1;

import a1.output.OutputDataClassName_1_2;

import a1.state.State_ServiceName_1_CapabilityName_1_1;
import a1.state.State_ServiceName_1_CapabilityName_1_2;

import a1.util.ConsumerHeader;
import scfactory.SCGenerator;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public void CapabilityName_1_1(InputDataClassName_1_1 inputDataClassName_1_1) {

		// ************* Begin of
		// ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml
		// *************//
		//
//		SCGenerator scGenerator_ServiceName_1_CapabilityName_1_2_am1 = new SCGenerator();
//		try {
//			scGenerator_ServiceName_1_CapabilityName_1_2_am1
//					.setAmFilePath("./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml");
//			scGenerator_ServiceName_1_CapabilityName_1_2_am1.start();
//			scGenerator_ServiceName_1_CapabilityName_1_2_am1.stop();
//		} catch (SCGeneratorException e) {
//			e.printStackTrace();
//		}
//		v2.output.OutputDataClassName_1_2 result_ServiceName_1_CapabilityName_1_2_am1 = (v2.output.OutputDataClassName_1_2) scGenerator_ServiceName_1_CapabilityName_1_2_am1
//				.getResponse();

//		String state_ServiceName_1_CapabilityName_1_2_am1 = scGenerator_ServiceName_1_CapabilityName_1_2_am1.getState();

//		System.out.println("OutputName_1_2_1 : " + result_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_1());
//		System.out.println("OutputName_1_2_2 : " + result_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_2());
//		System.out.println("OutputName_1_2_3 : " + result_ServiceName_1_CapabilityName_1_2_am1.getOutputName_1_2_3());

//		System.out.println("State : " + state_ServiceName_1_CapabilityName_1_2_am1);
		//
		// ************* End of
		// ./files_generated/v2/am/ServiceName_1_CapabilityName_1_2_2.fml
		// *************//

	}

	@Override
	public OutputDataClassName_1_2 CapabilityName_1_2() {
		// TODO Auto-generated stub

		System.out.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_2 : ********//");

		OutputDataClassName_1_2 out = new OutputDataClassName_1_2();

		out.setOutputName_1_2_1(Float.valueOf("925"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		// TODO Auto-generated stub
		System.out.println("State header in: " + ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_1_CapabilityName_1_2.setState(
				instanceState_ServiceName_1_CapabilityName_1_2.getState() + " ServiceName_1 CapabilityName_1_2");

		return out;
	}

}
