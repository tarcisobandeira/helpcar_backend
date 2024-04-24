package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Agendamento;
import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Servico;
import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.repository.AgendamentosRepository;
import com.sb.helpcar.repository.MotoristasRepository;
import com.sb.helpcar.repository.ServicosRepository;
import com.sb.helpcar.repository.VeiculosRepository;
import com.sb.helpcar.request.AgendamentosRequestDTO;
import com.sb.helpcar.response.AgendamentosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendamentosController {
    @Autowired
    private AgendamentosRepository repository;
    @Autowired
    private ServicosRepository servicosRepository;
    @Autowired
    private MotoristasRepository motoristasRepository;
    @Autowired
    private VeiculosRepository veiculosRepository;

    @PostMapping(value = "agendamento/save")
    public void InsertAgendamento(@RequestBody AgendamentosRequestDTO data){
        Servico s = new Servico(servicosRepository.findByid(data.id_servico()));
        Motorista m = new Motorista(motoristasRepository.findByid(data.id_motorista()));
        Veiculo v = new Veiculo(veiculosRepository.findByid(data.id_veiculo()));
        Agendamento a = new Agendamento(s, m, v);
        repository.save(a);
        return;
    }

    @GetMapping(value = "agendamento/all")
    public List<AgendamentosResponseDTO> getAll(){
        List<AgendamentosResponseDTO> agList = repository.findAll().stream().map(AgendamentosResponseDTO::new).toList();
        return agList;
    }

    @GetMapping(value = "agendamento/{id}")
    public AgendamentosResponseDTO getAgendamentoId(@PathVariable Integer id){
        AgendamentosResponseDTO ar = repository.findByid(id);
        return ar;
    }

}
