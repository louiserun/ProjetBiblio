package com.example.demo.controller;

import java.util.Dictionary;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bibliotheque;
import com.example.demo.model.Produit;
import com.example.demo.repository.BibliothequeRepository;
import com.example.demo.service.BibliothequeService;

//@CrossOrigin(origins = "http://127.0.0.1:4200")
@RestController
public class BiblioRestController {
    @Autowired BibliothequeRepository biblioRepository;
    
    @GetMapping("/Rbiblio")
    public List<Bibliotheque> getBiblio() {
        return biblioRepository.findAll();
    }

    @GetMapping("/Rbiblio/{nom}")
    public List<Bibliotheque> getBiblioByNom(@PathVariable("nom") String nom) {
    	return biblioRepository.findByNom(nom);
    }
	
    
    @PostMapping("/Rbiblio")
    public Bibliotheque save(@RequestBody Bibliotheque biblio ) {
    	biblioRepository.save(biblio);
		return biblio;
    }
    
    @DeleteMapping("/Rbiblio/{id}")
    public String delete(@RequestBody Bibliotheque biblio) {
    	biblioRepository.delete(biblio);
    	return "supprimé avec succès";
    }
}
