package com.volmar.demorestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.volmar.demorestapi.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {


}
