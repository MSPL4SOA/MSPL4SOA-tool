package SP_command.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_command.input.InputDataClassName_1_5;
import SP_command.input.InputDataClassName_1_6;
import SP_command.input.InputDataClassName_1_1;
import SP_command.input.InputDataClassName_1_3;
import SP_command.input.InputDataClassName_1_4;

import SP_command.output.OutputDataClassName_1_5;
import SP_command.output.OutputDataClassName_1_6;
import SP_command.output.OutputDataClassName_1_1;
import SP_command.output.OutputDataClassName_1_2;
import SP_command.output.OutputDataClassName_1_3;
import SP_command.output.OutputDataClassName_1_4;

import SP_command.state.State_ServiceName_1_CapabilityName_1_5;
import SP_command.state.State_ServiceName_1_CapabilityName_1_6;
import SP_command.state.State_ServiceName_1_CapabilityName_1_1;
import SP_command.state.State_ServiceName_1_CapabilityName_1_2;
import SP_command.state.State_ServiceName_1_CapabilityName_1_3;
import SP_command.state.State_ServiceName_1_CapabilityName_1_4;

import SP_command.util.ConsumerHeader;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_5 instanceState_ServiceName_1_CapabilityName_1_5;
	@Inject
	State_ServiceName_1_CapabilityName_1_6 instanceState_ServiceName_1_CapabilityName_1_6;
	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	@Inject
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;
	@Inject
	State_ServiceName_1_CapabilityName_1_4 instanceState_ServiceName_1_CapabilityName_1_4;

	@Override
	public OutputDataClassName_1_5 CapabilityName_1_5(
			InputDataClassName_1_5 inputDataClassName_1_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_5 : ********//");

		System.out.println("InputName_1_5_5 : "
				+ inputDataClassName_1_5.getInputName_1_5_5());
		System.out.println("InputName_1_5_3 : "
				+ inputDataClassName_1_5.getInputName_1_5_3());
		System.out.println("InputName_1_5_4 : "
				+ inputDataClassName_1_5.getInputName_1_5_4());
		System.out.println("InputName_1_5_1 : "
				+ inputDataClassName_1_5.getInputName_1_5_1());
		System.out.println("InputName_1_5_2 : "
				+ inputDataClassName_1_5.getInputName_1_5_2());

		OutputDataClassName_1_5 out = new OutputDataClassName_1_5();

		out.setOutputName_1_5_4(Integer.valueOf("47"));

		out.setOutputName_1_5_5(Float.valueOf("260"));

		out.setOutputName_1_5_2("CapabilityName_1_5");

		out.setOutputName_1_5_3(Float.valueOf("923"));

		out.setOutputName_1_5_1(Integer.valueOf("776"));

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

		instanceState_ServiceName_1_CapabilityName_1_5
				.setState(instanceState_ServiceName_1_CapabilityName_1_5
						.getState() + " ServiceName_1 CapabilityName_1_5");

		return out;
	}

	@Override
	public OutputDataClassName_1_6 CapabilityName_1_6(
			InputDataClassName_1_6 inputDataClassName_1_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_6 : ********//");

		System.out.println("InputName_1_6_4 : "
				+ inputDataClassName_1_6.getInputName_1_6_4());
		System.out.println("InputName_1_6_5 : "
				+ inputDataClassName_1_6.getInputName_1_6_5());
		System.out.println("InputName_1_6_2 : "
				+ inputDataClassName_1_6.getInputName_1_6_2());
		System.out.println("InputName_1_6_3 : "
				+ inputDataClassName_1_6.getInputName_1_6_3());
		System.out.println("InputName_1_6_1 : "
				+ inputDataClassName_1_6.getInputName_1_6_1());

		OutputDataClassName_1_6 out = new OutputDataClassName_1_6();

		out.setOutputName_1_6_7(Float.valueOf("103"));

		out.setOutputName_1_6_8(Float.valueOf("282"));

		out.setOutputName_1_6_5(Float.valueOf("438"));

		out.setOutputName_1_6_6("CapabilityName_1_6");

		out.setOutputName_1_6_3(Float.valueOf("494"));

		out.setOutputName_1_6_4(Integer.valueOf("158"));

		out.setOutputName_1_6_1(Float.valueOf("117"));

		out.setOutputName_1_6_2(Float.valueOf("414"));

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

		instanceState_ServiceName_1_CapabilityName_1_6
				.setState(instanceState_ServiceName_1_CapabilityName_1_6
						.getState() + " ServiceName_1 CapabilityName_1_6");

		return out;
	}

	@Override
	public OutputDataClassName_1_1 CapabilityName_1_1(
			InputDataClassName_1_1 inputDataClassName_1_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_1 : ********//");

		System.out.println("InputName_1_1_1 : "
				+ inputDataClassName_1_1.getInputName_1_1_1());

		OutputDataClassName_1_1 out = new OutputDataClassName_1_1();

		out.setOutputName_1_1_4(Integer.valueOf("806"));

		out.setOutputName_1_1_5(Integer.valueOf("585"));

		out.setOutputName_1_1_2(Float.valueOf("851"));

		out.setOutputName_1_1_3("CapabilityName_1_1");

		out.setOutputName_1_1_1(Float.valueOf("757"));

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

		instanceState_ServiceName_1_CapabilityName_1_1
				.setState(instanceState_ServiceName_1_CapabilityName_1_1
						.getState() + " ServiceName_1 CapabilityName_1_1");

		return out;
	}

	@Override
	public OutputDataClassName_1_2 CapabilityName_1_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_2 : ********//");

		OutputDataClassName_1_2 out = new OutputDataClassName_1_2();

		out.setOutputName_1_2_7(Float.valueOf("731"));

		out.setOutputName_1_2_5(Float.valueOf("919"));

		out.setOutputName_1_2_6(Integer.valueOf("265"));

		out.setOutputName_1_2_3(Integer.valueOf("752"));

		out.setOutputName_1_2_4(Float.valueOf("146"));

		out.setOutputName_1_2_1(Integer.valueOf("814"));

		out.setOutputName_1_2_2(Float.valueOf("775"));

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

		instanceState_ServiceName_1_CapabilityName_1_2
				.setState(instanceState_ServiceName_1_CapabilityName_1_2
						.getState() + " ServiceName_1 CapabilityName_1_2");

		return out;
	}

	@Override
	public OutputDataClassName_1_3 CapabilityName_1_3(
			InputDataClassName_1_3 inputDataClassName_1_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_3 : ********//");

		System.out.println("InputName_1_3_1 : "
				+ inputDataClassName_1_3.getInputName_1_3_1());
		System.out.println("InputName_1_3_2 : "
				+ inputDataClassName_1_3.getInputName_1_3_2());

		OutputDataClassName_1_3 out = new OutputDataClassName_1_3();

		out.setOutputName_1_3_8("CapabilityName_1_3");

		out.setOutputName_1_3_9(Float.valueOf("336"));

		out.setOutputName_1_3_6("CapabilityName_1_3");

		out.setOutputName_1_3_7(Integer.valueOf("921"));

		out.setOutputName_1_3_4(Float.valueOf("97"));

		out.setOutputName_1_3_5(Integer.valueOf("335"));

		out.setOutputName_1_3_2(Float.valueOf("84"));

		out.setOutputName_1_3_3("CapabilityName_1_3");

		out.setOutputName_1_3_1(Integer.valueOf("403"));

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

		instanceState_ServiceName_1_CapabilityName_1_3
				.setState(instanceState_ServiceName_1_CapabilityName_1_3
						.getState() + " ServiceName_1 CapabilityName_1_3");

		return out;
	}

	@Override
	public OutputDataClassName_1_4 CapabilityName_1_4(
			InputDataClassName_1_4 inputDataClassName_1_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_4 : ********//");

		System.out.println("InputName_1_4_4 : "
				+ inputDataClassName_1_4.getInputName_1_4_4());
		System.out.println("InputName_1_4_2 : "
				+ inputDataClassName_1_4.getInputName_1_4_2());
		System.out.println("InputName_1_4_3 : "
				+ inputDataClassName_1_4.getInputName_1_4_3());
		System.out.println("InputName_1_4_1 : "
				+ inputDataClassName_1_4.getInputName_1_4_1());

		OutputDataClassName_1_4 out = new OutputDataClassName_1_4();

		out.setOutputName_1_4_1("CapabilityName_1_4");

		out.setOutputName_1_4_2(Float.valueOf("283"));

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

		instanceState_ServiceName_1_CapabilityName_1_4
				.setState(instanceState_ServiceName_1_CapabilityName_1_4
						.getState() + " ServiceName_1 CapabilityName_1_4");

		return out;
	}

}
