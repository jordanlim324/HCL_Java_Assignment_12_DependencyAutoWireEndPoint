package com.jcl.Day12.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcl.Day12.Service.UserService;

//@Controller
@RestController
public class Controller {
		//Autowire By Type
		@Autowired
		//Autowire By Qualifier
		@Qualifier("UserServiceNewImpl")	
		UserService userServiceNewImpl;
		//UserService userServiceImpl; 
		
		
		//Field Based Dependency Injection
		//UserService userService;
		
		//Constructor Based Dependency Injection
		//@Autowired
		//public UserController(UserService userService) {
		//	System.out.println("Constructor DI");
		//	this.userService = userService;
		//}
		
		//Setter Based Dependency Injection
		//@Autowired
		//public void setUserService(UserService userService) {
		//	System.out.println("Setter DI");
		//	this.userService = userService;
		//}
		
		//End-Point
		@GetMapping("/test")
		public void getUsers() {
			//userService.getUsers();
			//userServiceImpl.getUsers();
			userServiceNewImpl.getUser();
		}
}
