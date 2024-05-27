package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class BiblioProduit {
	 @EmbeddedId
	 BiblioProduitKey id;

	 @ManyToOne
	 @MapsId("produitId")
	 @JoinColumn(name = "produit_id")
	 Produit produit;

	 @ManyToOne
	 @MapsId("biblioId")
	 @JoinColumn(name = "id_produit")
	 Bibliotheque biblio;

	 int nb_exemplaire;
}
