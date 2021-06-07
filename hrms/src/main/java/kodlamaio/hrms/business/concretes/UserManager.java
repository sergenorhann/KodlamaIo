package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
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
	public Result add(User user) {
		_userDao.save(user);
		return new SuccessResult("");
	}

	@Override
	public Result delete(User user) {
		_userDao.delete(user);
		return new SuccessResult("");
	}

	@Override
	public Result update(User user) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(_userDao.findAll());
	}

}
