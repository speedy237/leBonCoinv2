package com.tcorp.leboncoin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcorp.leboncoin.entity.Visitor;
import com.tcorp.leboncoin.repository.VisitorRepository;

@Service
public class VisitorService {
	private VisitorRepository repo;

	public VisitorService(VisitorRepository repo) {
		super();
		this.repo = repo;
	}
	
	public int addVisitor(Visitor visitor) {
		System.out.println("insertion de un visitor");
		System.out.println(visitor.toString());
		return repo.save(visitor).getId();
	}
	public Visitor getVisitor(int id) {
		return repo.findById(id).get();
	}
	
	public List<Visitor> getVistors(){
		return repo.findAll();
	}
	

}
