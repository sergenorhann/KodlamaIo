package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao _jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		_jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		_jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		_jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("Silindi.");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.findAll(), "Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusAndReleaseDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(
				_jobAdvertisementDao.getByStatusAndReleaseDate(Sort.by(Sort.Direction.ASC, "releaseDate")));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatus() {
		return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByStatus(true));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployersIdAndStatus(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				_jobAdvertisementDao.getByEmployersIdAndStatus(employerId));
	}

}
