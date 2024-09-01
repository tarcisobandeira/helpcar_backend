package com.sb.helpcar.entities;

import com.sb.helpcar.request.CategoriaRequestDTO;
import com.sb.helpcar.response.CategoriaResponseDTO;
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
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private Integer ativo;

    public Categoria(CategoriaRequestDTO data){
        this.nome = data.nome();
        this.ativo = 1;
    }

    public Categoria(CategoriaResponseDTO data){
        this.id = data.id();
        this.nome = data.nome();
        this.ativo = data.ativo();
    }
}


