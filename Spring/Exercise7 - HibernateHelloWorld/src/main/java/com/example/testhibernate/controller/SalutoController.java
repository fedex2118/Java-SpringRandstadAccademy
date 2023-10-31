package com.example.testhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testhibernate.model.Saluto;
import com.example.testhibernate.service.SalutoService;

@RestController
public class SalutoController {
	
	@Autowired
	private SalutoService salutoService;
	
	@GetMapping("/saluto")
	public Saluto saluto(@RequestParam String messaggio) {
		return salutoService.saveSaluto(messaggio);
	}
}
