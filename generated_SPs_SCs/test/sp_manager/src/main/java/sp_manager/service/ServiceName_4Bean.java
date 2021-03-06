package sp_manager.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sp_manager.input.InputDataClassName_4_3;
import sp_manager.input.InputDataClassName_4_4;
import sp_manager.input.InputDataClassName_4_5;

import sp_manager.output.OutputDataClassName_4_1;
import sp_manager.output.OutputDataClassName_4_2;
import sp_manager.output.OutputDataClassName_4_4;
import sp_manager.output.OutputDataClassName_4_5;

import sp_manager.state.State_ServiceName_4_CapabilityName_4_1;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_2;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_3;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_4;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_5;

import sp_manager.util.ConsumerHeader;

@Service(ServiceName_4.class)
public class ServiceName_4Bean implements ServiceName_4 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;
	@Inject
	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	@Inject
	State_ServiceName_4_CapabilityName_4_3 instanceState_ServiceName_4_CapabilityName_4_3;
	@Inject
	State_ServiceName_4_CapabilityName_4_4 instanceState_ServiceName_4_CapabilityName_4_4;
	@Inject
	State_ServiceName_4_CapabilityName_4_5 instanceState_ServiceName_4_CapabilityName_4_5;

	@Override
	public OutputDataClassName_4_1 CapabilityName_4_1() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_1 : ********//");

		OutputDataClassName_4_1 out = new OutputDataClassName_4_1();

		out.setOutputName_4_1_1(Float.valueOf("391"));

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

	@Override
	public OutputDataClassName_4_2 CapabilityName_4_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_2 : ********//");

		OutputDataClassName_4_2 out = new OutputDataClassName_4_2();

		out.setOutputName_4_2_1(Float.valueOf("932"));

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

		System.out.println("InputName_4_3_1 : "
				+ inputDataClassName_4_3.getInputName_4_3_1());
		System.out.println("InputName_4_3_2 : "
				+ inputDataClassName_4_3.getInputName_4_3_2());

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

		System.out.println("InputName_4_4_1 : "
				+ inputDataClassName_4_4.getInputName_4_4_1());
		System.out.println("InputName_4_4_2 : "
				+ inputDataClassName_4_4.getInputName_4_4_2());
		System.out.println("InputName_4_4_3 : "
				+ inputDataClassName_4_4.getInputName_4_4_3());
		System.out.println("InputName_4_4_4 : "
				+ inputDataClassName_4_4.getInputName_4_4_4());

		OutputDataClassName_4_4 out = new OutputDataClassName_4_4();

		out.setOutputName_4_4_1(Integer.valueOf("499"));

		out.setOutputName_4_4_2(Float.valueOf("340"));

		out.setOutputName_4_4_3("CapabilityName_4_4");

		out.setOutputName_4_4_4(Integer.valueOf("594"));

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

		out.setOutputName_4_5_1(Integer.valueOf("823"));

		out.setOutputName_4_5_2("CapabilityName_4_5");

		out.setOutputName_4_5_3(Integer.valueOf("609"));

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

}
