package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

	private CandidateService _candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		_candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll() {
		return _candidateService.getall();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate, String passwordAgain) {
		return _candidateService.add(candidate, passwordAgain);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody Candidate candidate) {
		return _candidateService.delete(candidate);
	}

}
