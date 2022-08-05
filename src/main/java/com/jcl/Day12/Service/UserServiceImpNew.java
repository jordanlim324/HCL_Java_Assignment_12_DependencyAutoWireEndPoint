package com.jcl.Day12.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jcl.Day12.UserRepository.UserRepository;

public class UserServiceImpNew {
	@Autowired
	UserRepository userRepo;
	
	public void getUser() {
		System.out.println("From UserServiceNewImpl");
	}
}
