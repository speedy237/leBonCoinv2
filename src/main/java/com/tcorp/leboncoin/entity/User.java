package com.tcorp.leboncoin.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="visitor_id")
@Table(name="user")
public class User extends Visitor{
	
	
	public User() {
		super();
	}
	
	public User(String nom, String prenom, String password, String phone, String email) {
		super(nom, prenom, password, phone, email);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
