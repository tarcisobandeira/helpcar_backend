package com.sb.helpcar.entities;

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
}
