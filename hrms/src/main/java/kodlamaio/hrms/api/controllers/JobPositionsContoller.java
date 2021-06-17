package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsContoller {

	private JobPositionService _jobPositionService;

	@Autowired
	public JobPositionsContoller(JobPositionService jobPositionService) {
		super();
		_jobPositionService = jobPositionService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return _jobPositionService.add(jobPosition);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody JobPosition jobPosition) {
		return _jobPositionService.delete(jobPosition);
	}

	@PostMapping("/update")
	public Result update(@RequestBody JobPosition jobPosition) {
		return _jobPositionService.update(jobPosition);
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll() {
		return _jobPositionService.getAll();
	}

}