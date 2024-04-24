package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Motorista;
import com.sb.helpcar.response.MotoristasResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristasRepository extends JpaRepository<Motorista, Integer> {
    MotoristasResponseDTO findByid(Integer id);
}
