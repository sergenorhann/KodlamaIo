package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);

	Result delete(JobAdvertisement jobAdvertisement);

	Result update(JobAdvertisement jobAdvertisement);

	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getByStatusAndReleaseDate();

	DataResult<List<JobAdvertisement>> getByStatus();
	
	DataResult<List<JobAdvertisement>> getByEmployersIdAndStatus(int employerId);
}
