package large3.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import large3.input.InputDataClassName_3_3;
import large3.input.InputDataClassName_3_4;
import large3.input.InputDataClassName_3_5;
import large3.input.InputDataClassName_3_6;
import large3.input.InputDataClassName_3_1;
import large3.input.InputDataClassName_3_2;

import large3.output.OutputDataClassName_3_3;
import large3.output.OutputDataClassName_3_4;
import large3.output.OutputDataClassName_3_5;
import large3.output.OutputDataClassName_3_6;
import large3.output.OutputDataClassName_3_1;
import large3.output.OutputDataClassName_3_2;

import large3.state.State_ServiceName_3_CapabilityName_3_3;
import large3.state.State_ServiceName_3_CapabilityName_3_4;
import large3.state.State_ServiceName_3_CapabilityName_3_5;
import large3.state.State_ServiceName_3_CapabilityName_3_6;
import large3.state.State_ServiceName_3_CapabilityName_3_1;
import large3.state.State_ServiceName_3_CapabilityName_3_2;

import large3.util.ConsumerHeader;

@Service(ServiceName_3.class)
public class ServiceName_3Bean implements ServiceName_3 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	@Inject
	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;
	@Inject
	State_ServiceName_3_CapabilityName_3_5 instanceState_ServiceName_3_CapabilityName_3_5;
	@Inject
	State_ServiceName_3_CapabilityName_3_6 instanceState_ServiceName_3_CapabilityName_3_6;
	@Inject
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	@Inject
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public OutputDataClassName_3_3 CapabilityName_3_3(
			InputDataClassName_3_3 inputDataClassName_3_3) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_3 : ********//");

		System.out.println("InputName_3_3_1 : "
				+ inputDataClassName_3_3.getInputName_3_3_1());
		System.out.println("InputName_3_3_2 : "
				+ inputDataClassName_3_3.getInputName_3_3_2());
		System.out.println("InputName_3_3_7 : "
				+ inputDataClassName_3_3.getInputName_3_3_7());
		System.out.println("InputName_3_3_5 : "
				+ inputDataClassName_3_3.getInputName_3_3_5());
		System.out.println("InputName_3_3_6 : "
				+ inputDataClassName_3_3.getInputName_3_3_6());
		System.out.println("InputName_3_3_3 : "
				+ inputDataClassName_3_3.getInputName_3_3_3());
		System.out.println("InputName_3_3_4 : "
				+ inputDataClassName_3_3.getInputName_3_3_4());

		OutputDataClassName_3_3 out = new OutputDataClassName_3_3();

		out.setOutputName_3_3_6(Integer.valueOf("571"));

		out.setOutputName_3_3_7(Float.valueOf("547"));

		out.setOutputName_3_3_4(Float.valueOf("444"));

		out.setOutputName_3_3_5("CapabilityName_3_3");

		out.setOutputName_3_3_8(Float.valueOf("872"));

		out.setOutputName_3_3_2(Float.valueOf("867"));

		out.setOutputName_3_3_3(Integer.valueOf("987"));

		out.setOutputName_3_3_1(Float.valueOf("958"));

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
		System.out.println("InputName_3_4_8 : "
				+ inputDataClassName_3_4.getInputName_3_4_8());
		System.out.println("InputName_3_4_9 : "
				+ inputDataClassName_3_4.getInputName_3_4_9());
		System.out.println("InputName_3_4_6 : "
				+ inputDataClassName_3_4.getInputName_3_4_6());
		System.out.println("InputName_3_4_7 : "
				+ inputDataClassName_3_4.getInputName_3_4_7());
		System.out.println("InputName_3_4_4 : "
				+ inputDataClassName_3_4.getInputName_3_4_4());
		System.out.println("InputName_3_4_5 : "
				+ inputDataClassName_3_4.getInputName_3_4_5());
		System.out.println("InputName_3_4_2 : "
				+ inputDataClassName_3_4.getInputName_3_4_2());
		System.out.println("InputName_3_4_3 : "
				+ inputDataClassName_3_4.getInputName_3_4_3());

		OutputDataClassName_3_4 out = new OutputDataClassName_3_4();

		out.setOutputName_3_4_5(Float.valueOf("37"));

		out.setOutputName_3_4_3("CapabilityName_3_4");

		out.setOutputName_3_4_4("CapabilityName_3_4");

		out.setOutputName_3_4_1("CapabilityName_3_4");

		out.setOutputName_3_4_2(Float.valueOf("65"));

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

		System.out.println("InputName_3_5_3 : "
				+ inputDataClassName_3_5.getInputName_3_5_3());
		System.out.println("InputName_3_5_4 : "
				+ inputDataClassName_3_5.getInputName_3_5_4());
		System.out.println("InputName_3_5_1 : "
				+ inputDataClassName_3_5.getInputName_3_5_1());
		System.out.println("InputName_3_5_2 : "
				+ inputDataClassName_3_5.getInputName_3_5_2());

		OutputDataClassName_3_5 out = new OutputDataClassName_3_5();

		out.setOutputName_3_5_4(Integer.valueOf("153"));

		out.setOutputName_3_5_5(Integer.valueOf("301"));

		out.setOutputName_3_5_2(Float.valueOf("440"));

		out.setOutputName_3_5_3(Integer.valueOf("983"));

		out.setOutputName_3_5_6(Float.valueOf("600"));

		out.setOutputName_3_5_1(Integer.valueOf("221"));

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

	@Override
	public OutputDataClassName_3_6 CapabilityName_3_6(
			InputDataClassName_3_6 inputDataClassName_3_6) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of ServiceName_3 : CapabilityName_3_6 : ********//");

		System.out.println("InputName_3_6_4 : "
				+ inputDataClassName_3_6.getInputName_3_6_4());
		System.out.println("InputName_3_6_5 : "
				+ inputDataClassName_3_6.getInputName_3_6_5());
		System.out.println("InputName_3_6_2 : "
				+ inputDataClassName_3_6.getInputName_3_6_2());
		System.out.println("InputName_3_6_3 : "
				+ inputDataClassName_3_6.getInputName_3_6_3());
		System.out.println("InputName_3_6_1 : "
				+ inputDataClassName_3_6.getInputName_3_6_1());

		OutputDataClassName_3_6 out = new OutputDataClassName_3_6();

		out.setOutputName_3_6_3(Float.valueOf("307"));

		out.setOutputName_3_6_4("CapabilityName_3_6");

		out.setOutputName_3_6_1("CapabilityName_3_6");

		out.setOutputName_3_6_2("CapabilityName_3_6");

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

		instanceState_ServiceName_3_CapabilityName_3_6
				.setState(instanceState_ServiceName_3_CapabilityName_3_6
						.getState() + " ServiceName_3 CapabilityName_3_6");

		return out;
	}

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

		OutputDataClassName_3_1 out = new OutputDataClassName_3_1();

		out.setOutputName_3_1_1(Integer.valueOf("201"));

		out.setOutputName_3_1_4("CapabilityName_3_1");

		out.setOutputName_3_1_2(Float.valueOf("696"));

		out.setOutputName_3_1_3(Float.valueOf("370"));

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

		System.out.println("InputName_3_2_2 : "
				+ inputDataClassName_3_2.getInputName_3_2_2());
		System.out.println("InputName_3_2_3 : "
				+ inputDataClassName_3_2.getInputName_3_2_3());
		System.out.println("InputName_3_2_1 : "
				+ inputDataClassName_3_2.getInputName_3_2_1());
		System.out.println("InputName_3_2_4 : "
				+ inputDataClassName_3_2.getInputName_3_2_4());
		System.out.println("InputName_3_2_5 : "
				+ inputDataClassName_3_2.getInputName_3_2_5());

		OutputDataClassName_3_2 out = new OutputDataClassName_3_2();

		out.setOutputName_3_2_5(Float.valueOf("771"));

		out.setOutputName_3_2_6("CapabilityName_3_2");

		out.setOutputName_3_2_3(Integer.valueOf("794"));

		out.setOutputName_3_2_4("CapabilityName_3_2");

		out.setOutputName_3_2_1("CapabilityName_3_2");

		out.setOutputName_3_2_2(Float.valueOf("283"));

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

		instanceState_ServiceName_3_CapabilityName_3_2
				.setState(instanceState_ServiceName_3_CapabilityName_3_2
						.getState() + " ServiceName_3 CapabilityName_3_2");

		return out;
	}

}
