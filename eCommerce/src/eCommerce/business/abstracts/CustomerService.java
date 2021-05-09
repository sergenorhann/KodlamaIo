package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(Customer customer);
	Customer getByMail(String eMail);
	List<Customer> getAll();
}
