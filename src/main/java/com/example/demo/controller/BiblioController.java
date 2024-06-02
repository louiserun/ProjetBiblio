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


public class BiblioController {
    @Autowired BibliothequeRepository biblioRepository;
    
    @GetMapping("/biblio")
    public String afficherBiblio() {
    	return "biblio";
    }

   
}