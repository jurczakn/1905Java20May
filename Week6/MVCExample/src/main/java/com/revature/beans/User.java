package com.revature.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	
	private String username;
	
	@JsonIgnore
	private String password;
	
	private String fullName;

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fullName=" + fullName + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(UserDTO userDTO) {
		this.username = userDTO.getUsername();
		this.password = userDTO.getPassword();
	}

	public User(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
