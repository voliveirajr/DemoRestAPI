package com.volmar.demorestapi.service;

import java.util.Optional;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import com.volmar.demorestapi.model.User;
import com.volmar.demorestapi.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findByID(String id) {
		Optional<User> user =userRepository.findById(id);
		
		if(!user.isPresent())
			throw new Exception();
		Resource<User> resource = new Resource<User>(user.get());
		
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).findAll());
		resource.add(linkTo.withRel("all-users"));
	}

	@Override
	public void removeUser(String id) {
    	User us = new User();
    	us.setId(id);
    	userRepository.delete(us);		
	}

}
