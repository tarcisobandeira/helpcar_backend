package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Servico;
import com.sb.helpcar.response.ServicosResponseDTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicosRepository extends JpaRepository<Servico, Integer> {

    ServicosResponseDTO findByid(Integer id);

    List<ServicosResponseDTO> findByEmpresaId(Integer id);
}
