package SP_helicopter1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_helicopter1.input.InputDataClassName_4_4;
import SP_helicopter1.input.InputDataClassName_4_1;

import SP_helicopter1.output.OutputDataClassName_4_2;
import SP_helicopter1.output.OutputDataClassName_4_3;
import SP_helicopter1.output.OutputDataClassName_4_4;
import SP_helicopter1.output.OutputDataClassName_4_1;

import SP_helicopter1.state.State_ServiceName_4_CapabilityName_4_2;
import SP_helicopter1.state.State_ServiceName_4_CapabilityName_4_3;
import SP_helicopter1.state.State_ServiceName_4_CapabilityName_4_4;
import SP_helicopter1.state.State_ServiceName_4_CapabilityName_4_1;

import SP_helicopter1.util.ConsumerHeader;

@Service(ServiceName_4.class)
public class ServiceName_4Bean implements ServiceName_4 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	@Inject
	State_ServiceName_4_CapabilityName_4_3 instanceState_ServiceName_4_CapabilityName_4_3;
	@Inject
	State_ServiceName_4_CapabilityName_4_4 instanceState_ServiceName_4_CapabilityName_4_4;
	@Inject
	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;

	@Override
	public OutputDataClassName_4_2 CapabilityName_4_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_2 : ********//");

		OutputDataClassName_4_2 out = new OutputDataClassName_4_2();

		out.setOutputName_4_2_4(Integer.valueOf("545"));

		out.setOutputName_4_2_5("CapabilityName_4_2");

		out.setOutputName_4_2_6(Float.valueOf("848"));

		out.setOutputName_4_2_7(Float.valueOf("471"));

		out.setOutputName_4_2_8(Float.valueOf("913"));

		out.setOutputName_4_2_9(Integer.valueOf("503"));

		out.setOutputName_4_2_1("CapabilityName_4_2");

		out.setOutputName_4_2_2("CapabilityName_4_2");

		out.setOutputName_4_2_3("CapabilityName_4_2");

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
	public OutputDataClassName_4_3 CapabilityName_4_3() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_3 : ********//");

		OutputDataClassName_4_3 out = new OutputDataClassName_4_3();

		out.setOutputName_4_3_3("CapabilityName_4_3");

		out.setOutputName_4_3_4(Integer.valueOf("824"));

		out.setOutputName_4_3_5(Integer.valueOf("497"));

		out.setOutputName_4_3_6(Float.valueOf("551"));

		out.setOutputName_4_3_1("CapabilityName_4_3");

		out.setOutputName_4_3_2(Float.valueOf("634"));

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

		instanceState_ServiceName_4_CapabilityName_4_3
				.setState(instanceState_ServiceName_4_CapabilityName_4_3
						.getState() + " ServiceName_4 CapabilityName_4_3");

		return out;
	}

	@Override
	public OutputDataClassName_4_4 CapabilityName_4_4(
			InputDataClassName_4_4 inputDataClassName_4_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_4 : ********//");

		System.out.println("InputName_4_4_5 : "
				+ inputDataClassName_4_4.getInputName_4_4_5());
		System.out.println("InputName_4_4_1 : "
				+ inputDataClassName_4_4.getInputName_4_4_1());
		System.out.println("InputName_4_4_2 : "
				+ inputDataClassName_4_4.getInputName_4_4_2());
		System.out.println("InputName_4_4_3 : "
				+ inputDataClassName_4_4.getInputName_4_4_3());
		System.out.println("InputName_4_4_4 : "
				+ inputDataClassName_4_4.getInputName_4_4_4());

		OutputDataClassName_4_4 out = new OutputDataClassName_4_4();

		out.setOutputName_4_4_2(Integer.valueOf("910"));

		out.setOutputName_4_4_3(Integer.valueOf("272"));

		out.setOutputName_4_4_4(Float.valueOf("186"));

		out.setOutputName_4_4_5("CapabilityName_4_4");

		out.setOutputName_4_4_1(Float.valueOf("855"));

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

		instanceState_ServiceName_4_CapabilityName_4_4
				.setState(instanceState_ServiceName_4_CapabilityName_4_4
						.getState() + " ServiceName_4 CapabilityName_4_4");

		return out;
	}

	@Override
	public OutputDataClassName_4_1 CapabilityName_4_1(
			InputDataClassName_4_1 inputDataClassName_4_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_4 : CapabilityName_4_1 : ********//");

		System.out.println("InputName_4_1_4 : "
				+ inputDataClassName_4_1.getInputName_4_1_4());
		System.out.println("InputName_4_1_5 : "
				+ inputDataClassName_4_1.getInputName_4_1_5());
		System.out.println("InputName_4_1_6 : "
				+ inputDataClassName_4_1.getInputName_4_1_6());
		System.out.println("InputName_4_1_1 : "
				+ inputDataClassName_4_1.getInputName_4_1_1());
		System.out.println("InputName_4_1_2 : "
				+ inputDataClassName_4_1.getInputName_4_1_2());
		System.out.println("InputName_4_1_3 : "
				+ inputDataClassName_4_1.getInputName_4_1_3());

		OutputDataClassName_4_1 out = new OutputDataClassName_4_1();

		out.setOutputName_4_1_1("CapabilityName_4_1");

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

}
