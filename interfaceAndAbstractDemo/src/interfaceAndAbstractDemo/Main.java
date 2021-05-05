package interfaceAndAbstractDemo;

import java.time.LocalDate;

import interfaceAndAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAndAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAndAbstractDemo.Entities.Customer;
import interfaceAndAbstractDemo.Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1, "FIRSTNAME", "LASTNAME", LocalDate.of(1111,11,11), "11111111111");
		customerManager.save(customer1);
	}

}