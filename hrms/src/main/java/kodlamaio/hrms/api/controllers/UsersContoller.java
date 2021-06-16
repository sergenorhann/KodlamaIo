package kodlamaio.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;


@RestController
@RequestMapping("/api/users")
public class UsersContoller {


	@Autowired
	public UsersContoller(UserService userService) {
		super();

	}

//	@GetMapping("/getall")
//	public DataResult<List<User>> getAll() {
//		return _userService.getAll();
//	}
//
//	@PostMapping("/add")
//	public Result add(@RequestBody User user) {
//		return _userService.add(user);
//	}
}
