package eCommerce.GoogleAuth;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.Customer;

public class GoogleAuthManager {
	
	private CustomerService _customerService;
	private LoggerService _loggerService;
	
	public GoogleAuthManager(CustomerService customerService, LoggerService loggerService) {
		super();
		_customerService = customerService;
		_loggerService = loggerService;
	}
	
	public void login(Customer customer) {
		if (_customerService.get(customer) != null) {
			_loggerService.log("Başarıyla giriş yaptınız : " + customer.getFirstName());
		}
		else
		{
			_loggerService.log("Bu kullanıcı sistemde bulunamadı");
		}
	}


	public void register(Customer customer) {
		if (_customerService.get(customer) == null) {
			_loggerService.log("Başarıyla kayıt oldunuz : " + customer.getFirstName());
		}
		else
		{
			_loggerService.log("Bu kullanıcı sisteme zaten kayıtlı");
		}
	}
}
