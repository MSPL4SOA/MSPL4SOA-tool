package test.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import test.input.InputDataClassName_3_3;
import test.input.InputDataClassName_3_5;
import test.input.InputDataClassName_3_6;
import test.input.InputDataClassName_3_1;
import test.input.InputDataClassName_3_2;

import test.output.OutputDataClassName_3_4;
import test.output.OutputDataClassName_3_5;
import test.output.OutputDataClassName_3_6;
import test.output.OutputDataClassName_3_1;
import test.output.OutputDataClassName_3_2;

import test.state.State_ServiceName_3_CapabilityName_3_3;
import test.state.State_ServiceName_3_CapabilityName_3_4;
import test.state.State_ServiceName_3_CapabilityName_3_5;
import test.state.State_ServiceName_3_CapabilityName_3_6;
import test.state.State_ServiceName_3_CapabilityName_3_1;
import test.state.State_ServiceName_3_CapabilityName_3_2;

import test.util.ConsumerHeader;

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
	public void CapabilityName_3_3(InputDataClassName_3_3 inputDataClassName_3_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_3 : ********//");

		System.out.println("InputName_3_3_1 : "
				+ inputDataClassName_3_3.getInputName_3_3_1());
		System.out.println("InputName_3_3_2 : "
				+ inputDataClassName_3_3.getInputName_3_3_2());
		System.out.println("InputName_3_3_5 : "
				+ inputDataClassName_3_3.getInputName_3_3_5());
		System.out.println("InputName_3_3_6 : "
				+ inputDataClassName_3_3.getInputName_3_3_6());
		System.out.println("InputName_3_3_3 : "
				+ inputDataClassName_3_3.getInputName_3_3_3());
		System.out.println("InputName_3_3_4 : "
				+ inputDataClassName_3_3.getInputName_3_3_4());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_3
				.setState(instanceState_ServiceName_3_CapabilityName_3_3
						.getState() + " ServiceName_3 CapabilityName_3_3");

	}

	@Override
	public OutputDataClassName_3_4 CapabilityName_3_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_4 : ********//");

		OutputDataClassName_3_4 out = new OutputDataClassName_3_4();

		out.setOutputName_3_4_5("CapabilityName_3_4");

		out.setOutputName_3_4_6(Integer.valueOf("978"));

		out.setOutputName_3_4_3(Float.valueOf("298"));

		out.setOutputName_3_4_4(Float.valueOf("267"));

		out.setOutputName_3_4_7(Integer.valueOf("706"));

		out.setOutputName_3_4_8(Float.valueOf("721"));

		out.setOutputName_3_4_1(Float.valueOf("141"));

		out.setOutputName_3_4_2("CapabilityName_3_4");

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

		System.out.println("InputName_3_5_9 : "
				+ inputDataClassName_3_5.getInputName_3_5_9());
		System.out.println("InputName_3_5_7 : "
				+ inputDataClassName_3_5.getInputName_3_5_7());
		System.out.println("InputName_3_5_8 : "
				+ inputDataClassName_3_5.getInputName_3_5_8());
		System.out.println("InputName_3_5_5 : "
				+ inputDataClassName_3_5.getInputName_3_5_5());
		System.out.println("InputName_3_5_6 : "
				+ inputDataClassName_3_5.getInputName_3_5_6());
		System.out.println("InputName_3_5_3 : "
				+ inputDataClassName_3_5.getInputName_3_5_3());
		System.out.println("InputName_3_5_4 : "
				+ inputDataClassName_3_5.getInputName_3_5_4());
		System.out.println("InputName_3_5_1 : "
				+ inputDataClassName_3_5.getInputName_3_5_1());
		System.out.println("InputName_3_5_2 : "
				+ inputDataClassName_3_5.getInputName_3_5_2());

		OutputDataClassName_3_5 out = new OutputDataClassName_3_5();

		out.setOutputName_3_5_4(Float.valueOf("657"));

		out.setOutputName_3_5_5("CapabilityName_3_5");

		out.setOutputName_3_5_2(Integer.valueOf("491"));

		out.setOutputName_3_5_3(Float.valueOf("454"));

		out.setOutputName_3_5_6(Integer.valueOf("284"));

		out.setOutputName_3_5_1(Integer.valueOf("529"));

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

		System.out.println("InputName_3_6_6 : "
				+ inputDataClassName_3_6.getInputName_3_6_6());
		System.out.println("InputName_3_6_7 : "
				+ inputDataClassName_3_6.getInputName_3_6_7());
		System.out.println("InputName_3_6_4 : "
				+ inputDataClassName_3_6.getInputName_3_6_4());
		System.out.println("InputName_3_6_5 : "
				+ inputDataClassName_3_6.getInputName_3_6_5());
		System.out.println("InputName_3_6_2 : "
				+ inputDataClassName_3_6.getInputName_3_6_2());
		System.out.println("InputName_3_6_3 : "
				+ inputDataClassName_3_6.getInputName_3_6_3());
		System.out.println("InputName_3_6_1 : "
				+ inputDataClassName_3_6.getInputName_3_6_1());

		OutputDataClassName_3_6 out = new OutputDataClassName_3_6();

		out.setOutputName_3_6_1(Float.valueOf("647"));

		out.setOutputName_3_6_2(Float.valueOf("673"));

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

		out.setOutputName_3_1_6("CapabilityName_3_1");

		out.setOutputName_3_1_1(Float.valueOf("923"));

		out.setOutputName_3_1_4(Integer.valueOf("99"));

		out.setOutputName_3_1_5(Integer.valueOf("825"));

		out.setOutputName_3_1_2(Float.valueOf("933"));

		out.setOutputName_3_1_3(Float.valueOf("756"));

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
	public OutputDataClassName_3_2 CapabilityName_3_2(
			InputDataClassName_3_2 inputDataClassName_3_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_2 : ********//");

		System.out.println("InputName_3_2_2 : "
				+ inputDataClassName_3_2.getInputName_3_2_2());
		System.out.println("InputName_3_2_3 : "
				+ inputDataClassName_3_2.getInputName_3_2_3());
		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());
		System.out.println("InputName_3_2_8 : "
				+ inputDataClassName_3_2.getInputName_3_2_8());
		System.out.println("InputName_3_2_9 : "
				+ inputDataClassName_3_2.getInputName_3_2_9());
		System.out.println("InputName_3_2_6 : "
				+ inputDataClassName_3_2.getInputName_3_2_6());
		System.out.println("InputName_3_2_7 : "
				+ inputDataClassName_3_2.getInputName_3_2_7());
		System.out.println("InputName_3_2_4 : "
				+ inputDataClassName_3_2.getInputName_3_2_4());
		System.out.println("InputName_3_2_5 : "
				+ inputDataClassName_3_2.getInputName_3_2_5());

		OutputDataClassName_3_2 out = new OutputDataClassName_3_2();

		out.setOutputName_3_2_7(Float.valueOf("200"));

		out.setOutputName_3_2_5(Float.valueOf("267"));

		out.setOutputName_3_2_6(Float.valueOf("712"));

		out.setOutputName_3_2_3(Integer.valueOf("136"));

		out.setOutputName_3_2_4(Integer.valueOf("480"));

		out.setOutputName_3_2_1("CapabilityName_3_2");

		out.setOutputName_3_2_2(Integer.valueOf("440"));

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

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

		return out;
	}

}
