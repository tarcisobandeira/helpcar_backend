package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Usuarios;
import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    UsuariosResponseDTO findByEmail(String email);

}
