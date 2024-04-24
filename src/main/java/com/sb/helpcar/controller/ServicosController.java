package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Servico;
import com.sb.helpcar.repository.EmpresasRepository;
import com.sb.helpcar.repository.ServicosRepository;
import com.sb.helpcar.request.ServicosRequestDTO;
import com.sb.helpcar.response.ServicosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
public class ServicosController {

    @Autowired
    ServicosRepository repository;
    @Autowired
    EmpresasRepository empresasRepository;

    @PostMapping(value = "servico/save")
    public void InsertServico(@RequestBody ServicosRequestDTO data) {
        Empresa em = new Empresa(empresasRepository.findByid(data.id_empresa()));
        Servico s = new Servico(data, em);
        repository.save(s);
        return;
    }

    @GetMapping(value = "servico/all")
    public List<ServicosResponseDTO> getAll() {
        List<ServicosResponseDTO> servicoList = repository.findAll().stream().map(ServicosResponseDTO::new).toList();
        return servicoList;
    }

    @GetMapping(value = "servico/{id}")
    public ServicosResponseDTO getServicoId(@PathVariable Integer id){
        ServicosResponseDTO sr = repository.findByid(id);
        return sr;
    }

    @GetMapping(value = "empresa/servico/{id}")
    public List<ServicosResponseDTO> findByEmpresaId(@PathVariable Integer id){
        List<ServicosResponseDTO> servicoList = repository.findByEmpresaId(id);
        return servicoList;
    }
}

