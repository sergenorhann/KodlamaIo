package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.ErrorResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.core.utilies.validation.abstracts.EmailValidationService;
import kodlamaio.hrms.core.utilies.validation.abstracts.SystemUserValidationService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao _employerDao;
	private EmailValidationService _emailValidationService;
	private SystemUserValidationService _systemUserValidationService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailValidationService emailValidationService,
			SystemUserValidationService systemUserValidationService) {
		super();
		_employerDao = employerDao;
		_emailValidationService = emailValidationService;
		_systemUserValidationService = systemUserValidationService;
	}

	@Override
	public Result add(Employer employer, String passwordAgain) {
		if (employer.getCompanyName().isEmpty() || employer.getPhoneNumber().isEmpty()
				|| employer.getWebsite().isEmpty() || employer.getEmail().isEmpty()
				|| employer.getPassword().isEmpty()) {
			return new ErrorResult("Hiçbir alan bos bırakılamaz!");
		} else if (_employerDao.getByEmail(employer.getEmail()) != null) {
			return new ErrorResult("Bu email zaten sisteme kayıtlı");
		} else if (!passwordAgain.equals(employer.getPassword())) {
			return new ErrorResult("Şifreler uyumsuz");
		} else if (!_emailValidationService.sendMail(employer) || !_systemUserValidationService.isValid(employer)) {
			return new ErrorResult("Doğrulama başarısız");
		} else if (!employer.getWebsite().contains(employer.getEmail().split("@")[0])) {
			return new ErrorResult("Web siteniz ile E-postanız aynı domaine sahip değil.");
		}

		_employerDao.save(employer);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result delete(Employer employer) {
		_employerDao.delete(employer);
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
