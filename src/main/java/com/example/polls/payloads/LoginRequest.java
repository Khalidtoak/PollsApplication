package com.example.polls.payloads;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String userNameOrEmail;
	  public String getUserNameOrEmail() {
		return userNameOrEmail;
	}
	public void setUserNameOrEmail(String userNameOrEmail) {
		this.userNameOrEmail = userNameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotBlank
	    private String password;


}
