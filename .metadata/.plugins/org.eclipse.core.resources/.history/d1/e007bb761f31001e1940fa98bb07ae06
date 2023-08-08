/*
 * @file: Post.java
 * @about: Questo classe rappresenta un post all'interno di una 
 * campagna, rappresentabile come una sessione intera.
 */

package com.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

	//Attributi
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 12000)
	private String contenuto;
	
	private Date dataDiCreazione;
	
	// Getters and Setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public Date getDataDiCreazione() {
		return dataDiCreazione;
	}

	public void setDataDiCreazione(Date dataDiCreazione) {
		this.dataDiCreazione = dataDiCreazione;
	}
}
