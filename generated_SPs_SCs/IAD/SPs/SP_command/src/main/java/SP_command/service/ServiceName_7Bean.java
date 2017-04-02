package SP_command.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_command.input.InputDataClassName_7_3;
import SP_command.input.InputDataClassName_7_4;
import SP_command.input.InputDataClassName_7_2;

import SP_command.output.OutputDataClassName_7_3;
import SP_command.output.OutputDataClassName_7_4;
import SP_command.output.OutputDataClassName_7_1;

import SP_command.state.State_ServiceName_7_CapabilityName_7_3;
import SP_command.state.State_ServiceName_7_CapabilityName_7_4;
import SP_command.state.State_ServiceName_7_CapabilityName_7_1;
import SP_command.state.State_ServiceName_7_CapabilityName_7_2;

import SP_command.util.ConsumerHeader;

@Service(ServiceName_7.class)
public class ServiceName_7Bean implements ServiceName_7 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	@Inject
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	@Inject
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	@Inject
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;

	@Override
	public OutputDataClassName_7_3 CapabilityName_7_3(
			InputDataClassName_7_3 inputDataClassName_7_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_3 : ********//");

		System.out.println("InputName_7_3_5 : "
				+ inputDataClassName_7_3.getInputName_7_3_5());
		System.out.println("InputName_7_3_6 : "
				+ inputDataClassName_7_3.getInputName_7_3_6());
		System.out.println("InputName_7_3_3 : "
				+ inputDataClassName_7_3.getInputName_7_3_3());
		System.out.println("InputName_7_3_4 : "
				+ inputDataClassName_7_3.getInputName_7_3_4());
		System.out.println("InputName_7_3_1 : "
				+ inputDataClassName_7_3.getInputName_7_3_1());
		System.out.println("InputName_7_3_2 : "
				+ inputDataClassName_7_3.getInputName_7_3_2());
		System.out.println("InputName_7_3_7 : "
				+ inputDataClassName_7_3.getInputName_7_3_7());
		System.out.println("InputName_7_3_8 : "
				+ inputDataClassName_7_3.getInputName_7_3_8());

		OutputDataClassName_7_3 out = new OutputDataClassName_7_3();

		out.setOutputName_7_3_1(Integer.valueOf("600"));

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

		instanceState_ServiceName_7_CapabilityName_7_3
				.setState(instanceState_ServiceName_7_CapabilityName_7_3
						.getState() + " ServiceName_7 CapabilityName_7_3");

		return out;
	}

	@Override
	public OutputDataClassName_7_4 CapabilityName_7_4(
			InputDataClassName_7_4 inputDataClassName_7_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_4 : ********//");

		System.out.println("InputName_7_4_4 : "
				+ inputDataClassName_7_4.getInputName_7_4_4());
		System.out.println("InputName_7_4_5 : "
				+ inputDataClassName_7_4.getInputName_7_4_5());
		System.out.println("InputName_7_4_2 : "
				+ inputDataClassName_7_4.getInputName_7_4_2());
		System.out.println("InputName_7_4_3 : "
				+ inputDataClassName_7_4.getInputName_7_4_3());
		System.out.println("InputName_7_4_1 : "
				+ inputDataClassName_7_4.getInputName_7_4_1());

		OutputDataClassName_7_4 out = new OutputDataClassName_7_4();

		out.setOutputName_7_4_2(Float.valueOf("471"));

		out.setOutputName_7_4_1(Integer.valueOf("334"));

		out.setOutputName_7_4_4(Integer.valueOf("120"));

		out.setOutputName_7_4_3("CapabilityName_7_4");

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

		instanceState_ServiceName_7_CapabilityName_7_4
				.setState(instanceState_ServiceName_7_CapabilityName_7_4
						.getState() + " ServiceName_7 CapabilityName_7_4");

		return out;
	}

	@Override
	public OutputDataClassName_7_1 CapabilityName_7_1() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_1 : ********//");

		OutputDataClassName_7_1 out = new OutputDataClassName_7_1();

		out.setOutputName_7_1_1(Integer.valueOf("665"));

		out.setOutputName_7_1_5("CapabilityName_7_1");

		out.setOutputName_7_1_4(Float.valueOf("597"));

		out.setOutputName_7_1_3(Integer.valueOf("867"));

		out.setOutputName_7_1_2(Integer.valueOf("156"));

		out.setOutputName_7_1_9(Float.valueOf("937"));

		out.setOutputName_7_1_8(Float.valueOf("966"));

		out.setOutputName_7_1_7(Integer.valueOf("68"));

		out.setOutputName_7_1_6(Integer.valueOf("316"));

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

		instanceState_ServiceName_7_CapabilityName_7_1
				.setState(instanceState_ServiceName_7_CapabilityName_7_1
						.getState() + " ServiceName_7 CapabilityName_7_1");

		return out;
	}

	@Override
	public void CapabilityName_7_2(InputDataClassName_7_2 inputDataClassName_7_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_2 : ********//");

		System.out.println("InputName_7_2_6 : "
				+ inputDataClassName_7_2.getInputName_7_2_6());
		System.out.println("InputName_7_2_7 : "
				+ inputDataClassName_7_2.getInputName_7_2_7());
		System.out.println("InputName_7_2_4 : "
				+ inputDataClassName_7_2.getInputName_7_2_4());
		System.out.println("InputName_7_2_5 : "
				+ inputDataClassName_7_2.getInputName_7_2_5());
		System.out.println("InputName_7_2_2 : "
				+ inputDataClassName_7_2.getInputName_7_2_2());
		System.out.println("InputName_7_2_3 : "
				+ inputDataClassName_7_2.getInputName_7_2_3());
		System.out.println("InputName_7_2_1 : "
				+ inputDataClassName_7_2.getInputName_7_2_1());
		System.out.println("InputName_7_2_8 : "
				+ inputDataClassName_7_2.getInputName_7_2_8());
		System.out.println("InputName_7_2_9 : "
				+ inputDataClassName_7_2.getInputName_7_2_9());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_7_CapabilityName_7_2
				.setState(instanceState_ServiceName_7_CapabilityName_7_2
						.getState() + " ServiceName_7 CapabilityName_7_2");

	}

}
