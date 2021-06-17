package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/candidates")
public class JobSeekersController {

	private JobSeekerService _jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		_jobSeekerService = jobSeekerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker candidate, String passwordAgain) {
		return _jobSeekerService.add(candidate, passwordAgain);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeeker candidate) {
		return _jobSeekerService.delete(candidate);
	}

	@PostMapping("/update")
	public Result update(@RequestBody JobSeeker candidate) {
		return _jobSeekerService.update(candidate);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll() {
		return _jobSeekerService.getall();
	}


}
