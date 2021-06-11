package kodlamaio.hrms.core.utilies.validation.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilies.validation.abstracts.EmailValidationService;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class EmailValidationManager implements EmailValidationService {

	@Override
	public boolean sendMail(User user) {
		return true;
	}

}
