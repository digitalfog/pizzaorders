package ua.pp.kaeltas.pizzaorders.service;

import ua.pp.kaeltas.pizzaorders.domain.Customer;
import ua.pp.kaeltas.pizzaorders.domain.Order;

public interface OrderService {

	public abstract Order placeNewOrder(Customer customer, Integer... pizzasID);

}