package sync8.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sync8.input.InputDataClassName_6_5;
import sync8.input.InputDataClassName_6_1;
import sync8.input.InputDataClassName_6_2;
import sync8.input.InputDataClassName_6_3;

import sync8.output.OutputDataClassName_6_4;
import sync8.output.OutputDataClassName_6_1;
import sync8.output.OutputDataClassName_6_2;

import sync8.state.State_ServiceName_6_CapabilityName_6_4;
import sync8.state.State_ServiceName_6_CapabilityName_6_5;
import sync8.state.State_ServiceName_6_CapabilityName_6_6;
import sync8.state.State_ServiceName_6_CapabilityName_6_1;
import sync8.state.State_ServiceName_6_CapabilityName_6_2;
import sync8.state.State_ServiceName_6_CapabilityName_6_3;

import sync8.util.ConsumerHeader;

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
	public OutputDataClassName_6_4 CapabilityName_6_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_4 : ********//");

		OutputDataClassName_6_4 out = new OutputDataClassName_6_4();

		out.setOutputName_6_4_1("CapabilityName_6_4");

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
	public void CapabilityName_6_5(InputDataClassName_6_5 inputDataClassName_6_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_5 : ********//");

		System.out.println("InputName_6_5_1 : "
				+ inputDataClassName_6_5.getInputName_6_5_1());
		System.out.println("InputName_6_5_2 : "
				+ inputDataClassName_6_5.getInputName_6_5_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_5
				.setState(instanceState_ServiceName_6_CapabilityName_6_5
						.getState() + " ServiceName_6 CapabilityName_6_5");

	}

	@Override
	public void CapabilityName_6_6() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_6 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_6
				.setState(instanceState_ServiceName_6_CapabilityName_6_6
						.getState() + " ServiceName_6 CapabilityName_6_6");

	}

	@Override
	public OutputDataClassName_6_1 CapabilityName_6_1(
			InputDataClassName_6_1 inputDataClassName_6_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_1 : ********//");

		System.out.println("InputName_6_1_2 : "
				+ inputDataClassName_6_1.getInputName_6_1_2());
		System.out.println("InputName_6_1_3 : "
				+ inputDataClassName_6_1.getInputName_6_1_3());
		System.out.println("InputName_6_1_4 : "
				+ inputDataClassName_6_1.getInputName_6_1_4());
		System.out.println("InputName_6_1_5 : "
				+ inputDataClassName_6_1.getInputName_6_1_5());
		System.out.println("InputName_6_1_6 : "
				+ inputDataClassName_6_1.getInputName_6_1_6());
		System.out.println("InputName_6_1_1 : "
				+ inputDataClassName_6_1.getInputName_6_1_1());

		OutputDataClassName_6_1 out = new OutputDataClassName_6_1();

		out.setOutputName_6_1_1("CapabilityName_6_1");

		out.setOutputName_6_1_2(Integer.valueOf("85"));

		out.setOutputName_6_1_3("CapabilityName_6_1");

		out.setOutputName_6_1_4(Float.valueOf("708"));

		out.setOutputName_6_1_5("CapabilityName_6_1");

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
	public OutputDataClassName_6_2 CapabilityName_6_2(
			InputDataClassName_6_2 inputDataClassName_6_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_2 : ********//");

		System.out.println("InputName_6_2_1 : "
				+ inputDataClassName_6_2.getInputName_6_2_1());
		System.out.println("InputName_6_2_2 : "
				+ inputDataClassName_6_2.getInputName_6_2_2());
		System.out.println("InputName_6_2_3 : "
				+ inputDataClassName_6_2.getInputName_6_2_3());
		System.out.println("InputName_6_2_4 : "
				+ inputDataClassName_6_2.getInputName_6_2_4());

		OutputDataClassName_6_2 out = new OutputDataClassName_6_2();

		out.setOutputName_6_2_1("CapabilityName_6_2");

		out.setOutputName_6_2_3(Integer.valueOf("801"));

		out.setOutputName_6_2_2(Integer.valueOf("456"));

		out.setOutputName_6_2_4(Float.valueOf("341"));

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
	public void CapabilityName_6_3(InputDataClassName_6_3 inputDataClassName_6_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_3 : ********//");

		System.out.println("InputName_6_3_1 : "
				+ inputDataClassName_6_3.getInputName_6_3_1());
		System.out.println("InputName_6_3_2 : "
				+ inputDataClassName_6_3.getInputName_6_3_2());

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
