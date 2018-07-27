package SP_infantry1.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP_infantry1.input.InputDataClassName_2_4;
import SP_infantry1.input.InputDataClassName_2_5;
import SP_infantry1.input.InputDataClassName_2_1;
import SP_infantry1.input.InputDataClassName_2_3;

import SP_infantry1.output.OutputDataClassName_2_4;
import SP_infantry1.output.OutputDataClassName_2_5;
import SP_infantry1.output.OutputDataClassName_2_1;
import SP_infantry1.output.OutputDataClassName_2_2;
import SP_infantry1.output.OutputDataClassName_2_3;

import SP_infantry1.state.State_ServiceName_2_CapabilityName_2_4;
import SP_infantry1.state.State_ServiceName_2_CapabilityName_2_5;
import SP_infantry1.state.State_ServiceName_2_CapabilityName_2_1;
import SP_infantry1.state.State_ServiceName_2_CapabilityName_2_2;
import SP_infantry1.state.State_ServiceName_2_CapabilityName_2_3;

import SP_infantry1.util.ConsumerHeader;

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
		System.out.println("InputName_2_4_5 : "
				+ inputDataClassName_2_4.getInputName_2_4_5());
		System.out.println("InputName_2_4_6 : "
				+ inputDataClassName_2_4.getInputName_2_4_6());

		OutputDataClassName_2_4 out = new OutputDataClassName_2_4();

		out.setOutputName_2_4_8(Float.valueOf("718"));

		out.setOutputName_2_4_9(Integer.valueOf("803"));

		out.setOutputName_2_4_4(Float.valueOf("860"));

		out.setOutputName_2_4_5("CapabilityName_2_4");

		out.setOutputName_2_4_6(Float.valueOf("894"));

		out.setOutputName_2_4_7(Float.valueOf("670"));

		out.setOutputName_2_4_1("CapabilityName_2_4");

		out.setOutputName_2_4_2(Integer.valueOf("944"));

		out.setOutputName_2_4_3("CapabilityName_2_4");

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

		OutputDataClassName_2_5 out = new OutputDataClassName_2_5();

		out.setOutputName_2_5_3("CapabilityName_2_5");

		out.setOutputName_2_5_4(Float.valueOf("743"));

		out.setOutputName_2_5_1(Float.valueOf("108"));

		out.setOutputName_2_5_2(Float.valueOf("573"));

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

		OutputDataClassName_2_1 out = new OutputDataClassName_2_1();

		out.setOutputName_2_1_3(Float.valueOf("490"));

		out.setOutputName_2_1_4(Float.valueOf("465"));

		out.setOutputName_2_1_5("CapabilityName_2_1");

		out.setOutputName_2_1_6("CapabilityName_2_1");

		out.setOutputName_2_1_1("CapabilityName_2_1");

		out.setOutputName_2_1_2(Float.valueOf("375"));

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
	public OutputDataClassName_2_2 CapabilityName_2_2() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_2 : ********//");

		OutputDataClassName_2_2 out = new OutputDataClassName_2_2();

		out.setOutputName_2_2_2("CapabilityName_2_2");

		out.setOutputName_2_2_3("CapabilityName_2_2");

		out.setOutputName_2_2_4(Integer.valueOf("347"));

		out.setOutputName_2_2_1(Integer.valueOf("83"));

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

		instanceState_ServiceName_2_CapabilityName_2_2
				.setState(instanceState_ServiceName_2_CapabilityName_2_2
						.getState() + " ServiceName_2 CapabilityName_2_2");

		return out;
	}

	@Override
	public OutputDataClassName_2_3 CapabilityName_2_3(
			InputDataClassName_2_3 inputDataClassName_2_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_2 : CapabilityName_2_3 : ********//");

		System.out.println("InputName_2_3_1 : "
				+ inputDataClassName_2_3.getInputName_2_3_1());

		OutputDataClassName_2_3 out = new OutputDataClassName_2_3();

		out.setOutputName_2_3_5(Float.valueOf("262"));

		out.setOutputName_2_3_6("CapabilityName_2_3");

		out.setOutputName_2_3_1(Integer.valueOf("299"));

		out.setOutputName_2_3_2(Integer.valueOf("92"));

		out.setOutputName_2_3_3(Integer.valueOf("237"));

		out.setOutputName_2_3_4("CapabilityName_2_3");

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
