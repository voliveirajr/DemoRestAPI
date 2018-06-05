package com.volmar.demorestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.volmar.demorestapi.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
