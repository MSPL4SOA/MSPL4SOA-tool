package sp_manager.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sp_manager.input.InputDataClassName_5_2;
import sp_manager.input.InputDataClassName_5_3;
import sp_manager.input.InputDataClassName_5_4;
import sp_manager.input.InputDataClassName_5_5;

import sp_manager.output.OutputDataClassName_5_2;
import sp_manager.output.OutputDataClassName_5_3;
import sp_manager.output.OutputDataClassName_5_4;

import sp_manager.state.State_ServiceName_5_CapabilityName_5_1;
import sp_manager.state.State_ServiceName_5_CapabilityName_5_2;
import sp_manager.state.State_ServiceName_5_CapabilityName_5_3;
import sp_manager.state.State_ServiceName_5_CapabilityName_5_4;
import sp_manager.state.State_ServiceName_5_CapabilityName_5_5;
import sp_manager.state.State_ServiceName_5_CapabilityName_5_6;

import sp_manager.util.ConsumerHeader;

@Service(ServiceName_5.class)
public class ServiceName_5Bean implements ServiceName_5 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_5_CapabilityName_5_1 instanceState_ServiceName_5_CapabilityName_5_1;
	@Inject
	State_ServiceName_5_CapabilityName_5_2 instanceState_ServiceName_5_CapabilityName_5_2;
	@Inject
	State_ServiceName_5_CapabilityName_5_3 instanceState_ServiceName_5_CapabilityName_5_3;
	@Inject
	State_ServiceName_5_CapabilityName_5_4 instanceState_ServiceName_5_CapabilityName_5_4;
	@Inject
	State_ServiceName_5_CapabilityName_5_5 instanceState_ServiceName_5_CapabilityName_5_5;
	@Inject
	State_ServiceName_5_CapabilityName_5_6 instanceState_ServiceName_5_CapabilityName_5_6;

	@Override
	public void CapabilityName_5_1() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_1 : ********//");

		instanceState_ServiceName_5_CapabilityName_5_1
				.setState(instanceState_ServiceName_5_CapabilityName_5_1
						.getState() + " ServiceName_5 CapabilityName_5_1");

	}

	@Override
	public OutputDataClassName_5_2 CapabilityName_5_2(
			InputDataClassName_5_2 inputDataClassName_5_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_2 : ********//");

		System.out.println("InputName_5_2_1 : "
				+ inputDataClassName_5_2.getInputName_5_2_1());
		System.out.println("InputName_5_2_2 : "
				+ inputDataClassName_5_2.getInputName_5_2_2());
		System.out.println("InputName_5_2_3 : "
				+ inputDataClassName_5_2.getInputName_5_2_3());
		System.out.println("InputName_5_2_4 : "
				+ inputDataClassName_5_2.getInputName_5_2_4());

		OutputDataClassName_5_2 out = new OutputDataClassName_5_2();

		out.setOutputName_5_2_1("CapabilityName_5_2");

		out.setOutputName_5_2_2("CapabilityName_5_2");

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

		out.setOutputName_5_3_2(Float.valueOf("806"));

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

		return out;
	}

	@Override
	public OutputDataClassName_5_4 CapabilityName_5_4(
			InputDataClassName_5_4 inputDataClassName_5_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_4 : ********//");

		System.out.println("InputName_5_4_1 : "
				+ inputDataClassName_5_4.getInputName_5_4_1());
		System.out.println("InputName_5_4_2 : "
				+ inputDataClassName_5_4.getInputName_5_4_2());
		System.out.println("InputName_5_4_3 : "
				+ inputDataClassName_5_4.getInputName_5_4_3());

		OutputDataClassName_5_4 out = new OutputDataClassName_5_4();

		out.setOutputName_5_4_1("CapabilityName_5_4");

		// TODO Auto-generated stub
		System.out.println("State header in: "
				+ ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_5_CapabilityName_5_4
				.setState(instanceState_ServiceName_5_CapabilityName_5_4
						.getState() + " ServiceName_5 CapabilityName_5_4");

		return out;
	}

	@Override
	public void CapabilityName_5_5(InputDataClassName_5_5 inputDataClassName_5_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_5 : ********//");

		System.out.println("InputName_5_5_1 : "
				+ inputDataClassName_5_5.getInputName_5_5_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_5_CapabilityName_5_5
				.setState(instanceState_ServiceName_5_CapabilityName_5_5
						.getState() + " ServiceName_5 CapabilityName_5_5");

	}

	@Override
	public void CapabilityName_5_6() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_5 : CapabilityName_5_6 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_5_CapabilityName_5_6
				.setState(instanceState_ServiceName_5_CapabilityName_5_6
						.getState() + " ServiceName_5 CapabilityName_5_6");

	}

}
