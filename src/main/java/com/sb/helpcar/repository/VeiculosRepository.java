package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepository extends JpaRepository<Veiculo, Integer> {
}
