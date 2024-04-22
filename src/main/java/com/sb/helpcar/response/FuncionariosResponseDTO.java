package com.sb.helpcar.response;

import com.sb.helpcar.entities.Empresa;
import com.sb.helpcar.entities.Funcionario;

import java.util.Date;

public record FuncionariosResponseDTO(Integer id, String nome, String sobrenome, String funcao, Date primeiroDia, Integer ativo, Empresa empresa) {
    public FuncionariosResponseDTO(Funcionario f){
        this(f.getId(), f.getNome(), f.getSobrenome(), f.getFuncao(), f.getPrimeiroDia(), f.getAtivo(), f.getEmpresa());
    }
}
