package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Categoria;
import com.sb.helpcar.response.CategoriaResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositiry extends JpaRepository<Categoria, Integer> {

    CategoriaResponseDTO findByid(Integer id);

}
