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
/**{
"accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxIiwiaWF0IjoxNTQ4MDg2NTM2LCJleHAiOjE1NDg2OTEzMzZ9.mda2SA-AOfvWdxu6EuG2t5Ir-wjB2zk7LQqS0kzEQTdxEHe63OYmdZbwUuv26zl9IeRUDddEFnjyEHYseT7kKg",
"tokenType": "Bearer"
}**/