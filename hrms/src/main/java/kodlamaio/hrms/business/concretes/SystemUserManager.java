package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService {

	private SystemUserDao _systemUserDao;

	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		_systemUserDao = systemUserDao;
	}

	@Override
	public Result add(SystemUser systemUser) {
		_systemUserDao.save(systemUser);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result delete(SystemUser systemUser) {
		_systemUserDao.delete(systemUser);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(SystemUser systemUser) {

		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<List<SystemUser>> getAll() {
		return new SuccessDataResult<List<SystemUser>>(_systemUserDao.findAll());
	}

}
