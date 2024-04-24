package com.sb.helpcar.repository;

import com.sb.helpcar.entities.ModeloVeiculo;
import com.sb.helpcar.response.ModeloVeiculosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloVeiculosRepository extends JpaRepository<ModeloVeiculo, Integer> {
    ModeloVeiculosResponseDTO findByid(Integer id);
}
