package com.tcorp.leboncoin.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.Category;
import com.tcorp.leboncoin.service.CategoryService;

@RestController
public class CategoryController {
	private CategoryService service;

	public CategoryController(CategoryService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public int addCategory(@RequestBody Category category) {
		
		return service.addCategory(category);
	}

}
