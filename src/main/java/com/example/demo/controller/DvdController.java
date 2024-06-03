package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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
	public RedirectView addDvd (@RequestParam String titre,
	    		@RequestParam String isbn,
	    		@RequestParam String realisateur) {
			RedirectView r = new RedirectView("/produit");
	    	Dvd dvd = new Dvd();
	    	
	    	dvd.setTitre(titre);
	    	dvd.setISBN(isbn);
	    	dvd.setRealisateur(realisateur);
	    	dvdRepository.save(dvd);
	    return r;
	}
}
