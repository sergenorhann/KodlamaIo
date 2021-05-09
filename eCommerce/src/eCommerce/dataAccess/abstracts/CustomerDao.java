package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer user);
	Customer get(Customer customer);
	Customer getByMail(String eMail);
	List<Customer> getAll();
}
