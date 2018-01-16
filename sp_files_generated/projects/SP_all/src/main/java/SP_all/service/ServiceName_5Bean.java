package SP_all.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_all.input.InputDataClassName_5_5;
import SP_all.input.InputDataClassName_5_1;
import SP_all.input.InputDataClassName_5_2;
import SP_all.input.InputDataClassName_5_3;

import SP_all.output.OutputDataClassName_5_5;
import SP_all.output.OutputDataClassName_5_1;
import SP_all.output.OutputDataClassName_5_4;

import SP_all.state.State_ServiceName_5_CapabilityName_5_5;
import SP_all.state.State_ServiceName_5_CapabilityName_5_1;
import SP_all.state.State_ServiceName_5_CapabilityName_5_2;
import SP_all.state.State_ServiceName_5_CapabilityName_5_3;
import SP_all.state.State_ServiceName_5_CapabilityName_5_4;

import SP_all.util.ConsumerHeader;

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

		OutputDataClassName_5_5 out = new OutputDataClassName_5_5();

		out.setOutputName_5_5_2("CapabilityName_5_5");

		out.setOutputName_5_5_1(Float.valueOf("465"));

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

		out.setOutputName_5_1_2(Integer.valueOf("820"));

		out.setOutputName_5_1_3(Float.valueOf("225"));

		out.setOutputName_5_1_1(Float.valueOf("58"));

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
	public void CapabilityName_5_2(InputDataClassName_5_2 inputDataClassName_5_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_2 : ********//");

		System.out.println("InputName_5_2_1 : "
				+ inputDataClassName_5_2.getInputName_5_2_1());
		System.out.println("InputName_5_2_4 : "
				+ inputDataClassName_5_2.getInputName_5_2_4());
		System.out.println("InputName_5_2_2 : "
				+ inputDataClassName_5_2.getInputName_5_2_2());
		System.out.println("InputName_5_2_3 : "
				+ inputDataClassName_5_2.getInputName_5_2_3());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_5_CapabilityName_5_2
				.setState(instanceState_ServiceName_5_CapabilityName_5_2
						.getState() + " ServiceName_5 CapabilityName_5_2");

	}

	@Override
	public void CapabilityName_5_3(InputDataClassName_5_3 inputDataClassName_5_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_3 : ********//");

		System.out.println("InputName_5_3_9 : "
				+ inputDataClassName_5_3.getInputName_5_3_9());
		System.out.println("InputName_5_3_3 : "
				+ inputDataClassName_5_3.getInputName_5_3_3());
		System.out.println("InputName_5_3_4 : "
				+ inputDataClassName_5_3.getInputName_5_3_4());
		System.out.println("InputName_5_3_1 : "
				+ inputDataClassName_5_3.getInputName_5_3_1());
		System.out.println("InputName_5_3_2 : "
				+ inputDataClassName_5_3.getInputName_5_3_2());
		System.out.println("InputName_5_3_7 : "
				+ inputDataClassName_5_3.getInputName_5_3_7());
		System.out.println("InputName_5_3_8 : "
				+ inputDataClassName_5_3.getInputName_5_3_8());
		System.out.println("InputName_5_3_5 : "
				+ inputDataClassName_5_3.getInputName_5_3_5());
		System.out.println("InputName_5_3_6 : "
				+ inputDataClassName_5_3.getInputName_5_3_6());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_5_CapabilityName_5_3
				.setState(instanceState_ServiceName_5_CapabilityName_5_3
						.getState() + " ServiceName_5 CapabilityName_5_3");

	}

	@Override
	public OutputDataClassName_5_4 CapabilityName_5_4() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_4 : ********//");

		OutputDataClassName_5_4 out = new OutputDataClassName_5_4();

		out.setOutputName_5_4_3(Float.valueOf("542"));

		out.setOutputName_5_4_1(Integer.valueOf("435"));

		out.setOutputName_5_4_2(Float.valueOf("174"));

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
