package interfaceAndAbstractDemo.Abstract;

import interfaceAndAbstractDemo.Entities.Customer;

public class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to Database : " + customer.getFirstName());
	}
}
