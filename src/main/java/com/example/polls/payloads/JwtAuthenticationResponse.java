package com.example.polls.payloads;

public class JwtAuthenticationResponse {
	private String message;
	private Boolean success;
	private String accessToken;
	private String tokenType = "Bearer";
	public JwtAuthenticationResponse(String accessToken, String message, Boolean success) {
		super();
		this.accessToken = accessToken;
		this.message  = message;
		this.success = success;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	

}
