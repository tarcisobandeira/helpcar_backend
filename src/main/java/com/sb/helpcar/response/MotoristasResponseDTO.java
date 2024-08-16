package com.sb.helpcar.response;

import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Usuario;

public record MotoristasResponseDTO(Integer id, String cpf, Usuario usuario) {
    public MotoristasResponseDTO(Motorista m){
        this(m.getId(), m.getCpf(), m.getUsuario());
    }


}
