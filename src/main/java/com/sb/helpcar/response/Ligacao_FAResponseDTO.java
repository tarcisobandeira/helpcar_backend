package com.sb.helpcar.response;

import com.sb.helpcar.entities.Agendamento;
import com.sb.helpcar.entities.Funcionario;
import com.sb.helpcar.entities.Ligacao_FA;

public record Ligacao_FAResponseDTO(Integer id, Integer status, Funcionario funcionario, Agendamento agendamento) {
    public Ligacao_FAResponseDTO (Ligacao_FA l){
        this(l.getId(), l.getStatus(), l.getFuncionario(), l.getAgendamento());
    }
}
