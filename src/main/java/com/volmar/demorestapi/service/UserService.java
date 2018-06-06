package com.volmar.demorestapi.service;

import java.util.Optional;

import com.volmar.demorestapi.model.User;

public interface UserService {

	Iterable<User> findAll();

	User save(User user);

	void removeUser(String id);

	Optional<User> findByID(String id);

}
