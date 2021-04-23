package com.vidya.service;

import com.vidya.Login;
import com.vidya.User;

public interface UserService {
	
	 void addUser(User user);

	  User validateUser(Login login);
	}
