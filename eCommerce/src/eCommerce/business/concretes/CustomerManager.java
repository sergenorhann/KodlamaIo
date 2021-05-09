package eCommerce.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao _userDao;
	private LoggerService _loggerService;

	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	Pattern pattern = Pattern.compile(regex);

	public CustomerManager(CustomerDao userDao, LoggerService loggerService) {
		super();
		_userDao = userDao;
		_loggerService = loggerService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (customer.getPassword().length() >= 6) {
			if (customer.getFirstName().length() >= 2 && customer.getLastName().length() >= 2) {
				Matcher matcher = pattern.matcher(customer.geteMail());
				if (matcher.matches()) {
					if (_userDao.getByMail(customer.geteMail()) != null) {
						System.out.println("Bu E-Posta adresi sisteme kayıtlı");
						return;
					}
					_userDao.add(customer);
					_loggerService.log(customer.getFirstName());
				} else {
					System.out.println("E-Posta adresi hatalı");
					return;
				}

			} else {
				System.out.println("Ad ve Soyad en az 2 karakter uzunluğunda olmalıdır.");
				return;
			}

		} else {
			System.out.println("Şifreniz en az 6 karakter uzunluğunda olmalıdır.");
			return;
		}
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer get(Customer customer) {
		// TODO Auto-generated method stub
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
