package interfaceAndAbstractDemo.Entities;

import java.time.LocalDate;

import interfaceAndAbstractDemo.Abstract.Entity;


public class Customer implements Entity{
	private int _id;
	private String _firstName;
	private String _lastName;
	private LocalDate  _dateOfBirth;
	private String _nationalityId;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, LocalDate  dateOfBirth, String nationalityId) {
		super();
		_id = id;
		_firstName = firstName;
		_lastName = lastName;
		_dateOfBirth = dateOfBirth;
		_nationalityId = nationalityId;
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

	public LocalDate getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return _nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		_nationalityId = nationalityId;
	}

}
