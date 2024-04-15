package com.sb.helpcar.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
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
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String descricao;
    private Double valor_avista;
    private Double valor_aprazo;
    private Integer quantidade;
    private Integer ativo;
    @ManyToOne
    private Empresa empresa;
}
