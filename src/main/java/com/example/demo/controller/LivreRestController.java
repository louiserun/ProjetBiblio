package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livre;
import com.example.demo.model.Produit;
import com.example.demo.repository.LivreRepository;

@CrossOrigin(origins = "http://127.0.0.1:4200")
@RestController
public class LivreRestController {
	@Autowired LivreRepository livreRepository;
	
	@GetMapping("/livre")
    public List<Livre> getProduit() {
        return livreRepository.findAll();
    }
	
	@PostMapping("/livre")
	public Livre addOrUpdateLivre (@RequestBody Livre livre) {
		livreRepository.save(livre);
		return livre;
	}
}
