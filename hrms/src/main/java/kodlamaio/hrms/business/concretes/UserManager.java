package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;
@Service
public class UserManager implements UserService {

	private UserDao _userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		_userDao = userDao;
	}

	@Override
	public void add(User user) {

	}

	@Override
	public void delete(User user) {
		_userDao.delete(user);
	}

	@Override
	public void update(User user) {

	}

	@Override
	public List<User> getAll() {
		return _userDao.findAll();
	}

}
