package SP_command.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_command.input.InputDataClassName_6_4;
import SP_command.input.InputDataClassName_6_5;
import SP_command.input.InputDataClassName_6_1;
import SP_command.input.InputDataClassName_6_2;
import SP_command.input.InputDataClassName_6_3;

import SP_command.output.OutputDataClassName_6_4;
import SP_command.output.OutputDataClassName_6_5;
import SP_command.output.OutputDataClassName_6_2;
import SP_command.output.OutputDataClassName_6_3;

import SP_command.state.State_ServiceName_6_CapabilityName_6_4;
import SP_command.state.State_ServiceName_6_CapabilityName_6_5;
import SP_command.state.State_ServiceName_6_CapabilityName_6_1;
import SP_command.state.State_ServiceName_6_CapabilityName_6_2;
import SP_command.state.State_ServiceName_6_CapabilityName_6_3;

import SP_command.util.ConsumerHeader;

@Service(ServiceName_6.class)
public class ServiceName_6Bean implements ServiceName_6 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	@Inject
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;
	@Inject
	State_ServiceName_6_CapabilityName_6_1 instanceState_ServiceName_6_CapabilityName_6_1;
	@Inject
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	@Inject
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;

	@Override
	public OutputDataClassName_6_4 CapabilityName_6_4(
			InputDataClassName_6_4 inputDataClassName_6_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_4 : ********//");

		System.out.println("InputName_6_4_7 : "
				+ inputDataClassName_6_4.getInputName_6_4_7());
		System.out.println("InputName_6_4_8 : "
				+ inputDataClassName_6_4.getInputName_6_4_8());
		System.out.println("InputName_6_4_9 : "
				+ inputDataClassName_6_4.getInputName_6_4_9());
		System.out.println("InputName_6_4_1 : "
				+ inputDataClassName_6_4.getInputName_6_4_1());
		System.out.println("InputName_6_4_2 : "
				+ inputDataClassName_6_4.getInputName_6_4_2());
		System.out.println("InputName_6_4_3 : "
				+ inputDataClassName_6_4.getInputName_6_4_3());
		System.out.println("InputName_6_4_4 : "
				+ inputDataClassName_6_4.getInputName_6_4_4());
		System.out.println("InputName_6_4_5 : "
				+ inputDataClassName_6_4.getInputName_6_4_5());
		System.out.println("InputName_6_4_6 : "
				+ inputDataClassName_6_4.getInputName_6_4_6());

		OutputDataClassName_6_4 out = new OutputDataClassName_6_4();

		out.setOutputName_6_4_5(Float.valueOf("123"));

		out.setOutputName_6_4_4(Integer.valueOf("892"));

		out.setOutputName_6_4_7(Integer.valueOf("486"));

		out.setOutputName_6_4_6(Float.valueOf("24"));

		out.setOutputName_6_4_1("CapabilityName_6_4");

		out.setOutputName_6_4_3(Float.valueOf("113"));

		out.setOutputName_6_4_2(Integer.valueOf("131"));

		out.setOutputName_6_4_9(Float.valueOf("612"));

		out.setOutputName_6_4_8(Float.valueOf("90"));

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
	public OutputDataClassName_6_5 CapabilityName_6_5(
			InputDataClassName_6_5 inputDataClassName_6_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_5 : ********//");

		System.out.println("InputName_6_5_1 : "
				+ inputDataClassName_6_5.getInputName_6_5_1());

		OutputDataClassName_6_5 out = new OutputDataClassName_6_5();

		out.setOutputName_6_5_3("CapabilityName_6_5");

		out.setOutputName_6_5_2(Float.valueOf("693"));

		out.setOutputName_6_5_1("CapabilityName_6_5");

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

		instanceState_ServiceName_6_CapabilityName_6_5
				.setState(instanceState_ServiceName_6_CapabilityName_6_5
						.getState() + " ServiceName_6 CapabilityName_6_5");

		return out;
	}

	@Override
	public void CapabilityName_6_1(InputDataClassName_6_1 inputDataClassName_6_1) {
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
		System.out.println("InputName_6_1_7 : "
				+ inputDataClassName_6_1.getInputName_6_1_7());
		System.out.println("InputName_6_1_8 : "
				+ inputDataClassName_6_1.getInputName_6_1_8());
		System.out.println("InputName_6_1_1 : "
				+ inputDataClassName_6_1.getInputName_6_1_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_1
				.setState(instanceState_ServiceName_6_CapabilityName_6_1
						.getState() + " ServiceName_6 CapabilityName_6_1");

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
		System.out.println("InputName_6_2_5 : "
				+ inputDataClassName_6_2.getInputName_6_2_5());
		System.out.println("InputName_6_2_6 : "
				+ inputDataClassName_6_2.getInputName_6_2_6());

		OutputDataClassName_6_2 out = new OutputDataClassName_6_2();

		out.setOutputName_6_2_1(Float.valueOf("783"));

		out.setOutputName_6_2_3("CapabilityName_6_2");

		out.setOutputName_6_2_2("CapabilityName_6_2");

		out.setOutputName_6_2_4(Float.valueOf("421"));

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
	public OutputDataClassName_6_3 CapabilityName_6_3(
			InputDataClassName_6_3 inputDataClassName_6_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_3 : ********//");

		System.out.println("InputName_6_3_1 : "
				+ inputDataClassName_6_3.getInputName_6_3_1());
		System.out.println("InputName_6_3_2 : "
				+ inputDataClassName_6_3.getInputName_6_3_2());
		System.out.println("InputName_6_3_3 : "
				+ inputDataClassName_6_3.getInputName_6_3_3());
		System.out.println("InputName_6_3_4 : "
				+ inputDataClassName_6_3.getInputName_6_3_4());
		System.out.println("InputName_6_3_5 : "
				+ inputDataClassName_6_3.getInputName_6_3_5());
		System.out.println("InputName_6_3_6 : "
				+ inputDataClassName_6_3.getInputName_6_3_6());
		System.out.println("InputName_6_3_7 : "
				+ inputDataClassName_6_3.getInputName_6_3_7());

		OutputDataClassName_6_3 out = new OutputDataClassName_6_3();

		out.setOutputName_6_3_6("CapabilityName_6_3");

		out.setOutputName_6_3_5("CapabilityName_6_3");

		out.setOutputName_6_3_7(Float.valueOf("146"));

		out.setOutputName_6_3_2(Integer.valueOf("513"));

		out.setOutputName_6_3_1(Float.valueOf("326"));

		out.setOutputName_6_3_4(Integer.valueOf("750"));

		out.setOutputName_6_3_3("CapabilityName_6_3");

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

		instanceState_ServiceName_6_CapabilityName_6_3
				.setState(instanceState_ServiceName_6_CapabilityName_6_3
						.getState() + " ServiceName_6 CapabilityName_6_3");

		return out;
	}

}
