package sync8.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sync8.input.InputDataClassName_3_4;
import sync8.input.InputDataClassName_3_5;
import sync8.input.InputDataClassName_3_6;
import sync8.input.InputDataClassName_3_1;
import sync8.input.InputDataClassName_3_2;

import sync8.output.OutputDataClassName_3_3;
import sync8.output.OutputDataClassName_3_4;
import sync8.output.OutputDataClassName_3_5;
import sync8.output.OutputDataClassName_3_6;
import sync8.output.OutputDataClassName_3_1;

import sync8.state.State_ServiceName_3_CapabilityName_3_3;
import sync8.state.State_ServiceName_3_CapabilityName_3_4;
import sync8.state.State_ServiceName_3_CapabilityName_3_5;
import sync8.state.State_ServiceName_3_CapabilityName_3_6;
import sync8.state.State_ServiceName_3_CapabilityName_3_1;
import sync8.state.State_ServiceName_3_CapabilityName_3_2;

import sync8.util.ConsumerHeader;

@Service(ServiceName_3.class)
public class ServiceName_3Bean implements ServiceName_3 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	@Inject
	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;
	@Inject
	State_ServiceName_3_CapabilityName_3_5 instanceState_ServiceName_3_CapabilityName_3_5;
	@Inject
	State_ServiceName_3_CapabilityName_3_6 instanceState_ServiceName_3_CapabilityName_3_6;
	@Inject
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	@Inject
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public OutputDataClassName_3_3 CapabilityName_3_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_3 : ********//");

		OutputDataClassName_3_3 out = new OutputDataClassName_3_3();

		out.setOutputName_3_3_2(Float.valueOf("976"));

		out.setOutputName_3_3_1(Integer.valueOf("433"));

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

		instanceState_ServiceName_3_CapabilityName_3_3
				.setState(instanceState_ServiceName_3_CapabilityName_3_3
						.getState() + " ServiceName_3 CapabilityName_3_3");

		return out;
	}

	@Override
	public OutputDataClassName_3_4 CapabilityName_3_4(
			InputDataClassName_3_4 inputDataClassName_3_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_4 : ********//");

		System.out.println("InputName_3_4_1 : "
				+ inputDataClassName_3_4.getInputName_3_4_1());
		System.out.println("InputName_3_4_2 : "
				+ inputDataClassName_3_4.getInputName_3_4_2());

		OutputDataClassName_3_4 out = new OutputDataClassName_3_4();

		out.setOutputName_3_4_3("CapabilityName_3_4");

		out.setOutputName_3_4_4(Float.valueOf("806"));

		out.setOutputName_3_4_1("CapabilityName_3_4");

		out.setOutputName_3_4_2(Float.valueOf("415"));

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

		instanceState_ServiceName_3_CapabilityName_3_4
				.setState(instanceState_ServiceName_3_CapabilityName_3_4
						.getState() + " ServiceName_3 CapabilityName_3_4");

		return out;
	}

	@Override
	public OutputDataClassName_3_5 CapabilityName_3_5(
			InputDataClassName_3_5 inputDataClassName_3_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_5 : ********//");

		System.out.println("InputName_3_5_1 : "
				+ inputDataClassName_3_5.getInputName_3_5_1());

		OutputDataClassName_3_5 out = new OutputDataClassName_3_5();

		out.setOutputName_3_5_2(Integer.valueOf("418"));

		out.setOutputName_3_5_3(Integer.valueOf("952"));

		out.setOutputName_3_5_1(Integer.valueOf("917"));

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

		instanceState_ServiceName_3_CapabilityName_3_5
				.setState(instanceState_ServiceName_3_CapabilityName_3_5
						.getState() + " ServiceName_3 CapabilityName_3_5");

		return out;
	}

	@Override
	public OutputDataClassName_3_6 CapabilityName_3_6(
			InputDataClassName_3_6 inputDataClassName_3_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_6 : ********//");

		System.out.println("InputName_3_6_2 : "
				+ inputDataClassName_3_6.getInputName_3_6_2());
		System.out.println("InputName_3_6_1 : "
				+ inputDataClassName_3_6.getInputName_3_6_1());

		OutputDataClassName_3_6 out = new OutputDataClassName_3_6();

		out.setOutputName_3_6_1("CapabilityName_3_6");

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

		instanceState_ServiceName_3_CapabilityName_3_6
				.setState(instanceState_ServiceName_3_CapabilityName_3_6
						.getState() + " ServiceName_3 CapabilityName_3_6");

		return out;
	}

	@Override
	public OutputDataClassName_3_1 CapabilityName_3_1(
			InputDataClassName_3_1 inputDataClassName_3_1) {
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

		OutputDataClassName_3_1 out = new OutputDataClassName_3_1();

		out.setOutputName_3_1_1(Float.valueOf("537"));

		out.setOutputName_3_1_4("CapabilityName_3_1");

		out.setOutputName_3_1_5(Float.valueOf("505"));

		out.setOutputName_3_1_2(Integer.valueOf("955"));

		out.setOutputName_3_1_3(Float.valueOf("101"));

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

		instanceState_ServiceName_3_CapabilityName_3_1
				.setState(instanceState_ServiceName_3_CapabilityName_3_1
						.getState() + " ServiceName_3 CapabilityName_3_1");

		return out;
	}

	@Override
	public void CapabilityName_3_2(InputDataClassName_3_2 inputDataClassName_3_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_2 : ********//");

		System.out.println("InputName_3_2_2 : "
				+ inputDataClassName_3_2.getInputName_3_2_2());
		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

	}

}
