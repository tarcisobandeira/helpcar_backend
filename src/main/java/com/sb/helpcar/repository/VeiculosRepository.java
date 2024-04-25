package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.response.VeiculosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculosRepository extends JpaRepository<Veiculo, Integer> {

    VeiculosResponseDTO findByid(Integer id);

    List<VeiculosResponseDTO> findByMotoristaId(Integer id);
}
