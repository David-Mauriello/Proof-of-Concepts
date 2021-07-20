package com.example.featurecreep.security.jwt.payload.response;

import java.util.List;

import lombok.Data;

@Data
public class JWTResponse {
	private String token, id, username, email;
	private String type = "Bearer";
	private List<String> roles;
	
	public JWTResponse(String accessToken, String id, String username, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
}
