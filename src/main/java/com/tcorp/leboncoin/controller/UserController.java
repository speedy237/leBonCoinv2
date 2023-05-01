package com.tcorp.leboncoin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.User;
import com.tcorp.leboncoin.service.UserService;

@RestController
public class UserController {
	
	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public int addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable("id") int id) {
		return service.getUser(id);
	}
	

}
