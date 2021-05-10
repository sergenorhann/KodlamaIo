package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface AuthService {
	void login(Customer customer);
	void register(Customer customer);
}