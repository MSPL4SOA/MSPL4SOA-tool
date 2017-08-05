package SP_aircraftcarrier1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_aircraftcarrier1.input.InputDataClassName_4_2;
import SP_aircraftcarrier1.input.InputDataClassName_4_3;
import SP_aircraftcarrier1.input.InputDataClassName_4_4;
import SP_aircraftcarrier1.input.InputDataClassName_4_5;
import SP_aircraftcarrier1.input.InputDataClassName_4_1;

import SP_aircraftcarrier1.output.OutputDataClassName_4_2;
import SP_aircraftcarrier1.output.OutputDataClassName_4_3;
import SP_aircraftcarrier1.output.OutputDataClassName_4_4;
import SP_aircraftcarrier1.output.OutputDataClassName_4_1;

import SP_aircraftcarrier1.state.State_ServiceName_4_CapabilityName_4_2;
import SP_aircraftcarrier1.state.State_ServiceName_4_CapabilityName_4_3;
import SP_aircraftcarrier1.state.State_ServiceName_4_CapabilityName_4_4;
import SP_aircraftcarrier1.state.State_ServiceName_4_CapabilityName_4_5;
import SP_aircraftcarrier1.state.State_ServiceName_4_CapabilityName_4_1;

import SP_aircraftcarrier1.util.ConsumerHeader;

@Service(ServiceName_4.class)
public class ServiceName_4Bean implements ServiceName_4 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	@Inject
	State_ServiceName_4_CapabilityName_4_3 instanceState_ServiceName_4_CapabilityName_4_3;
	@Inject
	State_ServiceName_4_CapabilityName_4_4 instanceState_ServiceName_4_CapabilityName_4_4;
	@Inject
	State_ServiceName_4_CapabilityName_4_5 instanceState_ServiceName_4_CapabilityName_4_5;
	@Inject
	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;

	@Override
	public OutputDataClassName_4_2 CapabilityName_4_2(
			InputDataClassName_4_2 inputDataClassName_4_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_2 : ********//");

		System.out.println("InputName_4_2_1 : "
				+ inputDataClassName_4_2.getInputName_4_2_1());
		System.out.println("InputName_4_2_2 : "
				+ inputDataClassName_4_2.getInputName_4_2_2());

		OutputDataClassName_4_2 out = new OutputDataClassName_4_2();

		out.setOutputName_4_2_4(Float.valueOf("703"));

		out.setOutputName_4_2_5("CapabilityName_4_2");

		out.setOutputName_4_2_6("CapabilityName_4_2");

		out.setOutputName_4_2_1(Integer.valueOf("819"));

		out.setOutputName_4_2_2(Float.valueOf("544"));

		out.setOutputName_4_2_3(Float.valueOf("937"));

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

		instanceState_ServiceName_4_CapabilityName_4_2
				.setState(instanceState_ServiceName_4_CapabilityName_4_2
						.getState() + " ServiceName_4 CapabilityName_4_2");

		return out;
	}

	@Override
	public OutputDataClassName_4_3 CapabilityName_4_3(
			InputDataClassName_4_3 inputDataClassName_4_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_3 : ********//");

		System.out.println("InputName_4_3_6 : "
				+ inputDataClassName_4_3.getInputName_4_3_6());
		System.out.println("InputName_4_3_7 : "
				+ inputDataClassName_4_3.getInputName_4_3_7());
		System.out.println("InputName_4_3_8 : "
				+ inputDataClassName_4_3.getInputName_4_3_8());
		System.out.println("InputName_4_3_9 : "
				+ inputDataClassName_4_3.getInputName_4_3_9());
		System.out.println("InputName_4_3_2 : "
				+ inputDataClassName_4_3.getInputName_4_3_2());
		System.out.println("InputName_4_3_3 : "
				+ inputDataClassName_4_3.getInputName_4_3_3());
		System.out.println("InputName_4_3_4 : "
				+ inputDataClassName_4_3.getInputName_4_3_4());
		System.out.println("InputName_4_3_5 : "
				+ inputDataClassName_4_3.getInputName_4_3_5());
		System.out.println("InputName_4_3_1 : "
				+ inputDataClassName_4_3.getInputName_4_3_1());

		OutputDataClassName_4_3 out = new OutputDataClassName_4_3();

		out.setOutputName_4_3_1(Integer.valueOf("686"));

		out.setOutputName_4_3_2(Integer.valueOf("96"));

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

		instanceState_ServiceName_4_CapabilityName_4_3
				.setState(instanceState_ServiceName_4_CapabilityName_4_3
						.getState() + " ServiceName_4 CapabilityName_4_3");

		return out;
	}

	@Override
	public OutputDataClassName_4_4 CapabilityName_4_4(
			InputDataClassName_4_4 inputDataClassName_4_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_4 : ********//");

		System.out.println("InputName_4_4_1 : "
				+ inputDataClassName_4_4.getInputName_4_4_1());
		System.out.println("InputName_4_4_2 : "
				+ inputDataClassName_4_4.getInputName_4_4_2());
		System.out.println("InputName_4_4_3 : "
				+ inputDataClassName_4_4.getInputName_4_4_3());

		OutputDataClassName_4_4 out = new OutputDataClassName_4_4();

		out.setOutputName_4_4_2(Float.valueOf("446"));

		out.setOutputName_4_4_3("CapabilityName_4_4");

		out.setOutputName_4_4_4("CapabilityName_4_4");

		out.setOutputName_4_4_5(Float.valueOf("542"));

		out.setOutputName_4_4_6("CapabilityName_4_4");

		out.setOutputName_4_4_7(Integer.valueOf("126"));

		out.setOutputName_4_4_1("CapabilityName_4_4");

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

		instanceState_ServiceName_4_CapabilityName_4_4
				.setState(instanceState_ServiceName_4_CapabilityName_4_4
						.getState() + " ServiceName_4 CapabilityName_4_4");

		return out;
	}

	@Override
	public void CapabilityName_4_5(InputDataClassName_4_5 inputDataClassName_4_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_5 : ********//");

		System.out.println("InputName_4_5_4 : "
				+ inputDataClassName_4_5.getInputName_4_5_4());
		System.out.println("InputName_4_5_5 : "
				+ inputDataClassName_4_5.getInputName_4_5_5());
		System.out.println("InputName_4_5_1 : "
				+ inputDataClassName_4_5.getInputName_4_5_1());
		System.out.println("InputName_4_5_2 : "
				+ inputDataClassName_4_5.getInputName_4_5_2());
		System.out.println("InputName_4_5_3 : "
				+ inputDataClassName_4_5.getInputName_4_5_3());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_4_CapabilityName_4_5
				.setState(instanceState_ServiceName_4_CapabilityName_4_5
						.getState() + " ServiceName_4 CapabilityName_4_5");

	}

	@Override
	public OutputDataClassName_4_1 CapabilityName_4_1(
			InputDataClassName_4_1 inputDataClassName_4_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_1 : ********//");

		System.out.println("InputName_4_1_8 : "
				+ inputDataClassName_4_1.getInputName_4_1_8());
		System.out.println("InputName_4_1_4 : "
				+ inputDataClassName_4_1.getInputName_4_1_4());
		System.out.println("InputName_4_1_5 : "
				+ inputDataClassName_4_1.getInputName_4_1_5());
		System.out.println("InputName_4_1_6 : "
				+ inputDataClassName_4_1.getInputName_4_1_6());
		System.out.println("InputName_4_1_7 : "
				+ inputDataClassName_4_1.getInputName_4_1_7());
		System.out.println("InputName_4_1_1 : "
				+ inputDataClassName_4_1.getInputName_4_1_1());
		System.out.println("InputName_4_1_2 : "
				+ inputDataClassName_4_1.getInputName_4_1_2());
		System.out.println("InputName_4_1_3 : "
				+ inputDataClassName_4_1.getInputName_4_1_3());

		OutputDataClassName_4_1 out = new OutputDataClassName_4_1();

		out.setOutputName_4_1_1("CapabilityName_4_1");

		out.setOutputName_4_1_2("CapabilityName_4_1");

		out.setOutputName_4_1_3("CapabilityName_4_1");

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

		instanceState_ServiceName_4_CapabilityName_4_1
				.setState(instanceState_ServiceName_4_CapabilityName_4_1
						.getState() + " ServiceName_4 CapabilityName_4_1");

		return out;
	}

}
