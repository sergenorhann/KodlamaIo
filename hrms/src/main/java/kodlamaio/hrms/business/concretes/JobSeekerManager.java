package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.ErrorResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.core.utilies.validation.abstracts.EmailValidationService;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao _jobSeekerDao;
	private EmailValidationService _emailValidationService;


	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, EmailValidationService emailValidationService
		) {
		super();
		_jobSeekerDao = jobSeekerDao;
		_emailValidationService = emailValidationService;

	}

	@Override
	public Result add(JobSeeker jobseeker, String passwordAgain) {

		if (jobseeker.getFirstName().isEmpty() || jobseeker.getLastName().isEmpty() || jobseeker.getEmail().isEmpty()
				|| jobseeker.getPassword().isEmpty() || jobseeker.getNationalityId().isEmpty()
				|| jobseeker.getDateOfBirth() == null) {
			return new ErrorResult("Hiçbir alan bos bırakılamaz!");

		} else if (!checkIfRealPerson(jobseeker)) {
			return new ErrorResult("Hatalı kişi");
		} else if (_jobSeekerDao.getByEmail(jobseeker.getEmail()) != null) {
			return new ErrorResult("Bu email zaten sisteme kayıtlı");
		} else if (_jobSeekerDao.getByNationalityId(jobseeker.getNationalityId()) != null) {
			return new ErrorResult("Bu TcNo zaten sisteme kayıtlı");
		} else if (!passwordAgain.equals(jobseeker.getPassword())) {
			return new ErrorResult("Şifreler uyumsuz");
		} else if (!_emailValidationService.sendMail(jobseeker)) {
			return new ErrorResult("E-posta doğrulaması başarısız");
		}
		_jobSeekerDao.save(jobseeker);
		return new SuccessResult("Eklendi");

	}

	@Override
	public Result delete(JobSeeker jobseeker) {
		_jobSeekerDao.delete(jobseeker);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(JobSeeker jobseeker) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<JobSeeker>> getall() {
		return new SuccessDataResult<List<JobSeeker>>(_jobSeekerDao.findAll());
	}

	public boolean checkIfRealPerson(JobSeeker candidate) {
		return true;
		// return _userCheckService.checkIfRealPerson(candidate.getNationalityId(),
		// candidate.getFirstName(), candidate.getLastName(),
		// candidate.getDateOfBirth());
	}
}
