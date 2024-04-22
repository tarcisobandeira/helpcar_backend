package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Usuario;
import com.sb.helpcar.request.EmpresasRequestDTO;
import com.sb.helpcar.response.EmpresasResponseDTO;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {


    EmpresasResponseDTO findByid(Integer id);

    List<EmpresasResponseDTO> findByUsuarioId(Integer id);
}
