package com.tcorp.leboncoin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.Visitor;
import com.tcorp.leboncoin.repository.VisitorRepository;
import com.tcorp.leboncoin.service.VisitorService;

@RestController
public class VisitorController {
	private VisitorService service;

	public VisitorController(VisitorService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(value="/visitors",method=RequestMethod.POST)
	public long addVisitor(@RequestBody Visitor visitor) {
		return service.addVisitor(visitor);
	}
	
	@RequestMapping(value="/visitors/{id}",method=RequestMethod.GET)
	public Visitor getVisitor(@PathVariable("id") int id) {
		return service.getVisitor(id);
	}
	
	@RequestMapping(value="/visitors",method=RequestMethod.GET)
	public List<Visitor> getVisitors(){
		return service.getVistors();
	}
	
	

}
