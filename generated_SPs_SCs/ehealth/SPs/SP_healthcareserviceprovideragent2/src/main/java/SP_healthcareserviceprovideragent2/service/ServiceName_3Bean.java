package SP_helicopter2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_helicopter2.input.InputDataClassName_3_1;
import SP_helicopter2.input.InputDataClassName_3_2;

import SP_helicopter2.output.OutputDataClassName_3_2;

import SP_helicopter2.state.State_ServiceName_3_CapabilityName_3_1;
import SP_helicopter2.state.State_ServiceName_3_CapabilityName_3_2;

import SP_helicopter2.util.ConsumerHeader;

@Service(ServiceName_3.class)
public class ServiceName_3Bean implements ServiceName_3 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	@Inject
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public void CapabilityName_3_1(InputDataClassName_3_1 inputDataClassName_3_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_1 : ********//");

		System.out.println("InputName_3_1_3 : "
				+ inputDataClassName_3_1.getInputName_3_1_3());
		System.out.println("InputName_3_1_4 : "
				+ inputDataClassName_3_1.getInputName_3_1_4());
		System.out.println("InputName_3_1_1 : "
				+ inputDataClassName_3_1.getInputName_3_1_1());
		System.out.println("InputName_3_1_2 : "
				+ inputDataClassName_3_1.getInputName_3_1_2());
		System.out.println("InputName_3_1_5 : "
				+ inputDataClassName_3_1.getInputName_3_1_5());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_1
				.setState(instanceState_ServiceName_3_CapabilityName_3_1
						.getState() + " ServiceName_3 CapabilityName_3_1");

	}

	@Override
	public OutputDataClassName_3_2 CapabilityName_3_2(
			InputDataClassName_3_2 inputDataClassName_3_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_2 : ********//");

		System.out.println("InputName_3_2_2 : "
				+ inputDataClassName_3_2.getInputName_3_2_2());
		System.out.println("InputName_3_2_3 : "
				+ inputDataClassName_3_2.getInputName_3_2_3());
		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());
		System.out.println("InputName_3_2_4 : "
				+ inputDataClassName_3_2.getInputName_3_2_4());
		System.out.println("InputName_3_2_5 : "
				+ inputDataClassName_3_2.getInputName_3_2_5());

		OutputDataClassName_3_2 out = new OutputDataClassName_3_2();

		out.setOutputName_3_2_5(Integer.valueOf("643"));

		out.setOutputName_3_2_6(Integer.valueOf("77"));

		out.setOutputName_3_2_3(Float.valueOf("974"));

		out.setOutputName_3_2_4("CapabilityName_3_2");

		out.setOutputName_3_2_1(Integer.valueOf("879"));

		out.setOutputName_3_2_2(Integer.valueOf("697"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		// TODO Auto-generated stub
		System.out.println("State header in: "
				+ ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

		return out;
	}

}
