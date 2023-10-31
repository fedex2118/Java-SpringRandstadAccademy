package com.example.testhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testhibernate.model.Saluto;

public interface SalutoRepository extends JpaRepository<Saluto, Long>{

}
