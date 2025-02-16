package com.ts.service;

public class LoginService {
	
	public String login(String username, String password) {
		if((username == null || username.length() == 0) ||(password == null || password.length() == 0))
			return "invalid input";
		if(username.equalsIgnoreCase("raj")&& password.equalsIgnoreCase("rani"))
			return "Valid Credentials";
		else
			return "invalid Credentials";
		
	}
	

}
