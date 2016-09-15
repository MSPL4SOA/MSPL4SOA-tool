package large2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large2.input.InputDataClassName_4_6;
import large2.input.InputDataClassName_4_2;
import large2.input.InputDataClassName_4_3;
import large2.input.InputDataClassName_4_4;
import large2.input.InputDataClassName_4_5;
import large2.input.InputDataClassName_4_1;

import large2.output.OutputDataClassName_4_6;
import large2.output.OutputDataClassName_4_2;
import large2.output.OutputDataClassName_4_3;
import large2.output.OutputDataClassName_4_4;
import large2.output.OutputDataClassName_4_5;
import large2.output.OutputDataClassName_4_1;

import large2.state.State_ServiceName_4_CapabilityName_4_6;
import large2.state.State_ServiceName_4_CapabilityName_4_2;
import large2.state.State_ServiceName_4_CapabilityName_4_3;
import large2.state.State_ServiceName_4_CapabilityName_4_4;
import large2.state.State_ServiceName_4_CapabilityName_4_5;
import large2.state.State_ServiceName_4_CapabilityName_4_1;

import large2.util.ConsumerHeader;

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

		System.out.println("InputName_4_6_3 : "
				+ inputDataClassName_4_6.getInputName_4_6_3());
		System.out.println("InputName_4_6_4 : "
				+ inputDataClassName_4_6.getInputName_4_6_4());
		System.out.println("InputName_4_6_5 : "
				+ inputDataClassName_4_6.getInputName_4_6_5());
		System.out.println("InputName_4_6_1 : "
				+ inputDataClassName_4_6.getInputName_4_6_1());
		System.out.println("InputName_4_6_2 : "
				+ inputDataClassName_4_6.getInputName_4_6_2());

		OutputDataClassName_4_6 out = new OutputDataClassName_4_6();

		out.setOutputName_4_6_1(Float.valueOf("743"));

		out.setOutputName_4_6_2("CapabilityName_4_6");

		out.setOutputName_4_6_3(Integer.valueOf("846"));

		out.setOutputName_4_6_4(Float.valueOf("772"));

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

		System.out.println("InputName_4_2_3 : "
				+ inputDataClassName_4_2.getInputName_4_2_3());
		System.out.println("InputName_4_2_4 : "
				+ inputDataClassName_4_2.getInputName_4_2_4());
		System.out.println("InputName_4_2_5 : "
				+ inputDataClassName_4_2.getInputName_4_2_5());
		System.out.println("InputName_4_2_6 : "
				+ inputDataClassName_4_2.getInputName_4_2_6());
		System.out.println("InputName_4_2_1 : "
				+ inputDataClassName_4_2.getInputName_4_2_1());
		System.out.println("InputName_4_2_2 : "
				+ inputDataClassName_4_2.getInputName_4_2_2());

		OutputDataClassName_4_2 out = new OutputDataClassName_4_2();

		out.setOutputName_4_2_4(Integer.valueOf("314"));

		out.setOutputName_4_2_5(Float.valueOf("817"));

		out.setOutputName_4_2_6(Integer.valueOf("362"));

		out.setOutputName_4_2_1(Float.valueOf("463"));

		out.setOutputName_4_2_2(Float.valueOf("368"));

		out.setOutputName_4_2_3(Float.valueOf("702"));

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
	public OutputDataClassName_4_3 CapabilityName_4_3(
			InputDataClassName_4_3 inputDataClassName_4_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_3 : ********//");

		System.out.println("InputName_4_3_6 : "
				+ inputDataClassName_4_3.getInputName_4_3_6());
		System.out.println("InputName_4_3_2 : "
				+ inputDataClassName_4_3.getInputName_4_3_2());
		System.out.println("InputName_4_3_3 : "
				+ inputDataClassName_4_3.getInputName_4_3_3());
		System.out.println("InputName_4_3_4 : "
				+ inputDataClassName_4_3.getInputName_4_3_4());
		System.out.println("InputName_4_3_5 : "
				+ inputDataClassName_4_3.getInputName_4_3_5());
		System.out.println("InputName_4_3_1 : "
				+ inputDataClassName_4_3.getInputName_4_3_1());

		OutputDataClassName_4_3 out = new OutputDataClassName_4_3();

		out.setOutputName_4_3_3(Integer.valueOf("286"));

		out.setOutputName_4_3_4(Float.valueOf("337"));

		out.setOutputName_4_3_5(Float.valueOf("605"));

		out.setOutputName_4_3_6(Float.valueOf("737"));

		out.setOutputName_4_3_1(Integer.valueOf("139"));

		out.setOutputName_4_3_2(Float.valueOf("689"));

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

		instanceState_ServiceName_4_CapabilityName_4_3
				.setState(instanceState_ServiceName_4_CapabilityName_4_3
						.getState() + " ServiceName_4 CapabilityName_4_3");

		return out;
	}

	@Override
	public OutputDataClassName_4_4 CapabilityName_4_4(
			InputDataClassName_4_4 inputDataClassName_4_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_4 : ********//");

		System.out.println("InputName_4_4_5 : "
				+ inputDataClassName_4_4.getInputName_4_4_5());
		System.out.println("InputName_4_4_6 : "
				+ inputDataClassName_4_4.getInputName_4_4_6());
		System.out.println("InputName_4_4_1 : "
				+ inputDataClassName_4_4.getInputName_4_4_1());
		System.out.println("InputName_4_4_2 : "
				+ inputDataClassName_4_4.getInputName_4_4_2());
		System.out.println("InputName_4_4_3 : "
				+ inputDataClassName_4_4.getInputName_4_4_3());
		System.out.println("InputName_4_4_4 : "
				+ inputDataClassName_4_4.getInputName_4_4_4());

		OutputDataClassName_4_4 out = new OutputDataClassName_4_4();

		out.setOutputName_4_4_2("CapabilityName_4_4");

		out.setOutputName_4_4_3(Integer.valueOf("841"));

		out.setOutputName_4_4_4(Float.valueOf("249"));

		out.setOutputName_4_4_5("CapabilityName_4_4");

		out.setOutputName_4_4_6(Float.valueOf("363"));

		out.setOutputName_4_4_1(Integer.valueOf("483"));

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

		System.out.println("InputName_4_5_4 : "
				+ inputDataClassName_4_5.getInputName_4_5_4());
		System.out.println("InputName_4_5_5 : "
				+ inputDataClassName_4_5.getInputName_4_5_5());
		System.out.println("InputName_4_5_6 : "
				+ inputDataClassName_4_5.getInputName_4_5_6());
		System.out.println("InputName_4_5_7 : "
				+ inputDataClassName_4_5.getInputName_4_5_7());
		System.out.println("InputName_4_5_1 : "
				+ inputDataClassName_4_5.getInputName_4_5_1());
		System.out.println("InputName_4_5_2 : "
				+ inputDataClassName_4_5.getInputName_4_5_2());
		System.out.println("InputName_4_5_3 : "
				+ inputDataClassName_4_5.getInputName_4_5_3());

		OutputDataClassName_4_5 out = new OutputDataClassName_4_5();

		out.setOutputName_4_5_1(Integer.valueOf("393"));

		out.setOutputName_4_5_2(Float.valueOf("864"));

		out.setOutputName_4_5_3(Integer.valueOf("432"));

		out.setOutputName_4_5_4(Float.valueOf("272"));

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

		System.out.println("InputName_4_1_4 : "
				+ inputDataClassName_4_1.getInputName_4_1_4());
		System.out.println("InputName_4_1_5 : "
				+ inputDataClassName_4_1.getInputName_4_1_5());
		System.out.println("InputName_4_1_6 : "
				+ inputDataClassName_4_1.getInputName_4_1_6());
		System.out.println("InputName_4_1_1 : "
				+ inputDataClassName_4_1.getInputName_4_1_1());
		System.out.println("InputName_4_1_2 : "
				+ inputDataClassName_4_1.getInputName_4_1_2());
		System.out.println("InputName_4_1_3 : "
				+ inputDataClassName_4_1.getInputName_4_1_3());

		OutputDataClassName_4_1 out = new OutputDataClassName_4_1();

		out.setOutputName_4_1_5("CapabilityName_4_1");

		out.setOutputName_4_1_6(Integer.valueOf("578"));

		out.setOutputName_4_1_1(Integer.valueOf("346"));

		out.setOutputName_4_1_2(Float.valueOf("922"));

		out.setOutputName_4_1_3("CapabilityName_4_1");

		out.setOutputName_4_1_4(Float.valueOf("178"));

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
