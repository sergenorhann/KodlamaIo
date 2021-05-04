package interfaceAndAbstractDemo.Concrete;

import interfaceAndAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAndAbstractDemo.Abstract.CustomerCheckService;
import interfaceAndAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
