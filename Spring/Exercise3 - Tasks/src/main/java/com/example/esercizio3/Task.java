package com.example.esercizio3;
//
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//
//@Entity
public class Task {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}

	public Task(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	
	
	
}
