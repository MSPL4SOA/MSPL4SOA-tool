package commerce.service;

import org.switchyard.component.bean.Service;
import javax.inject.Inject;
import org.switchyard.Context;

import commerce.input.InputProduct;
import commerce.input.Order;

import commerce.output.RequiredProduct;

import commerce.state.State_Cart_addProduct;

import commerce.util.ConsumerHeader;

@Service(Cart.class)
public class CartBean implements Cart {

	@Inject
	private Context context;

	@Inject
	State_Cart_addProduct instanceState_Cart_addProduct;

	@Override
	public void addProduct(InputProduct inputProduct) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of Cart : addProduct : ********//");

		System.out.println("id : " + inputProduct.getId());
		System.out.println("name : " + inputProduct.getName());
		System.out.println("qte : " + inputProduct.getQte());

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		instanceState_Cart_addProduct.setState(instanceState_Cart_addProduct
				.getState() + " Cart addProduct");

	}

	@Override
	public RequiredProduct getProduct(Order order) {
		// TODO Auto-generated stub

		System.out
				.println("\\\\******* The output of Cart : getProduct : ********//");

		System.out.println("id : " + order.getId());

		RequiredProduct out = new RequiredProduct();

		out.setId("getProduct");

		out.setName("getProduct");

		boolean checkAuth = ConsumerHeader.checkAuthentification(context);
		if (checkAuth == true) {
			// TODO Auto-generated stub
			System.out.println("Correct authentification");
		} else {
			// TODO Auto-generated stub
			System.out.println("Incorrect authentification");
		}

		return out;
	}

}
