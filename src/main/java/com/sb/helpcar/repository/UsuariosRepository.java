package com.sb.helpcar.repository;

import com.sb.helpcar.entities.Usuarios;
import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {

    UsuariosResponseDTO findByEmail(String email);

    UsuariosResponseDTO findByid(UUID id);

}
