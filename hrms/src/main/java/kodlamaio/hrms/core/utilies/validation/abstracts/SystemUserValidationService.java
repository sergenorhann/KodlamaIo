package kodlamaio.hrms.core.utilies.validation.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface SystemUserValidationService {
	public boolean isValid(User user);
}
