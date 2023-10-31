package com.example.esercizio4.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.esercizio4.entity.Libro;

@Service
public class LibroService {
	private final Map<Long, Libro> libri = new HashMap<>();
	private Long currentId = 1L;
	
	public Libro aggiungiLibro(Libro libro) {
		libro.setId(currentId++);
		libri.put(libro.getId(), libro);
		return libro;
	}
	
	public Collection<Libro> ottieniTutti() {
		return libri.values();
	}
	
	public Libro ottieniPerId(Long id) {
		return libri.get(id);
	}
	
	public Libro aggiornaLibro(Long id, Libro libro) {
		if(libri.containsKey(id)) {
			libro.setId(id);
			libri.put(id, libro);
			return libro;
		}
		return null;
	}
	
	public void eliminaLibro(Long id) {
		libri.remove(id);
	}
	
}
