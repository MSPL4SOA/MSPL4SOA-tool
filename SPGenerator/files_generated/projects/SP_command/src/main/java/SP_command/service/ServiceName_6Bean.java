package SP_command.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_command.input.InputDataClassName_6_4;
import SP_command.input.InputDataClassName_6_5;
import SP_command.input.InputDataClassName_6_6;

import SP_command.output.OutputDataClassName_6_4;
import SP_command.output.OutputDataClassName_6_5;
import SP_command.output.OutputDataClassName_6_6;
import SP_command.output.OutputDataClassName_6_1;
import SP_command.output.OutputDataClassName_6_2;

import SP_command.state.State_ServiceName_6_CapabilityName_6_4;
import SP_command.state.State_ServiceName_6_CapabilityName_6_5;
import SP_command.state.State_ServiceName_6_CapabilityName_6_6;
import SP_command.state.State_ServiceName_6_CapabilityName_6_1;
import SP_command.state.State_ServiceName_6_CapabilityName_6_2;
import SP_command.state.State_ServiceName_6_CapabilityName_6_3;

import SP_command.util.ConsumerHeader;

@Service(ServiceName_6.class)
public class ServiceName_6Bean implements ServiceName_6 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	@Inject
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;
	@Inject
	State_ServiceName_6_CapabilityName_6_6 instanceState_ServiceName_6_CapabilityName_6_6;
	@Inject
	State_ServiceName_6_CapabilityName_6_1 instanceState_ServiceName_6_CapabilityName_6_1;
	@Inject
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	@Inject
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;

	@Override
	public OutputDataClassName_6_4 CapabilityName_6_4(
			InputDataClassName_6_4 inputDataClassName_6_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_4 : ********//");

		System.out.println("InputName_6_4_1 : "
				+ inputDataClassName_6_4.getInputName_6_4_1());
		System.out.println("InputName_6_4_2 : "
				+ inputDataClassName_6_4.getInputName_6_4_2());

		OutputDataClassName_6_4 out = new OutputDataClassName_6_4();

		out.setOutputName_6_4_1(Float.valueOf("627"));

		out.setOutputName_6_4_2(Integer.valueOf("426"));

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

		instanceState_ServiceName_6_CapabilityName_6_4
				.setState(instanceState_ServiceName_6_CapabilityName_6_4
						.getState() + " ServiceName_6 CapabilityName_6_4");

		return out;
	}

	@Override
	public OutputDataClassName_6_5 CapabilityName_6_5(
			InputDataClassName_6_5 inputDataClassName_6_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_5 : ********//");

		System.out.println("InputName_6_5_6 : "
				+ inputDataClassName_6_5.getInputName_6_5_6());
		System.out.println("InputName_6_5_1 : "
				+ inputDataClassName_6_5.getInputName_6_5_1());
		System.out.println("InputName_6_5_2 : "
				+ inputDataClassName_6_5.getInputName_6_5_2());
		System.out.println("InputName_6_5_3 : "
				+ inputDataClassName_6_5.getInputName_6_5_3());
		System.out.println("InputName_6_5_4 : "
				+ inputDataClassName_6_5.getInputName_6_5_4());
		System.out.println("InputName_6_5_5 : "
				+ inputDataClassName_6_5.getInputName_6_5_5());

		OutputDataClassName_6_5 out = new OutputDataClassName_6_5();

		out.setOutputName_6_5_4(Integer.valueOf("963"));

		out.setOutputName_6_5_3("CapabilityName_6_5");

		out.setOutputName_6_5_5("CapabilityName_6_5");

		out.setOutputName_6_5_2(Float.valueOf("379"));

		out.setOutputName_6_5_1(Float.valueOf("449"));

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

		instanceState_ServiceName_6_CapabilityName_6_5
				.setState(instanceState_ServiceName_6_CapabilityName_6_5
						.getState() + " ServiceName_6 CapabilityName_6_5");

		return out;
	}

	@Override
	public OutputDataClassName_6_6 CapabilityName_6_6(
			InputDataClassName_6_6 inputDataClassName_6_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_6 : ********//");

		System.out.println("InputName_6_6_1 : "
				+ inputDataClassName_6_6.getInputName_6_6_1());
		System.out.println("InputName_6_6_2 : "
				+ inputDataClassName_6_6.getInputName_6_6_2());
		System.out.println("InputName_6_6_3 : "
				+ inputDataClassName_6_6.getInputName_6_6_3());
		System.out.println("InputName_6_6_4 : "
				+ inputDataClassName_6_6.getInputName_6_6_4());

		OutputDataClassName_6_6 out = new OutputDataClassName_6_6();

		out.setOutputName_6_6_1(Float.valueOf("688"));

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

		instanceState_ServiceName_6_CapabilityName_6_6
				.setState(instanceState_ServiceName_6_CapabilityName_6_6
						.getState() + " ServiceName_6 CapabilityName_6_6");

		return out;
	}

	@Override
	public OutputDataClassName_6_1 CapabilityName_6_1() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_1 : ********//");

		OutputDataClassName_6_1 out = new OutputDataClassName_6_1();

		out.setOutputName_6_1_1(Float.valueOf("511"));

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

		instanceState_ServiceName_6_CapabilityName_6_1
				.setState(instanceState_ServiceName_6_CapabilityName_6_1
						.getState() + " ServiceName_6 CapabilityName_6_1");

		return out;
	}

	@Override
	public OutputDataClassName_6_2 CapabilityName_6_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_2 : ********//");

		OutputDataClassName_6_2 out = new OutputDataClassName_6_2();

		out.setOutputName_6_2_1(Float.valueOf("733"));

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

		instanceState_ServiceName_6_CapabilityName_6_2
				.setState(instanceState_ServiceName_6_CapabilityName_6_2
						.getState() + " ServiceName_6 CapabilityName_6_2");

		return out;
	}

	@Override
	public void CapabilityName_6_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_3 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_3
				.setState(instanceState_ServiceName_6_CapabilityName_6_3
						.getState() + " ServiceName_6 CapabilityName_6_3");

	}

}
