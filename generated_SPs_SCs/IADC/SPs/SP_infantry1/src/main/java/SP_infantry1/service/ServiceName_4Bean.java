package SP_infantry1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_infantry1.input.InputDataClassName_4_2;
import SP_infantry1.input.InputDataClassName_4_3;
import SP_infantry1.input.InputDataClassName_4_4;
import SP_infantry1.input.InputDataClassName_4_5;
import SP_infantry1.input.InputDataClassName_4_1;

import SP_infantry1.output.OutputDataClassName_4_2;
import SP_infantry1.output.OutputDataClassName_4_4;
import SP_infantry1.output.OutputDataClassName_4_5;
import SP_infantry1.output.OutputDataClassName_4_1;

import SP_infantry1.state.State_ServiceName_4_CapabilityName_4_2;
import SP_infantry1.state.State_ServiceName_4_CapabilityName_4_3;
import SP_infantry1.state.State_ServiceName_4_CapabilityName_4_4;
import SP_infantry1.state.State_ServiceName_4_CapabilityName_4_5;
import SP_infantry1.state.State_ServiceName_4_CapabilityName_4_1;

import SP_infantry1.util.ConsumerHeader;

@Service(ServiceName_4.class)
public class ServiceName_4Bean implements ServiceName_4 {

	@Inject
	private Context context;

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

		out.setOutputName_4_2_4(Float.valueOf("758"));

		out.setOutputName_4_2_5(Float.valueOf("262"));

		out.setOutputName_4_2_6(Integer.valueOf("493"));

		out.setOutputName_4_2_1("CapabilityName_4_2");

		out.setOutputName_4_2_2(Integer.valueOf("461"));

		out.setOutputName_4_2_3(Integer.valueOf("61"));

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
		System.out.println("InputName_4_3_3 : "
				+ inputDataClassName_4_3.getInputName_4_3_3());
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

		out.setOutputName_4_4_2(Integer.valueOf("690"));

		out.setOutputName_4_4_3("CapabilityName_4_4");

		out.setOutputName_4_4_4(Float.valueOf("999"));

		out.setOutputName_4_4_5(Float.valueOf("869"));

		out.setOutputName_4_4_6("CapabilityName_4_4");

		out.setOutputName_4_4_7(Float.valueOf("898"));

		out.setOutputName_4_4_8(Integer.valueOf("560"));

		out.setOutputName_4_4_9(Integer.valueOf("463"));

		out.setOutputName_4_4_1("CapabilityName_4_4");

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
		System.out.println("InputName_4_5_2 : "
				+ inputDataClassName_4_5.getInputName_4_5_2());
		System.out.println("InputName_4_5_3 : "
				+ inputDataClassName_4_5.getInputName_4_5_3());

		OutputDataClassName_4_5 out = new OutputDataClassName_4_5();

		out.setOutputName_4_5_1(Integer.valueOf("704"));

		out.setOutputName_4_5_2(Integer.valueOf("283"));

		out.setOutputName_4_5_3(Integer.valueOf("76"));

		out.setOutputName_4_5_4(Float.valueOf("787"));

		out.setOutputName_4_5_5(Float.valueOf("418"));

		out.setOutputName_4_5_6(Integer.valueOf("750"));

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

		out.setOutputName_4_1_6("CapabilityName_4_1");

		out.setOutputName_4_1_7(Integer.valueOf("698"));

		out.setOutputName_4_1_8("CapabilityName_4_1");

		out.setOutputName_4_1_1("CapabilityName_4_1");

		out.setOutputName_4_1_2("CapabilityName_4_1");

		out.setOutputName_4_1_3(Integer.valueOf("779"));

		out.setOutputName_4_1_4(Float.valueOf("303"));

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
