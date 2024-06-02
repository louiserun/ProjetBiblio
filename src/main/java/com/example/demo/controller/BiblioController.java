package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bibliotheque;
import com.example.demo.repository.BibliothequeRepository;

@Controller
public class BiblioController {
    @Autowired
    BibliothequeRepository biblioRepository;

    @GetMapping("/biblio")    
    public String afficherBiblio() {
        return "biblio";
    }

    @PostMapping("/biblio")
    public ModelAndView getBiblioByNom(@RequestParam String nom) {
        List<Bibliotheque> biblio = biblioRepository.findByNom(nom);
        ModelAndView mav = new ModelAndView("biblio");
        mav.addObject("biblioList", biblio);
        return mav;
    }
}
