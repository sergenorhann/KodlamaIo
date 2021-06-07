package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface UserCheckService {
	public boolean checkIfRealPerson(JobSeeker jobSeeker);
}
