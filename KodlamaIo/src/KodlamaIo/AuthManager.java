package KodlamaIo;

public class AuthManager {
	
	public void login(User user) {
		System.out.println("Welcome : " + user.getFirstName());
	}
	
	public void register(User user){
		System.out.println("Welcome : " + user.getFirstName());
	}
}
