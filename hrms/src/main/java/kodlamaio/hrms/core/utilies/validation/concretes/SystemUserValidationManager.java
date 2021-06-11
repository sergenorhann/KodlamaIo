package kodlamaio.hrms.core.utilies.validation.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilies.validation.abstracts.SystemUserValidationService;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class SystemUserValidationManager implements SystemUserValidationService {

	@Override
	public boolean isValid(User user) {
		return true;
	}

}
