package com.dto;


public class Person {

	String username;
	
//	@Resource(name = "cat")
	Cat cat;

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	
	
}
