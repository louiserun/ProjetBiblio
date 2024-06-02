package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>{
	public List<Produit> findByTitre (String nom);
	
	 @Query("SELECT bp.produit FROM BiblioProduit bp WHERE bp.biblio.id_biblio = :biblioId")
	 public List<Produit> findProduitsByBibliothequeId(@Param("biblioId") int biblioId);
	
}