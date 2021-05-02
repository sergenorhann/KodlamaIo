package interfaces2;

public class CustomerManager {
	
	ICustomerDal _customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		_customerDal = customerDal;
	}

	public void add() {
		_customerDal.add();
	}
}
