package com.sb.helpcar.response;

import com.sb.helpcar.entities.MarcaVeiculo;
import com.sb.helpcar.entities.ModeloVeiculo;

public record ModeloVeiculosResponseDTO(Integer id, String nome, MarcaVeiculo marcaVeiculo) {
    public ModeloVeiculosResponseDTO(ModeloVeiculo mv){
        this(mv.getId(), mv.getNome(), mv.getMarcaVeiculo());
    }
}
