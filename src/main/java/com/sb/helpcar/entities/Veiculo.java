package com.sb.helpcar.entities;

import com.sb.helpcar.request.VeiculosRequestDTO;
import com.sb.helpcar.response.VeiculosResponseDTO;
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

    public Veiculo(VeiculosResponseDTO data){
        this.id = data.id();
        this.placa = data.placa();
        this.ano = data.ano();
        this.quilometragem = data.quilometragem();
        this.cor = data.cor();
        this.combustivel = data.combustivel();
        this.ativo = data.ativo();
        this.modeloVeiculo = data.modeloVeiculo();
        this.motorista = data.motorista();
    }

    public Veiculo(VeiculosRequestDTO data, ModeloVeiculo mv, Motorista m) {
        this.placa = data.placa();
        this.ano = data.ano();
        this.quilometragem = data.quilometragem();
        this.cor = data.cor();
        this.combustivel = data.combustivel();
        this.ativo = 1;
        this.modeloVeiculo = mv;
        this.motorista = m;
    }
}
