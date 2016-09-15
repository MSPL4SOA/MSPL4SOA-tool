package commerce.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import commerce.input.InformationToUpdate;

import commerce.output.ConnectionStatus;
import commerce.output.UpdateStatus;

import commerce.state.State_Client_connectProfile;
import commerce.state.State_Client_updateProfile;

import commerce.util.ConsumerHeader;

@Service(Client.class)
public class ClientBean implements Client {

	@Inject
	private Context context;

	@Inject
	State_Client_connectProfile instanceState_Client_connectProfile;
	@Inject
	State_Client_updateProfile instanceState_Client_updateProfile;

	@Override
	public ConnectionStatus connectProfile() {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of Client : connectProfile : ********//");

		ConnectionStatus out = new ConnectionStatus();

		out.setStatus(Integer.valueOf("22"));

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_Client_connectProfile
				.setState(instanceState_Client_connectProfile.getState()
						+ " Client connectProfile");

		return out;
	}

	@Override
	public UpdateStatus updateProfile(InformationToUpdate informationToUpdate) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of Client : updateProfile : ********//");

		System.out.println("age : " + informationToUpdate.getAge());
		System.out.println("address : " + informationToUpdate.getAddress());

		UpdateStatus out = new UpdateStatus();

		out.setStatus(Integer.valueOf("956"));

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

		instanceState_Client_updateProfile
				.setState(instanceState_Client_updateProfile.getState()
						+ " Client updateProfile");

		return out;
	}

}
