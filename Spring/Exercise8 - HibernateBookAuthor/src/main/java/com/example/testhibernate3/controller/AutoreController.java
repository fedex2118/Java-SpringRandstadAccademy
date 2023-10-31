package com.example.testhibernate3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testhibernate3.model.Autore;
import com.example.testhibernate3.service.AutoreService;

@RestController
public class AutoreController {
	
	@Autowired
	private AutoreService autoreService;
	
	@GetMapping("/autori")
	public List<Autore> autori() {
		return autoreService.findAll();
	}
	
	@PostMapping("/autori")
	public Autore creaAutore(@RequestBody Autore autore) {
		return autoreService.saveAutore(autore);
	}
	
	@PutMapping("/autori")
	public Autore aggiornaAutore(@RequestBody Autore autore, @RequestParam Long id) {
		return autoreService.updateAutore(autore, id);
	}
	
	@DeleteMapping("/autori")
	public void eliminaAutore(@RequestParam Long id) {
		autoreService.deleteAutore(id);
	}
	
}
