package com.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("someuser");
		boolean isValidUserPassword = password.equalsIgnoreCase("password");
		
		return isValidUserName && isValidUserPassword;
	};
}
