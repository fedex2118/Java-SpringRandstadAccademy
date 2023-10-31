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

import com.example.esercizioClinica.entity.Dottore;
import com.example.esercizioClinica.service.DottoreService;

@RestController
@RequestMapping("/dottori")
public class DottoreController {
	@Autowired
	private DottoreService dottoreService;
	
	@GetMapping
	public Collection<Dottore> listaDottori() {
		return dottoreService.ottieniTutti();
	}
	
	@GetMapping("/{id}")
	public Dottore ottieniDottore(@PathVariable Long id) {
		return dottoreService.ottieniPerId(id);
	}
	
	@PostMapping
	public Dottore nuovoDottore(@RequestBody Dottore dottore) {
		return dottoreService.aggiungiDottore(dottore);
	}
	
	@PutMapping("/{id}")
	public Dottore aggiornaDottore(@PathVariable Long id, 
			@RequestBody Dottore dottore) {
		return dottoreService.aggiornaDottore(id, dottore);
	}
	
	@DeleteMapping("/{id}")
	public void eliminaDottore(@PathVariable Long id) {
		dottoreService.eliminaDottore(id);
	}
}
