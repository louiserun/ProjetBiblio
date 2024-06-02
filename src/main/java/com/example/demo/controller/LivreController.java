package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Dvd;
import com.example.demo.model.Livre;
import com.example.demo.repository.LivreRepository;

@Controller
public class LivreController {
	@Autowired LivreRepository livreRepository;
	
	@GetMapping("/addLivre")
	public String addDvd () {
		return "addLivre";
	}
	
	@PostMapping("/addLivre/{idBiblio}")
	public String addDvd (@RequestParam String titre,
	    		@RequestParam String isbn,
	    		@RequestParam String auteur,
	    		@RequestParam String edition,
	    		@PathVariable("idBiblio") int id) {
	    	//ModelAndView mav = new ModelAndView();
	    	Livre livre = new Livre();
	    	
	    	livre.setTitre(titre);
	    	livre.setISBN(isbn);
	    	livre.setAuteur(auteur);
	    	livre.setEdition(edition);
	    	livreRepository.save(livre);
	    	
	    System.out.println("Livre ajouté");
		return "produit";
	}
}