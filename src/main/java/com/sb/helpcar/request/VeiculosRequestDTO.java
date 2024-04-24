package com.sb.helpcar.request;

public record VeiculosRequestDTO(String placa, Integer ano, Double quilometragem, String cor, Integer combustivel, Integer id_modeloVeiculo, Integer id_motorista) {
}
