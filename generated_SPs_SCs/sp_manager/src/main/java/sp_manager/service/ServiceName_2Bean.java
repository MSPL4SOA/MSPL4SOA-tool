package sp_manager.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sp_manager.input.InputDataClassName_2_1;
import sp_manager.input.InputDataClassName_2_3;
import sp_manager.input.InputDataClassName_2_4;
import sp_manager.input.InputDataClassName_2_6;

import sp_manager.output.OutputDataClassName_2_1;
import sp_manager.output.OutputDataClassName_2_3;
import sp_manager.output.OutputDataClassName_2_4;
import sp_manager.output.OutputDataClassName_2_5;

import sp_manager.state.State_ServiceName_2_CapabilityName_2_1;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_2;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_3;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_4;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_5;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_6;

import sp_manager.util.ConsumerHeader;

@Service(ServiceName_2.class)
public class ServiceName_2Bean implements ServiceName_2 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	@Inject
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;
	@Inject
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;
	@Inject
	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	@Inject
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
	@Inject
	State_ServiceName_2_CapabilityName_2_6 instanceState_ServiceName_2_CapabilityName_2_6;

	@Override
	public OutputDataClassName_2_1 CapabilityName_2_1(
			InputDataClassName_2_1 inputDataClassName_2_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_1 : ********//");

		System.out.println("InputName_2_1_1 : "
				+ inputDataClassName_2_1.getInputName_2_1_1());
		System.out.println("InputName_2_1_2 : "
				+ inputDataClassName_2_1.getInputName_2_1_2());
		System.out.println("InputName_2_1_3 : "
				+ inputDataClassName_2_1.getInputName_2_1_3());

		OutputDataClassName_2_1 out = new OutputDataClassName_2_1();

		out.setOutputName_2_1_1("CapabilityName_2_1");

		out.setOutputName_2_1_2(Integer.valueOf("137"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_2_CapabilityName_2_1
				.setState(instanceState_ServiceName_2_CapabilityName_2_1
						.getState() + " ServiceName_2 CapabilityName_2_1");

		return out;
	}

	@Override
	public void CapabilityName_2_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_2 : ********//");

		instanceState_ServiceName_2_CapabilityName_2_2
				.setState(instanceState_ServiceName_2_CapabilityName_2_2
						.getState() + " ServiceName_2 CapabilityName_2_2");

	}

	@Override
	public OutputDataClassName_2_3 CapabilityName_2_3(
			InputDataClassName_2_3 inputDataClassName_2_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_3 : ********//");

		System.out.println("InputName_2_3_1 : "
				+ inputDataClassName_2_3.getInputName_2_3_1());
		System.out.println("InputName_2_3_2 : "
				+ inputDataClassName_2_3.getInputName_2_3_2());
		System.out.println("InputName_2_3_3 : "
				+ inputDataClassName_2_3.getInputName_2_3_3());
		System.out.println("InputName_2_3_4 : "
				+ inputDataClassName_2_3.getInputName_2_3_4());

		OutputDataClassName_2_3 out = new OutputDataClassName_2_3();

		out.setOutputName_2_3_1(Float.valueOf("975"));

		out.setOutputName_2_3_2(Float.valueOf("664"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_2_CapabilityName_2_3
				.setState(instanceState_ServiceName_2_CapabilityName_2_3
						.getState() + " ServiceName_2 CapabilityName_2_3");

		return out;
	}

	@Override
	public OutputDataClassName_2_4 CapabilityName_2_4(
			InputDataClassName_2_4 inputDataClassName_2_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_4 : ********//");

		System.out.println("InputName_2_4_1 : "
				+ inputDataClassName_2_4.getInputName_2_4_1());

		OutputDataClassName_2_4 out = new OutputDataClassName_2_4();

		out.setOutputName_2_4_1(Integer.valueOf("494"));

		out.setOutputName_2_4_2(Integer.valueOf("325"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_2_CapabilityName_2_4
				.setState(instanceState_ServiceName_2_CapabilityName_2_4
						.getState() + " ServiceName_2 CapabilityName_2_4");

		return out;
	}

	@Override
	public OutputDataClassName_2_5 CapabilityName_2_5() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_5 : ********//");

		OutputDataClassName_2_5 out = new OutputDataClassName_2_5();

		out.setOutputName_2_5_1(Float.valueOf("93"));

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

		instanceState_ServiceName_2_CapabilityName_2_5
				.setState(instanceState_ServiceName_2_CapabilityName_2_5
						.getState() + " ServiceName_2 CapabilityName_2_5");

		return out;
	}

	@Override
	public void CapabilityName_2_6(InputDataClassName_2_6 inputDataClassName_2_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_6 : ********//");

		System.out.println("InputName_2_6_1 : "
				+ inputDataClassName_2_6.getInputName_2_6_1());
		System.out.println("InputName_2_6_2 : "
				+ inputDataClassName_2_6.getInputName_2_6_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_2_CapabilityName_2_6
				.setState(instanceState_ServiceName_2_CapabilityName_2_6
						.getState() + " ServiceName_2 CapabilityName_2_6");

	}

}
