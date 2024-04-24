package com.sb.helpcar.controller;

import com.sb.helpcar.entities.ModeloVeiculo;
import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.repository.ModeloVeiculosRepository;
import com.sb.helpcar.repository.MotoristasRepository;
import com.sb.helpcar.repository.VeiculosRepository;
import com.sb.helpcar.request.VeiculosRequestDTO;
import com.sb.helpcar.response.VeiculosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VeiculosController {

    @Autowired
    public VeiculosRepository repository;
    @Autowired
    public ModeloVeiculosRepository modeloVeiculosRepository;
    @Autowired
    public MotoristasRepository motoristasRepository;

    @PostMapping(value = "veiculo/save")
    public void InsertVeiculo(@RequestBody VeiculosRequestDTO data){
        ModeloVeiculo mv = new ModeloVeiculo(modeloVeiculosRepository.findByid(data.id_modeloVeiculo()));
        Motorista m = new Motorista(motoristasRepository.findByid(data.id_motorista()));
        Veiculo v = new Veiculo(data, mv, m);
        repository.save(v);
        return;
    }

    @GetMapping(value = "veiculo/all")
    public List<VeiculosResponseDTO> getAll(){
        List<VeiculosResponseDTO> vList = repository.findAll().stream().map(VeiculosResponseDTO::new).toList();
        return vList;
    }
}
