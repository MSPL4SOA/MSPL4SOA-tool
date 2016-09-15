package large2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large2.input.InputDataClassName_5_5;
import large2.input.InputDataClassName_5_6;
import large2.input.InputDataClassName_5_1;
import large2.input.InputDataClassName_5_2;
import large2.input.InputDataClassName_5_3;
import large2.input.InputDataClassName_5_4;

import large2.output.OutputDataClassName_5_5;
import large2.output.OutputDataClassName_5_6;
import large2.output.OutputDataClassName_5_1;
import large2.output.OutputDataClassName_5_2;
import large2.output.OutputDataClassName_5_3;
import large2.output.OutputDataClassName_5_4;

import large2.state.State_ServiceName_5_CapabilityName_5_5;
import large2.state.State_ServiceName_5_CapabilityName_5_6;
import large2.state.State_ServiceName_5_CapabilityName_5_1;
import large2.state.State_ServiceName_5_CapabilityName_5_2;
import large2.state.State_ServiceName_5_CapabilityName_5_3;
import large2.state.State_ServiceName_5_CapabilityName_5_4;

import large2.util.ConsumerHeader;

@Service(ServiceName_5.class)
public class ServiceName_5Bean implements ServiceName_5 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_5_CapabilityName_5_5 instanceState_ServiceName_5_CapabilityName_5_5;
	@Inject
	State_ServiceName_5_CapabilityName_5_6 instanceState_ServiceName_5_CapabilityName_5_6;
	@Inject
	State_ServiceName_5_CapabilityName_5_1 instanceState_ServiceName_5_CapabilityName_5_1;
	@Inject
	State_ServiceName_5_CapabilityName_5_2 instanceState_ServiceName_5_CapabilityName_5_2;
	@Inject
	State_ServiceName_5_CapabilityName_5_3 instanceState_ServiceName_5_CapabilityName_5_3;
	@Inject
	State_ServiceName_5_CapabilityName_5_4 instanceState_ServiceName_5_CapabilityName_5_4;

	@Override
	public OutputDataClassName_5_5 CapabilityName_5_5(
			InputDataClassName_5_5 inputDataClassName_5_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_5 : ********//");

		System.out.println("InputName_5_5_1 : "
				+ inputDataClassName_5_5.getInputName_5_5_1());
		System.out.println("InputName_5_5_2 : "
				+ inputDataClassName_5_5.getInputName_5_5_2());
		System.out.println("InputName_5_5_3 : "
				+ inputDataClassName_5_5.getInputName_5_5_3());
		System.out.println("InputName_5_5_4 : "
				+ inputDataClassName_5_5.getInputName_5_5_4());

		OutputDataClassName_5_5 out = new OutputDataClassName_5_5();

		out.setOutputName_5_5_4("CapabilityName_5_5");

		out.setOutputName_5_5_2(Integer.valueOf("16"));

		out.setOutputName_5_5_3(Integer.valueOf("464"));

		out.setOutputName_5_5_1(Integer.valueOf("668"));

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

		instanceState_ServiceName_5_CapabilityName_5_5
				.setState(instanceState_ServiceName_5_CapabilityName_5_5
						.getState() + " ServiceName_5 CapabilityName_5_5");

		return out;
	}

	@Override
	public OutputDataClassName_5_6 CapabilityName_5_6(
			InputDataClassName_5_6 inputDataClassName_5_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_6 : ********//");

		System.out.println("InputName_5_6_1 : "
				+ inputDataClassName_5_6.getInputName_5_6_1());
		System.out.println("InputName_5_6_4 : "
				+ inputDataClassName_5_6.getInputName_5_6_4());
		System.out.println("InputName_5_6_2 : "
				+ inputDataClassName_5_6.getInputName_5_6_2());
		System.out.println("InputName_5_6_3 : "
				+ inputDataClassName_5_6.getInputName_5_6_3());

		OutputDataClassName_5_6 out = new OutputDataClassName_5_6();

		out.setOutputName_5_6_3(Float.valueOf("539"));

		out.setOutputName_5_6_4("CapabilityName_5_6");

		out.setOutputName_5_6_1(Float.valueOf("458"));

		out.setOutputName_5_6_2("CapabilityName_5_6");

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

		instanceState_ServiceName_5_CapabilityName_5_6
				.setState(instanceState_ServiceName_5_CapabilityName_5_6
						.getState() + " ServiceName_5 CapabilityName_5_6");

		return out;
	}

	@Override
	public OutputDataClassName_5_1 CapabilityName_5_1(
			InputDataClassName_5_1 inputDataClassName_5_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_1 : ********//");

		System.out.println("InputName_5_1_1 : "
				+ inputDataClassName_5_1.getInputName_5_1_1());
		System.out.println("InputName_5_1_2 : "
				+ inputDataClassName_5_1.getInputName_5_1_2());
		System.out.println("InputName_5_1_5 : "
				+ inputDataClassName_5_1.getInputName_5_1_5());
		System.out.println("InputName_5_1_3 : "
				+ inputDataClassName_5_1.getInputName_5_1_3());
		System.out.println("InputName_5_1_4 : "
				+ inputDataClassName_5_1.getInputName_5_1_4());

		OutputDataClassName_5_1 out = new OutputDataClassName_5_1();

		out.setOutputName_5_1_2(Integer.valueOf("59"));

		out.setOutputName_5_1_3("CapabilityName_5_1");

		out.setOutputName_5_1_1(Integer.valueOf("260"));

		out.setOutputName_5_1_4("CapabilityName_5_1");

		out.setOutputName_5_1_5(Integer.valueOf("418"));

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

		instanceState_ServiceName_5_CapabilityName_5_1
				.setState(instanceState_ServiceName_5_CapabilityName_5_1
						.getState() + " ServiceName_5 CapabilityName_5_1");

		return out;
	}

	@Override
	public OutputDataClassName_5_2 CapabilityName_5_2(
			InputDataClassName_5_2 inputDataClassName_5_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_2 : ********//");

		System.out.println("InputName_5_2_1 : "
				+ inputDataClassName_5_2.getInputName_5_2_1());
		System.out.println("InputName_5_2_4 : "
				+ inputDataClassName_5_2.getInputName_5_2_4());
		System.out.println("InputName_5_2_5 : "
				+ inputDataClassName_5_2.getInputName_5_2_5());
		System.out.println("InputName_5_2_2 : "
				+ inputDataClassName_5_2.getInputName_5_2_2());
		System.out.println("InputName_5_2_3 : "
				+ inputDataClassName_5_2.getInputName_5_2_3());

		OutputDataClassName_5_2 out = new OutputDataClassName_5_2();

		out.setOutputName_5_2_1("CapabilityName_5_2");

		out.setOutputName_5_2_2(Float.valueOf("375"));

		out.setOutputName_5_2_5(Integer.valueOf("176"));

		out.setOutputName_5_2_3(Integer.valueOf("109"));

		out.setOutputName_5_2_4("CapabilityName_5_2");

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

		instanceState_ServiceName_5_CapabilityName_5_2
				.setState(instanceState_ServiceName_5_CapabilityName_5_2
						.getState() + " ServiceName_5 CapabilityName_5_2");

		return out;
	}

	@Override
	public OutputDataClassName_5_3 CapabilityName_5_3(
			InputDataClassName_5_3 inputDataClassName_5_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_3 : ********//");

		System.out.println("InputName_5_3_3 : "
				+ inputDataClassName_5_3.getInputName_5_3_3());
		System.out.println("InputName_5_3_4 : "
				+ inputDataClassName_5_3.getInputName_5_3_4());
		System.out.println("InputName_5_3_1 : "
				+ inputDataClassName_5_3.getInputName_5_3_1());
		System.out.println("InputName_5_3_2 : "
				+ inputDataClassName_5_3.getInputName_5_3_2());
		System.out.println("InputName_5_3_5 : "
				+ inputDataClassName_5_3.getInputName_5_3_5());

		OutputDataClassName_5_3 out = new OutputDataClassName_5_3();

		out.setOutputName_5_3_1(Float.valueOf("425"));

		out.setOutputName_5_3_4("CapabilityName_5_3");

		out.setOutputName_5_3_5("CapabilityName_5_3");

		out.setOutputName_5_3_2(Float.valueOf("761"));

		out.setOutputName_5_3_3(Integer.valueOf("391"));

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

		instanceState_ServiceName_5_CapabilityName_5_3
				.setState(instanceState_ServiceName_5_CapabilityName_5_3
						.getState() + " ServiceName_5 CapabilityName_5_3");

		return out;
	}

	@Override
	public OutputDataClassName_5_4 CapabilityName_5_4(
			InputDataClassName_5_4 inputDataClassName_5_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_4 : ********//");

		System.out.println("InputName_5_4_2 : "
				+ inputDataClassName_5_4.getInputName_5_4_2());
		System.out.println("InputName_5_4_3 : "
				+ inputDataClassName_5_4.getInputName_5_4_3());
		System.out.println("InputName_5_4_1 : "
				+ inputDataClassName_5_4.getInputName_5_4_1());
		System.out.println("InputName_5_4_4 : "
				+ inputDataClassName_5_4.getInputName_5_4_4());

		OutputDataClassName_5_4 out = new OutputDataClassName_5_4();

		out.setOutputName_5_4_3(Float.valueOf("958"));

		out.setOutputName_5_4_4("CapabilityName_5_4");

		out.setOutputName_5_4_1(Float.valueOf("168"));

		out.setOutputName_5_4_2(Float.valueOf("928"));

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

		instanceState_ServiceName_5_CapabilityName_5_4
				.setState(instanceState_ServiceName_5_CapabilityName_5_4
						.getState() + " ServiceName_5 CapabilityName_5_4");

		return out;
	}

}
