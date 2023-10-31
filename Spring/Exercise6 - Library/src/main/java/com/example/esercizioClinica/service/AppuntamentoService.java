package com.example.esercizioClinica.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.esercizioClinica.entity.Appuntamento;

@Service
public class AppuntamentoService {
	private final Map<Long, Appuntamento> appuntamenti = new HashMap<>();
	private Long currentId = 1L;
	
	public Appuntamento aggiungiAppuntamento(Appuntamento appuntamento) {
		appuntamento.setId(currentId++);
		appuntamenti.put(appuntamento.getId(), appuntamento);
		return appuntamento;
	}
	
	public Collection<Appuntamento> ottieniTutti() {
		return appuntamenti.values();
	}
	
	public Appuntamento ottieniPerId(Long id) {
		return appuntamenti.get(id);
	}
	
	public Appuntamento aggiornaAppuntamento(Long id, Appuntamento appuntamento) {
		if(appuntamenti.containsKey(id)) {
			appuntamento.setId(id);
			appuntamenti.put(id, appuntamento);
			return appuntamento;
		}
		return null;
	}
	
	public void eliminaAppuntamento(Long id) {
		appuntamenti.remove(id);
	}
}
