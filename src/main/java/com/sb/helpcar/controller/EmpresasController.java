package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Usuario;
import com.sb.helpcar.repository.EmpresasRepository;
import com.sb.helpcar.repository.UsuariosRepository;
import com.sb.helpcar.request.EmpresasRequestDTO;
import com.sb.helpcar.response.EmpresasResponseDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresasController {
    @Autowired
    private EmpresasRepository repository;
    @Autowired
    private UsuariosRepository userRepository;

    @PostMapping(value = "empresa/save")
    public void InsertEmpresa(@RequestBody EmpresasRequestDTO data){
        UsuariosResponseDTO ur = userRepository.findByid(data.id_usuario());
        Usuario u = new Usuario(ur);
        Empresa em = new Empresa(data, u);
        repository.save(em);
        return;
    }

    @GetMapping(value = "empresa/all")
    public List<EmpresasResponseDTO> getAll(){
        List<EmpresasResponseDTO> empresaList = repository.findAll().stream().map(EmpresasResponseDTO::new).toList();
        return empresaList;
    }

    @GetMapping(value = "empresa/{id}")
    public EmpresasResponseDTO getEmpresaId(@PathVariable Integer id){
        EmpresasResponseDTO er = repository.findByid(id);
        return er;
    }

    @GetMapping(value = "user/empresa/{id}")
    public List<EmpresasResponseDTO> findByUsuarioId(@PathVariable Integer id){
        List<EmpresasResponseDTO> empresaList = repository.findByUsuarioId(id);
        return empresaList;
    }
}