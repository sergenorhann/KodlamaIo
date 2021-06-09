package kodlamaio.hrms.business.abstracts;

import java.time.LocalDate;

public interface UserCheckService {
	public boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, LocalDate dateOfBirth);
}
