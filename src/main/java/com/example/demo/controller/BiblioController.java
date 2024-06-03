package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Bibliotheque;
import com.example.demo.repository.BibliothequeRepository;

@Controller
public class BiblioController {
    @Autowired
    BibliothequeRepository biblioRepository;

    @GetMapping("/biblio")    
    public ModelAndView afficherBiblio() {
    	List<Bibliotheque> biblio = biblioRepository.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("biblio", biblio); 
        mav.setViewName("biblio");
        return mav;
    }

    @PostMapping("/getBiblio")
    public ModelAndView getBiblioByNom(@RequestParam String nom) {
        List<Bibliotheque> biblio = biblioRepository.findByNom(nom);
        ModelAndView mav = new ModelAndView("biblio");
        mav.addObject("biblio", biblio); // Ajoutez la liste avec la clé "biblioList"
        return mav;
    }
    @GetMapping("/addBiblio")
    public String addBibblio() {
    	return "addBiblio";
    }
    
    @PostMapping("/addBiblio")
    public RedirectView addBiblio(@RequestParam String nom,
    		@RequestParam String ville,
    		@RequestParam String adresse) {
    	RedirectView red = new RedirectView("/biblio");
    	
    	Bibliotheque b = new Bibliotheque();
    	b.setAdresse(adresse);
    	b.setNom(nom);
    	b.setVille(ville);
    	biblioRepository.save(b);
    	
    	//mav.addObject("nom", nom);
    	return red;
    } 
    
    @PostMapping ("/goProduit")
    public RedirectView goProduit () {
    	RedirectView mav = new RedirectView("/biblio");
    	return mav;
    }
}
