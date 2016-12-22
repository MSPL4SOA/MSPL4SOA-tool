package large3.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large3.input.InputDataClassName_7_3;
import large3.input.InputDataClassName_7_4;
import large3.input.InputDataClassName_7_5;
import large3.input.InputDataClassName_7_1;
import large3.input.InputDataClassName_7_2;

import large3.output.OutputDataClassName_7_3;
import large3.output.OutputDataClassName_7_4;
import large3.output.OutputDataClassName_7_1;
import large3.output.OutputDataClassName_7_2;

import large3.state.State_ServiceName_7_CapabilityName_7_3;
import large3.state.State_ServiceName_7_CapabilityName_7_4;
import large3.state.State_ServiceName_7_CapabilityName_7_5;
import large3.state.State_ServiceName_7_CapabilityName_7_6;
import large3.state.State_ServiceName_7_CapabilityName_7_1;
import large3.state.State_ServiceName_7_CapabilityName_7_2;

import large3.util.ConsumerHeader;

@Service(ServiceName_7.class)
public class ServiceName_7Bean implements ServiceName_7 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	@Inject
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	@Inject
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;
	@Inject
	State_ServiceName_7_CapabilityName_7_6 instanceState_ServiceName_7_CapabilityName_7_6;
	@Inject
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	@Inject
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;

	@Override
	public OutputDataClassName_7_3 CapabilityName_7_3(
			InputDataClassName_7_3 inputDataClassName_7_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_3 : ********//");

		System.out.println("InputName_7_3_3 : "
				+ inputDataClassName_7_3.getInputName_7_3_3());
		System.out.println("InputName_7_3_4 : "
				+ inputDataClassName_7_3.getInputName_7_3_4());
		System.out.println("InputName_7_3_1 : "
				+ inputDataClassName_7_3.getInputName_7_3_1());
		System.out.println("InputName_7_3_2 : "
				+ inputDataClassName_7_3.getInputName_7_3_2());

		OutputDataClassName_7_3 out = new OutputDataClassName_7_3();

		out.setOutputName_7_3_3(Integer.valueOf("485"));

		out.setOutputName_7_3_2("CapabilityName_7_3");

		out.setOutputName_7_3_1("CapabilityName_7_3");

		out.setOutputName_7_3_5(Integer.valueOf("36"));

		out.setOutputName_7_3_4(Float.valueOf("336"));

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

		instanceState_ServiceName_7_CapabilityName_7_3
				.setState(instanceState_ServiceName_7_CapabilityName_7_3
						.getState() + " ServiceName_7 CapabilityName_7_3");

		return out;
	}

	@Override
	public OutputDataClassName_7_4 CapabilityName_7_4(
			InputDataClassName_7_4 inputDataClassName_7_4) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_4 : ********//");

		System.out.println("InputName_7_4_4 : "
				+ inputDataClassName_7_4.getInputName_7_4_4());
		System.out.println("InputName_7_4_5 : "
				+ inputDataClassName_7_4.getInputName_7_4_5());
		System.out.println("InputName_7_4_2 : "
				+ inputDataClassName_7_4.getInputName_7_4_2());
		System.out.println("InputName_7_4_3 : "
				+ inputDataClassName_7_4.getInputName_7_4_3());
		System.out.println("InputName_7_4_1 : "
				+ inputDataClassName_7_4.getInputName_7_4_1());
		System.out.println("InputName_7_4_6 : "
				+ inputDataClassName_7_4.getInputName_7_4_6());

		OutputDataClassName_7_4 out = new OutputDataClassName_7_4();

		out.setOutputName_7_4_2(Float.valueOf("333"));

		out.setOutputName_7_4_1("CapabilityName_7_4");

		out.setOutputName_7_4_5(Integer.valueOf("843"));

		out.setOutputName_7_4_4("CapabilityName_7_4");

		out.setOutputName_7_4_3("CapabilityName_7_4");

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

		instanceState_ServiceName_7_CapabilityName_7_4
				.setState(instanceState_ServiceName_7_CapabilityName_7_4
						.getState() + " ServiceName_7 CapabilityName_7_4");

		return out;
	}

	@Override
	public void CapabilityName_7_5(InputDataClassName_7_5 inputDataClassName_7_5) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_5 : ********//");

		System.out.println("InputName_7_5_3 : "
				+ inputDataClassName_7_5.getInputName_7_5_3());
		System.out.println("InputName_7_5_4 : "
				+ inputDataClassName_7_5.getInputName_7_5_4());
		System.out.println("InputName_7_5_1 : "
				+ inputDataClassName_7_5.getInputName_7_5_1());
		System.out.println("InputName_7_5_2 : "
				+ inputDataClassName_7_5.getInputName_7_5_2());
		System.out.println("InputName_7_5_7 : "
				+ inputDataClassName_7_5.getInputName_7_5_7());
		System.out.println("InputName_7_5_5 : "
				+ inputDataClassName_7_5.getInputName_7_5_5());
		System.out.println("InputName_7_5_6 : "
				+ inputDataClassName_7_5.getInputName_7_5_6());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_7_CapabilityName_7_5
				.setState(instanceState_ServiceName_7_CapabilityName_7_5
						.getState() + " ServiceName_7 CapabilityName_7_5");

	}

	@Override
	public void CapabilityName_7_6() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_6 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_ServiceName_7_CapabilityName_7_6
				.setState(instanceState_ServiceName_7_CapabilityName_7_6
						.getState() + " ServiceName_7 CapabilityName_7_6");

	}

	@Override
	public OutputDataClassName_7_1 CapabilityName_7_1(
			InputDataClassName_7_1 inputDataClassName_7_1) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_1 : ********//");

		System.out.println("InputName_7_1_7 : "
				+ inputDataClassName_7_1.getInputName_7_1_7());
		System.out.println("InputName_7_1_8 : "
				+ inputDataClassName_7_1.getInputName_7_1_8());
		System.out.println("InputName_7_1_5 : "
				+ inputDataClassName_7_1.getInputName_7_1_5());
		System.out.println("InputName_7_1_6 : "
				+ inputDataClassName_7_1.getInputName_7_1_6());
		System.out.println("InputName_7_1_3 : "
				+ inputDataClassName_7_1.getInputName_7_1_3());
		System.out.println("InputName_7_1_4 : "
				+ inputDataClassName_7_1.getInputName_7_1_4());
		System.out.println("InputName_7_1_1 : "
				+ inputDataClassName_7_1.getInputName_7_1_1());
		System.out.println("InputName_7_1_2 : "
				+ inputDataClassName_7_1.getInputName_7_1_2());

		OutputDataClassName_7_1 out = new OutputDataClassName_7_1();

		out.setOutputName_7_1_1(Float.valueOf("940"));

		out.setOutputName_7_1_5(Integer.valueOf("874"));

		out.setOutputName_7_1_4(Float.valueOf("68"));

		out.setOutputName_7_1_3(Float.valueOf("252"));

		out.setOutputName_7_1_2(Float.valueOf("124"));

		out.setOutputName_7_1_8(Float.valueOf("383"));

		out.setOutputName_7_1_7("CapabilityName_7_1");

		out.setOutputName_7_1_6("CapabilityName_7_1");

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

		instanceState_ServiceName_7_CapabilityName_7_1
				.setState(instanceState_ServiceName_7_CapabilityName_7_1
						.getState() + " ServiceName_7 CapabilityName_7_1");

		return out;
	}

	@Override
	public OutputDataClassName_7_2 CapabilityName_7_2(
			InputDataClassName_7_2 inputDataClassName_7_2) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_7 : CapabilityName_7_2 : ********//");

		System.out.println("InputName_7_2_6 : "
				+ inputDataClassName_7_2.getInputName_7_2_6());
		System.out.println("InputName_7_2_7 : "
				+ inputDataClassName_7_2.getInputName_7_2_7());
		System.out.println("InputName_7_2_4 : "
				+ inputDataClassName_7_2.getInputName_7_2_4());
		System.out.println("InputName_7_2_5 : "
				+ inputDataClassName_7_2.getInputName_7_2_5());
		System.out.println("InputName_7_2_2 : "
				+ inputDataClassName_7_2.getInputName_7_2_2());
		System.out.println("InputName_7_2_3 : "
				+ inputDataClassName_7_2.getInputName_7_2_3());
		System.out.println("InputName_7_2_1 : "
				+ inputDataClassName_7_2.getInputName_7_2_1());
		System.out.println("InputName_7_2_8 : "
				+ inputDataClassName_7_2.getInputName_7_2_8());
		System.out.println("InputName_7_2_9 : "
				+ inputDataClassName_7_2.getInputName_7_2_9());

		OutputDataClassName_7_2 out = new OutputDataClassName_7_2();

		out.setOutputName_7_2_4(Integer.valueOf("831"));

		out.setOutputName_7_2_3(Integer.valueOf("932"));

		out.setOutputName_7_2_2(Float.valueOf("604"));

		out.setOutputName_7_2_1(Float.valueOf("160"));

		out.setOutputName_7_2_7(Integer.valueOf("398"));

		out.setOutputName_7_2_6(Float.valueOf("436"));

		out.setOutputName_7_2_5("CapabilityName_7_2");

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

		instanceState_ServiceName_7_CapabilityName_7_2
				.setState(instanceState_ServiceName_7_CapabilityName_7_2
						.getState() + " ServiceName_7 CapabilityName_7_2");

		return out;
	}

}
