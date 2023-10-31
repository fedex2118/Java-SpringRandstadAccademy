package com.example.esercizioClinica.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.esercizioClinica.entity.Dottore;

@Service
public class DottoreService {
	private final Map<Long, Dottore> dottori = new HashMap<>();
	private Long currentId = 1L;
	
	@Autowired
	private AppuntamentoService appuntamentoService;
	
	public Dottore aggiungiDottore(Dottore dottore) {
		dottore.setId(currentId++);
		dottore.setAppuntamenti(appuntamentoService.ottieniTutti());
		dottori.put(dottore.getId(), dottore);
		return dottore;
	}
	
	public Collection<Dottore> ottieniTutti() {
		return dottori.values();
	}
	
	public Dottore ottieniPerId(Long id) {
		return dottori.get(id);
	}
	
	public Dottore aggiornaDottore(Long id, Dottore dottore) {
		if(dottori.containsKey(id)) {
			dottore.setId(id);
			dottori.put(id, dottore);
			return dottore;
		}
		return null;
	}
	
	public void eliminaDottore(Long id) {
		dottori.remove(id);
	}
	
//	public Dottore assegnaTutti(Long idDottore) {
//		
//		return dottore;
//	}
}
