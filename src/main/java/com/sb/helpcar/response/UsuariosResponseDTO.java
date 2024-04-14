package com.sb.helpcar.response;

import com.sb.helpcar.entities.Usuarios;

public record UsuariosResponseDTO(Integer id, String firstname, String lastname, String email, String password) {
    public UsuariosResponseDTO(Usuarios u){
        this(u.getId(), u.getFirstname(), u.getLastname(), u.getEmail(), u.getPassword());
    }

}
