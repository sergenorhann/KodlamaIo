package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class Customer implements Entity {
	int _id;
	String _firstName;
	String _lastName;
	String _eMail;
	String _password;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, String eMail, String password) {
		super();
		_id = id;
		_firstName = firstName;
		_lastName = lastName;
		_eMail = eMail;
		_password = password;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String geteMail() {
		return _eMail;
	}

	public void seteMail(String eMail) {
		_eMail = eMail;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

}
