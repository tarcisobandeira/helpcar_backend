package com.sb.helpcar.entities;

import com.sb.helpcar.request.EmpresasRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String x;
    private String y;
    @OneToMany
    private Usuarios usuario;

    public Empresa(EmpresasRequestDTO data, Usuarios u) {
        this.nome = data.nome();
        this.x = data.x();
        this.y = data.y();
        this.usuario = u;
    }
}
