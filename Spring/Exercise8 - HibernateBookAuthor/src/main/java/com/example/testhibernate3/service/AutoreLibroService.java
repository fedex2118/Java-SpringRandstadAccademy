package com.example.testhibernate3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testhibernate3.model.Autore;
import com.example.testhibernate3.model.Libro;
import com.example.testhibernate3.repository.AutoreRepository;
import com.example.testhibernate3.repository.LibroRepository;

@Service
public class AutoreLibroService {
	
	@Autowired
	private AutoreRepository autoreRepository;
	
	@Autowired
	private LibroRepository libroRepository;
	
	public void aggiungiLibroAdAutore(Long autoreId, Long libroId) {
	    Autore autore = autoreRepository.findById(autoreId).orElseThrow(() -> new RuntimeException("Autore non trovato"));
	    Libro libro = libroRepository.findById(libroId).orElseThrow(() -> new RuntimeException("Libro non trovato"));
	    
	    autore.getLibri().add(libro);
	    libro.getAutori().add(autore);
	    
	    autoreRepository.save(autore);
	    libroRepository.save(libro);
	}
}
