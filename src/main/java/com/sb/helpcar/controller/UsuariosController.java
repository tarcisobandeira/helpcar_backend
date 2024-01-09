package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Usuarios;
import com.sb.helpcar.repository.UsuariosRepository;
import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
public class UsuariosController {
    @Autowired
    private UsuariosRepository repository;
    private PasswordController pc = new PasswordController();

    public UsuariosController() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    @PostMapping(value = "user/save")
    public void InsertUsuario(@RequestBody UsuariosRequestDTO data) {
        Usuarios u = new Usuarios(data);
        u.setPassword(pc.CriptCreate(u.getPassword()));
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
        Usuarios u = new Usuarios(ur);
        u.setPassword(pc.Descript(u.getPassword()));
        return ur;
    }
}
