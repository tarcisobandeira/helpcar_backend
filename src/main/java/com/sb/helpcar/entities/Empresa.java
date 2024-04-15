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
    private String localizacao;
    private String cnpj;
    private Integer ativo;
    @ManyToOne
    private Usuario usuario;

    public Empresa(EmpresasRequestDTO data, Usuario u) {
        this.nome = data.nome();
        this.localizacao = data.localizacao();
        this.usuario = u;
    }
}
