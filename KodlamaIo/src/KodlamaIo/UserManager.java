package KodlamaIo;

public class UserManager {
	
	public void add(User user) {
		System.out.println("User Added: " + user.getFirstName());
	}
	
	public void delete(User user)  {
		System.out.println("User Deleted : " + user.getFirstName());
	}

	public void update(User user)  {
		System.out.println("User Updated : " + user.getFirstName());
	}
}
