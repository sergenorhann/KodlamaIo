package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.ErrorResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.core.utilies.validation.abstracts.EmailValidationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao _candidateDao;
	private EmailValidationService _emailValidationService;
	private UserCheckService _userCheckService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, EmailValidationService emailValidationService,
			UserCheckService userCheckService) {
		super();
		_candidateDao = candidateDao;
		_emailValidationService = emailValidationService;
		_userCheckService = userCheckService;
	}

	@Override
	public Result add(Candidate candidate, String passwordAgain) {

		if (candidate.getFirstName().isEmpty() || candidate.getLastName().isEmpty() || candidate.getEmail().isEmpty()
				|| candidate.getPassword().isEmpty() || candidate.getNationalityId().isEmpty()
				|| candidate.getDateOfBirth() == null) {
			return new ErrorResult("Hiçbir alan bos bırakılamaz!");

		} else if (!checkIfRealPerson(candidate)) {
			return new ErrorResult("Hatalı kişi");
		} else if (_candidateDao.findByEmail(candidate.getEmail()) != null) {
			return new ErrorResult("Bu email zaten sisteme kayıtlı");
		} else if (_candidateDao.findByNationalityId(candidate.getNationalityId()) != null) {
			return new ErrorResult("Bu TcNo zaten sisteme kayıtlı");
		} else if (!passwordAgain.equals(candidate.getPassword())) {
			return new ErrorResult("Şifreler uyumsuz");
		} else if (!_emailValidationService.sendMail(candidate)) {
			return new ErrorResult("E-posta doğrulaması başarısız");
		}
		_candidateDao.save(candidate);
		return new SuccessResult("Eklendi");

	}

	@Override
	public Result delete(Candidate candidate) {
		_candidateDao.delete(candidate);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(Candidate candidate) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<Candidate>> getall() {
		return new SuccessDataResult<List<Candidate>>(_candidateDao.findAll());
	}

	public boolean checkIfRealPerson(Candidate candidate) {
		return true;
		// return _userCheckService.checkIfRealPerson(candidate.getNationalityId(),
		// candidate.getFirstName(), candidate.getLastName(),
		// candidate.getDateOfBirth());
	}
}
