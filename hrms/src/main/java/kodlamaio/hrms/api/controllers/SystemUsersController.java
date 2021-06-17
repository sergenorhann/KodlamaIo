package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemusers")
public class SystemUsersController {

	private SystemUserService _systemUserService;

	@Autowired
	public SystemUsersController(SystemUserService systemUserService) {
		super();
		_systemUserService = systemUserService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody SystemUser systemUser) {
		return _systemUserService.add(systemUser);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody SystemUser systemUser) {
		return _systemUserService.delete(systemUser);
	}

	@PostMapping("/update")
	public Result update(@RequestBody SystemUser systemUser) {
		return _systemUserService.update(systemUser);
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemUser>> getAll()
	{
		return _systemUserService.getAll();
	}
}
