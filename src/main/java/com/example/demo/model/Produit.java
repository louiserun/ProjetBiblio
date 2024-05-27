package com.example.demo.model;

import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_produit;
	private String titre;
	@Column(nullable = false)
	private String ISBN;
	
	
	@OneToMany(mappedBy = "produit")
    Set<BiblioProduit> biblioProduit;
	
	public Produit()
	{
		super();
	}
	public Produit(String titre, String iSBN) {
		super();
		this.titre = titre;
		ISBN = iSBN;
	}
	
	
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
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
