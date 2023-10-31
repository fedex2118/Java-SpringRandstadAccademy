package com.example.testhibernate3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testhibernate3.model.Libro;
import com.example.testhibernate3.repository.LibroRepository;

@Service
public class LibroService {
	   @Autowired
	    private LibroRepository libroRepository;

	    public Libro saveLibro(Libro libro) {
	    	if (libro.getAutori().isEmpty()) {
	    		System.err.println("L'insieme di autori è vuoto!");
	    	}
	    	
	        Libro l = new Libro();
	        l.setTitolo(libro.getTitolo());
	        l.setAutori(libro.getAutori());
	        return libroRepository.save(l);
	    }
	    
	    public void deleteLibro(Long id) {
	    	Libro libro = libroRepository.findById(id).orElse(null);
	    	
	    	libroRepository.delete(libro);
	    }
	    
	    public Libro updateLibro(Libro libro, Long id) {
	    	Libro l = libroRepository.findById(id).orElse(null);
	    	
	    	if (l == null) {
	    		return null;
	    	}
	    	
	    	l.setId(id);
    		l.setTitolo(libro.getTitolo());
    		l.setAutori(libro.getAutori());
    		libroRepository.save(l);
    		return l;
	    }
	    
	    public List<Libro> findAll() {
	    	return libroRepository.findAll();
	    }
}
