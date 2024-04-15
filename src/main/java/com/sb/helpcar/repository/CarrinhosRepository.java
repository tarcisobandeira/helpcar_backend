package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhosRepository extends JpaRepository<Carrinho, Integer> {
}
