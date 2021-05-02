package KodlamaIo;

public class User {
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _password;
	private int _courseId;
	
	public User() {
	}

	public User(int id, String firstName, String lastName, String eMail, String password, int courseId) {
		this();
		_id = id;
		_firstName = firstName;
		_lastName = lastName;
		_eMail = eMail;
		_password = password;
		_courseId = courseId;
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
	public String geEMail() {
		return _eMail;
	}
	public void setEMail(String eMail) {
		_eMail = eMail;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		_password = password;
	}
	public void setCourseId(int courseId)
	{
		_courseId=courseId;
	}
	public int getCourseId()
	{
		return _courseId;
	}
}