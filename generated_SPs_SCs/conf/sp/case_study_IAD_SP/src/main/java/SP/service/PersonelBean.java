package SP.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import SP.input.Session;

import SP.output.SessionResponse;

import SP.state.State_Personel_login;

import SP.util.ConsumerHeader;

@Service(Personel.class)
public class PersonelBean implements Personel {

	@Inject
	private Context context;

	@Inject
	State_Personel_login instanceState_Personel_login;

	@Override
	public SessionResponse login(Session session) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of Personel : login : ********//");

		System.out.println("id : " + session.getId());

		SessionResponse out = new SessionResponse();

		out.setOk(true);

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

		instanceState_Personel_login.setState(instanceState_Personel_login
				.getState() + " Personel login");

		return out;
	}

}
