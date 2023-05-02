package com.tcorp.leboncoin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcorp.leboncoin.entity.Image;
import com.tcorp.leboncoin.repository.ImageRepository;

@Service
public class ImageService {
	
	
	private ImageRepository repo;
	
	
	private ImageService(ImageRepository repo) {
		this.repo=repo;
		
	}
	
	public String addImage(Image image) {
		return repo.save(image).getUrl();
	}
	
	public Image getImgage(int idImage) {
		return repo.findById(idImage).get();
		
	}
	
	public List<Image> getAllImage() {
		return repo.findAll();
	}

}
