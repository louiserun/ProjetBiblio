package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bibliotheque;
import com.example.demo.repository.BibliothequeRepository;

@Service
public class BibliothequeService {
	@Autowired BibliothequeRepository biblioRepository;
	
	public void addOrUpdateProjet(Bibliotheque biblio) {
		biblioRepository.save(biblio);
	}
}
