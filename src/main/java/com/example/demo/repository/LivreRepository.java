package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Livre;
import com.example.demo.model.Produit;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer>{
	 @Query("SELECT livre FROM Livre livre JOIN livre.biblioProduit bp WHERE bp.biblio.id_biblio = :biblioId")
	 List<Livre> findLivresByBibliothequeId(@Param("biblioId") int biblioId);
}
