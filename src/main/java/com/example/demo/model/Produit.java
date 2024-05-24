package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titre;
	private String ISBN;
	private List<Bibliotheque[]> bibliotheques;	
	
	public Produit()
	{
		super();
	}
	public Produit(String titre, String iSBN) {
		super();
		this.titre = titre;
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", titre=" + titre + ", ISBN=" + ISBN + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
