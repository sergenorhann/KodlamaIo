package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	Result add(Candidate candidate, String passwordAgain);

	Result delete(Candidate candidate);

	Result update(Candidate candidate);

	DataResult<List<Candidate>> getall();
}