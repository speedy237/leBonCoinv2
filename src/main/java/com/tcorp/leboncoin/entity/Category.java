package com.tcorp.leboncoin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long idCategory;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String description;
	
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	

	public long getIdCategory() {
		return idCategory;
	}



	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
