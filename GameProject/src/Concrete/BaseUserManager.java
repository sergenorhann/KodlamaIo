package Concrete;

import Abstract.UserService;
import Entities.User;

public class BaseUserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("Added to Database : " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted from Database : " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Updated : " + user.getFirstName());
	}

}