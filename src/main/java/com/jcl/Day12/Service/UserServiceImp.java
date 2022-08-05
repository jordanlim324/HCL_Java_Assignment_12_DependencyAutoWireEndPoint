package com.jcl.Day12.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jcl.Day12.UserRepository.UserRepository;

public class UserServiceImp {
	//Field Based Dependency Injection
		@Autowired
		UserRepository userRepo;
		
		@Autowired
		public UserServiceImp(UserRepository userRepo) {
			this.userRepo = userRepo;
		}
		
		//@Autowired
		//public void setUserRepo(UserRepository userRepo) {
		//	System.out.println("Setter DI from service");
		//	this.userRepo = userRepo;
		//}
		
		public void getUser() {
			//userRepo.getUsers();
			System.out.println("From UserServiceImpl");

		}
}
