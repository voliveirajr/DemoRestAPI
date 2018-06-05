package com.volmar.demorestapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Document
public class User {
	@Id
	public String id;
	public String username;
	public String name;
	public String surname;
	public List<Role> roles;

	public User(String username, String name, String surname, List<Role> roles) {
		super();
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.roles = roles;
	}

}
