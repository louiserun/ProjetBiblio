package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProduitRepository;


@RestController
public class ProduitRestController {
	@Autowired ProduitRepository produitRepository;
	
    @GetMapping("/Rproduit")
    public List<Produit> getProduit() {
        return produitRepository.findAll();
    }
    
   
    @GetMapping("/Rproduit/{titre}")
    public List<Produit> getProduitByNom(@PathVariable("titre") String titre) {
    	System.out.println(titre);
    	return produitRepository.findByTitre(titre);
    }
	
    @PostMapping("/Rproduit")
    public Produit save(@RequestBody Produit produit ) {
    	produitRepository.save(produit);
		return produit;
    }
    
    @PostMapping("/RproduitBiblio")
    public List<Produit> getProduitByBiblioId(@RequestBody int idBiblio ) {
    	return produitRepository.findProduitsByBibliothequeId(idBiblio);
    }
}

