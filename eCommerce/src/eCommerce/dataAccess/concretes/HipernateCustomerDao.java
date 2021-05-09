package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class HipernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi : " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {		
	}

	@Override
	public void update(Customer customer) {
		
	}

	@Override
	public Customer get(Customer customer) {
		return null;
	}
	
	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getByMail(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}

}
