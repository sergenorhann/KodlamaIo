package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	Result add(JobSeeker jobseeker, String passwordAgain);

	Result delete(JobSeeker jobseeker);

	Result update(JobSeeker jobseeker);

	DataResult<List<JobSeeker>> getall();
}