package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
@Service
public class JobSeeekerManager implements JobSeekerService {

	private JobSeekerDao _jobSeekerDao;
	@Autowired
	public JobSeeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		_jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(JobSeeker jobseeker) {
		_jobSeekerDao.save(jobseeker);
		return new SuccessResult("");
	}

	@Override
	public Result delete(JobSeeker jobseeker) {
		_jobSeekerDao.delete(jobseeker);
		return new SuccessResult("");
	}

	@Override
	public Result update(JobSeeker jobseeker) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<JobSeeker>> getall() {
		return null;
	}

}
