package kodlamaio.hrms.business.abstracts;

import java.time.LocalDate;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface UserCheckService {
	public boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, LocalDate dateOfBirth);
}
