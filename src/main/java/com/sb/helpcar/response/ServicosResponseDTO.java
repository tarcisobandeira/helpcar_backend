package com.sb.helpcar.response;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Servico;

public record ServicosResponseDTO(Integer id, String nome, String descricao, Double valor, String tempo, Integer ativo, Empresa empresa) {
    public ServicosResponseDTO(Servico s){
        this(s.getId(), s.getNome(), s.getDescricao(), s.getValor(), s.getTempo(), s.getAtivo(), s.getEmpresa());
    }
}
