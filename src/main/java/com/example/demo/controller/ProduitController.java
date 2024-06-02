package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.DvdRepository;
import com.example.demo.repository.LivreRepository;
import com.example.demo.repository.ProduitRepository;


@Controller
public class ProduitController {
	@Autowired ProduitRepository produitRepository;
	@Autowired LivreRepository livreRepository;
	@Autowired DvdRepository dvdRepository;
	
	@GetMapping("/getDvd/{idBiblio}")
	public String affiche(@PathVariable("idBiblio") int id) {
		
		return "produit";
	}
}
