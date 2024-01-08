package com.sb.helpcar.entities;

import com.sb.helpcar.request.UsuariosRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuarios {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
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

    public Usuarios(String email){
        this.email = email;
    }
}
