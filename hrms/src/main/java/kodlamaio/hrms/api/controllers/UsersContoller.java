package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersContoller {
/*
	private UserService _userService;

	@Autowired
	public UsersContoller(UserService userService) {
		super();
		_userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {
		return _userService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return _userService.add(user);
	}*/
}
