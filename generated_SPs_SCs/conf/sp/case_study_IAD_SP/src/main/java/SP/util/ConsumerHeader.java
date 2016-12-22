package SP.util;

import org.switchyard.Context;

public class ConsumerHeader {

	public static boolean checkAuthentification(Context context) {

		String username = "";
		String password = "";

		if (context.getPropertyValue("username") != null) {
			username = context.getPropertyValue("username").toString();

			System.out.println("The user name : " + username);
		}

		if (context.getPropertyValue("password") != null) {
			password = context.getPropertyValue("password").toString();

			System.out.println("The password : " + password);
		}

		// TODO Auto-generated stub, Please modify the default username and password
		if (username.equals("admin") && password.equals("pass")) {
			return true;
		} else {
			return false;
		}
	}

	public static String getConsumerState(Context context) {

		if (context.getPropertyValue("state_header") != null)
			return context.getPropertyValue("state_header").toString();
		else
			return "";

	}
}
