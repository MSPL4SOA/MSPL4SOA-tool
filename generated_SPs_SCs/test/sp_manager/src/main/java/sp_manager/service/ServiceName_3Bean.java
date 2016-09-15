package sp_manager.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import sp_manager.input.InputDataClassName_3_1;
import sp_manager.input.InputDataClassName_3_2;
import sp_manager.input.InputDataClassName_3_3;
import sp_manager.input.InputDataClassName_3_4;
import sp_manager.input.InputDataClassName_3_5;

import sp_manager.output.OutputDataClassName_3_1;
import sp_manager.output.OutputDataClassName_3_2;
import sp_manager.output.OutputDataClassName_3_3;
import sp_manager.output.OutputDataClassName_3_4;
import sp_manager.output.OutputDataClassName_3_5;

import sp_manager.state.State_ServiceName_3_CapabilityName_3_1;
import sp_manager.state.State_ServiceName_3_CapabilityName_3_2;
import sp_manager.state.State_ServiceName_3_CapabilityName_3_3;
import sp_manager.state.State_ServiceName_3_CapabilityName_3_4;
import sp_manager.state.State_ServiceName_3_CapabilityName_3_5;

import sp_manager.util.ConsumerHeader;

@Service(ServiceName_3.class)
public class ServiceName_3Bean implements ServiceName_3 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	@Inject
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;
	@Inject
	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	@Inject
	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;
	@Inject
	State_ServiceName_3_CapabilityName_3_5 instanceState_ServiceName_3_CapabilityName_3_5;

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
		System.out.println("InputName_3_1_3 : "
				+ inputDataClassName_3_1.getInputName_3_1_3());
		System.out.println("InputName_3_1_4 : "
				+ inputDataClassName_3_1.getInputName_3_1_4());

		OutputDataClassName_3_1 out = new OutputDataClassName_3_1();

		out.setOutputName_3_1_1("CapabilityName_3_1");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_3_CapabilityName_3_1
				.setState(instanceState_ServiceName_3_CapabilityName_3_1
						.getState() + " ServiceName_3 CapabilityName_3_1");

		return out;
	}

	@Override
	public OutputDataClassName_3_2 CapabilityName_3_2(
			InputDataClassName_3_2 inputDataClassName_3_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_2 : ********//");

		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());
		System.out.println("InputName_3_2_2 : "
				+ inputDataClassName_3_2.getInputName_3_2_2());

		OutputDataClassName_3_2 out = new OutputDataClassName_3_2();

		out.setOutputName_3_2_1(Integer.valueOf("980"));

		out.setOutputName_3_2_2(Integer.valueOf("933"));

		out.setOutputName_3_2_3(Integer.valueOf("489"));

		out.setOutputName_3_2_4(Integer.valueOf("120"));

		// TODO Auto-generated stub
		System.out.println("State header in: "
				+ ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

		return out;
	}

	@Override
	public OutputDataClassName_3_3 CapabilityName_3_3(
			InputDataClassName_3_3 inputDataClassName_3_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_3 : ********//");

		System.out.println("InputName_3_3_1 : "
				+ inputDataClassName_3_3.getInputName_3_3_1());

		OutputDataClassName_3_3 out = new OutputDataClassName_3_3();

		out.setOutputName_3_3_1(Integer.valueOf("308"));

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

		instanceState_ServiceName_3_CapabilityName_3_3
				.setState(instanceState_ServiceName_3_CapabilityName_3_3
						.getState() + " ServiceName_3 CapabilityName_3_3");

		return out;
	}

	@Override
	public OutputDataClassName_3_4 CapabilityName_3_4(
			InputDataClassName_3_4 inputDataClassName_3_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_4 : ********//");

		System.out.println("InputName_3_4_1 : "
				+ inputDataClassName_3_4.getInputName_3_4_1());
		System.out.println("InputName_3_4_2 : "
				+ inputDataClassName_3_4.getInputName_3_4_2());

		OutputDataClassName_3_4 out = new OutputDataClassName_3_4();

		out.setOutputName_3_4_1("CapabilityName_3_4");

		out.setOutputName_3_4_2("CapabilityName_3_4");

		// TODO Auto-generated stub
		System.out.println("State header in: "
				+ ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_3_CapabilityName_3_4
				.setState(instanceState_ServiceName_3_CapabilityName_3_4
						.getState() + " ServiceName_3 CapabilityName_3_4");

		return out;
	}

	@Override
	public OutputDataClassName_3_5 CapabilityName_3_5(
			InputDataClassName_3_5 inputDataClassName_3_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_5 : ********//");

		System.out.println("InputName_3_5_1 : "
				+ inputDataClassName_3_5.getInputName_3_5_1());
		System.out.println("InputName_3_5_2 : "
				+ inputDataClassName_3_5.getInputName_3_5_2());
		System.out.println("InputName_3_5_3 : "
				+ inputDataClassName_3_5.getInputName_3_5_3());
		System.out.println("InputName_3_5_4 : "
				+ inputDataClassName_3_5.getInputName_3_5_4());
		System.out.println("InputName_3_5_5 : "
				+ inputDataClassName_3_5.getInputName_3_5_5());

		OutputDataClassName_3_5 out = new OutputDataClassName_3_5();

		out.setOutputName_3_5_1(Float.valueOf("72"));

		out.setOutputName_3_5_2(Integer.valueOf("370"));

		out.setOutputName_3_5_3(Integer.valueOf("996"));

		out.setOutputName_3_5_4(Float.valueOf("334"));

		out.setOutputName_3_5_5("CapabilityName_3_5");

		out.setOutputName_3_5_6(Integer.valueOf("569"));

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

		instanceState_ServiceName_3_CapabilityName_3_5
				.setState(instanceState_ServiceName_3_CapabilityName_3_5
						.getState() + " ServiceName_3 CapabilityName_3_5");

		return out;
	}

}
