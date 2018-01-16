package SP_all.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_all.input.InputDataClassName_6_4;
import SP_all.input.InputDataClassName_6_5;
import SP_all.input.InputDataClassName_6_1;
import SP_all.input.InputDataClassName_6_2;
import SP_all.input.InputDataClassName_6_3;

import SP_all.output.OutputDataClassName_6_4;
import SP_all.output.OutputDataClassName_6_5;
import SP_all.output.OutputDataClassName_6_1;
import SP_all.output.OutputDataClassName_6_3;

import SP_all.state.State_ServiceName_6_CapabilityName_6_4;
import SP_all.state.State_ServiceName_6_CapabilityName_6_5;
import SP_all.state.State_ServiceName_6_CapabilityName_6_1;
import SP_all.state.State_ServiceName_6_CapabilityName_6_2;
import SP_all.state.State_ServiceName_6_CapabilityName_6_3;

import SP_all.util.ConsumerHeader;

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

		System.out.println("InputName_6_4_1 : "
				+ inputDataClassName_6_4.getInputName_6_4_1());
		System.out.println("InputName_6_4_2 : "
				+ inputDataClassName_6_4.getInputName_6_4_2());

		OutputDataClassName_6_4 out = new OutputDataClassName_6_4();

		out.setOutputName_6_4_5(Integer.valueOf("591"));

		out.setOutputName_6_4_4(Float.valueOf("433"));

		out.setOutputName_6_4_7(Float.valueOf("993"));

		out.setOutputName_6_4_6("CapabilityName_6_4");

		out.setOutputName_6_4_1(Float.valueOf("279"));

		out.setOutputName_6_4_3(Integer.valueOf("877"));

		out.setOutputName_6_4_2(Float.valueOf("483"));

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
		System.out.println("InputName_6_5_2 : "
				+ inputDataClassName_6_5.getInputName_6_5_2());
		System.out.println("InputName_6_5_3 : "
				+ inputDataClassName_6_5.getInputName_6_5_3());

		OutputDataClassName_6_5 out = new OutputDataClassName_6_5();

		out.setOutputName_6_5_4(Integer.valueOf("874"));

		out.setOutputName_6_5_3(Float.valueOf("457"));

		out.setOutputName_6_5_5(Float.valueOf("430"));

		out.setOutputName_6_5_2(Float.valueOf("524"));

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
	public OutputDataClassName_6_1 CapabilityName_6_1(
			InputDataClassName_6_1 inputDataClassName_6_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_1 : ********//");

		System.out.println("InputName_6_1_2 : "
				+ inputDataClassName_6_1.getInputName_6_1_2());
		System.out.println("InputName_6_1_3 : "
				+ inputDataClassName_6_1.getInputName_6_1_3());
		System.out.println("InputName_6_1_1 : "
				+ inputDataClassName_6_1.getInputName_6_1_1());

		OutputDataClassName_6_1 out = new OutputDataClassName_6_1();

		out.setOutputName_6_1_1("CapabilityName_6_1");

		out.setOutputName_6_1_2(Integer.valueOf("435"));

		out.setOutputName_6_1_3(Float.valueOf("806"));

		out.setOutputName_6_1_4(Integer.valueOf("341"));

		out.setOutputName_6_1_5(Float.valueOf("251"));

		out.setOutputName_6_1_6("CapabilityName_6_1");

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

		instanceState_ServiceName_6_CapabilityName_6_1
				.setState(instanceState_ServiceName_6_CapabilityName_6_1
						.getState() + " ServiceName_6 CapabilityName_6_1");

		return out;
	}

	@Override
	public void CapabilityName_6_2(InputDataClassName_6_2 inputDataClassName_6_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_2 : ********//");

		System.out.println("InputName_6_2_1 : "
				+ inputDataClassName_6_2.getInputName_6_2_1());
		System.out.println("InputName_6_2_2 : "
				+ inputDataClassName_6_2.getInputName_6_2_2());
		System.out.println("InputName_6_2_3 : "
				+ inputDataClassName_6_2.getInputName_6_2_3());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_2
				.setState(instanceState_ServiceName_6_CapabilityName_6_2
						.getState() + " ServiceName_6 CapabilityName_6_2");

	}

	@Override
	public OutputDataClassName_6_3 CapabilityName_6_3(
			InputDataClassName_6_3 inputDataClassName_6_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_3 : ********//");

		System.out.println("InputName_6_3_1 : "
				+ inputDataClassName_6_3.getInputName_6_3_1());

		OutputDataClassName_6_3 out = new OutputDataClassName_6_3();

		out.setOutputName_6_3_2(Float.valueOf("140"));

		out.setOutputName_6_3_1(Float.valueOf("971"));

		out.setOutputName_6_3_4("CapabilityName_6_3");

		out.setOutputName_6_3_3(Float.valueOf("918"));

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
