package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.SystemUser;

public interface SystemUserService {

	Result add(SystemUser systemUser);

	Result delete(SystemUser systemUser);

	Result update(SystemUser systemUser);

	DataResult<List<SystemUser>> getAll();
}
