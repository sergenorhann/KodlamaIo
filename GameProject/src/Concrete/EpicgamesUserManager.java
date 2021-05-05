package Concrete;

import Entities.User;
import Abstract.UserCheckService;

public class EpicgamesUserManager extends BaseUserManager{

	private UserCheckService _UserCheckService;

	public EpicgamesUserManager(UserCheckService UserCheckService) {
		_UserCheckService = UserCheckService;
	}

	@Override
	public void add(User user) {
		if (_UserCheckService.checkIfRealPerson(user)) {
			super.add(user);
		} else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void delete(User user) {
		super.delete(user);
	}

	@Override
	public void update(User user) {
		if (_UserCheckService.checkIfRealPerson(user)) {
			super.update(user);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
