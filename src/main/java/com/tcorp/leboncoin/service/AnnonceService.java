package com.tcorp.leboncoin.service;

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
		
	   System.out.println("hello gabok");
	   
	   System.out.println("idc service  "+idc);
	   System.out.println("id  service "+id);
	   System.out.println("annonce "+annonce.toString());
	   User user= repoUser.findById(id).get();
	   System.out.println("hello joyeux hjkk");
	   System.out.println(user.toString());   
	   annonce.setUser(user);
	   Category cat=repoCat.findById(idc).get();
	   System.out.println(cat.toString());
	   annonce.setCategory(cat);
	   System.out.println(annonce.toString());
	   return repo.save(annonce).getIdAnnonce();
	   
	   
	}

}
