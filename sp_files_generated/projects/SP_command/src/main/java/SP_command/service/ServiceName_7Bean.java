package SP_command.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_command.input.InputDataClassName_7_5;
import SP_command.input.InputDataClassName_7_1;
import SP_command.input.InputDataClassName_7_2;

import SP_command.output.OutputDataClassName_7_3;
import SP_command.output.OutputDataClassName_7_4;
import SP_command.output.OutputDataClassName_7_5;
import SP_command.output.OutputDataClassName_7_1;
import SP_command.output.OutputDataClassName_7_2;

import SP_command.state.State_ServiceName_7_CapabilityName_7_3;
import SP_command.state.State_ServiceName_7_CapabilityName_7_4;
import SP_command.state.State_ServiceName_7_CapabilityName_7_5;
import SP_command.state.State_ServiceName_7_CapabilityName_7_1;
import SP_command.state.State_ServiceName_7_CapabilityName_7_2;

import SP_command.util.ConsumerHeader;

@Service(ServiceName_7.class)
public class ServiceName_7Bean implements ServiceName_7 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	@Inject
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	@Inject
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;
	@Inject
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	@Inject
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;

	@Override
	public OutputDataClassName_7_3 CapabilityName_7_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_3 : ********//");

		OutputDataClassName_7_3 out = new OutputDataClassName_7_3();

		out.setOutputName_7_3_3(Float.valueOf("539"));

		out.setOutputName_7_3_2(Integer.valueOf("31"));

		out.setOutputName_7_3_1(Integer.valueOf("846"));

		out.setOutputName_7_3_4(Integer.valueOf("576"));

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

		instanceState_ServiceName_7_CapabilityName_7_3
				.setState(instanceState_ServiceName_7_CapabilityName_7_3
						.getState() + " ServiceName_7 CapabilityName_7_3");

		return out;
	}

	@Override
	public OutputDataClassName_7_4 CapabilityName_7_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_4 : ********//");

		OutputDataClassName_7_4 out = new OutputDataClassName_7_4();

		out.setOutputName_7_4_2(Float.valueOf("267"));

		out.setOutputName_7_4_1(Integer.valueOf("518"));

		out.setOutputName_7_4_6(Integer.valueOf("548"));

		out.setOutputName_7_4_5(Integer.valueOf("878"));

		out.setOutputName_7_4_4(Float.valueOf("685"));

		out.setOutputName_7_4_3(Float.valueOf("927"));

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

		instanceState_ServiceName_7_CapabilityName_7_4
				.setState(instanceState_ServiceName_7_CapabilityName_7_4
						.getState() + " ServiceName_7 CapabilityName_7_4");

		return out;
	}

	@Override
	public OutputDataClassName_7_5 CapabilityName_7_5(
			InputDataClassName_7_5 inputDataClassName_7_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_5 : ********//");

		System.out.println("InputName_7_5_3 : "
				+ inputDataClassName_7_5.getInputName_7_5_3());
		System.out.println("InputName_7_5_4 : "
				+ inputDataClassName_7_5.getInputName_7_5_4());
		System.out.println("InputName_7_5_1 : "
				+ inputDataClassName_7_5.getInputName_7_5_1());
		System.out.println("InputName_7_5_2 : "
				+ inputDataClassName_7_5.getInputName_7_5_2());
		System.out.println("InputName_7_5_7 : "
				+ inputDataClassName_7_5.getInputName_7_5_7());
		System.out.println("InputName_7_5_5 : "
				+ inputDataClassName_7_5.getInputName_7_5_5());
		System.out.println("InputName_7_5_6 : "
				+ inputDataClassName_7_5.getInputName_7_5_6());

		OutputDataClassName_7_5 out = new OutputDataClassName_7_5();

		out.setOutputName_7_5_1("CapabilityName_7_5");

		out.setOutputName_7_5_5("CapabilityName_7_5");

		out.setOutputName_7_5_4(Float.valueOf("879"));

		out.setOutputName_7_5_3("CapabilityName_7_5");

		out.setOutputName_7_5_2(Integer.valueOf("221"));

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

		instanceState_ServiceName_7_CapabilityName_7_5
				.setState(instanceState_ServiceName_7_CapabilityName_7_5
						.getState() + " ServiceName_7 CapabilityName_7_5");

		return out;
	}

	@Override
	public OutputDataClassName_7_1 CapabilityName_7_1(
			InputDataClassName_7_1 inputDataClassName_7_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_1 : ********//");

		System.out.println("InputName_7_1_5 : "
				+ inputDataClassName_7_1.getInputName_7_1_5());
		System.out.println("InputName_7_1_6 : "
				+ inputDataClassName_7_1.getInputName_7_1_6());
		System.out.println("InputName_7_1_3 : "
				+ inputDataClassName_7_1.getInputName_7_1_3());
		System.out.println("InputName_7_1_4 : "
				+ inputDataClassName_7_1.getInputName_7_1_4());
		System.out.println("InputName_7_1_1 : "
				+ inputDataClassName_7_1.getInputName_7_1_1());
		System.out.println("InputName_7_1_2 : "
				+ inputDataClassName_7_1.getInputName_7_1_2());

		OutputDataClassName_7_1 out = new OutputDataClassName_7_1();

		out.setOutputName_7_1_1("CapabilityName_7_1");

		out.setOutputName_7_1_4("CapabilityName_7_1");

		out.setOutputName_7_1_3("CapabilityName_7_1");

		out.setOutputName_7_1_2(Float.valueOf("906"));

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

		instanceState_ServiceName_7_CapabilityName_7_1
				.setState(instanceState_ServiceName_7_CapabilityName_7_1
						.getState() + " ServiceName_7 CapabilityName_7_1");

		return out;
	}

	@Override
	public OutputDataClassName_7_2 CapabilityName_7_2(
			InputDataClassName_7_2 inputDataClassName_7_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_2 : ********//");

		System.out.println("InputName_7_2_1 : "
				+ inputDataClassName_7_2.getInputName_7_2_1());

		OutputDataClassName_7_2 out = new OutputDataClassName_7_2();

		out.setOutputName_7_2_4(Float.valueOf("62"));

		out.setOutputName_7_2_3(Integer.valueOf("94"));

		out.setOutputName_7_2_2(Float.valueOf("506"));

		out.setOutputName_7_2_1(Integer.valueOf("158"));

		out.setOutputName_7_2_6(Float.valueOf("183"));

		out.setOutputName_7_2_5(Integer.valueOf("709"));

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

		instanceState_ServiceName_7_CapabilityName_7_2
				.setState(instanceState_ServiceName_7_CapabilityName_7_2
						.getState() + " ServiceName_7 CapabilityName_7_2");

		return out;
	}

}
