package com.tcorp.leboncoin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcorp.leboncoin.entity.Annonce;
import com.tcorp.leboncoin.entity.Category;
import com.tcorp.leboncoin.entity.User;
import com.tcorp.leboncoin.repository.AnnonceRepository;
import com.tcorp.leboncoin.repository.CategoryRepository;
import com.tcorp.leboncoin.repository.UserRepository;

@Service
public class AnnonceService {
	private UserRepository repoUser;
	private AnnonceRepository repo;
	private CategoryRepository repoCat;
	
	public AnnonceService(UserRepository repoUser, AnnonceRepository repo, CategoryRepository repoCat) {
		super();
		this.repoUser = repoUser;
		this.repo = repo;
		this.repoCat = repoCat;
	}


	public int addAnnonce(int id, int idc ,Annonce annonce ) {
		
	   User user= repoUser.findById(id).get();
	   annonce.setUser(user);
	   Category cat=repoCat.findById(idc).get();
	  // System.out.println(cat.toString());
	    annonce.setCategory(cat);
	   //System.out.println(annonce.toString());
	   return repo.save(annonce).getIdAnnonce();
	   
	   
	}
	
	public Annonce getAnnonce(int id) {
		return repo.findById(id).get();
	}
	
	public List<Annonce> getAnnonces(){
		return repo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
