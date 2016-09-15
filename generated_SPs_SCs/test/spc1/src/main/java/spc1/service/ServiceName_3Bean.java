package spc1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import spc1.input.InputDataClassName_3_2;

import spc1.output.OutputDataClassName_3_2;

import spc1.state.State_ServiceName_3_CapabilityName_3_1;
import spc1.state.State_ServiceName_3_CapabilityName_3_2;

import spc1.util.ConsumerHeader;

@Service(ServiceName_3.class)
public class ServiceName_3Bean implements ServiceName_3 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	@Inject
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public void CapabilityName_3_1() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_1 : ********//");

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
		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());

		OutputDataClassName_3_2 out = new OutputDataClassName_3_2();

		out.setOutputName_3_2_5(Float.valueOf("509"));

		out.setOutputName_3_2_3(Float.valueOf("496"));

		out.setOutputName_3_2_4(Float.valueOf("418"));

		out.setOutputName_3_2_1(Float.valueOf("648"));

		out.setOutputName_3_2_2(Float.valueOf("273"));

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
