package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Usuarios;
import com.sb.helpcar.repository.UsuariosRepository;
import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.MotoristasResponseDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class UsuariosController {
    @Autowired
    private UsuariosRepository repository;

    @PostMapping(value = "user/save")
    public void InsertUsuario(@RequestBody UsuariosRequestDTO data) {
        Usuarios u = new Usuarios(data);
        repository.save(u);
        return;
    }

    @GetMapping(value = "user/all")
    public List<UsuariosResponseDTO> getAll() {
        List<UsuariosResponseDTO> userList = repository.findAll().stream().map(UsuariosResponseDTO::new).toList();
        return userList;
    }

    @GetMapping(value = "user/login/{email}")
    public UsuariosResponseDTO filterLogin(@PathVariable String email) {
        UsuariosResponseDTO ur = repository.findByEmail(email);
        return ur;
    }

    @GetMapping(value = "user/{id}")
    public UsuariosResponseDTO getMotoristaId(@PathVariable UUID id){
        UsuariosResponseDTO ur = repository.findByid(id);
        return ur;
    }
}
