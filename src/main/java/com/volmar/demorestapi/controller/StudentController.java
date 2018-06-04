package com.volmar.demorestapi.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.volmar.demorestapi.model.Student;
import com.volmar.demorestapi.service.StudentService;

@RestController
@RequestMapping(value = "/api/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class StudentController {

	@Autowired
	@Qualifier("v1")
	StudentService studentserviceV1;

	@Autowired
	@Qualifier("v2")
	StudentService studentserviceV2;

	@RequestMapping(value = "/v1/student", method = RequestMethod.GET)
	public Iterable<Student> studentV1() {
		return studentserviceV1.findAll();
	}

	@RequestMapping(value = "/v2/student", method = RequestMethod.GET)
	public Iterable<Student> studentV2() {
		return studentserviceV2.findAll();
	}
	
}
