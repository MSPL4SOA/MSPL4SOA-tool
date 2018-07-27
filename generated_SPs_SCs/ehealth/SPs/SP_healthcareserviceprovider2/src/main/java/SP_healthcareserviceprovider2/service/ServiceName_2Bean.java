package SP_infantry2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_infantry2.input.InputDataClassName_2_1;
import SP_infantry2.input.InputDataClassName_2_2;

import SP_infantry2.output.OutputDataClassName_2_1;
import SP_infantry2.output.OutputDataClassName_2_2;

import SP_infantry2.state.State_ServiceName_2_CapabilityName_2_1;
import SP_infantry2.state.State_ServiceName_2_CapabilityName_2_2;

import SP_infantry2.util.ConsumerHeader;

@Service(ServiceName_2.class)
public class ServiceName_2Bean implements ServiceName_2 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	@Inject
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;

	@Override
	public OutputDataClassName_2_1 CapabilityName_2_1(
			InputDataClassName_2_1 inputDataClassName_2_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_1 : ********//");

		System.out.println("InputName_2_1_1 : "
				+ inputDataClassName_2_1.getInputName_2_1_1());

		OutputDataClassName_2_1 out = new OutputDataClassName_2_1();

		out.setOutputName_2_1_3("CapabilityName_2_1");

		out.setOutputName_2_1_1("CapabilityName_2_1");

		out.setOutputName_2_1_2(Integer.valueOf("207"));

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

		instanceState_ServiceName_2_CapabilityName_2_1
				.setState(instanceState_ServiceName_2_CapabilityName_2_1
						.getState() + " ServiceName_2 CapabilityName_2_1");

		return out;
	}

	@Override
	public OutputDataClassName_2_2 CapabilityName_2_2(
			InputDataClassName_2_2 inputDataClassName_2_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_2 : ********//");

		System.out.println("InputName_2_2_1 : "
				+ inputDataClassName_2_2.getInputName_2_2_1());
		System.out.println("InputName_2_2_2 : "
				+ inputDataClassName_2_2.getInputName_2_2_2());
		System.out.println("InputName_2_2_3 : "
				+ inputDataClassName_2_2.getInputName_2_2_3());
		System.out.println("InputName_2_2_4 : "
				+ inputDataClassName_2_2.getInputName_2_2_4());
		System.out.println("InputName_2_2_5 : "
				+ inputDataClassName_2_2.getInputName_2_2_5());
		System.out.println("InputName_2_2_6 : "
				+ inputDataClassName_2_2.getInputName_2_2_6());
		System.out.println("InputName_2_2_7 : "
				+ inputDataClassName_2_2.getInputName_2_2_7());
		System.out.println("InputName_2_2_8 : "
				+ inputDataClassName_2_2.getInputName_2_2_8());
		System.out.println("InputName_2_2_9 : "
				+ inputDataClassName_2_2.getInputName_2_2_9());

		OutputDataClassName_2_2 out = new OutputDataClassName_2_2();

		out.setOutputName_2_2_2("CapabilityName_2_2");

		out.setOutputName_2_2_1("CapabilityName_2_2");

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

		instanceState_ServiceName_2_CapabilityName_2_2
				.setState(instanceState_ServiceName_2_CapabilityName_2_2
						.getState() + " ServiceName_2 CapabilityName_2_2");

		return out;
	}

}
