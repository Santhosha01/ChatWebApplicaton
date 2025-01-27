package com.santhosh.chatapp;

public class UserWithResponse {
	
	private int id;
	private String name;
	private String username;
	private String email;
	private String password;
	private int isResponse;
		
	public UserWithResponse(int id,String name,String username,String email,String password,int isResponse) {
		this.setId(id);
		this.name=name;
		this.username=username;
		this.email=email;
		this.password=password;
		this.isResponse=isResponse;	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsResponse() {
		return isResponse;
	}

	public void setIsResponse(int isResponse) {
		this.isResponse = isResponse;
	}

}
