package com.sb.helpcar.entities;

import com.sb.helpcar.request.FuncionariosRequestDTO;
import com.sb.helpcar.response.FuncionariosResponseDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String sobrenome;
    private String funcao;
    private Date primeiroDia;
    private Integer ativo;
    @ManyToOne
    private Empresa empresa;

    public Funcionario(FuncionariosRequestDTO data, Empresa em) {
        this.nome = data.nome();
        this.sobrenome = data.sobrenome();
        this.funcao = data.funcao();
        this.primeiroDia = data.primeiroDia();
        this.ativo = 1;
        this.empresa = em;
    }

    public Funcionario(FuncionariosResponseDTO data) {
        this.nome = data.nome();
        this.sobrenome = data.sobrenome();
        this.funcao = data.funcao();
        this.primeiroDia = data.primeiroDia();
        this.ativo = data.ativo();
        this.empresa = data.empresa();
    }
}
