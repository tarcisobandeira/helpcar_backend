package com.sb.helpcar.request;

import java.util.Date;

public record FuncionariosRequestDTO(String nome, String sobrenome, String funcao, Date primeiroDia, Integer id_empresa) {

}
