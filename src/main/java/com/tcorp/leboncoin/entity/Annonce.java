package com.tcorp.leboncoin.entity;

import java.sql.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="annonce")
public class Annonce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idAnnonce;
	@Column
	private String title;
	@Column
	private String description;
	@Column(columnDefinition = "Date") 
	private Date create_at;
	@Column(columnDefinition = "Date") 
	private Date update_at;
	@Column
	private boolean avability;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="user_id", nullable=false)
	@JsonIgnore
	private User user;
	
	@OneToMany(mappedBy ="annonce")
	private Set<Comment> comment;
	
	@OneToMany(mappedBy ="annonce")
	private Set<SendMessage> sendMessage;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="idCategory", nullable=false)
	@JsonIgnore
	private Category category;
	
	@OneToMany(mappedBy = "annonce")
	private Set<Like> like;
	
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Annonce(String title, String description, Date create_at, Date update_at, boolean avability) {
		super();
		this.title = title;
		this.description = description;
		this.create_at = create_at;
		this.update_at = update_at;
		this.avability = avability;
	}





	public int getIdAnnonce() {
		return idAnnonce;
	}


	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}


	public Date getUpdate_at() {
		return update_at;
	}


	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}


	public boolean isAvability() {
		return avability;
	}


	public void setAvability(boolean avability) {
		this.avability = avability;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", title=" + title + ", description=" + description + ", create_at="
				+ create_at + ", update_at=" + update_at + ", avability=" + avability + ", user=" + user + ", category="
				+ category + "]";
	}


	public Long getBy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
