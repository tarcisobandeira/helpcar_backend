package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Veiculo;
import com.sb.helpcar.request.VeiculoRequestDTO;
import com.sb.helpcar.response.VeiculoResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepository extends JpaRepository<Veiculo, Integer> {

    VeiculoResponseDTO findByid(Integer id);
}
