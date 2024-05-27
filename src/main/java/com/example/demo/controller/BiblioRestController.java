package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bibliotheque;
import com.example.demo.repository.BibliothequeRepository;
import com.example.demo.service.BibliothequeService;

@CrossOrigin(origins = "http://127.0.0.1:4200")

@RestController
public class BiblioRestController {
    @Autowired BibliothequeRepository biblioRepository;
    
    @GetMapping("/biblio")
    public List<Bibliotheque> getBiblio() {
        return biblioRepository.findAll();
    }

	
    @PostMapping("/biblio")
    public Bibliotheque save(@RequestBody Bibliotheque biblio ) {
    	biblioRepository.save(biblio);
		return biblio;
    }
}