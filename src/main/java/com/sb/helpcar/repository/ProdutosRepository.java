package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
