package sync8.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sync8.input.InputDataClassName_2_4;
import sync8.input.InputDataClassName_2_5;
import sync8.input.InputDataClassName_2_6;
import sync8.input.InputDataClassName_2_1;
import sync8.input.InputDataClassName_2_2;
import sync8.input.InputDataClassName_2_3;

import sync8.output.OutputDataClassName_2_4;
import sync8.output.OutputDataClassName_2_5;
import sync8.output.OutputDataClassName_2_6;
import sync8.output.OutputDataClassName_2_1;
import sync8.output.OutputDataClassName_2_2;
import sync8.output.OutputDataClassName_2_3;

import sync8.state.State_ServiceName_2_CapabilityName_2_4;
import sync8.state.State_ServiceName_2_CapabilityName_2_5;
import sync8.state.State_ServiceName_2_CapabilityName_2_6;
import sync8.state.State_ServiceName_2_CapabilityName_2_1;
import sync8.state.State_ServiceName_2_CapabilityName_2_2;
import sync8.state.State_ServiceName_2_CapabilityName_2_3;

import sync8.util.ConsumerHeader;

@Service(ServiceName_2.class)
public class ServiceName_2Bean implements ServiceName_2 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	@Inject
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
	@Inject
	State_ServiceName_2_CapabilityName_2_6 instanceState_ServiceName_2_CapabilityName_2_6;
	@Inject
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	@Inject
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;
	@Inject
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public OutputDataClassName_2_4 CapabilityName_2_4(
			InputDataClassName_2_4 inputDataClassName_2_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_4 : ********//");

		System.out.println("InputName_2_4_1 : "
				+ inputDataClassName_2_4.getInputName_2_4_1());
		System.out.println("InputName_2_4_2 : "
				+ inputDataClassName_2_4.getInputName_2_4_2());
		System.out.println("InputName_2_4_3 : "
				+ inputDataClassName_2_4.getInputName_2_4_3());
		System.out.println("InputName_2_4_4 : "
				+ inputDataClassName_2_4.getInputName_2_4_4());
		System.out.println("InputName_2_4_5 : "
				+ inputDataClassName_2_4.getInputName_2_4_5());

		OutputDataClassName_2_4 out = new OutputDataClassName_2_4();

		out.setOutputName_2_4_4(Float.valueOf("540"));

		out.setOutputName_2_4_1("CapabilityName_2_4");

		out.setOutputName_2_4_2(Integer.valueOf("691"));

		out.setOutputName_2_4_3(Float.valueOf("98"));

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

		instanceState_ServiceName_2_CapabilityName_2_4
				.setState(instanceState_ServiceName_2_CapabilityName_2_4
						.getState() + " ServiceName_2 CapabilityName_2_4");

		return out;
	}

	@Override
	public OutputDataClassName_2_5 CapabilityName_2_5(
			InputDataClassName_2_5 inputDataClassName_2_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_5 : ********//");

		System.out.println("InputName_2_5_1 : "
				+ inputDataClassName_2_5.getInputName_2_5_1());
		System.out.println("InputName_2_5_2 : "
				+ inputDataClassName_2_5.getInputName_2_5_2());

		OutputDataClassName_2_5 out = new OutputDataClassName_2_5();

		out.setOutputName_2_5_1("CapabilityName_2_5");

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

		instanceState_ServiceName_2_CapabilityName_2_5
				.setState(instanceState_ServiceName_2_CapabilityName_2_5
						.getState() + " ServiceName_2 CapabilityName_2_5");

		return out;
	}

	@Override
	public OutputDataClassName_2_6 CapabilityName_2_6(
			InputDataClassName_2_6 inputDataClassName_2_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_6 : ********//");

		System.out.println("InputName_2_6_1 : "
				+ inputDataClassName_2_6.getInputName_2_6_1());

		OutputDataClassName_2_6 out = new OutputDataClassName_2_6();

		out.setOutputName_2_6_6("CapabilityName_2_6");

		out.setOutputName_2_6_2(Float.valueOf("573"));

		out.setOutputName_2_6_3(Integer.valueOf("97"));

		out.setOutputName_2_6_4(Float.valueOf("955"));

		out.setOutputName_2_6_5(Float.valueOf("941"));

		out.setOutputName_2_6_1(Integer.valueOf("405"));

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

		instanceState_ServiceName_2_CapabilityName_2_6
				.setState(instanceState_ServiceName_2_CapabilityName_2_6
						.getState() + " ServiceName_2 CapabilityName_2_6");

		return out;
	}

	@Override
	public OutputDataClassName_2_1 CapabilityName_2_1(
			InputDataClassName_2_1 inputDataClassName_2_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_1 : ********//");

		System.out.println("InputName_2_1_1 : "
				+ inputDataClassName_2_1.getInputName_2_1_1());
		System.out.println("InputName_2_1_2 : "
				+ inputDataClassName_2_1.getInputName_2_1_2());
		System.out.println("InputName_2_1_3 : "
				+ inputDataClassName_2_1.getInputName_2_1_3());
		System.out.println("InputName_2_1_4 : "
				+ inputDataClassName_2_1.getInputName_2_1_4());
		System.out.println("InputName_2_1_5 : "
				+ inputDataClassName_2_1.getInputName_2_1_5());

		OutputDataClassName_2_1 out = new OutputDataClassName_2_1();

		out.setOutputName_2_1_3("CapabilityName_2_1");

		out.setOutputName_2_1_4("CapabilityName_2_1");

		out.setOutputName_2_1_5(Integer.valueOf("163"));

		out.setOutputName_2_1_6(Integer.valueOf("220"));

		out.setOutputName_2_1_1("CapabilityName_2_1");

		out.setOutputName_2_1_2("CapabilityName_2_1");

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

		OutputDataClassName_2_2 out = new OutputDataClassName_2_2();

		out.setOutputName_2_2_2(Integer.valueOf("187"));

		out.setOutputName_2_2_3("CapabilityName_2_2");

		out.setOutputName_2_2_4("CapabilityName_2_2");

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

	@Override
	public OutputDataClassName_2_3 CapabilityName_2_3(
			InputDataClassName_2_3 inputDataClassName_2_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_3 : ********//");

		System.out.println("InputName_2_3_1 : "
				+ inputDataClassName_2_3.getInputName_2_3_1());
		System.out.println("InputName_2_3_2 : "
				+ inputDataClassName_2_3.getInputName_2_3_2());
		System.out.println("InputName_2_3_3 : "
				+ inputDataClassName_2_3.getInputName_2_3_3());
		System.out.println("InputName_2_3_4 : "
				+ inputDataClassName_2_3.getInputName_2_3_4());
		System.out.println("InputName_2_3_5 : "
				+ inputDataClassName_2_3.getInputName_2_3_5());
		System.out.println("InputName_2_3_6 : "
				+ inputDataClassName_2_3.getInputName_2_3_6());
		System.out.println("InputName_2_3_7 : "
				+ inputDataClassName_2_3.getInputName_2_3_7());

		OutputDataClassName_2_3 out = new OutputDataClassName_2_3();

		out.setOutputName_2_3_5(Float.valueOf("848"));

		out.setOutputName_2_3_6("CapabilityName_2_3");

		out.setOutputName_2_3_1(Float.valueOf("788"));

		out.setOutputName_2_3_2("CapabilityName_2_3");

		out.setOutputName_2_3_3(Integer.valueOf("229"));

		out.setOutputName_2_3_4(Integer.valueOf("78"));

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

		instanceState_ServiceName_2_CapabilityName_2_3
				.setState(instanceState_ServiceName_2_CapabilityName_2_3
						.getState() + " ServiceName_2 CapabilityName_2_3");

		return out;
	}

}
