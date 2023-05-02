package com.tcorp.leboncoin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcorp.leboncoin.entity.Annonce;
import com.tcorp.leboncoin.entity.Image;
import com.tcorp.leboncoin.entity.User;
import com.tcorp.leboncoin.service.AnnonceService;
import com.tcorp.leboncoin.service.ImageService;
import com.tcorp.leboncoin.service.UserService;

@RestController

public class ImageController {
	private ImageService serviceImge;
	private AnnonceService annonceService;
	private UserService userService;
	
	public ImageController(ImageService serviceImge, AnnonceService annonceService, UserService userService) {
		super();
		this.serviceImge = serviceImge;
		this.annonceService = annonceService;
		this.userService = userService;
	}




	@RequestMapping(value="/users/{idU}/annonce/{idA}/image", method=RequestMethod.POST)
	public String addImage(@PathVariable(value="idU") int idU, @PathVariable(value="idA") int idA, @RequestBody Image image) {
		User user=userService.getUser(idU);
		Annonce annonce=annonceService.getAnnonce(idA);
		if(annonce.getUser().getId()==user.getId()) {
			image.setAnnonce(annonce);
			return serviceImge.addImage(image);
		}
		else {
			return "impossible d'ajouter l'image a l'annonce";
			
		}
		
		
		
	}
	
	
	@RequestMapping(value="/users/{idU}/annonce/{idA}/image", method=RequestMethod.GET)
	
	public List<Image> getImage(@PathVariable(value="idU")int idU,@PathVariable(value="idA") int idA){
		
		Annonce annonce=annonceService.getAnnonce(idA);
		User user=userService.getUser(idU);
		List<Image> list=new ArrayList<Image>();
		if(annonce.getUser().getId()==user.getId()) {
			
			List<Image> images=this.serviceImge.getAllImage();
			for(Image im:images) {
				if(im.getAnnonce().getIdAnnonce()==annonce.getIdAnnonce()) {
					list.add(im);
				}
			}
		}
		
		 
		return  list;
	}
	
	
	

	

}
