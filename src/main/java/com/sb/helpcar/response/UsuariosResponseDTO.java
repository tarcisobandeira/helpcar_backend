package com.sb.helpcar.response;

import com.sb.helpcar.entities.Usuarios;

import java.util.UUID;

public record UsuariosResponseDTO(UUID id, String firstname, String lastname, String email, String password) {
    public UsuariosResponseDTO(Usuarios u){
        this(u.getId(), u.getFirstname(), u.getLastname(), u.getEmail(), u.getPassword());
    }

}
