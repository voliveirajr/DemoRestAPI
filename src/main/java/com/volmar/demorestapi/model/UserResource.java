package com.volmar.demorestapi.model;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;

@Getter
public class UserResource extends ResourceSupport {
	private final User user;

	public UserResource(User user) {
		super();
		this.user = user;
	}

}
