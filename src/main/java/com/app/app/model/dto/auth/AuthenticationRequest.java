package com.app.app.model.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {
	
	private String login;  // 
	
	private String password;
	
	

}
