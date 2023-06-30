package com.externshipproject.FoodOrderingSystemTeam110.model;
public class RegisterUserRequest {
    private String username;
    private String password;
    private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RegisterUserRequest(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public RegisterUserRequest() {
		super();
	}
	public RegisterUserRequest(String username) {
		super();
		this.username = username;
	}
}