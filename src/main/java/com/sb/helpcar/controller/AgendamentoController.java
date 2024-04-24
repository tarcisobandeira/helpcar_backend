package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Agendamento;
import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Servico;
import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.repository.AgendamentosRepository;
import com.sb.helpcar.repository.MotoristasRepository;
import com.sb.helpcar.repository.ServicosRepository;
import com.sb.helpcar.repository.VeiculosRepository;
import com.sb.helpcar.request.AgendamentoRequestDTO;
import com.sb.helpcar.response.AgendamentoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendamentoController {
    @Autowired
    private AgendamentosRepository repository;
    @Autowired
    private ServicosRepository servicosRepository;
    @Autowired
    private MotoristasRepository motoristasRepository;
    @Autowired
    private VeiculosRepository veiculosRepository;

    @PostMapping(value = "agendamento/save")
    public void InsertAgendamento(@RequestBody AgendamentoRequestDTO data){
        Servico s = new Servico(servicosRepository.findByid(data.id_servico()));
        Motorista m = new Motorista(motoristasRepository.findByid(data.id_motorista()));
        Veiculo v = new Veiculo(veiculosRepository.findByid(data.id_veiculo()));
        Agendamento a = new Agendamento(s, m, v);
        repository.save(a);
        return;
    }

    @GetMapping(value = "agendamento/all")
    public List<AgendamentoResponseDTO> getAll(){
        List<AgendamentoResponseDTO> agList = repository.findAll().stream().map(AgendamentoResponseDTO::new).toList();
        return agList;
    }

    @GetMapping(value = "agendamento/{id}")
    public AgendamentoResponseDTO getAgendamentoId(@PathVariable Integer id){
        AgendamentoResponseDTO ar = repository.findByid(id);
        return ar;
    }

}
