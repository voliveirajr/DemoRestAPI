package com.volmar.demorestapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

	@Id
	private String id;
	private Integer registration;
	private String name;

	public Student() {
	};

	public Student(String id, Integer registration, String name) {
		super();
		this.id = id;
		this.registration = registration;
		this.name = name;
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
