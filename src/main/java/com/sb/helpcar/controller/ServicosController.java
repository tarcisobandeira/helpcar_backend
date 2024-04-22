package com.sb.helpcar.controller;

import com.sb.helpcar.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicosController {

    @Autowired
    ServicosRepository repository;

    @PostMapping(value = "servico/save")
    public void InsertServico(){

    }
}
