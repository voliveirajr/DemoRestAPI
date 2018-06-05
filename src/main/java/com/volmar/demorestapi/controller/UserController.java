package com.volmar.demorestapi.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/v1/student", method = RequestMethod.GET)
	public Iterable<User> studentV1() {
		return userService.findAll();
	}

}
