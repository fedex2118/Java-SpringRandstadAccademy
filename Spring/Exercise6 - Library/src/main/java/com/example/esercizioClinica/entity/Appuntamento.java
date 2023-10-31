package com.example.esercizioClinica.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appuntamento {
	private long id;
	private LocalDate data;
	private LocalTime ora;
	
	public Appuntamento(long id, LocalDate data, LocalTime ora) {
		this.id = id;
		this.data = data;
		this.ora = ora;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	
	
	
	
	
}
