package com.sb.helpcar.entities;

import com.sb.helpcar.response.ModeloVeiculosResponseDTO;
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
public class ModeloVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    @ManyToOne
    private MarcaVeiculo marcaVeiculo;

    public ModeloVeiculo(ModeloVeiculosResponseDTO data) {
        this.id = data.id();
        this.nome = data.nome();
        this.marcaVeiculo = data.marcaVeiculo();
    }
}
