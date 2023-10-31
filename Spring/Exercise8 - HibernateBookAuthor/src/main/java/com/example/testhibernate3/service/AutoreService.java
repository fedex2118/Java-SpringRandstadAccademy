package com.example.testhibernate3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testhibernate3.model.Autore;
import com.example.testhibernate3.repository.AutoreRepository;

@Service
public class AutoreService {
	
	@Autowired
	private AutoreRepository autoreRepository;
	
    public Autore saveAutore(Autore autore) {
        Autore aut = new Autore();
        aut.setNome(autore.getNome());
        aut.setCognome(autore.getCognome());
        aut.setLibri(autore.getLibri());
        return autoreRepository.save(aut);
    }
    
    public void deleteAutore(Long id) {
    	Autore autore = autoreRepository.findById(id).orElse(null);
    	
    	autoreRepository.delete(autore);
    }
    
    public Autore updateAutore(Autore autore, Long id) {
    	Autore a = autoreRepository.findById(id).orElse(null);
    	
    	if (a == null) {
    		return null;
    	}
    	
    	a.setId(id);
		a.setNome(autore.getNome());
		a.setCognome(autore.getCognome());
		a.setLibri(autore.getLibri());
		autoreRepository.save(a);
		return a;
    }
    
    public List<Autore> findAll() {
    	return autoreRepository.findAll();
    }
	
}
