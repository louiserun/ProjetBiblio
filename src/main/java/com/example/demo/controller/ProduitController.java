package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bibliotheque;
import com.example.demo.model.Dvd;
import com.example.demo.model.Livre;
import com.example.demo.repository.DvdRepository;
import com.example.demo.repository.LivreRepository;
import com.example.demo.repository.ProduitRepository;
//@PathVariable("idBiblio") int id

@Controller
public class ProduitController {
	@Autowired ProduitRepository produitRepository;
	@Autowired LivreRepository livreRepository;
	@Autowired DvdRepository dvdRepository;
	
	@GetMapping("/produit")
	public ModelAndView affiche() {
		ModelAndView mav = new ModelAndView();
		
		List<Dvd> dvd = dvdRepository.findAll();
		List<Livre> livre = livreRepository.findAll();
		mav.setViewName("produit");
		mav.addObject("dvd", dvd);
		mav.addObject("livre", livre);
		return mav;
	}
	
	
	
}
