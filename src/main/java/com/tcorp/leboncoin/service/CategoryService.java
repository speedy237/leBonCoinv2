package com.tcorp.leboncoin.service;

import org.springframework.stereotype.Service;

import com.tcorp.leboncoin.entity.Category;
import com.tcorp.leboncoin.repository.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository repo;

	public CategoryService(CategoryRepository repo) {
		super();
		this.repo = repo;
	}
	
	public int addCategory(Category category) {
		return repo.save(category).getIdCategory();
	}
	

}
