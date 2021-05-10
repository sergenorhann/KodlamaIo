package eCommerce;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.business.concretes.GoogleAuthManagerAdapter;
import eCommerce.core.concretes.EMailLoggerManager;
import eCommerce.dataAccess.concretes.HipernateCustomerDao;
import eCommerce.dataAccess.concretes.InMemoryCustomerDao;
import eCommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer(1,"Sergen","Orhan","serge@gmail.com","1234567");
		Customer customer2 = new Customer(2,"sdfs","fgsfgd","serge@gmail.com","12334567");
		CustomerManager customerManager = new CustomerManager(new InMemoryCustomerDao(),new EMailLoggerManager());
		customerManager.add(customer1);	
		customerManager.add(customer2);
		
		AuthService authService= new GoogleAuthManagerAdapter(customerManager,new EMailLoggerManager());
		authService.register(customer1);
		authService.login(customer1);
		
		
	}

}
