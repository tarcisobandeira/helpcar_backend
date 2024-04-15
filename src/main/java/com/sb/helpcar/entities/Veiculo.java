package com.sb.helpcar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String placa;
    private Integer ano;
    private Double quilometragem;
    private String cor;
    private Integer combustivel;
    private Integer ativo;
    @ManyToOne
    private ModeloVeiculo modeloVeiculo;
    @ManyToOne
    private Motorista motorista;
}
