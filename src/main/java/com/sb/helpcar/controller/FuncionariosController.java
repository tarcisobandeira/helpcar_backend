package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Funcionario;
import com.sb.helpcar.repository.EmpresasRepository;
import com.sb.helpcar.repository.FuncionariosRepository;
import com.sb.helpcar.request.FuncionariosRequestDTO;
import com.sb.helpcar.response.FuncionariosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionariosController {

    @Autowired
    private FuncionariosRepository repository;
    @Autowired
    private EmpresasRepository empresasRepository;

    @PostMapping(value = "funcionario/save")
    public void InsertFuncionario(@RequestBody FuncionariosRequestDTO data){
        Empresa em = new Empresa(empresasRepository.findByid(data.id_empresa()));
        Funcionario f = new Funcionario(data, em);
        repository.save(f);
        return;
    }

    @GetMapping(value = "funcionario/all")
    public List<FuncionariosResponseDTO> getAll(){
        List<FuncionariosResponseDTO> funcionarioList = repository.findAll().stream().map(FuncionariosResponseDTO::new).toList();
        return funcionarioList;
    }
}
