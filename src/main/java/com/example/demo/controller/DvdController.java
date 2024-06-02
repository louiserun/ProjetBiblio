package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Dvd;
import com.example.demo.repository.DvdRepository;

@Controller
public class DvdController {
	
	@Autowired DvdRepository dvdRepository;
	
	@GetMapping("/addDvd")
	public String addDvd () {
		return "addDvd";
	}
	
	@PostMapping("/addDvd")
	public String addDvd (@RequestParam String titre,
	    		@RequestParam String isbn,
	    		@RequestParam String realisateur,
	    		@PathVariable("idBiblio") int id) {
	    	//ModelAndView mav = new ModelAndView();
	    	Dvd dvd = new Dvd();
	    	
	    	dvd.setTitre(titre);
	    	dvd.setISBN(isbn);
	    	dvd.setRealisateur(realisateur);
	    	dvdRepository.save(dvd);
	    System.out.println("produit ajouté");
		return "produit";
	}
}
