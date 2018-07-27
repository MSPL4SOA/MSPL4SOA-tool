package SP_infantry1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_infantry1.input.InputDataClassName_5_5;
import SP_infantry1.input.InputDataClassName_5_1;
import SP_infantry1.input.InputDataClassName_5_2;
import SP_infantry1.input.InputDataClassName_5_3;

import SP_infantry1.output.OutputDataClassName_5_5;
import SP_infantry1.output.OutputDataClassName_5_1;
import SP_infantry1.output.OutputDataClassName_5_2;
import SP_infantry1.output.OutputDataClassName_5_3;
import SP_infantry1.output.OutputDataClassName_5_4;

import SP_infantry1.state.State_ServiceName_5_CapabilityName_5_5;
import SP_infantry1.state.State_ServiceName_5_CapabilityName_5_1;
import SP_infantry1.state.State_ServiceName_5_CapabilityName_5_2;
import SP_infantry1.state.State_ServiceName_5_CapabilityName_5_3;
import SP_infantry1.state.State_ServiceName_5_CapabilityName_5_4;

import SP_infantry1.util.ConsumerHeader;

@Service(ServiceName_5.class)
public class ServiceName_5Bean implements ServiceName_5 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_5_CapabilityName_5_5 instanceState_ServiceName_5_CapabilityName_5_5;
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
		System.out.println("InputName_5_5_5 : "
				+ inputDataClassName_5_5.getInputName_5_5_5());
		System.out.println("InputName_5_5_6 : "
				+ inputDataClassName_5_5.getInputName_5_5_6());
		System.out.println("InputName_5_5_3 : "
				+ inputDataClassName_5_5.getInputName_5_5_3());
		System.out.println("InputName_5_5_4 : "
				+ inputDataClassName_5_5.getInputName_5_5_4());

		OutputDataClassName_5_5 out = new OutputDataClassName_5_5();

		out.setOutputName_5_5_6(Float.valueOf("461"));

		out.setOutputName_5_5_4(Float.valueOf("504"));

		out.setOutputName_5_5_5(Float.valueOf("61"));

		out.setOutputName_5_5_2(Float.valueOf("288"));

		out.setOutputName_5_5_3(Float.valueOf("564"));

		out.setOutputName_5_5_1("CapabilityName_5_5");

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
		System.out.println("InputName_5_1_6 : "
				+ inputDataClassName_5_1.getInputName_5_1_6());
		System.out.println("InputName_5_1_3 : "
				+ inputDataClassName_5_1.getInputName_5_1_3());
		System.out.println("InputName_5_1_4 : "
				+ inputDataClassName_5_1.getInputName_5_1_4());
		System.out.println("InputName_5_1_9 : "
				+ inputDataClassName_5_1.getInputName_5_1_9());
		System.out.println("InputName_5_1_7 : "
				+ inputDataClassName_5_1.getInputName_5_1_7());
		System.out.println("InputName_5_1_8 : "
				+ inputDataClassName_5_1.getInputName_5_1_8());

		OutputDataClassName_5_1 out = new OutputDataClassName_5_1();

		out.setOutputName_5_1_2("CapabilityName_5_1");

		out.setOutputName_5_1_3("CapabilityName_5_1");

		out.setOutputName_5_1_1("CapabilityName_5_1");

		out.setOutputName_5_1_4("CapabilityName_5_1");

		out.setOutputName_5_1_5(Float.valueOf("247"));

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

		out.setOutputName_5_2_1(Float.valueOf("661"));

		out.setOutputName_5_2_2(Integer.valueOf("501"));

		out.setOutputName_5_2_5(Float.valueOf("844"));

		out.setOutputName_5_2_3(Float.valueOf("713"));

		out.setOutputName_5_2_4(Integer.valueOf("15"));

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

		System.out.println("InputName_5_3_1 : "
				+ inputDataClassName_5_3.getInputName_5_3_1());

		OutputDataClassName_5_3 out = new OutputDataClassName_5_3();

		out.setOutputName_5_3_1("CapabilityName_5_3");

		out.setOutputName_5_3_6("CapabilityName_5_3");

		out.setOutputName_5_3_7(Integer.valueOf("468"));

		out.setOutputName_5_3_4("CapabilityName_5_3");

		out.setOutputName_5_3_5(Integer.valueOf("170"));

		out.setOutputName_5_3_2("CapabilityName_5_3");

		out.setOutputName_5_3_3(Integer.valueOf("106"));

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
	public OutputDataClassName_5_4 CapabilityName_5_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_4 : ********//");

		OutputDataClassName_5_4 out = new OutputDataClassName_5_4();

		out.setOutputName_5_4_9("CapabilityName_5_4");

		out.setOutputName_5_4_7("CapabilityName_5_4");

		out.setOutputName_5_4_8("CapabilityName_5_4");

		out.setOutputName_5_4_5(Integer.valueOf("862"));

		out.setOutputName_5_4_6(Float.valueOf("531"));

		out.setOutputName_5_4_3(Integer.valueOf("811"));

		out.setOutputName_5_4_4(Float.valueOf("758"));

		out.setOutputName_5_4_1(Integer.valueOf("798"));

		out.setOutputName_5_4_2(Float.valueOf("808"));

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
