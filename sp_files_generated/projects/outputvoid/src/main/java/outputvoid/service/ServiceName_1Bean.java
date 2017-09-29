package outputvoid.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import outputvoid.input.InputDataClassName_1_2;

import outputvoid.output.OutputDataClassName_1_2;

import outputvoid.state.State_ServiceName_1_CapabilityName_1_1;
import outputvoid.state.State_ServiceName_1_CapabilityName_1_2;

import outputvoid.util.ConsumerHeader;

@Service(ServiceName_1.class)
public class ServiceName_1Bean implements ServiceName_1 {

	@Inject
	private Context context;

	@Inject
	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	@Inject
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public void CapabilityName_1_1() {
		// TODO Auto-generated stub

		System.out.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_1 : ********//");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		// TODO Auto-generated stub
		System.out.println("State header in: " + ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_1_CapabilityName_1_1.setState(
				instanceState_ServiceName_1_CapabilityName_1_1.getState() + " ServiceName_1 CapabilityName_1_1");

		System.out.println("State header out: " + instanceState_ServiceName_1_CapabilityName_1_1.getState());
		
	}

	@Override
	public OutputDataClassName_1_2 CapabilityName_1_2(InputDataClassName_1_2 inputDataClassName_1_2) {
		// TODO Auto-generated stub

		System.out.println("\\\\******* The output of ServiceName_1 : CapabilityName_1_2 : ********//");

		System.out.println("InputName_1_2_1 : " + inputDataClassName_1_2.getInputName_1_2_1());

		OutputDataClassName_1_2 out = new OutputDataClassName_1_2();

		out.setOutputName_1_2_1(Float.valueOf("531"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		// TODO Auto-generated stub
		System.out.println("State header in: " + ConsumerHeader.getConsumerState(context));

		instanceState_ServiceName_1_CapabilityName_1_2.setState(
				instanceState_ServiceName_1_CapabilityName_1_2.getState() + " ServiceName_1 CapabilityName_1_2");

		System.out.println("State header out: " + instanceState_ServiceName_1_CapabilityName_1_2.getState());

		return out;
	}

}
