package large11.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large11.input.InputDataClassName_7_1;
import large11.input.InputDataClassName_7_2;
import large11.input.InputDataClassName_7_3;
import large11.input.InputDataClassName_7_4;
import large11.input.InputDataClassName_7_5;
import large11.input.InputDataClassName_7_6;

import large11.output.OutputDataClassName_7_1;
import large11.output.OutputDataClassName_7_2;
import large11.output.OutputDataClassName_7_3;
import large11.output.OutputDataClassName_7_4;
import large11.output.OutputDataClassName_7_5;

import large11.state.State_ServiceName_7_CapabilityName_7_1;
import large11.state.State_ServiceName_7_CapabilityName_7_2;
import large11.state.State_ServiceName_7_CapabilityName_7_3;
import large11.state.State_ServiceName_7_CapabilityName_7_4;
import large11.state.State_ServiceName_7_CapabilityName_7_5;
import large11.state.State_ServiceName_7_CapabilityName_7_6;

import large11.util.ConsumerHeader;

@Service(ServiceName_7.class)
public class ServiceName_7Bean implements ServiceName_7 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	@Inject
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;
	@Inject
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	@Inject
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	@Inject
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;
	@Inject
	State_ServiceName_7_CapabilityName_7_6 instanceState_ServiceName_7_CapabilityName_7_6;

	@Override
	public OutputDataClassName_7_1 CapabilityName_7_1(
			InputDataClassName_7_1 inputDataClassName_7_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_1 : ********//");

		System.out.println("InputName_7_1_1 : "
				+ inputDataClassName_7_1.getInputName_7_1_1());
		System.out.println("InputName_7_1_2 : "
				+ inputDataClassName_7_1.getInputName_7_1_2());
		System.out.println("InputName_7_1_3 : "
				+ inputDataClassName_7_1.getInputName_7_1_3());

		OutputDataClassName_7_1 out = new OutputDataClassName_7_1();

		out.setOutputName_7_1_1(Float.valueOf("252"));

		out.setOutputName_7_1_2(Float.valueOf("176"));

		out.setOutputName_7_1_3(Float.valueOf("54"));

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
		System.out.println("InputName_7_2_2 : "
				+ inputDataClassName_7_2.getInputName_7_2_2());

		OutputDataClassName_7_2 out = new OutputDataClassName_7_2();

		out.setOutputName_7_2_1(Float.valueOf("347"));

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

	@Override
	public OutputDataClassName_7_3 CapabilityName_7_3(
			InputDataClassName_7_3 inputDataClassName_7_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_3 : ********//");

		System.out.println("InputName_7_3_1 : "
				+ inputDataClassName_7_3.getInputName_7_3_1());

		OutputDataClassName_7_3 out = new OutputDataClassName_7_3();

		out.setOutputName_7_3_1(Float.valueOf("320"));

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
	public OutputDataClassName_7_4 CapabilityName_7_4(
			InputDataClassName_7_4 inputDataClassName_7_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_4 : ********//");

		System.out.println("InputName_7_4_1 : "
				+ inputDataClassName_7_4.getInputName_7_4_1());

		OutputDataClassName_7_4 out = new OutputDataClassName_7_4();

		out.setOutputName_7_4_1("CapabilityName_7_4");

		out.setOutputName_7_4_2(Float.valueOf("42"));

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

		System.out.println("InputName_7_5_1 : "
				+ inputDataClassName_7_5.getInputName_7_5_1());
		System.out.println("InputName_7_5_2 : "
				+ inputDataClassName_7_5.getInputName_7_5_2());

		OutputDataClassName_7_5 out = new OutputDataClassName_7_5();

		out.setOutputName_7_5_1(Float.valueOf("941"));

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
	public void CapabilityName_7_6(InputDataClassName_7_6 inputDataClassName_7_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_6 : ********//");

		System.out.println("InputName_7_6_1 : "
				+ inputDataClassName_7_6.getInputName_7_6_1());
		System.out.println("InputName_7_6_2 : "
				+ inputDataClassName_7_6.getInputName_7_6_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_7_CapabilityName_7_6
				.setState(instanceState_ServiceName_7_CapabilityName_7_6
						.getState() + " ServiceName_7 CapabilityName_7_6");

	}

}
