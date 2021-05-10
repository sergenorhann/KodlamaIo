package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.Customer;

public class AuthManager implements AuthService {

	private CustomerService _customerService;
	private LoggerService _loggerService;

	public AuthManager(CustomerService customerService, LoggerService loggerService) {
		super();
		_customerService = customerService;
		_loggerService = loggerService;
	}

	@Override
	public void login(Customer customer) {
		if (_customerService.get(customer) != null) {
			_loggerService.log("Başarıyla giriş yaptınız : " + customer.getFirstName());
		}
		else
		{
			_loggerService.log("Bu kullanıcı sistemde bulunamadı");
		}
	}

	@Override
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
