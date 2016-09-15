package commerce.service;

import commerce.input.InputProduct;
import commerce.input.Order;

import commerce.output.RequiredProduct;

public interface Cart {

	public void addProduct(InputProduct inputProduct);

	public RequiredProduct getProduct(Order order);

}
