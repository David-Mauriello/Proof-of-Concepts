package com.example.featurecreep.security.jwt.payload.response;

import lombok.Data;

@Data
public class MessageResponse {
	private String message;
	
	public MessageResponse(String message) {
		this.message = message;
	}
}
