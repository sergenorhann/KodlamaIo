package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao _employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		_employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		_employerDao.save(employer);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result delete(Employer employer) {
		return new SuccessResult("Silindi.");
	}

	@Override
	public Result update(Employer employer) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(_employerDao.findAll());
	}

}
