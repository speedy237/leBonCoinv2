package com.tcorp.leboncoin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	@Column(nullable=false)
	private String content;
	@Column(nullable= false)
	private int score;
	
	@ManyToOne
	@JoinColumn(name="idAnnonce")
	private Annonce annonce;
	
	@ManyToOne
	@JoinColumn(name="visitor_id")
	private Visitor visitor;
	
	
	public Comment(String content, int score, Annonce annonce, Visitor visitor) {
		super();
		this.content = content;
		this.score = score;
		this.annonce = annonce;
		this.visitor = visitor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public Visitor getVisitor() {
		return visitor;
	}
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	public Comment() {
		super();
	}
	
	
	
	

}
