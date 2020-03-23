package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Login;
import com.faith.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class UserController {

	//Creating instance for interface IUserService
	@Autowired
	private IUserService userService;  

   /*// add user
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
	} */

	/*//List user
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(userService.listUser(), HttpStatus.OK);
	}*/

	//List user by name and password
	@GetMapping("/users/{username}&{password}")
	public ResponseEntity<Login> listUser(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		ResponseEntity<Login> response = null;

		Login user = (Login) userService.findUser(username, password);
		if (user == null) {
			response = new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
		} else
			response = new ResponseEntity<Login>(user, HttpStatus.OK);
		return response;
	}
}
