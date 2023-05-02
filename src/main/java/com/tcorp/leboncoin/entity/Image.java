package com.tcorp.leboncoin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idImage;
	@Column(nullable=false)
	private String url;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="idAnnonce", nullable=false)
	@JsonIgnore
	private Annonce annonce;
	public Image() {
		super();
	}
	public Image(String url, Annonce annonce) {
		super();
		
		this.url = url;
		this.annonce = annonce;
	}
	public Image(String url) {
		super();
		this.url = url;
	}
	
	 
	public int getIdImage() {
		return idImage;
	}
	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	
	
	
}
