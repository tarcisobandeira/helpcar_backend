package com.sb.helpcar.response;

import com.sb.helpcar.entities.Motoristas;
import com.sb.helpcar.entities.Usuarios;

import java.util.UUID;

public record MotoristasResponseDTO(UUID id, Long cpf, Usuarios usuarios) {
    public MotoristasResponseDTO(Motoristas m){
        this(m.getId(), m.getCpf(), m.getUsuarios());
    }


}
