package com.sb.helpcar.request;

import org.springframework.data.jpa.repository.QueryRewriter;

public record VeiculoRequestDTO(String placa, Integer ano, Double quilometragem, String cor, Integer combustivel, Integer id_modeloVeiculo, Integer id_motorista) {
}
