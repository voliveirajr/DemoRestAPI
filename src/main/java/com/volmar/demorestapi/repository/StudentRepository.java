package com.volmar.demorestapi.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volmar.demorestapi.model.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {

	List<Student> findByName(String name);

}
