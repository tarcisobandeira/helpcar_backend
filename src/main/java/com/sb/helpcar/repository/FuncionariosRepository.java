package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionario, Integer> {
}
