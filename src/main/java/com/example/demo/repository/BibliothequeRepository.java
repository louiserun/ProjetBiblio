package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bibliotheque;

@Repository
public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Integer>{

}
