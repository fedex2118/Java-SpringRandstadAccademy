package com.example.testhibernate3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testhibernate3.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	
}
