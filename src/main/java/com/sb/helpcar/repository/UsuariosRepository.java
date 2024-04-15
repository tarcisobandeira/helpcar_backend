package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Usuario;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

    UsuariosResponseDTO findByEmail(String email);

    UsuariosResponseDTO findByid(Integer id);

}
