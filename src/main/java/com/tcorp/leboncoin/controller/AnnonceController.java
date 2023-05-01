package com.tcorp.leboncoin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.Annonce;
import com.tcorp.leboncoin.service.AnnonceService;

@RestController
public class AnnonceController {
	private AnnonceService service;

	public AnnonceController(AnnonceService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(value="/users/{id}/category/{idc}/annonce", method=RequestMethod.POST)
	public int addAnnonce(@PathVariable("id") int id, @PathVariable("idc") int idc,@RequestBody Annonce annonce) {
		System.out.println("hello");
		System.out.println("id"+id);
		System.out.println("idc"+idc);
		System.out.println(""+annonce.toString());
		return service.addAnnonce(id, idc, annonce);
	}
	
	 

}
