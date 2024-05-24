package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Dvd extends Produit{
	private String Realisateur;

	public String getRealisateur() {
		return Realisateur;
	}
	public void setRealisateur(String realisateur) {
		Realisateur = realisateur;
	}
	
}
