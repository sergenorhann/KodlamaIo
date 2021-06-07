package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	Result add(JobPosition jobPosition);

	Result delete(JobPosition jobPosition);

	Result update(JobPosition jobPosition);

	DataResult<List<JobPosition>> getAll();
}
