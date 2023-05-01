package com.tcorp.leboncoin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcorp.leboncoin.entity.User;
import com.tcorp.leboncoin.repository.UserRepository;

@Service
public class UserService {
	private UserRepository repo;

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public int addUser(User user) {
		return repo.save(user).getId();
	}
	
	public User getUser(int id) {
		return repo.findById(id).get();
	}
	
	public List<User> getUsers(){
		
		return repo.findAll();
		
	}
	

}
