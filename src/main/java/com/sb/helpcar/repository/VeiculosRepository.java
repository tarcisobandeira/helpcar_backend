package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.response.VeiculosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepository extends JpaRepository<Veiculo, Integer> {

    VeiculosResponseDTO findByid(Integer id);
}
