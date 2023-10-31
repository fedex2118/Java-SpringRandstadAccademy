package com.example.testhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testhibernate.model.Saluto;
import com.example.testhibernate.repository.SalutoRepository;

@Service
public class SalutoService {

    @Autowired
    private SalutoRepository salutoRepository;

    public Saluto saveSaluto(String messaggio) {
        Saluto saluto = new Saluto();
        saluto.setMessaggio(messaggio);
        return salutoRepository.save(saluto);
    }
}
