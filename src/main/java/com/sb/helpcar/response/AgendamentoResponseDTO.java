package com.sb.helpcar.response;

import com.sb.helpcar.entities.Agendamento;
import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Servico;
import com.sb.helpcar.entities.Veiculo;

public record AgendamentoResponseDTO(Integer id, Integer status, Servico servico, Motorista motorista, Veiculo veiculo) {
    public AgendamentoResponseDTO (Agendamento a){
        this(a.getId(), a.getStatus(), a.getServico(), a.getMotorista(), a.getVeiculo());
    }
}
