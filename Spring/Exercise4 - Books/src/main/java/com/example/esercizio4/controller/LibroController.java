package com.example.esercizio4.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.esercizio4.entity.Libro;
import com.example.esercizio4.service.LibroService;

@RestController
@RequestMapping("/libri")
public class LibroController {
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public Collection<Libro> listaLibri() {
		return libroService.ottieniTutti();
	}
	
	@GetMapping("/{id}")
	public Libro ottieniLibro(@PathVariable Long id) {
		return libroService.ottieniPerId(id);
	}
	
	@PostMapping
	public Libro nuovoLibro(@RequestBody Libro libro) {
		return libroService.aggiungiLibro(libro);
	}
	
	@PutMapping("/{id}")
	public Libro aggiornaLibro(@PathVariable Long id, @RequestBody Libro libro) {
		return libroService.aggiornaLibro(id, libro);
	}
	
	@DeleteMapping("/{id}")
	public void eliminaLibro(@PathVariable Long id) {
		libroService.eliminaLibro(id);
	}
	
	
}
