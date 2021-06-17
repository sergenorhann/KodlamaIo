package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService _employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		_employerService = employerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employer employer, String passwordAgain) {
		return _employerService.add(employer, passwordAgain);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer) {
		return _employerService.delete(employer);
	}

	@PostMapping("/update")
	public Result update(@RequestBody Employer employer) {
		return _employerService.update(employer);
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll() {
		return _employerService.getAll();
	}
}
