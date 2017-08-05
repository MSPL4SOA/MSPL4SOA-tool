package sync8.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sync8.input.InputDataClassName_4_6;
import sync8.input.InputDataClassName_4_2;
import sync8.input.InputDataClassName_4_3;
import sync8.input.InputDataClassName_4_5;
import sync8.input.InputDataClassName_4_1;

import sync8.output.OutputDataClassName_4_6;
import sync8.output.OutputDataClassName_4_2;
import sync8.output.OutputDataClassName_4_4;
import sync8.output.OutputDataClassName_4_5;
import sync8.output.OutputDataClassName_4_1;

import sync8.state.State_ServiceName_4_CapabilityName_4_6;
import sync8.state.State_ServiceName_4_CapabilityName_4_2;
import sync8.state.State_ServiceName_4_CapabilityName_4_3;
import sync8.state.State_ServiceName_4_CapabilityName_4_4;
import sync8.state.State_ServiceName_4_CapabilityName_4_5;
import sync8.state.State_ServiceName_4_CapabilityName_4_1;

import sync8.util.ConsumerHeader;

@Service(ServiceName_4.class)
public class ServiceName_4Bean implements ServiceName_4 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_4_CapabilityName_4_6 instanceState_ServiceName_4_CapabilityName_4_6;
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
	public OutputDataClassName_4_6 CapabilityName_4_6(
			InputDataClassName_4_6 inputDataClassName_4_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_6 : ********//");

		System.out.println("InputName_4_6_1 : "
				+ inputDataClassName_4_6.getInputName_4_6_1());

		OutputDataClassName_4_6 out = new OutputDataClassName_4_6();

		out.setOutputName_4_6_1("CapabilityName_4_6");

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

		instanceState_ServiceName_4_CapabilityName_4_6
				.setState(instanceState_ServiceName_4_CapabilityName_4_6
						.getState() + " ServiceName_4 CapabilityName_4_6");

		return out;
	}

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

		out.setOutputName_4_2_4("CapabilityName_4_2");

		out.setOutputName_4_2_1(Float.valueOf("621"));

		out.setOutputName_4_2_2(Integer.valueOf("644"));

		out.setOutputName_4_2_3(Float.valueOf("500"));

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
	public void CapabilityName_4_3(InputDataClassName_4_3 inputDataClassName_4_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_3 : ********//");

		System.out.println("InputName_4_3_2 : "
				+ inputDataClassName_4_3.getInputName_4_3_2());
		System.out.println("InputName_4_3_1 : "
				+ inputDataClassName_4_3.getInputName_4_3_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_4_CapabilityName_4_3
				.setState(instanceState_ServiceName_4_CapabilityName_4_3
						.getState() + " ServiceName_4 CapabilityName_4_3");

	}

	@Override
	public OutputDataClassName_4_4 CapabilityName_4_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_4 : ********//");

		OutputDataClassName_4_4 out = new OutputDataClassName_4_4();

		out.setOutputName_4_4_2("CapabilityName_4_4");

		out.setOutputName_4_4_1(Integer.valueOf("26"));

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
	public OutputDataClassName_4_5 CapabilityName_4_5(
			InputDataClassName_4_5 inputDataClassName_4_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_5 : ********//");

		System.out.println("InputName_4_5_1 : "
				+ inputDataClassName_4_5.getInputName_4_5_1());

		OutputDataClassName_4_5 out = new OutputDataClassName_4_5();

		out.setOutputName_4_5_1("CapabilityName_4_5");

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

		instanceState_ServiceName_4_CapabilityName_4_5
				.setState(instanceState_ServiceName_4_CapabilityName_4_5
						.getState() + " ServiceName_4 CapabilityName_4_5");

		return out;
	}

	@Override
	public OutputDataClassName_4_1 CapabilityName_4_1(
			InputDataClassName_4_1 inputDataClassName_4_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_1 : ********//");

		System.out.println("InputName_4_1_1 : "
				+ inputDataClassName_4_1.getInputName_4_1_1());
		System.out.println("InputName_4_1_2 : "
				+ inputDataClassName_4_1.getInputName_4_1_2());
		System.out.println("InputName_4_1_3 : "
				+ inputDataClassName_4_1.getInputName_4_1_3());

		OutputDataClassName_4_1 out = new OutputDataClassName_4_1();

		out.setOutputName_4_1_1(Integer.valueOf("984"));

		out.setOutputName_4_1_2(Float.valueOf("670"));

		out.setOutputName_4_1_3(Float.valueOf("896"));

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
