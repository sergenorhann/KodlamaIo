package interfaceAndAbstractDemo.Concrete;

import interfaceAndAbstractDemo.Abstract.CustomerCheckService;
import interfaceAndAbstractDemo.Entities.Customer;

public class CustomerCheckManager  implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
