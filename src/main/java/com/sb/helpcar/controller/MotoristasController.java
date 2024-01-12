package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Motoristas;
import com.sb.helpcar.repository.MotoristasRepository;
import com.sb.helpcar.request.MotoristasRequestDTO;
import com.sb.helpcar.response.MotoristasResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotoristasController {

    @Autowired
    private MotoristasRepository repository;

    @PostMapping(value = "motorista/save")
    public void InsertMotorista(@RequestBody MotoristasRequestDTO data){
        Motoristas m = new Motoristas(data);
        repository.save(m);
        return;
    }

    @GetMapping(value = "motorista/all")
    public List<MotoristasResponseDTO> getAll(){
        List<MotoristasResponseDTO> motoList = repository.findAll().stream().map(MotoristasResponseDTO::new).toList();
        return motoList;
    }

}
