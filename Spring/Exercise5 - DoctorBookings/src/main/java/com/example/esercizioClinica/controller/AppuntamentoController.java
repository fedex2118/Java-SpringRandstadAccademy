package com.example.esercizioClinica.controller;

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

import com.example.esercizioClinica.entity.Appuntamento;
import com.example.esercizioClinica.service.AppuntamentoService;

@RestController
@RequestMapping("/appuntamenti")
public class AppuntamentoController {
	@Autowired
	private AppuntamentoService appuntamentoService;
	
	@GetMapping
	public Collection<Appuntamento> listaAppuntamento() {
		return appuntamentoService.ottieniTutti();
	}
	
	@GetMapping("/{id}")
	public Appuntamento ottieniAppuntamento(@PathVariable Long id) {
		return appuntamentoService.ottieniPerId(id);
	}
	
	@PostMapping
	public Appuntamento nuovoAppuntamento(@RequestBody Appuntamento appuntamento) {
		return appuntamentoService.aggiungiAppuntamento(appuntamento);
	}
	
	@PutMapping("/{id}")
	public Appuntamento aggiornaAppuntamento(@PathVariable Long id, 
			@RequestBody Appuntamento appuntamento) {
		return appuntamentoService.aggiornaAppuntamento(id, appuntamento);
	}
	
	@DeleteMapping("/{id}")
	public void eliminaAppuntamento(@PathVariable Long id) {
		appuntamentoService.eliminaAppuntamento(id);
	}
	
	
}
