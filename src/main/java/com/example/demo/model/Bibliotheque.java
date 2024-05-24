package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Bibliotheque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_biblio;
	private String nom;
	private String ville;
	private String adresse;
	
	@ManyToMany
	@JoinTable( name = "bibliothequeProduit",joinColumns = @JoinColumn (referencedColumnName = "id_biblio"), 
	inverseJoinColumns = @JoinColumn (referencedColumnName = "id_produit"))
	private List<Produit[]> produits;	
	
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
