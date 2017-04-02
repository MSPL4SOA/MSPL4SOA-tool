package SP_infantry2.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_infantry2.input.InputDataClassName_3_3;
import SP_infantry2.input.InputDataClassName_3_4;
import SP_infantry2.input.InputDataClassName_3_6;
import SP_infantry2.input.InputDataClassName_3_1;

import SP_infantry2.output.OutputDataClassName_3_6;
import SP_infantry2.output.OutputDataClassName_3_1;

import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_3;
import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_4;
import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_5;
import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_6;
import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_1;
import SP_infantry2.state.State_ServiceName_3_CapabilityName_3_2;

import SP_infantry2.util.ConsumerHeader;

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
		System.out.println("InputName_3_3_9 : "
				+ inputDataClassName_3_3.getInputName_3_3_9());
		System.out.println("InputName_3_3_7 : "
				+ inputDataClassName_3_3.getInputName_3_3_7());
		System.out.println("InputName_3_3_8 : "
				+ inputDataClassName_3_3.getInputName_3_3_8());
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
	public void CapabilityName_3_4(InputDataClassName_3_4 inputDataClassName_3_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_4 : ********//");

		System.out.println("InputName_3_4_1 : "
				+ inputDataClassName_3_4.getInputName_3_4_1());
		System.out.println("InputName_3_4_6 : "
				+ inputDataClassName_3_4.getInputName_3_4_6());
		System.out.println("InputName_3_4_4 : "
				+ inputDataClassName_3_4.getInputName_3_4_4());
		System.out.println("InputName_3_4_5 : "
				+ inputDataClassName_3_4.getInputName_3_4_5());
		System.out.println("InputName_3_4_2 : "
				+ inputDataClassName_3_4.getInputName_3_4_2());
		System.out.println("InputName_3_4_3 : "
				+ inputDataClassName_3_4.getInputName_3_4_3());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_4
				.setState(instanceState_ServiceName_3_CapabilityName_3_4
						.getState() + " ServiceName_3 CapabilityName_3_4");

	}

	@Override
	public void CapabilityName_3_5() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_5 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_5
				.setState(instanceState_ServiceName_3_CapabilityName_3_5
						.getState() + " ServiceName_3 CapabilityName_3_5");

	}

	@Override
	public OutputDataClassName_3_6 CapabilityName_3_6(
			InputDataClassName_3_6 inputDataClassName_3_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_6 : ********//");

		System.out.println("InputName_3_6_6 : "
				+ inputDataClassName_3_6.getInputName_3_6_6());
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

		out.setOutputName_3_6_3("CapabilityName_3_6");

		out.setOutputName_3_6_4("CapabilityName_3_6");

		out.setOutputName_3_6_1("CapabilityName_3_6");

		out.setOutputName_3_6_2("CapabilityName_3_6");

		out.setOutputName_3_6_5(Float.valueOf("891"));

		out.setOutputName_3_6_6("CapabilityName_3_6");

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

		System.out.println("InputName_3_1_1 : "
				+ inputDataClassName_3_1.getInputName_3_1_1());
		System.out.println("InputName_3_1_2 : "
				+ inputDataClassName_3_1.getInputName_3_1_2());

		OutputDataClassName_3_1 out = new OutputDataClassName_3_1();

		out.setOutputName_3_1_8(Integer.valueOf("722"));

		out.setOutputName_3_1_6(Integer.valueOf("547"));

		out.setOutputName_3_1_7("CapabilityName_3_1");

		out.setOutputName_3_1_1(Integer.valueOf("620"));

		out.setOutputName_3_1_4("CapabilityName_3_1");

		out.setOutputName_3_1_5(Integer.valueOf("144"));

		out.setOutputName_3_1_2(Integer.valueOf("209"));

		out.setOutputName_3_1_3(Float.valueOf("846"));

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
	public void CapabilityName_3_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_2 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

	}

}
