package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bibliotheque;

@Repository
public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Integer>{
	
	public List<Bibliotheque> findByNom(String name);
	
	@Query ("select b from Bibliotheque b")
	public List<Bibliotheque> findAll();

	@Query ("select b.nom from Bibliotheque b")
	public List<Bibliotheque> findNom();
}
