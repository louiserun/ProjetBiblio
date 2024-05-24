package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Bibliotheque {
	private String nom;
	private String ville;
	private String adresse;
	
	public Bibliotheque () {
		super();
	}
	
	@Override
	public String toString() {
		return "Bibliotheque [nom=" + nom + ", ville=" + ville + ", adresse=" + adresse + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
