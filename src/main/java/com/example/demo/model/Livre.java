package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Livre extends Produit {
	private String Auteur;
	private String Edition;
	
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	
	
}
