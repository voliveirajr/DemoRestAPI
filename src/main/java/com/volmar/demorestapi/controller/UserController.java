package com.volmar.demorestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.volmar.demorestapi.model.User;
import com.volmar.demorestapi.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/user", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping
	public Iterable<User> getAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public Resource<User> retrieveUser() {
		userService.
	}
}
