package com.neosoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor@Data
public class JwtResponse {

	private User user;
	private String jwtToken;
	public JwtResponse(User user2, String newGeneratedToken) {
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
}

