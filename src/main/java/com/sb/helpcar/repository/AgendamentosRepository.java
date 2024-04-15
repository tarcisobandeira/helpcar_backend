package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosRepository extends JpaRepository<Agendamento, Integer> {
}
