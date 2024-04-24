package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Agendamento;
import com.sb.helpcar.response.AgendamentosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosRepository extends JpaRepository<Agendamento, Integer> {
    AgendamentosResponseDTO findByid(Integer id);
}
