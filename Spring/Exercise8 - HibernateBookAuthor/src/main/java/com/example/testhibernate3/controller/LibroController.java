package com.example.testhibernate3.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testhibernate3.model.Autore;
import com.example.testhibernate3.model.Libro;
import com.example.testhibernate3.service.LibroService;

@RestController
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@GetMapping("/libri")
	public List<Libro> libri() {
		return libroService.findAll();
	}
	
	@PostMapping("/libri")
	public Libro creaLibro(@RequestBody Libro libro) {
		return libroService.saveLibro(libro);
	}
	
	@PutMapping("/libri")
	public Libro aggiornaLibro(@RequestBody Libro libro, @RequestParam Long id) {
		return libroService.updateLibro(libro, id);
	}
	
	@DeleteMapping("/libri")
	public void eliminaLibro(@RequestParam Long id) {
		libroService.deleteLibro(id);
	}
}
