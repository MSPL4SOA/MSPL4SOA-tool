package SP_all.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_all.input.InputDataClassName_7_4;
import SP_all.input.InputDataClassName_7_5;
import SP_all.input.InputDataClassName_7_1;
import SP_all.input.InputDataClassName_7_2;

import SP_all.output.OutputDataClassName_7_3;
import SP_all.output.OutputDataClassName_7_4;
import SP_all.output.OutputDataClassName_7_5;

import SP_all.state.State_ServiceName_7_CapabilityName_7_3;
import SP_all.state.State_ServiceName_7_CapabilityName_7_4;
import SP_all.state.State_ServiceName_7_CapabilityName_7_5;
import SP_all.state.State_ServiceName_7_CapabilityName_7_1;
import SP_all.state.State_ServiceName_7_CapabilityName_7_2;

import SP_all.util.ConsumerHeader;

@Service(ServiceName_7.class)
public class ServiceName_7Bean implements ServiceName_7 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	@Inject
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	@Inject
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;
	@Inject
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	@Inject
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;

	@Override
	public OutputDataClassName_7_3 CapabilityName_7_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_3 : ********//");

		OutputDataClassName_7_3 out = new OutputDataClassName_7_3();

		out.setOutputName_7_3_9(Integer.valueOf("624"));

		out.setOutputName_7_3_8("CapabilityName_7_3");

		out.setOutputName_7_3_3(Integer.valueOf("151"));

		out.setOutputName_7_3_2(Float.valueOf("745"));

		out.setOutputName_7_3_1(Integer.valueOf("338"));

		out.setOutputName_7_3_7(Integer.valueOf("537"));

		out.setOutputName_7_3_6(Integer.valueOf("845"));

		out.setOutputName_7_3_5(Integer.valueOf("66"));

		out.setOutputName_7_3_4("CapabilityName_7_3");

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

		out.setOutputName_7_4_2("CapabilityName_7_4");

		out.setOutputName_7_4_1(Float.valueOf("158"));

		out.setOutputName_7_4_5(Integer.valueOf("80"));

		out.setOutputName_7_4_4(Integer.valueOf("19"));

		out.setOutputName_7_4_3(Float.valueOf("301"));

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
	public OutputDataClassName_7_5 CapabilityName_7_5(
			InputDataClassName_7_5 inputDataClassName_7_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_5 : ********//");

		System.out.println("InputName_7_5_3 : "
				+ inputDataClassName_7_5.getInputName_7_5_3());
		System.out.println("InputName_7_5_4 : "
				+ inputDataClassName_7_5.getInputName_7_5_4());
		System.out.println("InputName_7_5_1 : "
				+ inputDataClassName_7_5.getInputName_7_5_1());
		System.out.println("InputName_7_5_2 : "
				+ inputDataClassName_7_5.getInputName_7_5_2());
		System.out.println("InputName_7_5_5 : "
				+ inputDataClassName_7_5.getInputName_7_5_5());

		OutputDataClassName_7_5 out = new OutputDataClassName_7_5();

		out.setOutputName_7_5_1(Integer.valueOf("564"));

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

		instanceState_ServiceName_7_CapabilityName_7_5
				.setState(instanceState_ServiceName_7_CapabilityName_7_5
						.getState() + " ServiceName_7 CapabilityName_7_5");

		return out;
	}

	@Override
	public void CapabilityName_7_1(InputDataClassName_7_1 inputDataClassName_7_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_1 : ********//");

		System.out.println("InputName_7_1_1 : "
				+ inputDataClassName_7_1.getInputName_7_1_1());
		System.out.println("InputName_7_1_2 : "
				+ inputDataClassName_7_1.getInputName_7_1_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_7_CapabilityName_7_1
				.setState(instanceState_ServiceName_7_CapabilityName_7_1
						.getState() + " ServiceName_7 CapabilityName_7_1");

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
