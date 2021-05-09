package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class InMemoryCustomerDao implements CustomerDao{
	
	ArrayList<Customer> _customers;
	
	public InMemoryCustomerDao() {
		_customers = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer customer) {
		_customers.add(customer);
		System.out.println("Eklendi");
	}

	@Override
	public void delete(Customer customer) {
		_customers.remove(customer);
		System.out.println("Silindi");
	}

	@Override
	public void update(Customer customer) {
		_customers.set(_customers.indexOf(customer), customer);
		System.out.println("güncellendi");
	}

	@Override
	public Customer get(Customer customer) {
		return _customers.get(_customers.indexOf(customer));
	}

	@Override
	public Customer getByMail(String eMail) {
		return _customers.stream().filter(c->c.geteMail()==eMail).findFirst().orElse(null);
	}

	@Override
	public List<Customer> getAll() {
		return _customers;
	}

}
