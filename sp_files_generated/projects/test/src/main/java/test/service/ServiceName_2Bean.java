package test.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import test.input.InputDataClassName_2_4;
import test.input.InputDataClassName_2_5;
import test.input.InputDataClassName_2_1;
import test.input.InputDataClassName_2_2;
import test.input.InputDataClassName_2_3;

import test.output.OutputDataClassName_2_4;
import test.output.OutputDataClassName_2_5;
import test.output.OutputDataClassName_2_1;
import test.output.OutputDataClassName_2_2;
import test.output.OutputDataClassName_2_3;

import test.state.State_ServiceName_2_CapabilityName_2_4;
import test.state.State_ServiceName_2_CapabilityName_2_5;
import test.state.State_ServiceName_2_CapabilityName_2_1;
import test.state.State_ServiceName_2_CapabilityName_2_2;
import test.state.State_ServiceName_2_CapabilityName_2_3;

import test.util.ConsumerHeader;

@Service(ServiceName_2.class)
public class ServiceName_2Bean implements ServiceName_2 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	@Inject
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
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
		System.out.println("InputName_2_4_6 : "
				+ inputDataClassName_2_4.getInputName_2_4_6());
		System.out.println("InputName_2_4_7 : "
				+ inputDataClassName_2_4.getInputName_2_4_7());

		OutputDataClassName_2_4 out = new OutputDataClassName_2_4();

		out.setOutputName_2_4_4(Integer.valueOf("21"));

		out.setOutputName_2_4_5(Float.valueOf("375"));

		out.setOutputName_2_4_6(Float.valueOf("9"));

		out.setOutputName_2_4_1(Integer.valueOf("77"));

		out.setOutputName_2_4_2(Float.valueOf("399"));

		out.setOutputName_2_4_3(Integer.valueOf("195"));

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
		System.out.println("InputName_2_5_3 : "
				+ inputDataClassName_2_5.getInputName_2_5_3());
		System.out.println("InputName_2_5_4 : "
				+ inputDataClassName_2_5.getInputName_2_5_4());
		System.out.println("InputName_2_5_5 : "
				+ inputDataClassName_2_5.getInputName_2_5_5());
		System.out.println("InputName_2_5_6 : "
				+ inputDataClassName_2_5.getInputName_2_5_6());
		System.out.println("InputName_2_5_7 : "
				+ inputDataClassName_2_5.getInputName_2_5_7());

		OutputDataClassName_2_5 out = new OutputDataClassName_2_5();

		out.setOutputName_2_5_3(Integer.valueOf("184"));

		out.setOutputName_2_5_4(Float.valueOf("328"));

		out.setOutputName_2_5_5(Integer.valueOf("211"));

		out.setOutputName_2_5_6(Float.valueOf("323"));

		out.setOutputName_2_5_1(Integer.valueOf("723"));

		out.setOutputName_2_5_2(Integer.valueOf("59"));

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
	public OutputDataClassName_2_1 CapabilityName_2_1(
			InputDataClassName_2_1 inputDataClassName_2_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_1 : ********//");

		System.out.println("InputName_2_1_1 : "
				+ inputDataClassName_2_1.getInputName_2_1_1());
		System.out.println("InputName_2_1_2 : "
				+ inputDataClassName_2_1.getInputName_2_1_2());

		OutputDataClassName_2_1 out = new OutputDataClassName_2_1();

		out.setOutputName_2_1_7("CapabilityName_2_1");

		out.setOutputName_2_1_3(Float.valueOf("898"));

		out.setOutputName_2_1_4(Float.valueOf("89"));

		out.setOutputName_2_1_5(Integer.valueOf("440"));

		out.setOutputName_2_1_6(Float.valueOf("862"));

		out.setOutputName_2_1_1(Float.valueOf("185"));

		out.setOutputName_2_1_2(Integer.valueOf("434"));

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

		OutputDataClassName_2_2 out = new OutputDataClassName_2_2();

		out.setOutputName_2_2_6(Integer.valueOf("444"));

		out.setOutputName_2_2_7(Float.valueOf("277"));

		out.setOutputName_2_2_8("CapabilityName_2_2");

		out.setOutputName_2_2_2(Integer.valueOf("44"));

		out.setOutputName_2_2_3("CapabilityName_2_2");

		out.setOutputName_2_2_4(Integer.valueOf("151"));

		out.setOutputName_2_2_5(Float.valueOf("394"));

		out.setOutputName_2_2_1(Float.valueOf("769"));

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

		OutputDataClassName_2_3 out = new OutputDataClassName_2_3();

		out.setOutputName_2_3_5(Float.valueOf("609"));

		out.setOutputName_2_3_6("CapabilityName_2_3");

		out.setOutputName_2_3_7(Integer.valueOf("301"));

		out.setOutputName_2_3_1(Integer.valueOf("427"));

		out.setOutputName_2_3_2("CapabilityName_2_3");

		out.setOutputName_2_3_3(Integer.valueOf("537"));

		out.setOutputName_2_3_4(Integer.valueOf("116"));

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
