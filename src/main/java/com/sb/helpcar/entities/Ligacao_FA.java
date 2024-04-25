package com.sb.helpcar.entities;

import com.sb.helpcar.response.Ligacao_FAResponseDTO;
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
public class Ligacao_FA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer status;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Agendamento agendamento;

    public Ligacao_FA(Funcionario f, Agendamento a) {
        this.status = 1;
        this.funcionario = f;
        this.agendamento = a;
    }

    public Ligacao_FA(Ligacao_FAResponseDTO data) {
        this.id = data.id();
        this.status = data.status();
        this.funcionario = data.funcionario();
        this.agendamento = data.agendamento();
    }
}
