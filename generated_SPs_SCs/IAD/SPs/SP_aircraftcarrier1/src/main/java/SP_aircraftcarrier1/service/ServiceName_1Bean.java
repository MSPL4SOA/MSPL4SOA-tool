package SP_aircraftcarrier1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_aircraftcarrier1.input.InputDataClassName_1_5;
import SP_aircraftcarrier1.input.InputDataClassName_1_1;
import SP_aircraftcarrier1.input.InputDataClassName_1_2;
import SP_aircraftcarrier1.input.InputDataClassName_1_3;
import SP_aircraftcarrier1.input.InputDataClassName_1_4;

import SP_aircraftcarrier1.output.OutputDataClassName_1_5;
import SP_aircraftcarrier1.output.OutputDataClassName_1_1;
import SP_aircraftcarrier1.output.OutputDataClassName_1_2;
import SP_aircraftcarrier1.output.OutputDataClassName_1_3;
import SP_aircraftcarrier1.output.OutputDataClassName_1_4;

import SP_aircraftcarrier1.state.State_ServiceName_1_CapabilityName_1_5;
import SP_aircraftcarrier1.state.State_ServiceName_1_CapabilityName_1_1;
import SP_aircraftcarrier1.state.State_ServiceName_1_CapabilityName_1_2;
import SP_aircraftcarrier1.state.State_ServiceName_1_CapabilityName_1_3;
import SP_aircraftcarrier1.state.State_ServiceName_1_CapabilityName_1_4;

import SP_aircraftcarrier1.util.ConsumerHeader;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_5 instanceState_ServiceName_1_CapabilityName_1_5;
	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	@Inject
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;
	@Inject
	State_ServiceName_1_CapabilityName_1_4 instanceState_ServiceName_1_CapabilityName_1_4;

	@Override
	public OutputDataClassName_1_5 CapabilityName_1_5(
			InputDataClassName_1_5 inputDataClassName_1_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_5 : ********//");

		System.out.println("InputName_1_5_5 : "
				+ inputDataClassName_1_5.getInputName_1_5_5());
		System.out.println("InputName_1_5_6 : "
				+ inputDataClassName_1_5.getInputName_1_5_6());
		System.out.println("InputName_1_5_3 : "
				+ inputDataClassName_1_5.getInputName_1_5_3());
		System.out.println("InputName_1_5_4 : "
				+ inputDataClassName_1_5.getInputName_1_5_4());
		System.out.println("InputName_1_5_9 : "
				+ inputDataClassName_1_5.getInputName_1_5_9());
		System.out.println("InputName_1_5_7 : "
				+ inputDataClassName_1_5.getInputName_1_5_7());
		System.out.println("InputName_1_5_8 : "
				+ inputDataClassName_1_5.getInputName_1_5_8());
		System.out.println("InputName_1_5_1 : "
				+ inputDataClassName_1_5.getInputName_1_5_1());
		System.out.println("InputName_1_5_2 : "
				+ inputDataClassName_1_5.getInputName_1_5_2());

		OutputDataClassName_1_5 out = new OutputDataClassName_1_5();

		out.setOutputName_1_5_1(Float.valueOf("541"));

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

		instanceState_ServiceName_1_CapabilityName_1_5
				.setState(instanceState_ServiceName_1_CapabilityName_1_5
						.getState() + " ServiceName_1 CapabilityName_1_5");

		return out;
	}

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
		System.out.println("InputName_1_1_5 : "
				+ inputDataClassName_1_1.getInputName_1_1_5());
		System.out.println("InputName_1_1_6 : "
				+ inputDataClassName_1_1.getInputName_1_1_6());
		System.out.println("InputName_1_1_3 : "
				+ inputDataClassName_1_1.getInputName_1_1_3());
		System.out.println("InputName_1_1_4 : "
				+ inputDataClassName_1_1.getInputName_1_1_4());

		OutputDataClassName_1_1 out = new OutputDataClassName_1_1();

		out.setOutputName_1_1_2(Float.valueOf("826"));

		out.setOutputName_1_1_3("CapabilityName_1_1");

		out.setOutputName_1_1_1("CapabilityName_1_1");

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
	public OutputDataClassName_1_2 CapabilityName_1_2(
			InputDataClassName_1_2 inputDataClassName_1_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_2 : ********//");

		System.out.println("InputName_1_2_1 : "
				+ inputDataClassName_1_2.getInputName_1_2_1());
		System.out.println("InputName_1_2_2 : "
				+ inputDataClassName_1_2.getInputName_1_2_2());
		System.out.println("InputName_1_2_3 : "
				+ inputDataClassName_1_2.getInputName_1_2_3());

		OutputDataClassName_1_2 out = new OutputDataClassName_1_2();

		out.setOutputName_1_2_1("CapabilityName_1_2");

		out.setOutputName_1_2_2(Float.valueOf("481"));

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

		instanceState_ServiceName_1_CapabilityName_1_2
				.setState(instanceState_ServiceName_1_CapabilityName_1_2
						.getState() + " ServiceName_1 CapabilityName_1_2");

		return out;
	}

	@Override
	public OutputDataClassName_1_3 CapabilityName_1_3(
			InputDataClassName_1_3 inputDataClassName_1_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_3 : ********//");

		System.out.println("InputName_1_3_7 : "
				+ inputDataClassName_1_3.getInputName_1_3_7());
		System.out.println("InputName_1_3_8 : "
				+ inputDataClassName_1_3.getInputName_1_3_8());
		System.out.println("InputName_1_3_5 : "
				+ inputDataClassName_1_3.getInputName_1_3_5());
		System.out.println("InputName_1_3_6 : "
				+ inputDataClassName_1_3.getInputName_1_3_6());
		System.out.println("InputName_1_3_3 : "
				+ inputDataClassName_1_3.getInputName_1_3_3());
		System.out.println("InputName_1_3_4 : "
				+ inputDataClassName_1_3.getInputName_1_3_4());
		System.out.println("InputName_1_3_1 : "
				+ inputDataClassName_1_3.getInputName_1_3_1());
		System.out.println("InputName_1_3_2 : "
				+ inputDataClassName_1_3.getInputName_1_3_2());

		OutputDataClassName_1_3 out = new OutputDataClassName_1_3();

		out.setOutputName_1_3_4("CapabilityName_1_3");

		out.setOutputName_1_3_5(Float.valueOf("902"));

		out.setOutputName_1_3_2("CapabilityName_1_3");

		out.setOutputName_1_3_3("CapabilityName_1_3");

		out.setOutputName_1_3_1("CapabilityName_1_3");

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

		instanceState_ServiceName_1_CapabilityName_1_3
				.setState(instanceState_ServiceName_1_CapabilityName_1_3
						.getState() + " ServiceName_1 CapabilityName_1_3");

		return out;
	}

	@Override
	public OutputDataClassName_1_4 CapabilityName_1_4(
			InputDataClassName_1_4 inputDataClassName_1_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_4 : ********//");

		System.out.println("InputName_1_4_6 : "
				+ inputDataClassName_1_4.getInputName_1_4_6());
		System.out.println("InputName_1_4_7 : "
				+ inputDataClassName_1_4.getInputName_1_4_7());
		System.out.println("InputName_1_4_4 : "
				+ inputDataClassName_1_4.getInputName_1_4_4());
		System.out.println("InputName_1_4_5 : "
				+ inputDataClassName_1_4.getInputName_1_4_5());
		System.out.println("InputName_1_4_2 : "
				+ inputDataClassName_1_4.getInputName_1_4_2());
		System.out.println("InputName_1_4_3 : "
				+ inputDataClassName_1_4.getInputName_1_4_3());
		System.out.println("InputName_1_4_1 : "
				+ inputDataClassName_1_4.getInputName_1_4_1());

		OutputDataClassName_1_4 out = new OutputDataClassName_1_4();

		out.setOutputName_1_4_5(Integer.valueOf("70"));

		out.setOutputName_1_4_6("CapabilityName_1_4");

		out.setOutputName_1_4_3("CapabilityName_1_4");

		out.setOutputName_1_4_4(Integer.valueOf("333"));

		out.setOutputName_1_4_1(Float.valueOf("849"));

		out.setOutputName_1_4_2("CapabilityName_1_4");

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
