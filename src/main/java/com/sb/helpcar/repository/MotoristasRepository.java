package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Motoristas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotoristasRepository extends JpaRepository<Motoristas, UUID> {
}
