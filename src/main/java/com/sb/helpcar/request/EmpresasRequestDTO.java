package com.sb.helpcar.request;

import com.sb.helpcar.entities.Empresa;

public record EmpresasRequestDTO(Integer id, String nome, String localizacao, String cnpj, Integer id_usuario, Integer ativo) {

}
