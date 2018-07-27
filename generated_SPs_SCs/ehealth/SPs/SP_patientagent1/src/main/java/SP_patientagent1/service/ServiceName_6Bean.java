package SP_aircraftcarrier1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_aircraftcarrier1.input.InputDataClassName_6_4;
import SP_aircraftcarrier1.input.InputDataClassName_6_5;
import SP_aircraftcarrier1.input.InputDataClassName_6_6;
import SP_aircraftcarrier1.input.InputDataClassName_6_1;
import SP_aircraftcarrier1.input.InputDataClassName_6_2;
import SP_aircraftcarrier1.input.InputDataClassName_6_3;
import SP_aircraftcarrier1.input.InputDataClassName_6_8;

import SP_aircraftcarrier1.output.OutputDataClassName_6_4;
import SP_aircraftcarrier1.output.OutputDataClassName_6_5;
import SP_aircraftcarrier1.output.OutputDataClassName_6_6;
import SP_aircraftcarrier1.output.OutputDataClassName_6_7;
import SP_aircraftcarrier1.output.OutputDataClassName_6_2;
import SP_aircraftcarrier1.output.OutputDataClassName_6_3;
import SP_aircraftcarrier1.output.OutputDataClassName_6_8;

import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_4;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_5;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_6;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_7;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_1;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_2;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_3;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_8;

import SP_aircraftcarrier1.util.ConsumerHeader;

@Service(ServiceName_6.class)
public class ServiceName_6Bean implements ServiceName_6 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	@Inject
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;
	@Inject
	State_ServiceName_6_CapabilityName_6_6 instanceState_ServiceName_6_CapabilityName_6_6;
	@Inject
	State_ServiceName_6_CapabilityName_6_7 instanceState_ServiceName_6_CapabilityName_6_7;
	@Inject
	State_ServiceName_6_CapabilityName_6_1 instanceState_ServiceName_6_CapabilityName_6_1;
	@Inject
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	@Inject
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;
	@Inject
	State_ServiceName_6_CapabilityName_6_8 instanceState_ServiceName_6_CapabilityName_6_8;

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

		out.setOutputName_6_4_5(Float.valueOf("456"));

		out.setOutputName_6_4_4(Float.valueOf("987"));

		out.setOutputName_6_4_6(Float.valueOf("683"));

		out.setOutputName_6_4_1("CapabilityName_6_4");

		out.setOutputName_6_4_3("CapabilityName_6_4");

		out.setOutputName_6_4_2("CapabilityName_6_4");

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

		OutputDataClassName_6_5 out = new OutputDataClassName_6_5();

		out.setOutputName_6_5_4(Float.valueOf("743"));

		out.setOutputName_6_5_3(Float.valueOf("690"));

		out.setOutputName_6_5_6("CapabilityName_6_5");

		out.setOutputName_6_5_5(Float.valueOf("278"));

		out.setOutputName_6_5_2("CapabilityName_6_5");

		out.setOutputName_6_5_1(Float.valueOf("159"));

		out.setOutputName_6_5_7("CapabilityName_6_5");

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
	public OutputDataClassName_6_6 CapabilityName_6_6(
			InputDataClassName_6_6 inputDataClassName_6_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_6 : ********//");

		System.out.println("InputName_6_6_1 : "
				+ inputDataClassName_6_6.getInputName_6_6_1());
		System.out.println("InputName_6_6_2 : "
				+ inputDataClassName_6_6.getInputName_6_6_2());
		System.out.println("InputName_6_6_3 : "
				+ inputDataClassName_6_6.getInputName_6_6_3());
		System.out.println("InputName_6_6_4 : "
				+ inputDataClassName_6_6.getInputName_6_6_4());

		OutputDataClassName_6_6 out = new OutputDataClassName_6_6();

		out.setOutputName_6_6_3(Integer.valueOf("971"));

		out.setOutputName_6_6_2(Integer.valueOf("455"));

		out.setOutputName_6_6_5(Integer.valueOf("347"));

		out.setOutputName_6_6_4(Float.valueOf("797"));

		out.setOutputName_6_6_1(Float.valueOf("697"));

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

		instanceState_ServiceName_6_CapabilityName_6_6
				.setState(instanceState_ServiceName_6_CapabilityName_6_6
						.getState() + " ServiceName_6 CapabilityName_6_6");

		return out;
	}

	@Override
	public OutputDataClassName_6_7 CapabilityName_6_7() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_7 : ********//");

		OutputDataClassName_6_7 out = new OutputDataClassName_6_7();

		out.setOutputName_6_7_2("CapabilityName_6_7");

		out.setOutputName_6_7_1("CapabilityName_6_7");

		out.setOutputName_6_7_4(Float.valueOf("792"));

		out.setOutputName_6_7_3("CapabilityName_6_7");

		out.setOutputName_6_7_6(Integer.valueOf("476"));

		out.setOutputName_6_7_5(Integer.valueOf("995"));

		out.setOutputName_6_7_8("CapabilityName_6_7");

		out.setOutputName_6_7_7(Float.valueOf("685"));

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

		instanceState_ServiceName_6_CapabilityName_6_7
				.setState(instanceState_ServiceName_6_CapabilityName_6_7
						.getState() + " ServiceName_6 CapabilityName_6_7");

		return out;
	}

	@Override
	public void CapabilityName_6_1(InputDataClassName_6_1 inputDataClassName_6_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_1 : ********//");

		System.out.println("InputName_6_1_2 : "
				+ inputDataClassName_6_1.getInputName_6_1_2());
		System.out.println("InputName_6_1_3 : "
				+ inputDataClassName_6_1.getInputName_6_1_3());
		System.out.println("InputName_6_1_4 : "
				+ inputDataClassName_6_1.getInputName_6_1_4());
		System.out.println("InputName_6_1_5 : "
				+ inputDataClassName_6_1.getInputName_6_1_5());
		System.out.println("InputName_6_1_6 : "
				+ inputDataClassName_6_1.getInputName_6_1_6());
		System.out.println("InputName_6_1_1 : "
				+ inputDataClassName_6_1.getInputName_6_1_1());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_6_CapabilityName_6_1
				.setState(instanceState_ServiceName_6_CapabilityName_6_1
						.getState() + " ServiceName_6 CapabilityName_6_1");

	}

	@Override
	public OutputDataClassName_6_2 CapabilityName_6_2(
			InputDataClassName_6_2 inputDataClassName_6_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_2 : ********//");

		System.out.println("InputName_6_2_1 : "
				+ inputDataClassName_6_2.getInputName_6_2_1());
		System.out.println("InputName_6_2_2 : "
				+ inputDataClassName_6_2.getInputName_6_2_2());
		System.out.println("InputName_6_2_3 : "
				+ inputDataClassName_6_2.getInputName_6_2_3());
		System.out.println("InputName_6_2_4 : "
				+ inputDataClassName_6_2.getInputName_6_2_4());
		System.out.println("InputName_6_2_5 : "
				+ inputDataClassName_6_2.getInputName_6_2_5());
		System.out.println("InputName_6_2_6 : "
				+ inputDataClassName_6_2.getInputName_6_2_6());

		OutputDataClassName_6_2 out = new OutputDataClassName_6_2();

		out.setOutputName_6_2_1("CapabilityName_6_2");

		out.setOutputName_6_2_7("CapabilityName_6_2");

		out.setOutputName_6_2_6("CapabilityName_6_2");

		out.setOutputName_6_2_3(Float.valueOf("128"));

		out.setOutputName_6_2_2("CapabilityName_6_2");

		out.setOutputName_6_2_5(Integer.valueOf("420"));

		out.setOutputName_6_2_4(Float.valueOf("695"));

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

		instanceState_ServiceName_6_CapabilityName_6_2
				.setState(instanceState_ServiceName_6_CapabilityName_6_2
						.getState() + " ServiceName_6 CapabilityName_6_2");

		return out;
	}

	@Override
	public OutputDataClassName_6_3 CapabilityName_6_3(
			InputDataClassName_6_3 inputDataClassName_6_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_3 : ********//");

		System.out.println("InputName_6_3_8 : "
				+ inputDataClassName_6_3.getInputName_6_3_8());
		System.out.println("InputName_6_3_1 : "
				+ inputDataClassName_6_3.getInputName_6_3_1());
		System.out.println("InputName_6_3_2 : "
				+ inputDataClassName_6_3.getInputName_6_3_2());
		System.out.println("InputName_6_3_3 : "
				+ inputDataClassName_6_3.getInputName_6_3_3());
		System.out.println("InputName_6_3_4 : "
				+ inputDataClassName_6_3.getInputName_6_3_4());
		System.out.println("InputName_6_3_5 : "
				+ inputDataClassName_6_3.getInputName_6_3_5());
		System.out.println("InputName_6_3_6 : "
				+ inputDataClassName_6_3.getInputName_6_3_6());
		System.out.println("InputName_6_3_7 : "
				+ inputDataClassName_6_3.getInputName_6_3_7());

		OutputDataClassName_6_3 out = new OutputDataClassName_6_3();

		out.setOutputName_6_3_2("CapabilityName_6_3");

		out.setOutputName_6_3_1(Float.valueOf("583"));

		out.setOutputName_6_3_3(Integer.valueOf("404"));

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

	@Override
	public OutputDataClassName_6_8 CapabilityName_6_8(
			InputDataClassName_6_8 inputDataClassName_6_8) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_6 : CapabilityName_6_8 : ********//");

		System.out.println("InputName_6_8_3 : "
				+ inputDataClassName_6_8.getInputName_6_8_3());
		System.out.println("InputName_6_8_4 : "
				+ inputDataClassName_6_8.getInputName_6_8_4());
		System.out.println("InputName_6_8_5 : "
				+ inputDataClassName_6_8.getInputName_6_8_5());
		System.out.println("InputName_6_8_6 : "
				+ inputDataClassName_6_8.getInputName_6_8_6());
		System.out.println("InputName_6_8_7 : "
				+ inputDataClassName_6_8.getInputName_6_8_7());
		System.out.println("InputName_6_8_1 : "
				+ inputDataClassName_6_8.getInputName_6_8_1());
		System.out.println("InputName_6_8_2 : "
				+ inputDataClassName_6_8.getInputName_6_8_2());

		OutputDataClassName_6_8 out = new OutputDataClassName_6_8();

		out.setOutputName_6_8_1(Float.valueOf("616"));

		out.setOutputName_6_8_3("CapabilityName_6_8");

		out.setOutputName_6_8_2("CapabilityName_6_8");

		out.setOutputName_6_8_5(Integer.valueOf("579"));

		out.setOutputName_6_8_4("CapabilityName_6_8");

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

		instanceState_ServiceName_6_CapabilityName_6_8
				.setState(instanceState_ServiceName_6_CapabilityName_6_8
						.getState() + " ServiceName_6 CapabilityName_6_8");

		return out;
	}

}
