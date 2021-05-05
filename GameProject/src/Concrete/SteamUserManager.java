package Concrete;


import Abstract.UserCheckService;
import Entities.User;

public class SteamUserManager extends BaseUserManager{
	private UserCheckService _UserCheckService;

	//geçici çözüm
	public SteamUserManager(UserCheckService UserCheckService) {
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
