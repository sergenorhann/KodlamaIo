package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao _jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		_jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		return new SuccessResult("");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		return new SuccessResult("");
	}

	@Override
	public Result update(JobPosition jobPosition) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		System.out.println(_jobPositionDao.findAll());
		System.out.println("--" + _jobPositionDao.count());
		return new SuccessDataResult<List<JobPosition>>(_jobPositionDao.findAll());
	}

}
