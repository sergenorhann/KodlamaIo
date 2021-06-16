package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.ErrorResult;
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

		if (jobPosition.getName().isEmpty()) {
			return new ErrorResult("İş pozisyonu boş bırakılamaz.");
		}

		if (!this.isJobPostionNameExist(jobPosition.getName())) {
			return new ErrorResult("İş pozisyonu mevcut");
		}

		_jobPositionDao.save(jobPosition);
		return new SuccessResult("Eklendi.");

	}

	private boolean isJobPostionNameExist(String name) {
		if (_jobPositionDao.findByName(name) != null) {
			return false;
		}
		return true;

	}

	@Override
	public Result delete(JobPosition jobPosition) {
		_jobPositionDao.delete(jobPosition);
		return new SuccessResult("Silindi.");
	}

	@Override
	public Result update(JobPosition jobPosition) {

		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(_jobPositionDao.findAll());
	}

}
