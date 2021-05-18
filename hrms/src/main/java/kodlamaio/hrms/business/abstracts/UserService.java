package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	List<User> getAll();
}
