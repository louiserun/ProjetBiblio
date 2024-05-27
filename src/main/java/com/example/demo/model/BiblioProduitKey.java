package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BiblioProduitKey implements Serializable {
	@Column(name = "id_produit")
	int biblioId;
	
	@Column(name = "id_produit")
	int produitId;
}