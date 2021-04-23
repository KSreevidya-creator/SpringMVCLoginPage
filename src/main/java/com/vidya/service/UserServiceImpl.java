package com.vidya.service;

import com.vidya.Login;
import com.vidya.User;
import com.vidya.dao.UserRepository;

public class UserServiceImpl implements UserService {
	
	public UserRepository userRepo;

	public void addUser(User user) {
		
		userRepo.save(user);
		// TODO Auto-generated method stub
		
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userRepo.findById(login.getUsername()).get();
	}

}
