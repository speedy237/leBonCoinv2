package com.tcorp.leboncoin.entity;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="visitor")
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String password;
	@Column
	private String phone;
	@Column
	private String email;
	@OneToMany(mappedBy ="visitor")
	private Set<Comment> comment;	
	@OneToMany(mappedBy ="visitor")
	private Set<SendMessage> sendMessage;
	@OneToMany(mappedBy = "visitor")
	private Set<Like> like;
	

	public Set<Comment> getComment() {
		return comment;
	}

	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}

	public Set<SendMessage> getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(Set<SendMessage> sendMessage) {
		this.sendMessage = sendMessage;
	}

	

	public Visitor() {
		super();
	}
	


	public Visitor(String nom, String prenom, String password, String phone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	 

	public int getId() {
		return id;
	}

	 
	public String getNom() {
		return nom;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Visitor [nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", phone=" + phone + ", email="
				+ email + "]";
	}



}
