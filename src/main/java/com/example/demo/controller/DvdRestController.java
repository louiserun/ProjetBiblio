package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livre;
import com.example.demo.repository.DvdRepository;

//@CrossOrigin(origins = "http://127.0.0.1:4200")
@RestController
public class DvdRestController {
	@Autowired DvdRepository dvdRepository;
	
	@GetMapping("/dvd")
    public List<Livre> getProduit() {
        return dvdRepository.findAll();
    }
	
	@PostMapping("/dvd")
	public Livre addOrUpdateLivre (@RequestBody Livre dvd) {
		dvdRepository.save(dvd);
		return dvd;
	}
}
