package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Ligacao_FA;
import com.sb.helpcar.response.Ligacao_FAResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ligacao_FARepository extends JpaRepository<Ligacao_FA, Integer> {


    List<Ligacao_FAResponseDTO> findByAgendamentoId(Integer id);
}
