package com.sb.helpcar.entities;

import com.sb.helpcar.repository.UsuariosRepository;
import com.sb.helpcar.request.UsuariosRequestDTO;
import com.sb.helpcar.response.UsuariosResponseDTO;
import jakarta.persistence.*;
import jakarta.security.auth.message.callback.SecretKeyCallback;
import lombok.*;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public Usuarios(UsuariosRequestDTO data) {
        this.firstname = data.firstname();
        this.lastname = data.lastname();
        this.email = data.email();
        this.password = data.password();
    }

    public Usuarios(UsuariosResponseDTO data) {
        this.id = data.id();
        this.firstname = data.firstname();
        this.lastname = data.lastname();
        this.email = data.email();
        this.password = data.password();
    }

    public Usuarios(String email) {
        this.email = email;
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

}
