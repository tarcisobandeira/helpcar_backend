package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {
}
