package com.sb.helpcar.response;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Usuario;

public record EmpresasResponseDTO(Integer id, String nome, String localizacao, String cnpj, Integer ativo, Usuario usuario) {
    public EmpresasResponseDTO(Empresa em){
        this(em.getId(), em.getNome(), em.getLocalizacao(), em.getCnpj(), em.getAtivo(), em.getUsuario());
    }
}
