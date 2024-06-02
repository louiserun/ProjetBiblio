package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Dvd;
import com.example.demo.model.Livre;
import com.example.demo.model.Produit;

public interface DvdRepository extends JpaRepository<Dvd, Integer> {
	@Query("SELECT bp.produit FROM BiblioProduit bp WHERE bp.biblio.id_biblio = :biblioId")
	 public List<Dvd> findProduitsByBibliothequeId(@Param("biblioId") int biblioId);
	
}
