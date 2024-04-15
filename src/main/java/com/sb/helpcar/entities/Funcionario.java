package com.sb.helpcar.entities;

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
    @ManyToOne
    private Empresa empresa;
}
