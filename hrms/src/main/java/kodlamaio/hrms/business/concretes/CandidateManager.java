package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.ErrorResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao _candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		_candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {

		if (candidate.getFirstName().isEmpty() || candidate.getLastName().isEmpty() || candidate.getEMail().isEmpty()
				|| candidate.getPassword().isEmpty() || candidate.getNationalityId().isEmpty()
				|| candidate.getDateOfBirth() == null) {
			return new ErrorResult("Hiçbir alan bos bırakılamaz!");

		}
		if (!checkIfRealPerson(candidate)) {
			return new ErrorResult("Hatalı kişi");
		}
		_candidateDao.save(candidate);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result delete(Candidate jobseeker) {
		_candidateDao.delete(jobseeker);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(Candidate jobseeker) {
		return new SuccessResult("");
	}

	@Override
	public DataResult<List<Candidate>> getall() {
		return new SuccessDataResult<List<Candidate>>(_candidateDao.findAll());
	}

	public boolean checkIfRealPerson(Candidate candidate) {
		return true;
		// _userCheckService.checkIfRealPerson(candidate.getNationalityId(),
		// candidate.getFirstName(), candidate.getLastName(),
		// candidate.getDateOfBirth());

	}
}
