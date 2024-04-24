package com.sb.helpcar.entities;

import com.sb.helpcar.request.AgendamentoRequestDTO;
import com.sb.helpcar.response.AgendamentoResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer status;
    @ManyToOne
    private Servico servico;
    @ManyToOne
    private Motorista motorista;
    @ManyToOne
    private Veiculo veiculo;

    public Agendamento(AgendamentoResponseDTO data){
        this.id = data.id();
        this.status = data.status();
        this.servico = data.servico();
        this.motorista = data.motorista();
        this.veiculo = data.veiculo();
    }

    public Agendamento(Servico s, Motorista m, Veiculo v){
        this.status = 1;
        this.servico = s;
        this.motorista = m;
        this.veiculo = v;
    }
}
