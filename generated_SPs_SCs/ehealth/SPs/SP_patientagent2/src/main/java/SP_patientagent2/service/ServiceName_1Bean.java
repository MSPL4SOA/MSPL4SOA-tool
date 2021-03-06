package SP_aircraftcarrier2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_aircraftcarrier2.input.InputDataClassName_1_1;
import SP_aircraftcarrier2.input.InputDataClassName_1_2;

import SP_aircraftcarrier2.output.OutputDataClassName_1_1;
import SP_aircraftcarrier2.output.OutputDataClassName_1_4;

import SP_aircraftcarrier2.state.State_ServiceName_1_CapabilityName_1_1;
import SP_aircraftcarrier2.state.State_ServiceName_1_CapabilityName_1_2;
import SP_aircraftcarrier2.state.State_ServiceName_1_CapabilityName_1_3;
import SP_aircraftcarrier2.state.State_ServiceName_1_CapabilityName_1_4;

import SP_aircraftcarrier2.util.ConsumerHeader;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	@Inject
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;
	@Inject
	State_ServiceName_1_CapabilityName_1_4 instanceState_ServiceName_1_CapabilityName_1_4;

	@Override
	public OutputDataClassName_1_1 CapabilityName_1_1(
			InputDataClassName_1_1 inputDataClassName_1_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_1 : ********//");

		System.out.println("InputName_1_1_1 : "
				+ inputDataClassName_1_1.getInputName_1_1_1());
		System.out.println("InputName_1_1_2 : "
				+ inputDataClassName_1_1.getInputName_1_1_2());
		System.out.println("InputName_1_1_3 : "
				+ inputDataClassName_1_1.getInputName_1_1_3());

		OutputDataClassName_1_1 out = new OutputDataClassName_1_1();

		out.setOutputName_1_1_8(Integer.valueOf("258"));

		out.setOutputName_1_1_6("CapabilityName_1_1");

		out.setOutputName_1_1_7(Float.valueOf("600"));

		out.setOutputName_1_1_4("CapabilityName_1_1");

		out.setOutputName_1_1_5("CapabilityName_1_1");

		out.setOutputName_1_1_2(Integer.valueOf("5"));

		out.setOutputName_1_1_3(Integer.valueOf("750"));

		out.setOutputName_1_1_1(Float.valueOf("689"));

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

		instanceState_ServiceName_1_CapabilityName_1_1
				.setState(instanceState_ServiceName_1_CapabilityName_1_1
						.getState() + " ServiceName_1 CapabilityName_1_1");

		return out;
	}

	@Override
	public void CapabilityName_1_2(InputDataClassName_1_2 inputDataClassName_1_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_2 : ********//");

		System.out.println("InputName_1_2_1 : "
				+ inputDataClassName_1_2.getInputName_1_2_1());
		System.out.println("InputName_1_2_2 : "
				+ inputDataClassName_1_2.getInputName_1_2_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_1_CapabilityName_1_2
				.setState(instanceState_ServiceName_1_CapabilityName_1_2
						.getState() + " ServiceName_1 CapabilityName_1_2");

	}

	@Override
	public void CapabilityName_1_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_3 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_1_CapabilityName_1_3
				.setState(instanceState_ServiceName_1_CapabilityName_1_3
						.getState() + " ServiceName_1 CapabilityName_1_3");

	}

	@Override
	public OutputDataClassName_1_4 CapabilityName_1_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_4 : ********//");

		OutputDataClassName_1_4 out = new OutputDataClassName_1_4();

		out.setOutputName_1_4_5(Float.valueOf("970"));

		out.setOutputName_1_4_3(Float.valueOf("224"));

		out.setOutputName_1_4_4(Float.valueOf("42"));

		out.setOutputName_1_4_1(Float.valueOf("427"));

		out.setOutputName_1_4_2(Integer.valueOf("77"));

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

		instanceState_ServiceName_1_CapabilityName_1_4
				.setState(instanceState_ServiceName_1_CapabilityName_1_4
						.getState() + " ServiceName_1 CapabilityName_1_4");

		return out;
	}

}
