package com.sb.helpcar.controller;

import com.sb.helpcar.entities.*;
import com.sb.helpcar.repository.*;
import com.sb.helpcar.request.LigacaoFARequestDTO;
import com.sb.helpcar.request.ServicosRequestDTO;
import com.sb.helpcar.response.Ligacao_FAResponseDTO;
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
    @Autowired
    Ligacao_FARepository ligacaoFaRepository;
    @Autowired
    FuncionariosRepository funcionariosRepository;
    @Autowired
    AgendamentosRepository agendamentosRepository;

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

    @PostMapping(value = "agendamento/funcionario/save")
    public void InsertFuncionarioOnAgendamento(@RequestBody LigacaoFARequestDTO data){
        Funcionario f = new Funcionario(funcionariosRepository.findByid(data.id_funcionario()));
        Agendamento a = new Agendamento(agendamentosRepository.findByid(data.id_agendamento()));
        Ligacao_FA ligacaoFa = new Ligacao_FA(f, a);
        ligacaoFaRepository.save(ligacaoFa);
        return;
    }

    @GetMapping(value = "agedamento/funcionario/{id}")
    public List<Ligacao_FAResponseDTO> getAllFuncionariosByAgendamento(@PathVariable Integer id){
        List<Ligacao_FAResponseDTO> lList = ligacaoFaRepository.findByAgendamentoId(id);
        return lList;
    }
}

