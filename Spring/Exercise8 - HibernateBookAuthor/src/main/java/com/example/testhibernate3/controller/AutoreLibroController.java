package com.example.testhibernate3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testhibernate3.service.AutoreLibroService;

@RestController
public class AutoreLibroController {
	
	@Autowired
	private AutoreLibroService autoreLibroService;
	
//	@GetMapping("/autorelibro")
//	public List<Autore, List<Libro>> libri() {
//		return libroService.findAll();
//	}
	
	@PostMapping("/autorelibro")
	public void aggiungiLibroAdAutore(@RequestParam Long autoreId, @RequestParam Long libroId) {
		autoreLibroService.aggiungiLibroAdAutore(autoreId, libroId);
	}
}
