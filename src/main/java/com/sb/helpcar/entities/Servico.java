package com.sb.helpcar.entities;

import com.sb.helpcar.request.ServicosRequestDTO;
import com.sb.helpcar.response.ServicosResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String descricao;
    private Double valor;
    private String tempo;
    private Integer ativo;
    @ManyToOne
    private Empresa empresa;

    public Servico(ServicosRequestDTO data, Empresa em) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.valor = data.valor();
        this.tempo = data.tempo();
        this.ativo = 1;
        this.empresa = em;
    }

    public Servico(ServicosResponseDTO data) {
        this.id = data.id();
        this.nome = data.nome();
        this.valor = data.valor();
        this.tempo = data.tempo();
        this.ativo = data.ativo();
        this.empresa = data.empresa();
    }
}
