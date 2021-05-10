package eCommerce.business.concretes;


import eCommerce.GoogleAuth.GoogleAuthManager;
import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.Customer;


public class GoogleAuthManagerAdapter implements AuthService{

	private CustomerService _customerService;
	private LoggerService _loggerService;
	
	public GoogleAuthManagerAdapter(CustomerService customerService, LoggerService loggerService) {
		super();
		_customerService = customerService;
		_loggerService = loggerService;
	}
	
	@Override
	public void login(Customer customer) {
		GoogleAuthManager authManager = new GoogleAuthManager(_customerService, _loggerService);
		authManager.login(customer);
	}

	@Override
	public void register(Customer customer) {
		// TODO Auto-generated method stub
		GoogleAuthManager authManager = new GoogleAuthManager(_customerService, _loggerService);
		authManager.register(customer);
	}
	
}
