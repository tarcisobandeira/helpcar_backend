package com.sb.helpcar.response;

import com.sb.helpcar.entities.ModeloVeiculo;
import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.entities.Veiculo;

public record VeiculoResponseDTO(Integer id, String placa, Integer ano, Double quilometragem, String cor, Integer combustivel, Integer ativo, ModeloVeiculo modeloVeiculo, Motorista motorista) {
    public VeiculoResponseDTO(Veiculo v){
        this(v.getId(), v.getPlaca(), v.getAno(), v.getQuilometragem(), v.getCor(), v.getCombustivel(), v.getAtivo(), v.getModeloVeiculo(), v.getMotorista());
    }
}
