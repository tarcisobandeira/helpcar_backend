package com.sb.helpcar.entities;

import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer ativo;

    public Usuario(UsuariosRequestDTO data) {
        this.firstname = data.firstname();
        this.lastname = data.lastname();
        this.email = data.email();
        this.password = data.password();
    }

    public Usuario(UsuariosResponseDTO data) {
        this.id = data.id();
        this.firstname = data.firstname();
        this.lastname = data.lastname();
        this.email = data.email();
        this.password = data.password();
    }
}
