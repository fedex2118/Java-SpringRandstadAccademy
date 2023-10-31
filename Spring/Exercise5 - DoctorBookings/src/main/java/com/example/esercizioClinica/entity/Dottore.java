package com.example.esercizioClinica.entity;

import java.util.Collection;

public class Dottore {
	private long id;
	private String nome;
	private Collection<Appuntamento> appuntamenti;
	
	public Dottore(long id, String nome, Collection<Appuntamento> appuntamenti) {
		this.id = id;
		this.nome = nome;
		this.appuntamenti = appuntamenti;
	}
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Appuntamento> getAppuntamenti() {
		return appuntamenti;
	}

	public void setAppuntamenti(Collection<Appuntamento> appuntamenti) {
		this.appuntamenti = appuntamenti;
	}
}
