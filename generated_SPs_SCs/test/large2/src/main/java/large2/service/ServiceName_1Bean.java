package large2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large2.input.InputDataClassName_1_6;
import large2.input.InputDataClassName_1_1;
import large2.input.InputDataClassName_1_2;
import large2.input.InputDataClassName_1_3;
import large2.input.InputDataClassName_1_4;

import large2.output.OutputDataClassName_1_5;
import large2.output.OutputDataClassName_1_6;
import large2.output.OutputDataClassName_1_1;
import large2.output.OutputDataClassName_1_2;
import large2.output.OutputDataClassName_1_3;

import large2.state.State_ServiceName_1_CapabilityName_1_5;
import large2.state.State_ServiceName_1_CapabilityName_1_6;
import large2.state.State_ServiceName_1_CapabilityName_1_1;
import large2.state.State_ServiceName_1_CapabilityName_1_2;
import large2.state.State_ServiceName_1_CapabilityName_1_3;
import large2.state.State_ServiceName_1_CapabilityName_1_4;

import large2.util.ConsumerHeader;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_5 instanceState_ServiceName_1_CapabilityName_1_5;
	@Inject
	State_ServiceName_1_CapabilityName_1_6 instanceState_ServiceName_1_CapabilityName_1_6;
	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	@Inject
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;
	@Inject
	State_ServiceName_1_CapabilityName_1_4 instanceState_ServiceName_1_CapabilityName_1_4;

	@Override
	public OutputDataClassName_1_5 CapabilityName_1_5() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_5 : ********//");

		OutputDataClassName_1_5 out = new OutputDataClassName_1_5();

		out.setOutputName_1_5_6("CapabilityName_1_5");

		out.setOutputName_1_5_7(Float.valueOf("998"));

		out.setOutputName_1_5_4(Float.valueOf("173"));

		out.setOutputName_1_5_5(Integer.valueOf("300"));

		out.setOutputName_1_5_2(Integer.valueOf("67"));

		out.setOutputName_1_5_3(Float.valueOf("684"));

		out.setOutputName_1_5_1("CapabilityName_1_5");

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
	public OutputDataClassName_1_6 CapabilityName_1_6(
			InputDataClassName_1_6 inputDataClassName_1_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_6 : ********//");

		System.out.println("InputName_1_6_4 : "
				+ inputDataClassName_1_6.getInputName_1_6_4());
		System.out.println("InputName_1_6_5 : "
				+ inputDataClassName_1_6.getInputName_1_6_5());
		System.out.println("InputName_1_6_2 : "
				+ inputDataClassName_1_6.getInputName_1_6_2());
		System.out.println("InputName_1_6_3 : "
				+ inputDataClassName_1_6.getInputName_1_6_3());
		System.out.println("InputName_1_6_6 : "
				+ inputDataClassName_1_6.getInputName_1_6_6());
		System.out.println("InputName_1_6_7 : "
				+ inputDataClassName_1_6.getInputName_1_6_7());
		System.out.println("InputName_1_6_1 : "
				+ inputDataClassName_1_6.getInputName_1_6_1());

		OutputDataClassName_1_6 out = new OutputDataClassName_1_6();

		out.setOutputName_1_6_7("CapabilityName_1_6");

		out.setOutputName_1_6_8(Float.valueOf("205"));

		out.setOutputName_1_6_5(Integer.valueOf("157"));

		out.setOutputName_1_6_6("CapabilityName_1_6");

		out.setOutputName_1_6_3("CapabilityName_1_6");

		out.setOutputName_1_6_4(Integer.valueOf("270"));

		out.setOutputName_1_6_1(Float.valueOf("365"));

		out.setOutputName_1_6_2(Float.valueOf("444"));

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

		instanceState_ServiceName_1_CapabilityName_1_6
				.setState(instanceState_ServiceName_1_CapabilityName_1_6
						.getState() + " ServiceName_1 CapabilityName_1_6");

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
		System.out.println("InputName_1_1_3 : "
				+ inputDataClassName_1_1.getInputName_1_1_3());
		System.out.println("InputName_1_1_4 : "
				+ inputDataClassName_1_1.getInputName_1_1_4());

		OutputDataClassName_1_1 out = new OutputDataClassName_1_1();

		out.setOutputName_1_1_4("CapabilityName_1_1");

		out.setOutputName_1_1_5(Float.valueOf("967"));

		out.setOutputName_1_1_2("CapabilityName_1_1");

		out.setOutputName_1_1_3(Float.valueOf("536"));

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

		System.out.println("InputName_1_2_6 : "
				+ inputDataClassName_1_2.getInputName_1_2_6());
		System.out.println("InputName_1_2_1 : "
				+ inputDataClassName_1_2.getInputName_1_2_1());
		System.out.println("InputName_1_2_4 : "
				+ inputDataClassName_1_2.getInputName_1_2_4());
		System.out.println("InputName_1_2_5 : "
				+ inputDataClassName_1_2.getInputName_1_2_5());
		System.out.println("InputName_1_2_2 : "
				+ inputDataClassName_1_2.getInputName_1_2_2());
		System.out.println("InputName_1_2_3 : "
				+ inputDataClassName_1_2.getInputName_1_2_3());

		OutputDataClassName_1_2 out = new OutputDataClassName_1_2();

		out.setOutputName_1_2_7(Float.valueOf("457"));

		out.setOutputName_1_2_8(Float.valueOf("658"));

		out.setOutputName_1_2_5(Integer.valueOf("80"));

		out.setOutputName_1_2_6("CapabilityName_1_2");

		out.setOutputName_1_2_3(Integer.valueOf("289"));

		out.setOutputName_1_2_4("CapabilityName_1_2");

		out.setOutputName_1_2_1(Float.valueOf("995"));

		out.setOutputName_1_2_2(Float.valueOf("411"));

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
		System.out.println("InputName_1_3_9 : "
				+ inputDataClassName_1_3.getInputName_1_3_9());
		System.out.println("InputName_1_3_3 : "
				+ inputDataClassName_1_3.getInputName_1_3_3());
		System.out.println("InputName_1_3_4 : "
				+ inputDataClassName_1_3.getInputName_1_3_4());
		System.out.println("InputName_1_3_1 : "
				+ inputDataClassName_1_3.getInputName_1_3_1());
		System.out.println("InputName_1_3_2 : "
				+ inputDataClassName_1_3.getInputName_1_3_2());

		OutputDataClassName_1_3 out = new OutputDataClassName_1_3();

		out.setOutputName_1_3_8(Integer.valueOf("200"));

		out.setOutputName_1_3_9(Float.valueOf("304"));

		out.setOutputName_1_3_6(Integer.valueOf("485"));

		out.setOutputName_1_3_7("CapabilityName_1_3");

		out.setOutputName_1_3_4(Float.valueOf("540"));

		out.setOutputName_1_3_5(Float.valueOf("884"));

		out.setOutputName_1_3_2(Integer.valueOf("312"));

		out.setOutputName_1_3_3(Float.valueOf("254"));

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
	public void CapabilityName_1_4(InputDataClassName_1_4 inputDataClassName_1_4) {
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
		System.out.println("InputName_1_4_8 : "
				+ inputDataClassName_1_4.getInputName_1_4_8());
		System.out.println("InputName_1_4_2 : "
				+ inputDataClassName_1_4.getInputName_1_4_2());
		System.out.println("InputName_1_4_3 : "
				+ inputDataClassName_1_4.getInputName_1_4_3());
		System.out.println("InputName_1_4_1 : "
				+ inputDataClassName_1_4.getInputName_1_4_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_1_CapabilityName_1_4
				.setState(instanceState_ServiceName_1_CapabilityName_1_4
						.getState() + " ServiceName_1 CapabilityName_1_4");

	}

}
