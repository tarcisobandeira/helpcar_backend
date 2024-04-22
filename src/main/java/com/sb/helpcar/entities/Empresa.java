package com.sb.helpcar.entities;

import com.sb.helpcar.request.EmpresasRequestDTO;
import com.sb.helpcar.response.EmpresasResponseDTO;
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
        this.cnpj = data.cnpj();
        this.usuario = u;
        this.ativo = 1;
    }

    public Empresa(Usuario id_user){this.usuario = id_user;}
}
