package kodlamaio.hrms.core.utilies.validation.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface EmailValidationService {
	public boolean sendMail(User user);
}
