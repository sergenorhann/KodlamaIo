package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService _jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		_jobAdvertisementService = jobAdvertisementService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return _jobAdvertisementService.add(jobAdvertisement);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody JobAdvertisement jobAdvertisement) {
		return _jobAdvertisementService.delete(jobAdvertisement);
	}

	@PostMapping("/update")
	public Result update(@RequestBody JobAdvertisement jobAdvertisement) {
		return _jobAdvertisementService.update(jobAdvertisement);
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return _jobAdvertisementService.getAll();
	}

	@GetMapping("/getbystatusandreleasedate")
	public DataResult<List<JobAdvertisement>> getAllByIsActiveSortedDate() {
		return _jobAdvertisementService.getByStatusAndReleaseDate();
	}

	@GetMapping("/getbystatus")
	public DataResult<List<JobAdvertisement>> getByStatus() {
		return _jobAdvertisementService.getByStatus();
	}

	@GetMapping("/getbyemployersidandstatus")
	public DataResult<List<JobAdvertisement>> getByEmployersIdAndStatus(@RequestParam int employerId) {
		return _jobAdvertisementService.getByEmployersIdAndStatus(employerId);
	}

}
