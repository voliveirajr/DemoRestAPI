package com.volmar.demorestapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.volmar.demorestapi.model.Student;
import com.volmar.demorestapi.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	    @Autowired
	    StudentRepository studentRepository;
	    
	    @RequestMapping(method=RequestMethod.GET)
	    public Iterable<Student> student() {
	        return studentRepository.findAll();
	    }

	    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public Student create(@RequestBody Student student) {
	        return studentRepository.save(student);
	    }

	    @RequestMapping(method=RequestMethod.GET, value = "/{id}")
	    public Optional<Student> read(@PathVariable String id) {
	        return studentRepository.findById(id);
	    }

	    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void update(@RequestBody Student student) {
	        studentRepository.save(student);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	    	Student st = new Student();
	    	st.setId(id);
	    	studentRepository.delete(st); 
	    }
}
