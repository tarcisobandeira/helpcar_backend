package com.sb.helpcar.response;

import com.sb.helpcar.entities.Motoristas;
import com.sb.helpcar.entities.Usuarios;

import java.util.UUID;

public record MotoristasResponseDTO(Integer id, Long cpf, Usuarios usuario) {
    public MotoristasResponseDTO(Motoristas m){
        this(m.getId(), m.getCpf(), m.getUsuario());
    }


}
