package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);

	Result delete(Employer employer);

	Result update(Employer employer);

	DataResult<List<Employer>> getAll();
}
