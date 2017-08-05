package SP_aircraftcarrier1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_aircraftcarrier1.input.InputDataClassName_2_4;
import SP_aircraftcarrier1.input.InputDataClassName_2_5;
import SP_aircraftcarrier1.input.InputDataClassName_2_1;
import SP_aircraftcarrier1.input.InputDataClassName_2_2;

import SP_aircraftcarrier1.output.OutputDataClassName_2_4;
import SP_aircraftcarrier1.output.OutputDataClassName_2_5;
import SP_aircraftcarrier1.output.OutputDataClassName_2_1;
import SP_aircraftcarrier1.output.OutputDataClassName_2_3;

import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_4;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_5;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_1;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_2;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_3;

import SP_aircraftcarrier1.util.ConsumerHeader;

@Service(ServiceName_2.class)
public class ServiceName_2Bean implements ServiceName_2 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	@Inject
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
	@Inject
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	@Inject
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;
	@Inject
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public OutputDataClassName_2_4 CapabilityName_2_4(
			InputDataClassName_2_4 inputDataClassName_2_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_4 : ********//");

		System.out.println("InputName_2_4_1 : "
				+ inputDataClassName_2_4.getInputName_2_4_1());
		System.out.println("InputName_2_4_2 : "
				+ inputDataClassName_2_4.getInputName_2_4_2());
		System.out.println("InputName_2_4_3 : "
				+ inputDataClassName_2_4.getInputName_2_4_3());
		System.out.println("InputName_2_4_4 : "
				+ inputDataClassName_2_4.getInputName_2_4_4());

		OutputDataClassName_2_4 out = new OutputDataClassName_2_4();

		out.setOutputName_2_4_4("CapabilityName_2_4");

		out.setOutputName_2_4_5("CapabilityName_2_4");

		out.setOutputName_2_4_6(Integer.valueOf("229"));

		out.setOutputName_2_4_1(Integer.valueOf("609"));

		out.setOutputName_2_4_2(Float.valueOf("522"));

		out.setOutputName_2_4_3(Float.valueOf("165"));

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

		instanceState_ServiceName_2_CapabilityName_2_4
				.setState(instanceState_ServiceName_2_CapabilityName_2_4
						.getState() + " ServiceName_2 CapabilityName_2_4");

		return out;
	}

	@Override
	public OutputDataClassName_2_5 CapabilityName_2_5(
			InputDataClassName_2_5 inputDataClassName_2_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_5 : ********//");

		System.out.println("InputName_2_5_1 : "
				+ inputDataClassName_2_5.getInputName_2_5_1());
		System.out.println("InputName_2_5_2 : "
				+ inputDataClassName_2_5.getInputName_2_5_2());
		System.out.println("InputName_2_5_3 : "
				+ inputDataClassName_2_5.getInputName_2_5_3());
		System.out.println("InputName_2_5_4 : "
				+ inputDataClassName_2_5.getInputName_2_5_4());

		OutputDataClassName_2_5 out = new OutputDataClassName_2_5();

		out.setOutputName_2_5_1(Float.valueOf("820"));

		out.setOutputName_2_5_2(Float.valueOf("430"));

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

		out.setOutputName_2_1_7(Integer.valueOf("611"));

		out.setOutputName_2_1_8(Integer.valueOf("235"));

		out.setOutputName_2_1_3("CapabilityName_2_1");

		out.setOutputName_2_1_4(Float.valueOf("309"));

		out.setOutputName_2_1_5(Float.valueOf("30"));

		out.setOutputName_2_1_6(Float.valueOf("852"));

		out.setOutputName_2_1_1("CapabilityName_2_1");

		out.setOutputName_2_1_2("CapabilityName_2_1");

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

		instanceState_ServiceName_2_CapabilityName_2_1
				.setState(instanceState_ServiceName_2_CapabilityName_2_1
						.getState() + " ServiceName_2 CapabilityName_2_1");

		return out;
	}

	@Override
	public void CapabilityName_2_2(InputDataClassName_2_2 inputDataClassName_2_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_2 : ********//");

		System.out.println("InputName_2_2_1 : "
				+ inputDataClassName_2_2.getInputName_2_2_1());
		System.out.println("InputName_2_2_2 : "
				+ inputDataClassName_2_2.getInputName_2_2_2());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_2_CapabilityName_2_2
				.setState(instanceState_ServiceName_2_CapabilityName_2_2
						.getState() + " ServiceName_2 CapabilityName_2_2");

	}

	@Override
	public OutputDataClassName_2_3 CapabilityName_2_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_3 : ********//");

		OutputDataClassName_2_3 out = new OutputDataClassName_2_3();

		out.setOutputName_2_3_1(Float.valueOf("746"));

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

		instanceState_ServiceName_2_CapabilityName_2_3
				.setState(instanceState_ServiceName_2_CapabilityName_2_3
						.getState() + " ServiceName_2 CapabilityName_2_3");

		return out;
	}

}
