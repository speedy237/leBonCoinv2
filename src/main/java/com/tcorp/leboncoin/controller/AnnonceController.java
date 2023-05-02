package com.tcorp.leboncoin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.Annonce;
import com.tcorp.leboncoin.entity.Image;
import com.tcorp.leboncoin.service.AnnonceService;
import com.tcorp.leboncoin.service.CategoryService;
import com.tcorp.leboncoin.service.ImageService;

@RestController
public class AnnonceController {
	private AnnonceService service;
	 

	public AnnonceController(AnnonceService serviceA) {
		super();
		this.service = serviceA;
	}

	@RequestMapping(value="/users/{id}/category/{idc}/annonce", method=RequestMethod.POST)
	public int addAnnonce(@PathVariable(value="id") int id, @PathVariable(value="idc") int idc,@RequestBody Annonce annonce) {
		 
		return service.addAnnonce(id, idc, annonce);
	} 
	
	@RequestMapping(value="/users/{id}/category/{idc}/annonce",method=RequestMethod.GET)
	public List<Annonce> getAnnonces(){
		  return service.getAnnonces();
	}


}
