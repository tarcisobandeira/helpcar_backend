package com.sb.helpcar.response;

import com.sb.helpcar.entities.Categoria;

public record CategoriaResponseDTO(Integer id, String nome, Integer ativo) {
    public CategoriaResponseDTO(Categoria c) {
        this(c.getId(), c.getNome(), c.getAtivo());
    }
}
