package com.example.demo.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Bibliotheque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_biblio;
	private String nom;
	private String ville;
	private String adresse;
	
	@OneToMany(mappedBy = "biblio")
    Set<BiblioProduit> biblioProduit;
	
	public Bibliotheque () {
		super();
	}
	
	public Bibliotheque(String nom, String ville, String adresse) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
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
